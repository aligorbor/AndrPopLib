package ru.geekbrains.android2.andrpoplib

import android.app.Activity
import android.content.Context
import android.widget.Button

class IdsInteractorImpl(context: Context) : IdsInteractor {
    override val idBtn1: Int = (context as Activity).findViewById<Button>(R.id.btn_counter1).id
    override val idBtn2: Int = (context as Activity).findViewById<Button>(R.id.btn_counter2).id
    override val idBtn3: Int = (context as Activity).findViewById<Button>(R.id.btn_counter3).id
}