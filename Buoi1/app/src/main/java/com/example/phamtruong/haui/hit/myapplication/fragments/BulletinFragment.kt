package com.example.phamtruong.haui.hit.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phamtruong.haui.hit.myapplication.R
import com.example.phamtruong.haui.hit.myapplication.adapters.DanhSachAdapter
import com.example.phamtruong.haui.hit.myapplication.ui.User


class BulletinFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_bulletin, container, false)
        // Inflate the layout for this fragment
        var edt : EditText = view.findViewById(R.id.edt)
        var bt1 : Button = view.findViewById(R.id.bt1)
        var bt2 : Button = view.findViewById(R.id.bt2)
        var rcy : RecyclerView = view.findViewById(R.id.rcy)

        bt1.setOnClickListener{
            Toast.makeText(view.context,"ok la",Toast.LENGTH_LONG).show()
        }

        var list = arrayListOf<String>()
        list.add("4 Attachments")
        list.add("1 Module")

        var listUser = arrayListOf<User>()
        listUser.add(User("You","23 Maret 2022 - 00:41 WIB","Algebra Theory 1","25 Maret 2022 - 00:01 WIB",requireContext().getString(R.string.noi_dung),"4 Attachments"))
        listUser.add(User("You","23 Maret 2022 - 00:41 WIB","Algebra Theory 1","25 Maret 2022 - 00:01 WIB",requireContext().getString(R.string.noi_dung),"1 Module"))


        var adapter : DanhSachAdapter = DanhSachAdapter(listUser)
        rcy.layoutManager = LinearLayoutManager(view.context)

        rcy.setHasFixedSize(true)
        rcy.itemAnimator = DefaultItemAnimator()
        rcy.adapter = adapter

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BulletinFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}