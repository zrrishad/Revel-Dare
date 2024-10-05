package com.example.reveldare;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class GossipDashboard extends AppCompatActivity {

    ListView edList;

    HashMap<String,String> hashMap=new HashMap<>();

    ArrayList< HashMap<String,String>> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gossip_dashboard);
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
            View myView=layoutInflater.inflate(R.layout.layout3,viewGroup,false);

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


                    if (Title.contains("Spread The Tea")){

                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity1.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Exciting Discussions")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity2.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Admitting The Truth")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity3.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Intriguing Queries")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity4.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Which Do You Prefer")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity5.class);
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
        hashMap.put("Title","Spread The Tea");
        hashMap.put("Des","you just had an hour-long gossip session");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Exciting Discussions");
        hashMap.put("Des","All about relationships, cheating, and exes!");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Title","Admitting The Truth");
        hashMap.put("Des","Expose your hidden secrets,no one is safe");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Intriguing Queries");
        hashMap.put("Des","Turn up the heat with-extra risque dares");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Which Do You Prefer");
        hashMap.put("Des","The classic game but much more intense");
        arrayList.add(hashMap);


    }


}