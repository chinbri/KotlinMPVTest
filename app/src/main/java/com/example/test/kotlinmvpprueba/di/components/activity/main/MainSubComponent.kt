package com.example.test.kotlinmvpprueba.di.components.activity.main

import com.example.test.kotlinmvpprueba.ui.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainSubComponent {

    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun mainModule(module: MainModule): Builder
        fun build(): MainSubComponent
    }

}