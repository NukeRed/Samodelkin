package com.derkun.samodelkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class NewCharacterActivity : AppCompatActivity() {

    private var characterData = CharacterGeneratorVersion.generate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_character)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val raceTextView = findViewById<TextView>(R.id.raceTextView)
        val dexterityTextView = findViewById<TextView>(R.id.dexterityTextView)
        val wisdomTextView = findViewById<TextView>(R.id.wisdomTextView)
        val strengthTextView = findViewById<TextView>(R.id.strengthTextView)
        val generateButton = findViewById<TextView>(R.id.generateButton)





            characterData.run {
                nameTextView.text = name
                raceTextView.text = race
                dexterityTextView.text = dex
                wisdomTextView.text = wis
                strengthTextView.text = str
            }
        }
    }

