package ru.geekbrains.android2.andrpoplib

class MainPresenter(val view: MainView, val idsInteractor: IdsInteractor) {
    val model = CountersModel()

    fun counterClick(id: Int) {
        when (id) {
            idsInteractor.idBtn1 -> {
                val nextValue = model.next(0)
                view.setButtonText(idsInteractor.idBtn1, nextValue.toString())
            }
            idsInteractor.idBtn2 -> {
                val nextValue = model.next(1)
                view.setButtonText(idsInteractor.idBtn2, nextValue.toString())
            }
            idsInteractor.idBtn3 -> {
                val nextValue = model.next(2)
                view.setButtonText(idsInteractor.idBtn3, nextValue.toString())
            }
        }
    }
}