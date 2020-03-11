package com.example.test.kotlinmvpprueba.ui.main

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.test.kotlinmvpprueba.di.components.activity.ActivityComponent
import com.example.test.kotlinmvpprueba.di.components.activity.DaggerActivityComponent
import com.example.test.kotlinmvpprueba.ui.PruebaApplication

abstract class BaseActivity: Activity() {

    protected lateinit var activityComponent: ActivityComponent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent =
            DaggerActivityComponent
                .builder()
                .applicationComponent((application as PruebaApplication).component)
                .build()
    }
}