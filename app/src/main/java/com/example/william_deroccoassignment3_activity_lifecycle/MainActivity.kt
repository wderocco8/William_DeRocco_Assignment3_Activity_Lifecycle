package com.example.william_deroccoassignment3_activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }

    // This method is called when the activity is first created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() called")
    }

    // This method is called when the activity becomes visible to the user but is not yet in the foreground.
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    // This method is called when the activity is visible and in the foreground.
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }
}