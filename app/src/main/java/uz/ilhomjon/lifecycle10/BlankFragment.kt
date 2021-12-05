package uz.ilhomjon.lifecycle10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {
    lateinit var myObservable: MyObservable

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        myObservable = MyObservable()
//        viewLifecycleOwner.lifecycle.addObserver(myObservable)
        lifecycle.addObserver(myObservable)

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}