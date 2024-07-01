package com.changesoftaction.testhiltmvvm.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.changesoftaction.testhiltmvvm.databinding.ProductItemListBinding
import com.changesoftaction.testhiltmvvm.model.ProductListModel


class ProductAdapter(private val productViewModel: List<ProductListModel>) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        // val view = layoutInflater.inflate(R.layout.product_item_list, parent, false)

        val productItemListBinding =
            ProductItemListBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(productItemListBinding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(
            "TAG",
            "onBindViewHolder: productViewModel[position].category " + productViewModel[position].category
        )
        //holder.itemName.text = productViewModel[position].category

        holder.binding.itemName.text = productViewModel[position].description
    }

    override fun getItemCount(): Int {
        return productViewModel.size
    }

}

class ViewHolder(val binding: ProductItemListBinding) : RecyclerView.ViewHolder(binding.root) {
    // val itemName: TextView = itemView.findViewById(R.id.itemName)

}
