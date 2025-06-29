package com.example.shopeasy.ViewModel

import androidx.lifecycle.LiveData
import com.example.shopeasy.Domain.CategoryModel
import com.example.shopeasy.Domain.StoreModel
import com.example.shopeasy.Repository.ResultsRepository

class ResultsViewModel {
    private val repository = ResultsRepository()

    fun loadSubCategory(id: String): LiveData<MutableList<CategoryModel>> {
        return repository.loadSubCategory(id)
    }

    fun loadPopular(id: String): LiveData<MutableList<StoreModel>> {
        return repository.loadPopular(id)
    }

    fun loadNearest(id: String): LiveData<MutableList<StoreModel>> {
        return repository.loadNearest(id)
    }
}