package com.example.android.lifecycles.step2

import android.arch.lifecycle.ViewModel

/**
 * Created by Arnold on 28 Apr 2018.
 */

class ChronometerViewModel : ViewModel() {

    var startTime: Long? = null
        private set

    fun setStartTime(startTime: Long) {
        this.startTime = startTime
    }
}