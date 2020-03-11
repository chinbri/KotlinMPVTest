package com.example.test.kotlinmvpprueba.di.components.activity

import com.example.test.kotlinmvpprueba.di.components.ApplicationComponent
import com.example.test.kotlinmvpprueba.di.components.activity.main.MainSubComponent
import com.example.test.kotlinmvpprueba.ui.main.BaseActivity
import dagger.Component

@Component(
    modules = [ActivityModule::class],
    dependencies = [ApplicationComponent::class]
)
interface ActivityComponent {

    fun mainSubComponentBuilder(): MainSubComponent.Builder

}