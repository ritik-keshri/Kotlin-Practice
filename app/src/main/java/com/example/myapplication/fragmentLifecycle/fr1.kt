package com.example.fragmentlifecycle

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class fr1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG, "onAttach: Fragment", )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate: Fragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG, "onCreateView: Fragment", )
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fr1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG, "onActivityCreated: Fragment", )
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: Fragment", )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: Fragment", )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: Fragment", )
    }
    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: Fragment", )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG, "onDestroyView: Fragment", )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: Fragment", )
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG, "onDetach: Fragment", )
    }
    
    
}