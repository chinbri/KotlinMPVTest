package com.example.test.presentation

class MainPresenter: MainContract.Presenter {

    private lateinit var view: MainContract.View

    override fun whatelse() {
        println("whatelse!!!")
        view.whatever()
    }

    override fun subscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unSubscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setView(view: MainContract.View) {
        this.view = view
    }

}