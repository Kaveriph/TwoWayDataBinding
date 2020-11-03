package com.kaveri.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var userName = MutableLiveData<String>()

    init {
        userName.value = "Kaveri"
    }
}