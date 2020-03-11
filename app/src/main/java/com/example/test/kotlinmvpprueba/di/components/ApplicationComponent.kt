package com.example.test.kotlinmvpprueba.di.components

import com.example.test.kotlinmvpprueba.ui.PruebaApplication
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: PruebaApplication)

}