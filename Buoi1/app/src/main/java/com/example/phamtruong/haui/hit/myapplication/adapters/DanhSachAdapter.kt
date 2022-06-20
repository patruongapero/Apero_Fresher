package com.example.phamtruong.haui.hit.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.phamtruong.haui.hit.myapplication.R
import com.example.phamtruong.haui.hit.myapplication.ui.User

class DanhSachAdapter (var dataSet: ArrayList<User>) :
    RecyclerView.Adapter<DanhSachAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textName: TextView = view.findViewById(R.id.txtName)
        val textTime: TextView = view.findViewById(R.id.txtTime)
        val textTitle: TextView = view.findViewById(R.id.txtTitle)
        val textTimePin: TextView = view.findViewById(R.id.txtTimePin)
        val textNoiDung: TextView = view.findViewById(R.id.txtNoiDung)
        val textStatus: TextView = view.findViewById(R.id.txtStatus)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_ds, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textName.text = dataSet.get(position).name
        viewHolder.textTime.text = dataSet.get(position).time
        viewHolder.textTitle.text = dataSet.get(position).title
        viewHolder.textTimePin.text = dataSet.get(position).timePin
        viewHolder.textNoiDung.text = dataSet.get(position).noiDung
        viewHolder.textStatus.text = dataSet.get(position).status

    }

    override fun getItemCount() = dataSet.size

}
