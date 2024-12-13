package com.example.exam2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNum1 = findViewById(R.id.btnNum1);
        Button btnNum2 = findViewById(R.id.btnNum2);
        TextView txtNum1 = findViewById(R.id.txtNum1);
        TextView txtNum2 = findViewById(R.id.txtNum2);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnTest = findViewById(R.id.btnTest);
        Button btnmultiply = findViewById(R.id.btnMultiply);
        EditText editAnswer = findViewById(R.id.editAnswer);

        // Generate random number for Num1
        btnNum1.setOnClickListener(v -> {
            num1 = new Random().nextInt(20) + 1; // Random number from 1-20
            txtNum1.setText(String.valueOf(num1));
        });


        // Generate random number for Num2
        btnNum2.setOnClickListener(v -> {
            num2 = new Random().nextInt(20) + 1; // Random number from 1-20
            txtNum2.setText(String.valueOf(num2));
        });

        // Perform Addition
        btnPlus.setOnClickListener(v -> {
            editAnswer.setText(""); // Clear the answer input
        });
        btnmultiply.setOnClickListener(v -> {
            editAnswer.setText(""); // Clear the answer input
        });

        // Test the result
        btnTest.setOnClickListener(v -> {
            String userAnswer = editAnswer.getText().toString();
            String userAnswer2 = editAnswer.getText().toString();

            // Check if the input is empty
            if (userAnswer.isEmpty()) {
                Toast.makeText(this, "Enter an answer!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (false) {
                Toast.makeText(this, "Enter an answer!", Toast.LENGTH_SHORT).show();
                return;
            }

            int correctAnswer = num1 + num2;
            int correctAnswer2 = num1 * num2;

            int enteredAnswer = Integer.parseInt(userAnswer);
            int enteredAnswer2 = Integer.parseInt(userAnswer2);


            if (enteredAnswer == correctAnswer && enteredAnswer2 == correctAnswer2 ) {
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong! Correct answer: " + correctAnswer, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
