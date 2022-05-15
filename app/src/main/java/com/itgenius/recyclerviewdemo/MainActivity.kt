package com.itgenius.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.itgenius.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // เรียกใช้ binding view
    private lateinit var binding: ActivityMainBinding

    // เรียกใช้ Adapter
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    // เรียกใช้ Model
    private lateinit var productList: List<ProductModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // load data to Product List
        loadProduct()

        // create  layoutManager
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

        // pass it to recyclerView layoutManager
        binding.recyclerView.setLayoutManager(layoutManager)

        // initialize the adapter
        recyclerViewAdapter = RecyclerViewAdapter(productList)

        // attach adapter to the recycler view
        binding.recyclerView.adapter = recyclerViewAdapter

    }

    // เขียนฟังก์ชันเพิ่มข้อมูลงใน Model
    private fun loadProduct() {
        productList = listOf(
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot"),
            ProductModel("iPhone 13 Pro Max", "Description of iphone 13") ,
            ProductModel("iPad 2021 Air", "Description of iPad 2021 Air"),
            ProductModel("Samsung S22", "Description of iPad Samsung S22"),
            ProductModel("Huawei P30", "Description of iPad Huawei P30"),
            ProductModel("Sony Cybershot", "Description of Sony Cybershot")
        )
    }
}