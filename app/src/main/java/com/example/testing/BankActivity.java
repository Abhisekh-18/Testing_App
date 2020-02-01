package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BankActivity extends AppCompatActivity {
EditText num2,num5,num10;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        num2=findViewById(R.id.editText3);
        num5=findViewById(R.id.editText4);
        num10=findViewById(R.id.editText5);
        result=findViewById(R.id.textView2);

    }

    public void calculate(View view) {
        int n2 = Integer.parseInt(num2.getText().toString());
        int n5 = Integer.parseInt(num5.getText().toString());
        int n10 = Integer.parseInt(num10.getText().toString());
        int res=n2*2+n5*5+n10*10;
        result.setText("Total amount in piggy bank is: "+res);
    }
}
