package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class labActivity extends AppCompatActivity {
EditText db,ds,android,python,ai,show;
TextView grade1,n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);
        db=findViewById(R.id.textView13);
        ds=findViewById(R.id.textView14);
        android=findViewById(R.id.textView15);
        python=findViewById(R.id.textView16);
        ai=findViewById(R.id.textView17);
        grade1=findViewById(R.id.textView18);
        n=findViewById(R.id.textView12);
        Intent it3=getIntent();
        String name=it3.getStringExtra("student_name");
        n.setText(name);
    }

    public void grade(View view) {
        double a=Double.parseDouble(db.getText().toString());
        double b=Double.parseDouble(ds.getText().toString());
        double c=Double.parseDouble(android.getText().toString());
        double d=Double.parseDouble(python.getText().toString());
        double e=Double.parseDouble(ai.getText().toString());
        double g=(a+b+c+d+e)*0.20;
        if (g<=100 && g>=81) {
            grade1.setText("The grade of the student is: Distintion");
        }
        else if(g<=80 && g>=71){
            grade1.setText("The grade of the student is: First Class");
        }
        else if(g<=70 && g>=61){
            grade1.setText("The grade of the student is: Second Class");
        }
        else if(g<=60 && g>=41){
            grade1.setText("The grade of the student is: First Class");
        }
        else {
            grade1.setText("The grade of the student is: Fail");
        }
    }
}
