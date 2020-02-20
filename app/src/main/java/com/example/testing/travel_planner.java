package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class travel_planner extends AppCompatActivity {
EditText ed1,ed2;
CheckBox ch1,ch2,ch3;
RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_planner);
        ch1=findViewById(R.id.checkBox1);
        ch2=findViewById(R.id.checkBox2);
        ch3=findViewById(R.id.checkBox3);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
    }

    public void cost(View view) {
        int manli=Integer.parseInt(ch1.getText().toString());
        int simla=Integer.parseInt(ch2.getText().toString());
        int kasol=Integer.parseInt(ch1.getText().toString());
        int total=0;
        int person=Integer.parseInt(ed1.getText().toString());
        int day=Integer.parseInt(ed2.getText().toString());
        StringBuilder msg = new StringBuilder();
        msg.append("Selected items");
        if(ch1.isChecked())
        {
            total=(total+manli)*day*person;
        }
        else if(ch2.isChecked()){
            total=(total+simla)*day*person;
        }
        else if(ch3.isChecked()){
            total=(total+kasol)*day*person;
        }
        else if(ch1.isChecked()&&ch2.isChecked()){
            total=(total+simla+manli)*day*person;
        }
        else if(ch1.isChecked()&&ch3.isChecked()){
            total=(total+kasol+manli)*day*person;
        }
        else if(ch2.isChecked()&&ch3.isChecked()){
            total=total+simla+kasol;
        }
        if(r1.isChecked()){
            total=total+4000;
        }
        msg.append(total);
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
