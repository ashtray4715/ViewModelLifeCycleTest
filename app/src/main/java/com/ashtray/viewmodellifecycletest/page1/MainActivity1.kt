package com.ashtray.viewmodellifecycletest.page1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ashtray.viewmodellifecycletest.R
import com.ashtray.viewmodellifecycletest.factory.MyViewModelFactory

class MainActivity1 : AppCompatActivity() {

    private val viewModel: MyViewModel1 by viewModels() {MyViewModelFactory("#1")}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        viewModel.testFunc()
    }
}