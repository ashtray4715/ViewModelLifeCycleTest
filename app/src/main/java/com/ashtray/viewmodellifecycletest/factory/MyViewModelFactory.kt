package com.ashtray.viewmodellifecycletest.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ashtray.viewmodellifecycletest.page1.MyViewModel1
import com.ashtray.viewmodellifecycletest.page2.MyViewModel2
import java.lang.IllegalArgumentException

class MyViewModelFactory(
    private val deviceId: String
): ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        count ++
        return when(modelClass) {
            MyViewModel1::class.java -> MyViewModel1(deviceId) as T
            MyViewModel2::class.java -> MyViewModel2(deviceId) as T
            else -> throw IllegalArgumentException("Unknown view model class")
        }
    }

    companion object {
        var count = 0
    }
}
