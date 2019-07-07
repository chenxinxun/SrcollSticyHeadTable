package com.example.sticyscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        content.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        content.adapter = ContentAdapter(this)
        left.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        left.adapter = LeftAdapter(this)
        t_head.setScrollView(t_body)
        t_body.setScrollView(t_head)
        content.isNestedScrollingEnabled = false
        left.isNestedScrollingEnabled = false
    }
}
