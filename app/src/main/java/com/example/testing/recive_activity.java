package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class recive_activity extends AppCompatActivity {
TextView result,result1,result2,result3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_activity);
        result=findViewById(R.id.textView7);
        result1=findViewById(R.id.textView8);
        result2=findViewById(R.id.textView9);
        result3=findViewById(R.id.textView10);

        Intent it2=getIntent();
        String name=it2.getStringExtra("student_name");
        int roll=it2.getIntExtra("roll_no",0);
        float cgpa=it2.getFloatExtra("cgpa",0f);
        double fees=it2.getDoubleExtra("fees_paid",0);
        boolean status=it2.getBooleanExtra("status",false);
        String str="The values in the array is:";
        int arr[]=it2.getIntArrayExtra("array");
        for(int i=0;i<arr.length;i++){
            str=str+"\n"+arr[i]+"\n";
        }
        result2.setText(str);
        String str1 = "The values of array list are";
        ArrayList<Integer> a=it2.getIntegerArrayListExtra("arr1");
        for(int p:a){
            str1=str1+"\n"+p+"\n";
        }
        result3.setText(str1);

        result.setText("Name:"+name+"\nRoll Number:"+roll+"\nCGPA:"+cgpa+
                "\nFees Pain:"+fees+"\nStatus:"+status);
        //Value Recive from bundle method
        Bundle b= it2.getBundleExtra("bundle");
        String name1= b.getString("name");
        int roll1=b.getInt("roll_no",20);
        float cgpa1=b.getFloat("cgpa",0f);
        double fees1=b.getDouble("fees_paid",0);
        result1.setText("Name:"+name1+"\nRoll Number:"+roll1+"\nCGPA:"+cgpa1+
                "\nFees Pain:"+fees1);
    }
}
