package com.android.mlify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.mlify.R
import java.util.ArrayList

class AboutAdapter : RecyclerView.Adapter<AboutAdapter.MyViewHolder>() {

    var devList = ArrayList<String>()
    var devemailList = ArrayList<String>()
    var devRoll = ArrayList<String>()
    var devReg = ArrayList<String>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(
            R.layout.devinfo,
            parent, false
        )
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.name.text = devList[position]
        holder.roll.text = devRoll[position]
        holder.reg.text = devReg[position]
        holder.email.text = devemailList[position]
    }

    override fun getItemCount(): Int {
        return devList.size
    }

    fun updateDevList(
        devList: ArrayList<String>,
        devemailList: ArrayList<String>,
        devRoll: ArrayList<String>,
        devReg: ArrayList<String>
    ) {

        this.devList.clear()
        this.devemailList.clear()
        this.devReg.clear()
        this.devRoll.clear()


        this.devList.addAll(devList)
        this.devemailList.addAll(devemailList)
        this.devReg.addAll(devReg)
        this.devRoll.addAll(devRoll)
        notifyDataSetChanged()

    }

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val name: TextView = itemview.findViewById(R.id.devName)
        val roll: TextView = itemview.findViewById(R.id.devRoll)
        val reg: TextView = itemview.findViewById(R.id.devReg)
        val email: TextView = itemview.findViewById(R.id.devEmail)
    }
}