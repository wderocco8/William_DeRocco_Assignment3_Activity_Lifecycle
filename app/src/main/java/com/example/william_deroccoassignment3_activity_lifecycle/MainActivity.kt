package com.example.william_deroccoassignment3_activity_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
    }

    // This method is called when the activity is first created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() called")

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)

        button.setOnClickListener {
            textView.text = "Hello"
            editText.setText("Hello")
        }
    }

    // This method is called when the activity becomes visible to the user but is not yet in the foreground.
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
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

    // This method is called when the activity is partially obscured by another activity, but it's still visible (e.g. switching to another activity)
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    // This method is called when the activity is no longer visible to the user.
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    // This method is called when the activity is being destroyed and removed from memory.
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}