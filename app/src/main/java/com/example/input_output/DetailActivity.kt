package com.example.input_output

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail.*
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

        private lateinit var hasil_nim : TextView
        private lateinit var  hasil_nama : TextView
        private lateinit var hasil_nilai : TextView
        private lateinit var grade_nilai : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        hasil_nim = findViewById(R.id.hsl_nim)
        hasil_nama = findViewById(R.id.hsl_nama)
        hasil_nilai = findViewById(R.id.hsl_nilai)
        grade_nilai = findViewById(R.id.hsl_rate)

        supportActionBar?.title="Hasil Output"

        hasil_nim.setText(intent.getStringExtra("data_nim"))
        hasil_nama.setText(intent.getStringExtra("data_nama"))
        hasil_nilai.setText(intent.getStringExtra("data_nilai"))
//        grade_nilai.setText(intent.getStringExtra("data_ket"))
        if (intent.getStringExtra("data_ket").toInt()>=80){
            hsl_rate.text = "A"
        }else if ((intent.getStringExtra("data_ket").toInt()>=60)){
            hsl_rate.text = "B"
        }else if((intent.getStringExtra("data_ket").toInt()>=40)){
            hsl_rate.text = "C"
        }else if((intent.getStringExtra("data_ket").toInt()>=20)){
            hsl_rate.text = "D"
        }else if((intent.getStringExtra("data_ket").toInt()>=0)){
            hsl_rate.text = "E"
        }
        btn_back.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

