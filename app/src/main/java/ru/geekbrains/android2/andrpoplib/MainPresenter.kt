package ru.geekbrains.android2.andrpoplib

import moxy.MvpPresenter

class MainPresenter(val model: CountersModel): MvpPresenter<MainView>() {

    fun counterOneClick() {
        val nextValue = model.next(0)
        viewState.setCounterOneText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(1)
        viewState.setCounterTwoText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(2)
        viewState.setCounterThreeText(nextValue.toString())
    }
}
