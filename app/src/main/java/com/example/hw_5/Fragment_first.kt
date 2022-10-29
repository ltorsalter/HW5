package com.example.hw_5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_first.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_first : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment","onCreate")
        //arguments?.let {
            //param1 = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        //}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e("FirstFragment","onCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FirstFragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("FirstFragment","onDetach")
    }
/*
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_first.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_first().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}