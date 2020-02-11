package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {
CheckBox c1,c2,c3;
RadioButton r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        c1=findViewById(R.id.checkBox2);
        c2=findViewById(R.id.checkBox3);
        c3=findViewById(R.id.checkBox4);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
    }

    public void show_checked(View view) {
        int total=0;
        StringBuilder msg =new StringBuilder();
        msg.append("Selected items");
        if(c1.isChecked())
        {
            total=total+150;
            msg.append("\n Butter Chiken :Rs 150 ");
        }
        if(c2.isChecked())
        {
            total=total+250;
            msg.append("\n Mutton Kimma  :Rs 250 ");
        }
        if(c3.isChecked())
        {
            total=total+350;
            msg.append("\n Mutton Lababdar :Rs 350 ");
        }
        msg.append("Total :Rs "+total);
        Toast.makeText(this,msg+"\nItem Ordered:"+total,Toast.LENGTH_LONG).show();
    }

    public void rating(View view) {
       StringBuilder msg1=new StringBuilder();
        if(r1.isChecked())
        {
            msg1.append("\n The food quality is : Bad ");
        }
        if(r2.isChecked())
        {
            msg1.append("\n The food quality is : Average ");
        }
        if(r3.isChecked())
        {
            msg1.append("\n The food quality is : Good ");
        }
        Toast.makeText(this,msg1,Toast.LENGTH_LONG).show();
    }
    }

