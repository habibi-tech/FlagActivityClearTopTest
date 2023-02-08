package com.tokopedia.cleartoptest

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tokopedia.cleartoptest.databinding.ActivityMain4Binding


class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //listAllActivities(this)

        binding.tv.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        Log.i(Singleton.TAG, "onCreate: ${Singleton.sharedValue}")
    }

    private fun listAllActivities(context: Context) {
        val pManager: PackageManager = context.packageManager
        val packageName: String = context.applicationContext.packageName
        try {
            val list =
                pManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES).activities
            for (activityInfo in list) {
                Log.d("thiiis", "ActivityInfo = " + activityInfo.name)

                if(activityInfo.name == MainActivity4::class.java.name) {
                    Log.d("thiiis", "Activity = BERHASIL")
                }
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }
}