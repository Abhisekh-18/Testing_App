package com.example.testing;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class phyActivity extends AppCompatActivity {
TextView et1,et2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy);
        et1=findViewById(R.id.textView3);
        et2=findViewById(R.id.textView4);
        result=findViewById(R.id.textView6);
    }

    public void phytha(View view) {
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        double m1=Math.hypot(n1,n2);
        result.setText("The Hypotenus is:"+m1);
    }
}
