package com.encoders.courotineinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("Current_Thread", Thread.currentThread().name)

        //// SIMPLE THREAD ///////
//        thread {
//            Log.e("Thread is start", Thread.currentThread().name)
//            Thread.sleep(3000)
//            Log.e("Thread is Finishes", Thread.currentThread().name)
//          //  finish()
//        }


        ///// COROUTINE THREAD //////

        GlobalScope.launch {
            Log.e("Thread is start", Thread.currentThread().name)
            delay(3000)
            Log.e("Thread is Finishes", Thread.currentThread().name)
            finish()
        }



    }
}