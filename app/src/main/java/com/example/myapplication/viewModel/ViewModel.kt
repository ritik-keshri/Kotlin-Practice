package com.example.myapplication.viewModel

import androidx.lifecycle.ViewModel

//For ViewModel
//class ViewModel : ViewModel() {
//    var number = 0

//For ViewModelFactory
class ViewModel(count: Int) : ViewModel() {

    var number = count

    fun addNumber(){
        number++
    }
}