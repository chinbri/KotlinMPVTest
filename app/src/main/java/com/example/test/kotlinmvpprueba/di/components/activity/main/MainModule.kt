package com.example.test.kotlinmvpprueba.di.components.activity.main

import com.example.test.presentation.MainContract
import com.example.test.presentation.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun providesMainPresenter(): MainContract.Presenter = MainPresenter()

}