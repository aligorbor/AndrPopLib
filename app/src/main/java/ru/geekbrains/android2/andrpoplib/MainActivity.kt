package ru.geekbrains.android2.andrpoplib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ru.geekbrains.android2.andrpoplib.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var vb: ActivityMainBinding
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)
        presenter = MainPresenter(this, IdsInteractorImpl(this))
        vb.btnCounter1.setOnClickListener { presenter.counterClick(it.id) }
        vb.btnCounter2.setOnClickListener { presenter.counterClick(it.id) }
        vb.btnCounter3.setOnClickListener { presenter.counterClick(it.id) }
    }

    override fun setButtonText(index: Int, text: String) {
        findViewById<Button>(index).text = text
    }
}