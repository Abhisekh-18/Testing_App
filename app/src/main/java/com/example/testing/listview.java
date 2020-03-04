package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {
ListView lv;
MediaPlayer mp;
String [] songs={"Song 1","Song 2","Song 3"};
int [] songID= {R.raw.mario};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv = findViewById(R.id.lv);
        mp=new MediaPlayer();
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,songs);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Playsong(position);
            }
        });
    }
    public void Playsong(int songIndex)
    {
        mp.reset();
        //If my media player is playing any song then reset() reset the media player
        mp=MediaPlayer.create(this,songID[songIndex]);
        //Create function is used for play songs and as its a static class we have to call it through class name
        mp.start();
    }
    public void onDestroy()
        {
        super.onDestroy();
        mp.release();
    }
}
