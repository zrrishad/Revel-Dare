package com.example.reveldare;

import android.content.Context;
import android.content.Intent;
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


            edLay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (Title.contains("Spill the Tea")){

                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity1.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Juicy Convos")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity2.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Confessions")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity3.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Spicy Questions")) {
                        Intent myIntent=new Intent(GossipDashboard.this,GossipActivity4.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Would You Rather")) {
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
        hashMap.put("Title","Spill the Tea");
        hashMap.put("Des","you just had an hour-long gossip session");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Juicy Convos");
        hashMap.put("Des","All about relationships, cheating, and exes!");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Title","Confessions");
        hashMap.put("Des","Expose your hidden secrets,no one is safe");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Spicy Questions");
        hashMap.put("Des","Turn up the heat with-extra risque dares");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Would You Rather");
        hashMap.put("Des","The classic game but much more intense");
        arrayList.add(hashMap);


    }


}