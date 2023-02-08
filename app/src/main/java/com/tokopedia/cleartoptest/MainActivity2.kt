package com.tokopedia.cleartoptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tokopedia.cleartoptest.databinding.ActivityMain2Binding
import com.tokopedia.cleartoptest.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tv.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        Log.i(Singleton.TAG, "onCreate: ${Singleton.sharedValue}")
    }
}