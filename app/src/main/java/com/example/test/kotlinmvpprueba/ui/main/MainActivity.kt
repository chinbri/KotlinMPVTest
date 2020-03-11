package com.example.test.kotlinmvpprueba.ui.main

import android.os.Bundle
import com.example.test.kotlinmvpprueba.R
import com.example.test.kotlinmvpprueba.di.components.activity.main.MainModule
import com.example.test.presentation.MainContract
import javax.inject.Inject

class MainActivity: BaseActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent
            .mainSubComponentBuilder()
            .mainModule(MainModule())
            .build()
            .inject(this)

        setContentView(R.layout.main_activity)

        presenter.setView(this)
        presenter.whatelse()
    }

    override fun whatever() {
        println("whatever!!!!")
    }

}