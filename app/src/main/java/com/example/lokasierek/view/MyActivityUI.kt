package com.example.lokasierek.view

import android.content.res.Resources
import android.widget.LinearLayout
import com.example.lokasierek.MainActivity
import org.jetbrains.anko.*

class MyActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL

            editText {
                hint = "Name"
            }.lparams(width = matchParent, height = wrapContent){
                bottomMargin = dip(100)
            }

            button("Say Hello") {
            }.lparams(width = matchParent, height = wrapContent)
        }
    }

    fun Int.toDp(): Int = (this / Resources.getSystem().displayMetrics.density).toInt()
}