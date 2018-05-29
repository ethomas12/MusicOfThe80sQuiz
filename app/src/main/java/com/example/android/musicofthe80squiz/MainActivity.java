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
    int sumFalse = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkBtn4(View v) {

        // ************ Question 4 ************* //
        TextView typed_answer_4 = findViewById(R.id.quiz_4_editable);
        String your_answer_4 = typed_answer_4.getText().toString();


        if (your_answer_4.equalsIgnoreCase("love on the run")) {
            //happy toast!
            Toast.makeText(getApplicationContext(), "That is correct!",
                    Toast.LENGTH_SHORT).show();

        } else {
            sumFalse += 1;
            //whoops toast
            Toast.makeText(getApplicationContext(), "Uh, not quite..",
                    Toast.LENGTH_SHORT).show();
        }

    }

    public void checkBtn8(View v) {

        // ************ Question 8 ************* //
        TextView typed_answer_8 = findViewById(R.id.quiz_8_editable);
        String your_answer_8 = typed_answer_8.getText().toString();


        if (your_answer_8.equalsIgnoreCase("my name is Luka")) {
            //Make the toast a variable so we can make changes to it
            //happy toast!
            Toast toast = Toast.makeText(this, "That is correct!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();

        } else {
            sumFalse += 1;
            //whoops toast
            Toast toast = Toast.makeText(this, "Uh, not quite..", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();
        }

    }


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

        if (!is1a | !is1c) {
            sumFalse += 1;
        } else if (is1b || is1d || is1e) {
            sumFalse += 1;
        }

        // ************ Question 2 ************* //
        RadioButton checkbox2a = findViewById(R.id.true_radio_button);
        boolean isTrue_2 = checkbox2a.isChecked();

        RadioButton checkBox2b = findViewById(R.id.false_radio_button);
        boolean isFalse_2 = checkBox2b.isChecked();


        if (!isTrue_2 | isFalse_2) {
            sumFalse += 1;
        }

        // ************ Question 3 ************* //
        CheckBox checkbox3a = findViewById(R.id.checkbox_3_a);
        boolean is3a = checkbox3a.isChecked();

        CheckBox checkBox3b = findViewById(R.id.checkbox_3_b);
        boolean is3b = checkBox3b.isChecked();

        CheckBox checkbox3c = findViewById(R.id.checkbox_3_c);
        boolean is3c = checkbox3c.isChecked();

        CheckBox checkbox3d = findViewById(R.id.checkbox_3_d);
        boolean is3d = checkbox3d.isChecked();

        CheckBox checkbox3e = findViewById(R.id.checkbox_3_e);
        boolean is3e = checkbox3e.isChecked();

        if (!is3a | !is3c | !is3e) {
            sumFalse += 1;
        } else if (is3b || is3d) {
            sumFalse += 1;
        }

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
        } else if (is6a || is6c) {
            sumFalse += 1;
        }

        // ************ Question 7 ************* //
        RadioButton checkbox7a = findViewById(R.id.radio_button_7a);
        boolean isTrue_7 = checkbox7a.isChecked();

        RadioButton checkBox7b = findViewById(R.id.radio_button_7b);
        boolean isFalse_7 = checkBox7b.isChecked();


        if (isTrue_7 | !isFalse_7) {
            sumFalse += 1;
        }

        // ************ Question 9 ************* //
        RadioButton checkbox9a = findViewById(R.id.checkbox_9_a);
        boolean is9a = checkbox9a.isChecked();

        RadioButton checkBox9b = findViewById(R.id.checkbox_9_b);
        boolean is9b = checkBox9b.isChecked();

        RadioButton checkbox9c = findViewById(R.id.checkbox_9_c);
        boolean is9c = checkbox9c.isChecked();

        RadioButton checkbox9d = findViewById(R.id.checkbox_9_d);
        boolean is9d = checkbox9d.isChecked();

        RadioButton checkbox9e = findViewById(R.id.checkbox_9_e);
        boolean is9e = checkbox9e.isChecked();

        if (!is9d) {
            sumFalse += 1;
        } else if (is9a || is9b || is9c || is9e) {
            sumFalse += 1;
        }

        // ************ Question 10 ************* //
        RadioButton checkbox10a = findViewById(R.id.babies_adults_radio_button);
        boolean isTrue_10 = checkbox5a.isChecked();

        RadioButton checkBox10b = findViewById(R.id.adults_babies_radio_button);
        boolean isFalse_10 = checkBox5b.isChecked();

        if (!isFalse_10 || isTrue_10) {
            sumFalse += 1;
        }

        //************* Calculate score ************//

        int startScore = 8;

        int finalScore = startScore - sumFalse;

        TextView quantityTextView = findViewById(R.id.final_score_message);
        quantityTextView.setText("You got " + finalScore + " out of " + startScore + " correct!");

        return finalScore;
    }

    // ************ Check Answers ************* //

    public void showAnswers(View view) {

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
        answer7TextView.setText(R.string.fact_9);

        TextView answer10TextView = findViewById(R.id.answer_10);
        answer8TextView.setText(R.string.fact_10);

    }

}

