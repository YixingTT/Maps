package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText textField1 = (EditText) findViewById(R.id.textField1);
        EditText textField2 = (EditText) findViewById(R.id.textField2);
        String input1 = textField1.getText().toString();
        String input2 = textField2.getText().toString();
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int result = 0;

        switch (view.getId()){
            case R.id.button:
                result = num1 + num2;
                break;
            case R.id.button2:
                result = num1 - num2;
                break;
            case R.id.button3:
                result = num1 * num2;
                break;
            case R.id.button4:
                result = num1 / num2;
                break;
        }

        goToActivity2(result);
    }

    public void goToActivity2(int n){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", String.valueOf(n));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}