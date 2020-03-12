package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class list2 extends AppCompatActivity {
    ListView lv;
    Student_adapter ad;
    int imgId[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    ArrayList<Student> al = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        ad=new Student_adapter();
        lv = findViewById(R.id.list_view);
        lv.setAdapter(ad);
        al.add(new Student(1, "Abhisekh Sahoo", 98.6, imgId));
        al.add(new Student(2, "Aditya Singh", 99.6, imgId));
        al.add(new Student(3, "Abhishek Jha", 95.9, imgId));
        al.add(new Student(4, "Kusagra Chandra", 96.9, imgId));
    }
}
    class Student {
        int rollNo;
        String name;
        double marks;
        int imgId[];

        Student(int r, String n, double m, int[] i) {
            rollNo = r;
            name = n;
            marks = m;
            imgId = i;
        }
    }
    class Student_adapter extends BaseAdapter {
        public int getCount(){
            return al.size();
        }
        public Object getItem(int position){
            return  al.get(position);
        }
        public long getItemId(int position){
            return position;
        }
        public View getView(int position, View singleView, ViewGroup parent){
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            inflater.inflate(R.layout.list_containt,parent,false);
            TextView roll=singleView.findViewById(R.id.tvrollno);
            TextView name=singleView.findViewById(R.id.tvname);
            TextView mark=singleView.findViewById(R.id.tvmarks);
            ImageView img=singleView.findViewById(R.id.im1);
            roll.setText(al.get(position).rollNo);
            mark.setText(al.get(position).marks);
            name.setText(al.get(position).name);
            img.setImageResource(imgId[position]);
            return singleView;
        }
    }

