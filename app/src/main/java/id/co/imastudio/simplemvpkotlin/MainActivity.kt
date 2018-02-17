package id.co.imastudio.simplemvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {



    //deklrasi presenter
    lateinit var presenter  : MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()

    }

    private fun initView() {
        inibutton.setOnClickListener {

            presenter.logicView(iniInput.text.toString())

        }

    }

    override fun Success() {
        Toast.makeText(this,"success",Toast.LENGTH_SHORT).show()

    }

    override fun Salah() {

        Toast.makeText(this,"ini input kosong",Toast.LENGTH_SHORT).show()


    }
    private fun initPresenter() {
        //init presenter
        presenter = MainPresenter(this)

       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
