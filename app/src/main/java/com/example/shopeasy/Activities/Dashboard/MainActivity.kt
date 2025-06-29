package com.example.shopeasy.Activities.Dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.example.shopeasy.Domain.BannerModel
import com.example.shopeasy.Domain.CategoryModel
import com.example.shopeasy.R
import com.example.shopeasy.Repository.DashboardRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            DashboardScreen()
        }
    }
}

@Composable
@Preview
fun DashboardScreen() {
    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(color = colorResource(id = R.color.blue))

    val viewModel = DashboardRepository()

    val categories = remember { mutableStateListOf<CategoryModel>() }
    val banners = remember { mutableStateListOf<BannerModel>() }

    var showCategoryLoading by remember { mutableStateOf(true) }
    var showBannerLoading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        viewModel.loadCategory().observeForever {
            categories.clear()
            categories.addAll(it)
            showCategoryLoading = false
        }
    }

    LaunchedEffect(Unit) {
        viewModel.loadBanner().observeForever {
            banners.clear()
            banners.addAll(it)
            showBannerLoading=false
        }
    }


    Scaffold(
        bottomBar = { MyBottomBar() }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(R.color.lightBlue))
                .padding(paddingValues = paddingValues)
        ) {

            item { TopBar() }
            item { CategorySection(categories,showCategoryLoading) }
            item{ Banner(banners,showBannerLoading) }
        }

    }
}