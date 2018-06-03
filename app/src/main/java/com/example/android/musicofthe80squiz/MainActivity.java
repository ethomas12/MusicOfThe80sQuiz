package com.example.android.musicofthe80squiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int sumTrue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int submitScore(View view) {

        // ************ Question 1 ************* //
        CheckBox checkbox1a = findViewById(R.id.checkbox_1_a);
        boolean is1a = checkbox1a.isChecked();

        CheckBox checkbox1c = findViewById(R.id.checkbox_1_c);
        boolean is1c = checkbox1c.isChecked();

        if (is1a && is1c) {
            sumTrue++;
        }

        // ************ Question 2 ************* //
        RadioButton checkbox2a = findViewById(R.id.true_radio_button);
        boolean isTrue_2 = checkbox2a.isChecked();

        if (isTrue_2) {
            sumTrue++;
        }

        // ************ Question 3 ************* //
        CheckBox checkbox3a = findViewById(R.id.checkbox_3_a);
        boolean is3a = checkbox3a.isChecked();

        CheckBox checkbox3c = findViewById(R.id.checkbox_3_c);
        boolean is3c = checkbox3c.isChecked();

        CheckBox checkbox3e = findViewById(R.id.checkbox_3_e);
        boolean is3e = checkbox3e.isChecked();

        if (is3a && is3c && is3e) {
            sumTrue++;
        }

        // ************ Question 4 ************* //
        TextView typed_answer_4 = findViewById(R.id.quiz_4_editable);
        String your_answer_4 = typed_answer_4.getText().toString();


        if (your_answer_4.equalsIgnoreCase("love on the run")) {
            sumTrue++;
        }

        // ************ Question 5 ************* //
        RadioButton checkBox5b = findViewById(R.id.ba_radio);
        boolean isFalse_5 = checkBox5b.isChecked();

        if (isFalse_5) {
            sumTrue++;
        }

        // ************ Question 6 ************* //
        CheckBox checkBox6b = findViewById(R.id.checkbox_6_b);
        boolean is6b = checkBox6b.isChecked();

        CheckBox checkbox6d = findViewById(R.id.checkbox_6_d);
        boolean is6d = checkbox6d.isChecked();

        CheckBox checkbox6e = findViewById(R.id.checkbox_6_e);
        boolean is6e = checkbox6e.isChecked();

        if (is6b && is6d && is6e) {
            sumTrue++;
        }

        // ************ Question 7 ************* //
        RadioButton checkBox7b = findViewById(R.id.radio_button_7b);
        boolean isFalse_7 = checkBox7b.isChecked();

        if (isFalse_7) {
            sumTrue++;
        }

        // ************ Question 8 ************* //
        TextView typed_answer_8 = findViewById(R.id.quiz_8_editable);
        String your_answer_8 = typed_answer_8.getText().toString();


        if (your_answer_8.equalsIgnoreCase("my name is Luka")) {
            sumTrue++;
        }

        // ************ Question 9 ************* //
        RadioButton checkbox9d = findViewById(R.id.checkbox_9_d);
        boolean is9d = checkbox9d.isChecked();

        if (is9d) {
            sumTrue++;
        }

        // ************ Question 10 ************* //
        RadioButton checkBox10b = findViewById(R.id.radio_button_10b);
        boolean isFalse_10 = checkBox10b.isChecked();

        if (isFalse_10) {
            sumTrue++;
        }

        //************* Calculate score ************//

        int startScore = 0;

        int finalScore = startScore + sumTrue;

        Toast toast = Toast.makeText(this, "You got " + finalScore + " out of 10 correct!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        if (finalScore > 8) {

            Toast toast2 = Toast.makeText(this, "Totally tubular!", Toast.LENGTH_SHORT);
            toast2.setGravity(Gravity.CENTER_VERTICAL, 0, 160);
            toast2.show();
        } else {
            Toast toast4 = Toast.makeText(this, "Rad", Toast.LENGTH_SHORT);
            toast4.setGravity(Gravity.CENTER_VERTICAL, 0, 160);
            toast4.show();
        }

        ScrollView scrollToTop = findViewById(R.id.scrollView);
        scrollToTop.setScrollY(0);

        TextView answer1TextView = findViewById(R.id.answer_1);
        answer1TextView.setText(R.string.fact_1);

        TextView answer2TextView = findViewById(R.id.answer_2);
        answer2TextView.setText(R.string.fact_2);

        TextView answer3TextView = findViewById(R.id.answer_3);
        answer3TextView.setText(R.string.fact_3);

        TextView answer4TextView = findViewById(R.id.answer_4);
        answer4TextView.setText(R.string.fact_4);

        TextView answer5TextView = findViewById(R.id.answer_5);
        answer5TextView.setText(R.string.fact_5);

        TextView answer6TextView = findViewById(R.id.answer_6);
        answer6TextView.setText(R.string.fact_6);

        TextView answer7TextView = findViewById(R.id.answer_7);
        answer7TextView.setText(R.string.fact_7);

        TextView answer8TextView = findViewById(R.id.answer_8);
        answer8TextView.setText(R.string.fact_8);

        TextView answer9TextView = findViewById(R.id.answer_9);
        answer9TextView.setText(R.string.fact_9);

        TextView answer10TextView = findViewById(R.id.answer_10);
        answer10TextView.setText(R.string.fact_10);

        return sumTrue = 0;
    }

}

