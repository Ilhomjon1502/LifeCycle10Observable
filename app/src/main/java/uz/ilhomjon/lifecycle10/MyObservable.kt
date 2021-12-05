package uz.ilhomjon.lifecycle10

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObservable : LifecycleObserver{
    private val TAG = "MyObservable"
    
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListener(){
        Log.d(TAG, "connectListener: onResume")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disconnectListener(){
        Log.d(TAG, "disconnectListener: onPause")
    }
}