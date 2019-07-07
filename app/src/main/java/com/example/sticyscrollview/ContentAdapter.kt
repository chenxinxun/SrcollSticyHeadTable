package com.example.sticyscrollview

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class ContentAdapter(val context:Context):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(position == 0){

        } else {

            holder as ViewHolder
            holder.setUp(position)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return   ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_data, parent, false))
    }



    override fun getItemCount(): Int {
        return 20
    }

    inner class ViewHolder(override val containerView: View):RecyclerView.ViewHolder(containerView), LayoutContainer{
        fun setUp(position: Int){
            containerView.setBackgroundColor(Color.WHITE)
        }


    }




}