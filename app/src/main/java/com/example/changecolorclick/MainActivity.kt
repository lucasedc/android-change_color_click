package com.example.changecolorclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbChangeColor.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if(id == cbChangeColor.id){
            changeColor()
        }
    }

    private fun changeColor() {
        if(cbChangeColor.isChecked){
            imgChangeColor.setColorFilter(resources.getColor(R.color.purple_700))
        }else{
            imgChangeColor.setColorFilter(resources.getColor(R.color.black))
        }
    }
}