package com.changesoftaction.testhiltmvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.changesoftaction.testhiltmvvm.repository.ProductRepository
import com.changesoftaction.testhiltmvvm.model.ProductListModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(private val productRepository: ProductRepository) : ViewModel() {

    val productLiveData: LiveData<List<ProductListModel>>
        get() = productRepository.productLiveData

    init {

        viewModelScope.launch {
            productRepository.getProductsList()

        }

    }
}