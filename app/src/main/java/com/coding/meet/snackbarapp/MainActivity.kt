package com.coding.meet.snackbarapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val shortTimeSnackBarBtn = findViewById<Button>(R.id.shortTimeSnackBarBtn)
        shortTimeSnackBarBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Short Time Show SnackBar after automatic Snack bar dismiss.",
                Snackbar.LENGTH_SHORT
            )
            snackBar.show()
        }

        val shortTimeSnackBarActionBtn = findViewById<Button>(R.id.shortTimeSnackBarActionBtn)
        shortTimeSnackBarActionBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Short Time Show SnackBar with Own Action after automatic Snack bar dismiss.",
                Snackbar.LENGTH_SHORT
            ).setAction("Action"){
                Toast.makeText(this,"Action",Toast.LENGTH_LONG).show()
            }
            snackBar.show()
        }




        val longTimeSnackBarBtn = findViewById<Button>(R.id.longTimeSnackBarBtn)
        longTimeSnackBarBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Long Time Show SnackBar after automatic Snack bar dismiss.",
                Snackbar.LENGTH_LONG
            )
            snackBar.show()
        }

        val longTimeSnackBarActionBtn = findViewById<Button>(R.id.longTimeSnackBarActionBtn)
        longTimeSnackBarActionBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Long Time Show SnackBar with Own Action after automatic Snack bar dismiss.",
                Snackbar.LENGTH_LONG
            ).setAction("Action"){
                Toast.makeText(this,"Action",Toast.LENGTH_LONG).show()
            }
            snackBar.show()
        }



        /// here no snackbar dismiss
        val indefiniteTimeSnackBarBtn = findViewById<Button>(R.id.indefiniteTimeSnackBarBtn)
        indefiniteTimeSnackBarBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "indefinite Time Show SnackBar",
                Snackbar.LENGTH_INDEFINITE
            )
            snackBar.show()
        }

        val indefiniteSnackBarActionBtn = findViewById<Button>(R.id.indefiniteSnackBarActionBtn)
        indefiniteSnackBarActionBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "indefinite Time Show SnackBar with Own Action",
                Snackbar.LENGTH_INDEFINITE
            ).setAction("Action"){
                Toast.makeText(this,"Action",Toast.LENGTH_LONG).show()
            }
            snackBar.show()
        }



        val customSnackBtn = findViewById<Button>(R.id.customSnackbarBtn)
        customSnackBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Customize View in Snack bar",
                Snackbar.LENGTH_LONG ///  LENGTH_INDEFINITE,LENGTH_SHORT,LENGTH_LONG
            )
            val snackBarView = snackBar.view
            snackBarView.setBackgroundColor(Color.parseColor("#050C20"))
            val snackBarTV = snackBarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            snackBarTV.setTextColor(Color.parseColor("#03FA6E"))
            val snackBarActionTv = snackBarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_action)
            snackBarActionTv.setTextColor(Color.parseColor("#03FA6E"))
            snackBar.show()
        }

        val customSnackActionBtn = findViewById<Button>(R.id.customSnackbarActionBtn)
        customSnackActionBtn.setOnClickListener {
            val snackBar = Snackbar.make(
                it,
                "Customize View in Snack bar With Action",
                Snackbar.LENGTH_LONG ///  LENGTH_INDEFINITE,LENGTH_SHORT,LENGTH_LONG
            ).setAction("Action"){
                Toast.makeText(this,"Action",Toast.LENGTH_LONG).show()
            }
            val snackBarView = snackBar.view
            snackBarView.setBackgroundColor(Color.parseColor("#050C20"))
            val snackBarTV = snackBarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            snackBarTV.setTextColor(Color.parseColor("#03FA6E"))
            val snackBarActionTv = snackBarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_action)
            snackBarActionTv.setTextColor(Color.parseColor("#03FA6E"))
            snackBar.show()
        }



    }
}