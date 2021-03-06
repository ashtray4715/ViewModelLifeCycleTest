package com.ashtray.viewmodellifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ashtray.viewmodellifecycletest.page1.MainActivity1
import com.ashtray.viewmodellifecycletest.page2.MainActivity2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener { click1() }
        findViewById<Button>(R.id.btn2).setOnClickListener { click2() }
    }

    private fun click1() {
        startActivity(
            Intent(this, MainActivity1::class.java)
        )
    }

    private fun click2() {
        startActivity(
            Intent(this, MainActivity2::class.java)
        )
    }
}