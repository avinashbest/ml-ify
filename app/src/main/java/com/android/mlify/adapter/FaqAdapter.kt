package com.android.mlify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.mlify.R
import java.util.ArrayList

class FaqAdapter : RecyclerView.Adapter<FaqAdapter.MyViewHolder>() {

    var qusList = ArrayList<String>()
    var ansList = ArrayList<String>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(
            R.layout.faqquestions,
            parent, false
        )
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {


        holder.question.text = qusList[position]
        holder.answer.text = ansList[position]
    }

    override fun getItemCount(): Int {
        return qusList.size
    }

    fun updateQusList(qusList: ArrayList<String>,ansList: ArrayList<String>) {

        this.qusList.clear()
        this.ansList.clear()

        this.qusList.addAll(qusList)
        this.ansList.addAll(ansList)
        notifyDataSetChanged()

    }

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val question: TextView = itemview.findViewById(R.id.faqQuestion)
        val answer: TextView = itemview.findViewById(R.id.faqAnswer)
    }
}