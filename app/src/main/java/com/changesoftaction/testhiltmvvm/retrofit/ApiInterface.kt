package com.changesoftaction.testhiltmvvm.retrofit

import com.changesoftaction.testhiltmvvm.model.ProductListModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/products/")
    suspend fun getProduct(): Response<List<ProductListModel>>
}