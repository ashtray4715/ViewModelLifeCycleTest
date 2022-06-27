package com.ashtray.viewmodellifecycletest.log

import android.util.Log

object MyLogger {
    private const val TAG = "[MG]"

    fun d(tag: String, message: String) {
        Log.d(TAG + tag , message)
    }
}