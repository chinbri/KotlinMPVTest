package com.example.test.kotlinmvpprueba.di.components

import android.app.Application
import com.example.test.kotlinmvpprueba.ui.PruebaApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule (var application: PruebaApplication) {

    @Provides
    @Singleton
    fun providesApplication(): Application = application

}