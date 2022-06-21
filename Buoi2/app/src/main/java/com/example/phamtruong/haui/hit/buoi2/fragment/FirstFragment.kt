package com.example.phamtruong.haui.hit.buoi2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.phamtruong.haui.hit.buoi2.R
import org.w3c.dom.Text

class FirstFragment : Fragment() {
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_first, container, false)

        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        view.findViewById<TextView>(R.id.txt_signin).setOnClickListener{
            navController!!.navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        view.findViewById<TextView>(R.id.txt_join).setOnClickListener{
            navController!!.navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }


}