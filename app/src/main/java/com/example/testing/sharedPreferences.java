package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class sharedPreferences extends AppCompatActivity {
CheckBox cb1;
EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        cb1=findViewById(R.id.cb);
        ed1=findViewById(R.id.textView19);
        ed2=findViewById(R.id.textView20);
    }

    public void save_data(View view) {
        Toast.makeText(this,"User id and password saved",Toast.LENGTH_LONG).show();
        if(cb1.isChecked()){
            SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor=sp.edit();
            String user_name=ed1.getText().toString();
            String pass=ed2.getText().toString();
            editor.putString("user_name",user_name);
            editor.putString("pass",pass);
            editor.commit();
        }
        else
        {
            Toast.makeText(this,"User does not want to store the data.",Toast.LENGTH_LONG).show();
        }
    }

    public void read_data(View view) {
        SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(this);
        String name=sp.getString("user_name","No Data");
        String pass=sp.getString("pass","No Date");
        ed1.setText(name);
        ed2.setText(pass);
    }

    public void clear(View view) {
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=sp.edit();
        editor.remove("user_name");
        editor.remove("pass");
        editor.clear();
    }
}
