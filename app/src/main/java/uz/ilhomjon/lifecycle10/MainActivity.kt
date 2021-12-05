package uz.ilhomjon.lifecycle10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var myObservable: MyObservable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        myObservable = MyObservable()
//
//        lifecycle.addObserver(myObservable)

        supportFragmentManager.beginTransaction().replace(R.id.container, BlankFragment()).commit()
    }
}