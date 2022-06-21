package com.example.phamtruong.haui.hit.buoi2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.phamtruong.haui.hit.buoi2.R


class SecondFragment : Fragment() {
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        view.findViewById<TextView>(R.id.txt_signup).setOnClickListener{
            navController!!.navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        view.findViewById<TextView>(R.id.txt_back).setOnClickListener{
            navController!!.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }
}