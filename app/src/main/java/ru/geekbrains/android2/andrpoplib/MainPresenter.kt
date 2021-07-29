package ru.geekbrains.android2.andrpoplib

class MainPresenter(val view: MainView, val model: CountersModel) {

    fun counterOneClick() {
        val nextValue = model.next(0)
        view.setCounterOneText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(1)
        view.setCounterTwoText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(2)
        view.setCounterThreeText(nextValue.toString())
    }
}
