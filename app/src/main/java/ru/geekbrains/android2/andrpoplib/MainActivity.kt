package ru.geekbrains.android2.andrpoplib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ru.geekbrains.android2.andrpoplib.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var vb: ActivityMainBinding
    private val presenter = MainPresenter(this, CountersModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)
        vb.btnCounter1.setOnClickListener { presenter.counterOneClick() }
        vb.btnCounter2.setOnClickListener { presenter.counterTwoClick() }
        vb.btnCounter3.setOnClickListener { presenter.counterThreeClick() }
    }

    override fun setCounterOneText(text: String) {
        vb.btnCounter1.text = text
    }

    override fun setCounterTwoText(text: String) {
        vb.btnCounter2.text = text
    }

    override fun setCounterThreeText(text: String) {
        vb.btnCounter3.text = text
    }
}