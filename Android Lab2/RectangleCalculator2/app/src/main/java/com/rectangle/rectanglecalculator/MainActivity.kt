package com.rectangle.rectanglecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the XML layout
        setContentView(R.layout.activity_main)

        // Find the views using findViewById
        val lengthInput: EditText = findViewById(R.id.lengthInput)
        val widthInput: EditText = findViewById(R.id.widthInput)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resetButton: Button = findViewById(R.id.resetButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Set click listener for calculate button
        calculateButton.setOnClickListener {
            val length = lengthInput.text.toString().toDoubleOrNull()
            val width = widthInput.text.toString().toDoubleOrNull()
            if (validateInput(length, width)) {
                val perimeter = calculatePerimeter(length!!, width!!)
                val area = calculateArea(length, width)
                resultTextView.text = "Perimeter: $perimeter\nArea: $area"
            } else {
                resultTextView.text = "Invalid Input"
            }
        }

        // Set click listener for reset button
        resetButton.setOnClickListener {
            lengthInput.text.clear()
            widthInput.text.clear()
            resultTextView.text = "Results will be displayed here"
        }
    }

    private fun validateInput(length: Double?, width: Double?): Boolean {
        return length != null && width != null && length > 0 && width > 0
    }

    private fun calculatePerimeter(length: Double, width: Double): Double {
        return 2 * (length + width)
    }

    // Method to calculate the area of the rectangle
    private fun calculateArea(length: Double, width: Double): Double {
        return length * width
    }
}
