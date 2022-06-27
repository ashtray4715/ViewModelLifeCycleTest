package com.ashtray.viewmodellifecycletest.page2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ashtray.viewmodellifecycletest.R
import com.ashtray.viewmodellifecycletest.factory.MyViewModelFactory
import com.ashtray.viewmodellifecycletest.page1.MyViewModel1

class MainActivity2 : AppCompatActivity() {

    private val viewModel: MyViewModel2 by viewModels() {MyViewModelFactory("#2")}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        viewModel.testFunc()
    }
}