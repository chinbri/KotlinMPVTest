package com.example.test.presentation

interface BaseContract {

    interface Presenter<in ViewClass:View>{
        fun subscribe()
        fun unSubscribe()
        fun setView(view: ViewClass)
    }

    interface View

}