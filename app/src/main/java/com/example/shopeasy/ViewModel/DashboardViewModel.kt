package com.example.shopeasy.ViewModel

import androidx.lifecycle.LiveData
import com.example.shopeasy.Domain.BannerModel
import com.example.shopeasy.Domain.CategoryModel

class DashboardViewModel {
    private val repository = DashboardViewModel()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadBanners(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanners()
    }
}