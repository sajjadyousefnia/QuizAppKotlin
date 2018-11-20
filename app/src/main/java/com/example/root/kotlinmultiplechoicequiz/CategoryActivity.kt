package com.example.root.kotlinmultiplechoicequiz

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.root.kotlinmultiplechoicequiz.Adapter.CategoryAdapter
import com.example.root.kotlinmultiplechoicequiz.Common.SpacesItemDecoration
import com.example.root.kotlinmultiplechoicequiz.DBHelper.DBHelper
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        toolbar.title = "EDMT QUIZ 2019"
        setSupportActionBar(toolbar)

        recyclerview_category.setHasFixedSize(true)
        recyclerview_category.layoutManager = GridLayoutManager(this, 2)

        val adapter = CategoryAdapter(this, DBHelper.getInstance(this).allCategories)
        recyclerview_category.addItemDecoration(SpacesItemDecoration(4))
        recyclerview_category.adapter = adapter


    }
}
