package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }


        private fun setListeners() {

            val boxOneText = findViewById<TextView>(R.id.box_one_text)
            val boxTwoText = findViewById<TextView>(R.id.box_two_text)
            val boxThreeText = findViewById<TextView>(R.id.box_three_text)
            val boxFourText = findViewById<TextView>(R.id.box_four_text)
            val boxFiveText = findViewById<TextView>(R.id.box_five_text)
            val redButton = findViewById<Button>(R.id.red_button)
            val greenButton = findViewById<Button>(R.id.green_button)
            val yellowButton = findViewById<Button>(R.id.yellow_button)

            val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

            val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, rootConstraintLayout,
                    redButton, greenButton, yellowButton
                )

            for (item in clickableViews) {
                item.setOnClickListener { makeColored(it) }
            }

            sendMessage()
        }

        private fun makeColored(view: View) {
            when (view.id) {

                // Boxes using Color class colors for the background
                R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
                R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
                R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
                R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

                else -> view.setBackgroundColor(Color.LTGRAY)

            }

        }

    private fun sendMessage (){
        val redButton : Button = findViewById(R.id.red_button)
        val greenButton : Button = findViewById(R.id.green_button)
        val yellowButton : Button = findViewById(R.id.yellow_button)

        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        redButton.setOnClickListener {
            boxThreeText.setBackgroundResource(R.color.my_red)
        }
        greenButton.setOnClickListener {
            boxFourText.setBackgroundResource(R.color.my_green)
        }
        yellowButton.setOnClickListener {
            boxFiveText.setBackgroundResource(R.color.my_yellow)
        }

    }
    }
