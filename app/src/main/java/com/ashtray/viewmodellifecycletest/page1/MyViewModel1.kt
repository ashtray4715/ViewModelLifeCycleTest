package com.ashtray.viewmodellifecycletest.page1

import androidx.lifecycle.ViewModel
import com.ashtray.viewmodellifecycletest.log.MyLogger

class MyViewModel1(private val deviceId: String) : ViewModel() {

    init {
        MyLogger.d(TAG, "init called with $deviceId")
    }

    fun testFunc() {
        MyLogger.d(TAG, "test func called")
    }

    override fun onCleared() {
        MyLogger.d(TAG, "onCleared called with $deviceId")
        super.onCleared()
    }

    companion object {
        private const val TAG = "MyViewModel1"
    }
}