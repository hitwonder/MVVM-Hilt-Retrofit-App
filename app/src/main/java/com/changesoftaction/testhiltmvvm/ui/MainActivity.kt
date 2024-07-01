package com.changesoftaction.testhiltmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.changesoftaction.testhiltmvvm.databinding.ActivityMainBinding
import com.changesoftaction.testhiltmvvm.model.ProductListModel
import com.changesoftaction.testhiltmvvm.viewmodels.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /* @Inject
     @Named("firebaseRepo")
     lateinit var userRepository: UserRepository*/

    private var activityBinding: ActivityMainBinding? = null
    private val binding get() = activityBinding!!

    lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // val binding = MainActivity.inflate(layoutInflater)
        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityBinding!!.root
        setContentView(view)

        viewModel = ViewModelProvider(this)[ProductViewModel::class.java]
        viewModel.productLiveData.observe(this) {
            initProductRecycleView(it)
        }


    }

    private fun initProductRecycleView(productListModel: List<ProductListModel>) {
        binding.rvRecycleView.layoutManager = LinearLayoutManager(this)
        binding.rvRecycleView.adapter = ProductAdapter(productListModel)

        Log.d("TAG", "onCreate: now  data ${productListModel.size}")
    }
}