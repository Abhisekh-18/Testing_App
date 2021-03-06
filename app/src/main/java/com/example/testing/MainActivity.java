package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_toast(View view) {
        Toast.makeText(this,"Toast is shown",Toast.LENGTH_LONG).show();
    }

    public void show_calculator(View view) {
        Intent it = new Intent(this,CalulatorActivity.class);
        startActivity(it);
    }

    public void show_bank(View view) {
        Intent it1 =new Intent(this,BankActivity.class);
        startActivity(it1);
    }

    public void phytha(View view) {

        Intent it2=new Intent(this,phyActivity.class);
        startActivity(it2);
    }

    public void send_data(View view) {
        Intent it2=new Intent(this,recive_activity.class);

        it2.putExtra("student_name","Abhisekh");
        it2.putExtra("roll_no",20);
        it2.putExtra("cgpa",9.14f);
        it2.putExtra("fees_paid",49000);
        it2.putExtra("status",true);
//Second Way to send data
        Bundle b=new Bundle();
        b.putString("name","Abhisekh");
        b.putInt("roll_no",20);
        b.putFloat("cgpa",9.14f);
        b.putDouble("fees_paid",300000);
        it2.putExtra("bundle",b);

//Passing array values amoung avtivities
        int arr[]={100,200,3434,323,32,32,32};
        it2.putExtra("array",arr);
        //Array List
        ArrayList a=new ArrayList<Integer>();
        a.add(100);
        a.add(300);
        a.add(14345);
        a.add(1434387);
        it2.putExtra("arr1",a);
        startActivity(it2);
    }

    public void lab(View view) {
        Intent it3=new Intent(this,labActivity.class);
        name=findViewById(R.id.textView11);
        String n=name.getText().toString();
        it3.putExtra("student_name",n);
        startActivity(it3);
    }

    public void view(View view) {
        Intent it4=new Intent(this,WebViewActivity.class);
        startActivity(it4);
    }

    public void checkBox(View view) {
        Intent it5=new Intent(this,checkbox.class);
        startActivity(it5);
    }

    public void share(View view) {
        Intent it6=new Intent(this,sharedPreferences.class);
        startActivity(it6);
    }

    public void travel_planner(View view) {
        Intent it7=new Intent(this,travel_planner.class);
        startActivity(it7);
    }

    public void quiz(View view) {
        Intent it8=new Intent(this,quiz.class);
        startActivity(it8);
    }

    public void listview(View view) {
        Intent it9=new Intent(this,listview.class);
        startActivity(it9);
    }


    public void list2(View view) {
        Intent it10=new Intent(this,list2.class);
        startActivity(it10);
    }
}

