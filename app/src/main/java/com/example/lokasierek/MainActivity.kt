package com.example.lokasierek

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lokasierek.view.MyActivityUI
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyActivityUI().setContentView(this)
    }
}