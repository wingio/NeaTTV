package xyz.wingio.neattv.utilities

import android.util.Log

class Logger(private val name: String?) {

    fun debug(message : String){
        Log.d(name, message)
    }

    fun warn(message: String){
        Log.w(name, message)
    }

    fun info(message: String){
        Log.i(name, message)
    }

    fun error(message: String){
        Log.e(name, message)
    }

    fun error(message: String, error : Throwable){
        Log.e(name, message, error)
    }

}