package com.example.madpractical7_21012022059

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        val BtnCreateAlarm = findViewById<MaterialButton>(R.id.btn_set_alarm)
        val mainLayout = findViewById<ConstraintLayout>(R.id.main_layout)
        val ShowTimeTV = findViewById<TextView>(R.id.show_time_tv)
        val dt = Date()
        ShowTimeTV.text= SimpleDateFormat("dd-MM-yyyy HH:mm a", Locale.getDefault()).format(Date());
        BtnCreateAlarm.setOnClickListener {
//            mainLayout.visibility=View.GONE
            showDialog()
        }
    }
    private fun showDialog()
    {
        var cal: Calendar = Calendar.getInstance()
        var hour = cal.get(Calendar.HOUR_OF_DAY)
        var min = cal.get(Calendar.MINUTE)
        val tpd = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener(function = { view, h, m ->
        }),hour,min,false)
        tpd.show()

    }
}