package com.pashcabu.willitfitment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCurrentVal:Button = findViewById(R.id.btn_currentVal)
        btnCurrentVal.setOnClickListener { btnCurrentValues() }
        val btnCalculate:Button = findViewById(R.id.btn_calculate)
        //btnCalculate.setOnClickListener { btnCalculate() }
        val btnHowToUse:Button = findViewById(R.id.btn_howToUse)
       // btnHowToUse.setOnClickListener { btnHowToUse() }
    }

    private fun btnCurrentValues(){
        val intent:Intent= Intent(this, CurrentValues::class.java)
        startActivity(intent)
    }

    
}