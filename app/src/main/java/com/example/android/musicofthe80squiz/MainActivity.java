package com.example.android.musicofthe80squiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sumFalse = 0;

        public int submitScore(View view) {

            // ************ Question 1 ************* //
            CheckBox checkbox1a = findViewById(R.id.checkbox_1_a);
            boolean is1a = checkbox1a.isChecked();

            CheckBox checkBox1b = findViewById(R.id.checkbox_1_b);
            boolean is1b = checkBox1b.isChecked();

            CheckBox checkbox1c = findViewById(R.id.checkbox_1_c);
            boolean is1c = checkbox1c.isChecked();

            CheckBox checkbox1d = findViewById(R.id.checkbox_1_d);
            boolean is1d = checkbox1d.isChecked();

            CheckBox checkbox1e = findViewById(R.id.checkbox_1_e);
            boolean is1e = checkbox1e.isChecked();

            if (!is1a | !is1c ) {
                sumFalse += 1;
            }

            else if (is1b || is1d || is1e) {
                sumFalse += 1;
            }

            // ************ Question 3 ************* //
            RadioButton checkbox3a = findViewById(R.id.true_radio_button);
            boolean isTrue_3 = checkbox3a.isChecked();

            RadioButton checkBox3b = findViewById(R.id.false_radio_button);
            boolean isFalse_3 = checkBox3b.isChecked();


            if (isTrue_3 | !isFalse_3) {
                sumFalse += 1;
            }

            // ************ Question 4 ************* //


            // ************ Question 5 ************* //
            RadioButton checkbox5a = findViewById(R.id.babies_adults_radio_button);
            boolean isTrue_5 = checkbox5a.isChecked();

            RadioButton checkBox5b = findViewById(R.id.adults_babies_radio_button);
            boolean isFalse_5 = checkBox5b.isChecked();

            if (isFalse_5 || !isTrue_5) {
                sumFalse += 1;
            }

            // ************ Question 6 ************* //
            CheckBox checkbox6a = findViewById(R.id.checkbox_6_a);
            boolean is6a = checkbox6a.isChecked();

            CheckBox checkBox6b = findViewById(R.id.checkbox_6_b);
            boolean is6b = checkBox6b.isChecked();

            CheckBox checkbox6c = findViewById(R.id.checkbox_6_c);
            boolean is6c = checkbox6c.isChecked();

            CheckBox checkbox6d = findViewById(R.id.checkbox_6_d);
            boolean is6d = checkbox6d.isChecked();

            CheckBox checkbox6e = findViewById(R.id.checkbox_6_e);
            boolean is6e = checkbox6e.isChecked();

            if (!is6b | !is6d | !is6e) {
                sumFalse += 1;
            }

            else if (is6a || is6c) {
                sumFalse += 1;
            }

            // ************ Question 7 ************* //
            RadioButton checkbox7a = findViewById(R.id.radio_button_7a);
            boolean isTrue_7 = checkbox7a.isChecked();

            RadioButton checkBox7b = findViewById(R.id.radio_button_7b);
            boolean isFalse_7 = checkBox7b.isChecked();


            if (isTrue_3 | !isFalse_3) {
                sumFalse += 1;
            }

            // ************ Question 8 ************* //



        }

        // ************ Check Answers ************* //

        //  Question 1
        public void checkBtn1(View view) {
            TextView answer1TextView = findViewById(R.id.answer_1);
            answer1TextView.setText(R.string.fact_1);
        }

        //  Question 2
        public void checkBtn2(View view) {
            TextView answer2TextView = findViewById(R.id.answer_2);
            answer2TextView.setText(R.string.fact_2);
        }

        //  Question 3
        public void checkBtn3(View view) {
            TextView answer3TextView = findViewById(R.id.answer_3);
            answer3TextView.setText(R.string.fact_3);
        }

        // Question 4
        public void checkBtn4(View view) {
            TextView answer4TextView = findViewById(R.id.answer_4);
            answer4TextView.setText(R.string.fact_4);
        }

        // Question 5
        public void checkBtn5(View view) {
            TextView answer5TextView = findViewById(R.id.answer_5);
            answer5TextView.setText(R.string.fact_5);
        }

        //  Question 6
        public void checkBtn6(View view) {
            TextView answer6TextView = findViewById(R.id.answer_6);
            answer6TextView.setText(R.string.fact_6);
        }
        // Question 7
        public void checkBtn7(View view) {
            TextView answer7TextView = findViewById(R.id.answer_7);
            answer7TextView.setText(R.string.fact_7);
        }

        // Question 8
        public void checkBtn8(View view) {
            TextView answer8TextView = findViewById(R.id.answer_8);
            answer8TextView.setText(R.string.fact_8);
        }

}
