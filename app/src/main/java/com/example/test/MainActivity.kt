package com.example.test



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var buttonGen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        buttonGen = findViewById(R.id.buttonGen)

        buttonGen.setOnClickListener {

                val generator = NumberGenerator()
                val results = generator.processNumbers()
                textView.text = results


        }
    }
}