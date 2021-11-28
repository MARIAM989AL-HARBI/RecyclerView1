package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var etMessage: EditText
    private lateinit var btSubmit: Button
    private lateinit var rvMain: RecyclerView
    private lateinit var messages: ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etMessage = findViewById(R.id.etMessage)
        btSubmit = findViewById(R.id.btSubmit)
        btSubmit.setOnClickListener {
            messages.add(etMessage.text.toString())
            rvMain.adapter?.notifyDataSetChanged()
        }
        messages = arrayListOf()
        rvMain = findViewById(R.id.rvMain)
        rvMain.adapter = RVAdapter(messages)
        rvMain.layoutManager = LinearLayoutManager(this)
    }
}
