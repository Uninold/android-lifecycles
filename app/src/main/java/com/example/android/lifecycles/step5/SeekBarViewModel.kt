package com.example.android.lifecycles.step5

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by Arnold on 28 Apr 2018.
 */
class SeekBarViewModel : ViewModel() {

    var seekbarValue = MutableLiveData<Int>()
}