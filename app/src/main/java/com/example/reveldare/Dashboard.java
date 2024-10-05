package com.example.reveldare;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Dashboard extends AppCompatActivity {

   ListView edList;


    HashMap<String,String> hashMap=new HashMap<>();

    ArrayList< HashMap<String,String>> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        edList=findViewById(R.id.edList);

        MyAdapter myAdapter=new MyAdapter();
        createtable();

        edList.setAdapter(myAdapter);

    }
    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView=layoutInflater.inflate(R.layout.layout,viewGroup,false);

            HashMap<String,String>hashMap=arrayList.get(position);

          TextView edTitle=myView.findViewById(R.id.edTitle);
          TextView edDes =myView.findViewById(R.id.edDes);
          //  CardView Edcard=myView.findViewById(R.id.Edcadr);
            LinearLayout edLay=myView.findViewById(R.id.edLay);

            String Title=hashMap.get("Title");
            String Des=hashMap.get("Des");


            edTitle.setText(Title);
            edDes.setText(Des);

            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            edTitle.setBackgroundColor(color);


            edLay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (Title.contains("Thought Provoking Question")){

                        Intent myIntent=new Intent(Dashboard.this,MainActivity.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Midnight Conversations")) {
                        Intent myIntent=new Intent(Dashboard.this,MainActivity2.class);
                        startActivity(myIntent);

                   } else if (Title.contains("For Best Buddies")) {
                       Intent myIntent=new Intent(Dashboard.this,MainActivity3.class);
                       startActivity(myIntent);

                    } else if (Title.contains("Finding Out About")) {
                        Intent myIntent=new Intent(Dashboard.this,MainActivity4.class);
                        startActivity(myIntent);

                    } else if (Title.contains("For Brother and Sisters")) {
                        Intent myIntent=new Intent(Dashboard.this,MainActivity5.class);
                        startActivity(myIntent);

                    }


                }
            });



            return myView;




        }
    }

    ///////////////////////////////////////
    private void createtable(){
        hashMap=new HashMap<>();
        hashMap.put("image_url","");
        hashMap.put("Title","Thought Provoking Question");
        hashMap.put("Des","Questions the hit deep ");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Midnight Conversations");
        hashMap.put("Des","Get to know each other for real");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Title","For Best Buddies");
        hashMap.put("Des","How well do you really know them?");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Finding Out About");
        hashMap.put("Des","Questions to meet someone new");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","For Brother and Sisters");
        hashMap.put("Des","Ask each other before its too late");
        arrayList.add(hashMap);


    }



}