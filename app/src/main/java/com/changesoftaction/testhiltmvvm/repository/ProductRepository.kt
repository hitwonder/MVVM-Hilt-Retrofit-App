package com.changesoftaction.testhiltmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.changesoftaction.testhiltmvvm.model.ProductListModel
import com.changesoftaction.testhiltmvvm.retrofit.ApiInterface
import javax.inject.Inject


class ProductRepository @Inject constructor(private val apiInterface: ApiInterface) {

    private val productMutable = MutableLiveData<List<ProductListModel>>()
    val productLiveData: LiveData<List<ProductListModel>>
        get() = productMutable


    suspend fun getProductsList() {
        val result = apiInterface.getProduct()

        if (result.isSuccessful) {
            productMutable.postValue(result.body())
        }
    }


}