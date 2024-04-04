package com.example.historicalappassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // Declare
    private lateinit var checkButton: Button
    private lateinit var editText: EditText
    private lateinit var clearButton: Button
    private lateinit var instructionTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize
        checkButton = findViewById(R.id.checkButton)
        clearButton = findViewById(R.id.clearButton)
        editText = findViewById(R.id.ageEditText)
        instructionTextView = findViewById(R.id.resultTextView)

        checkButton.setOnClickListener {
            // Create a variable for age to get value from the user
            val age = editText.text.toString().toIntOrNull()

            // If age is not null and age is in the range between 20 and 100
            if (age != null && age in 20..100) {

                // When age is 87 display Mother Teresa, else when it is.. and so on
                val name = when (age) {

                    96 -> "Queen Elizabeth: " +
                            "Had ruled most of European countries. " +
                            "Longest reigning ruler known for 7 decades. " +
                            "Witnessed significant global events such as Wars and the Global Pandemic."

                    87 -> "Mother Teresa: " +
                            "Well-known Albanian-Indian Christian-Catholic Nun who founded religious congregation and charities. " +
                            "Admired by most individuals but singled out on the greatest controversial topics of today about abortion and contraception. " +
                            "Her clinics received millions in donations but lacked medical care as she believed that the sick must suffer like Christ on the cross."

                    86 -> "Nikola Tesla: " +
                            "Famously known Dr light hold the record of brilliant inventions that we use every day. " +
                            "Creator of AC (alternative current). " +
                            "Discovered how light or globes work."

                    79 -> "Mahatma Gandhi: " +
                            "Upon his arrival to KZN, he was unfortunately subject to racism. " +
                            "He is called Mahatma which refers to great soul and conveys deep respect to his leadership skills and excellence. " +
                            "His birthday (2nd October) is taken as an International Day of Nonviolence."

                    69 -> "Marco Polo: " +
                            "Late European Explorer and Adventurer spent close to 2 decades exploring the Asian continent. " +
                            "His excellence resulted in things we use in our day-to-day life such as paper money, postal system, eyeglasses, and brilliant architecture that still exists even after 100 years."

                    56 -> "Adolf Hitler: " +
                            "Former leader of Nazi Germany. " +
                            "His fascist agenda led to World War II and millions of people died."

                    48 -> "Princess Diana: " +
                            "Late former Princess of Wales ended one of the greatest controversial topics of all time when she shook dozens of hands of patients who were diagnosed with HIV and AIDS. " +
                            "A former activist for HIV and AIDS who educated millions of individuals that this particular disease cannot be contracted through physical touch such as a hug or handshake."

                    46 -> "Pablo Escobar: " +
                            "Late Cartel, Drug Lord, and Billionaire. " +
                            "A role model and the man responsible for the vast drug activities affecting the world today. " +
                            "Every monster has a soft spot, and with that being said, it's no surprise that with the amount of money he had, he donated it to social programs and housing projects helping the unfortunate."

                    41 -> "King Shaka Zulu: " +
                            "Great King Shaka Zulu former founder and king of the Zulu (culture) Kingdom in South Africa, Kwa-Zulu Natal. " +
                            "Powerful warrior and ruler who used his strength to unite kingdoms in his territory. " +
                            "Groomed young boys to be strong and great men to be part of his army and fight in wars."

                    39 -> "Martin Luther King Jr: " +
                            "Named after Protestant reformer Martin Luther and believed in peaceful protest with no violence. " +
                            "One of the people who fought for civil rights in the states so that every person black, brown, or white is treated fairly. " +
                            "Had survived assassination from a racist individual, and a decade later passed through assassination which led to national mourning (USA)."

                    else -> null
                }
                val message = if (name != null) "Your age matches $name."
                else "No historical figure found with the entered age."
                instructionTextView.text = message
            } else {
                instructionTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
            }
        }
        clearButton.setOnClickListener {
            editText.text.clear()
            instructionTextView.text = ""
        }
    }
}