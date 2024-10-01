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

public class CupleDashboad extends AppCompatActivity {

    ListView edList;


    HashMap<String,String> hashMap=new HashMap<>();

    ArrayList< HashMap<String,String>> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuple_dashboad);
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
            View myView=layoutInflater.inflate(R.layout.layout2,viewGroup,false);

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


                    if (Title.contains("Couple Questions")){

                        Intent myIntent=new Intent(CupleDashboad.this,CupleActivity1.class);
                        startActivity(myIntent);

                    } else if (Title.contains("For Soulmates")) {
                        Intent myIntent=new Intent(CupleDashboad.this,CupleActivity2.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Couple Therapy")) {
                        Intent myIntent=new Intent(CupleDashboad.this,CupleActivity3.class);
                        startActivity(myIntent);

                    } else if (Title.contains("For Long-Distance")) {
                        Intent myIntent=new Intent(CupleDashboad.this,CupleActivity4.class);
                        startActivity(myIntent);

                    } else if (Title.contains("Naughty Questions")) {
                        Intent myIntent=new Intent(CupleDashboad.this,CoupleActivity5.class);
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
        hashMap.put("Title","Couple Questions");
        hashMap.put("Des","Questions that will love you feeling closer");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","For Soulmates");
        hashMap.put("Des","Get reel vulnerable and deepen your love");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Title","Couple Therapy");
        hashMap.put("Des","Deep and rarely asked questions.Meant to heal");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","For Long-Distance");
        hashMap.put("Des","Warning this will make it difficult to hang up");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","Naughty Questions");
        hashMap.put("Des","Question for every coupls favorite subject");
        arrayList.add(hashMap);


    }


}