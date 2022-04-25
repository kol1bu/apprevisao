package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.done_button)
        rollButton.setOnClickListener { addCampos() }

    }
        private fun addCampos(){
            val campo1 = findViewById<EditText>(R.id.campo_1)
            val campo2 = findViewById<EditText>(R.id.campo_2)

            if (campo1.text.isNotEmpty() && (campo2.text.isNotEmpty())) {
                if (Integer.parseInt(campo1.text.toString()) > Integer.parseInt(campo2.text.toString())) {
                    Toast.makeText(
                        this, "O campo 1 é maior que o 2",
                        Toast.LENGTH_SHORT
                    ).show()
                } else if (Integer.parseInt(campo2.text.toString()) > Integer.parseInt(campo1.text.toString())) {
                    Toast.makeText(
                        this, "O campo 2 é maior que o 1",
                        Toast.LENGTH_SHORT
                    ).show()
                } else if (Integer.parseInt(campo1.text.toString()) == Integer.parseInt(campo2.text.toString())) {
                    Toast.makeText(
                        this, "Os campos são iguais",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                }
            }
        }
}


