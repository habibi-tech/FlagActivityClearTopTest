package com.tokopedia.cleartoptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tokopedia.cleartoptest.databinding.ActivityMain3Binding
import com.tokopedia.cleartoptest.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        Log.i(Singleton.TAG, "onCreate: ${Singleton.sharedValue}")
        Singleton.sharedValue = "changed value"
        Log.i(Singleton.TAG, "onCreate: ${Singleton.sharedValue}")
    }
}