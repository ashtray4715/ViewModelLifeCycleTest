package com.ashtray.viewmodellifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ashtray.viewmodellifecycletest.page1.MainActivity1
import com.ashtray.viewmodellifecycletest.page2.MainActivity2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click1(view: View) {
        startActivity(
            Intent(this, MainActivity1::class.java)
        )
    }

    fun click2(view: View) {
        startActivity(
            Intent(this, MainActivity2::class.java)
        )
    }
}