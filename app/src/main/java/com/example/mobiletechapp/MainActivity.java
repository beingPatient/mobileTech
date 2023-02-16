package com.example.mobiletechapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        setTitle("Mobile Tech App");

        /* Q2 */
        Button button = findViewById(R.id.buttonOK);
        EditText editText = findViewById(R.id.editTextInput);
        TextView textView = findViewById(R.id.textViewOutput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                textView.setText(message);
            }
        });

        /* Q3*/
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText("");
            }
        });


        /*Q4*/
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode==KeyEvent.KEYCODE_ENTER){
                    TextView textView = findViewById(R.id.textViewOutput);
                    EditText editText = findViewById(R.id.editTextInput);
                    textView.setText(editText.getText());
                }

                return false;
            }
        });
    }

    public void displayMessage(View view) {
        TextView textView = findViewById(R.id.textViewOutput);
        EditText editText = findViewById(R.id.editTextInput);
        textView.setText(editText.getText());



        Toast.makeText(this, "OK button clicked", Toast.LENGTH_SHORT).show();
    }

}