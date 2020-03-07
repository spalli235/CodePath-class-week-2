package com.example.supriya.myflashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.my_cancel_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.my_save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String storeQuestion = ((EditText) findViewById(R.id.editQuestionField)).getText().toString();
                String storeAnswer = ((EditText) findViewById(R.id.editAnswerField)).getText().toString();
                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("string1", storeQuestion); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("string2", storeAnswer); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity
            }
        });
    }
}