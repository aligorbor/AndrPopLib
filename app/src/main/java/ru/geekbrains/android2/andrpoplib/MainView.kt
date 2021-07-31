package ru.geekbrains.android2.andrpoplib

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {
    fun setCounterOneText(text: String)
    fun setCounterTwoText(text: String)
    fun setCounterThreeText(text: String)
}