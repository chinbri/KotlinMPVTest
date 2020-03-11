package com.example.test.kotlinmvpprueba.di.components.activity

import android.app.Activity
import com.example.test.presentation.MainContract
import com.example.test.presentation.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity = activity

}