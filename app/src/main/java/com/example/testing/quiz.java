package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class quiz extends AppCompatActivity {
RadioButton rb1,rb2,rb3,rb4;
CheckBox cb1,cb2,cb3,cb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
    }

    public void check(View view) {
        int mark=0;
        StringBuilder msg = new StringBuilder();
        StringBuilder msg1 = new StringBuilder();
        if(rb1.isChecked()){
            mark=mark+50;
            msg.append("The answer is correct");
        }
        else{
            msg.append("The 1st answer is wrong ");
        }
        if(cb1.isChecked() && cb2.isChecked()){
            mark=mark+50;
            msg1.append("The 2nd answer is correct and marks is:"+mark);
        }
        else{
            msg1.append("The 2nd answer is wrong and marks is:"+mark);
        }
        Toast.makeText(this,msg+"and"+msg1,Toast.LENGTH_LONG).show();
    }
}
