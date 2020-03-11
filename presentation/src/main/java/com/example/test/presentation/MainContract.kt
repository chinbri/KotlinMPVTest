package com.example.test.presentation

interface MainContract: BaseContract {

    interface View: BaseContract.View{
        fun whatever()
    }
    interface Presenter: BaseContract.Presenter<View>{
        fun whatelse()
    }

}
