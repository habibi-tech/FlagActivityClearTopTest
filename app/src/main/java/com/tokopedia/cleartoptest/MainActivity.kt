package com.tokopedia.cleartoptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tokopedia.cleartoptest.Singleton.TAG
import com.tokopedia.cleartoptest.Singleton.sharedValue
import com.tokopedia.cleartoptest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        Log.i(TAG, "onCreate: $sharedValue")
    }
}