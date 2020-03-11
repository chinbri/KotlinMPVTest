package com.example.test.kotlinmvpprueba.ui

import android.app.Application
import com.example.test.kotlinmvpprueba.di.components.ApplicationComponent
import com.example.test.kotlinmvpprueba.di.components.DaggerApplicationComponent

class PruebaApplication: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        initComponent()
    }

    private fun initComponent() {
        component = DaggerApplicationComponent
            .builder()
            .build()

        component.inject(this)
    }


}