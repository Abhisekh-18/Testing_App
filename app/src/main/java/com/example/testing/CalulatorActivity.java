package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalulatorActivity extends AppCompatActivity {
EditText num1,num2;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calulator);
        num1 = findViewById(R.id.editText);
        num2 = findViewById(R.id.editText2);
        result = findViewById(R.id.textView5);

    }

    public void add(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res=n1+n2;
        result.setText("The addition is : "+res);
    }

    public void mul(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res=n1*n2;
        result.setText("The addition is : "+res);
    }

    public void sub(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res=n1-n2;
        result.setText("The addition is : "+res);
    }

    public void div(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res=n1%n2;
        result.setText("The addition is : "+res);
    }
}
