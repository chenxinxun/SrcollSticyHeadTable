package com.example.sticyscrollview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class LeftAdapter(val context:Context):RecyclerView.Adapter<LeftAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setUp(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return   ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_h_data, parent, false))
    }



    override fun getItemCount(): Int {
        return 20
    }

    inner class ViewHolder(override val containerView: View):RecyclerView.ViewHolder(containerView), LayoutContainer{
        fun setUp(position: Int){

        }


    }




}