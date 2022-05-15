package com.itgenius.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itgenius.recyclerviewdemo.databinding.RecyclerviewRowBinding

class RecyclerViewAdapter(var productData: List<ProductModel>,) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(productData[position]){
                binding.tvProductName.text = this.productName
                binding.tvProductDescription.text = this.productDescription
            }
        }
    }

    override fun getItemCount(): Int {
        return productData.size
    }

}