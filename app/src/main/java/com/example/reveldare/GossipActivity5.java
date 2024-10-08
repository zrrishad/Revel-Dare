package com.example.reveldare;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class GossipActivity5 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gossip5);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);
        text6=findViewById(R.id.text6);
        text7=findViewById(R.id.text7);
        text8=findViewById(R.id.text8);
        text9=findViewById(R.id.text9);
        text10=findViewById(R.id.text10);
        text11=findViewById(R.id.text11);
        text12=findViewById(R.id.text12);
        text13=findViewById(R.id.text13);
        text14=findViewById(R.id.text14);
        text15=findViewById(R.id.text15);
        text16=findViewById(R.id.text16);
        text17=findViewById(R.id.text17);
        text18=findViewById(R.id.text18);
        text19=findViewById(R.id.text19);
        text20=findViewById(R.id.text20);
        text21=findViewById(R.id.text21);
        text22=findViewById(R.id.text22);
        text23=findViewById(R.id.text23);
        text24=findViewById(R.id.text24);
        text25=findViewById(R.id.text25);
        text26=findViewById(R.id.text26);
        text27=findViewById(R.id.text27);
        text28=findViewById(R.id.text28);
        text29=findViewById(R.id.text29);
        text30=findViewById(R.id.text30);


        RequestQueue queue = Volley.newRequestQueue(GossipActivity5.this);
        String url = "http://192.168.1.107/apps/load%20server%20gossip.five";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Gossipfive1=jsonObject.getString("Gossipfive1");
                            String Gossipfive2=jsonObject.getString("Gossipfive2");
                            String Gossipfive3=jsonObject.getString("Gossipfive3");
                            String Gossipfive4=jsonObject.getString("Gossipfive4");
                            String Gossipfive5=jsonObject.getString("Gossipfive5");
                            String Gossipfive6=jsonObject.getString("Gossipfive6");
                            String Gossipfive7=jsonObject.getString("Gossipfive7");
                            String Gossipfive8=jsonObject.getString("Gossipfive8");
                            String Gossipfive9=jsonObject.getString("Gossipfive9");
                            String Gossipfive10=jsonObject.getString("Gossipfive10");
                            String Gossipfive11=jsonObject.getString("Gossipfive11");
                            String Gossipfive12=jsonObject.getString("Gossipfive12");
                            String Gossipfive13=jsonObject.getString("Gossipfive13");
                            String Gossipfive14=jsonObject.getString("Gossipfive14");
                            String Gossipfive15=jsonObject.getString("Gossipfive15");
                            String Gossipfive16=jsonObject.getString("Gossipfive16");
                            String Gossipfive17=jsonObject.getString("Gossipfive17");
                            String Gossipfive18=jsonObject.getString("Gossipfive18");
                            String Gossipfive19=jsonObject.getString("Gossipfive19");
                            String Gossipfive20=jsonObject.getString("Gossipfive20");
                            String Gossipfive21=jsonObject.getString("Gossipfive21");
                            String Gossipfive22=jsonObject.getString("Gossipfive22");
                            String Gossipfive23=jsonObject.getString("Gossipfive23");
                            String Gossipfive24=jsonObject.getString("Gossipfive24");
                            String Gossipfive25=jsonObject.getString("Gossipfive25");
                            String Gossipfive26=jsonObject.getString("Gossipfive26");
                            String Gossipfive27=jsonObject.getString("Gossipfive27");
                            String Gossipfive28=jsonObject.getString("Gossipfive28");
                            String Gossipfive29=jsonObject.getString("Gossipfive29");
                            String Gossipfive30=jsonObject.getString("Gossipfive30");

                            text1.setText(Gossipfive1);
                            text2.setText(Gossipfive2);
                            text3.setText(Gossipfive3);
                            text4.setText(Gossipfive4);
                            text5.setText(Gossipfive5);
                            text6.setText(Gossipfive6);
                            text7.setText(Gossipfive7);
                            text8.setText(Gossipfive8);
                            text9.setText(Gossipfive9);
                            text10.setText(Gossipfive10);
                            text11.setText(Gossipfive11);
                            text12.setText(Gossipfive12);
                            text13.setText(Gossipfive13);
                            text14.setText(Gossipfive14);
                            text15.setText(Gossipfive15);
                            text16.setText(Gossipfive16);
                            text17.setText(Gossipfive17);
                            text18.setText(Gossipfive18);
                            text19.setText(Gossipfive19);
                            text20.setText(Gossipfive20);
                            text21.setText(Gossipfive21);
                            text22.setText(Gossipfive22);
                            text23.setText(Gossipfive23);
                            text24.setText(Gossipfive24);
                            text25.setText(Gossipfive25);
                            text26.setText(Gossipfive26);
                            text27.setText(Gossipfive27);
                            text28.setText(Gossipfive28);
                            text29.setText(Gossipfive29);
                            text30.setText(Gossipfive30);





                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                /// bButton.setText("server error"+error.getMessage());
                //  edProg.setVisibility(View.GONE);
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);









    }
}