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

public class GossipActivity4 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gossip4);

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


        RequestQueue queue = Volley.newRequestQueue(GossipActivity4.this);
        String url = "http://192.168.157.159/apps/load%20server%20gossip.four";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Gossipfour1=jsonObject.getString("Gossipfour1");
                            String Gossipfour2=jsonObject.getString("Gossipfour2");
                            String Gossipfour3=jsonObject.getString("Gossipfour3");
                            String Gossipfour4=jsonObject.getString("Gossipfour4");
                            String Gossipfour5=jsonObject.getString("Gossipfour5");
                            String Gossipfour6=jsonObject.getString("Gossipfour6");
                            String Gossipfour7=jsonObject.getString("Gossipfour7");
                            String Gossipfour8=jsonObject.getString("Gossipfour8");
                            String Gossipfour9=jsonObject.getString("Gossipfour9");
                            String Gossipfour10=jsonObject.getString("Gossipfour10");
                            String Gossipfour11=jsonObject.getString("Gossipfour11");
                            String Gossipfour12=jsonObject.getString("Gossipfour12");
                            String Gossipfour13=jsonObject.getString("Gossipfour13");
                            String Gossipfour14=jsonObject.getString("Gossipfour14");
                            String Gossipfour15=jsonObject.getString("Gossipfour15");
                            String Gossipfour16=jsonObject.getString("Gossipfour16");
                            String Gossipfour17=jsonObject.getString("Gossipfour17");
                            String Gossipfour18=jsonObject.getString("Gossipfour18");
                            String Gossipfour19=jsonObject.getString("Gossipfour19");
                            String Gossipfour20=jsonObject.getString("Gossipfour20");
                            String Gossipfour21=jsonObject.getString("Gossipfour21");
                            String Gossipfour22=jsonObject.getString("Gossipfour22");
                            String Gossipfour23=jsonObject.getString("Gossipfour23");
                            String Gossipfour24=jsonObject.getString("Gossipfour24");
                            String Gossipfour25=jsonObject.getString("Gossipfour25");
                            String Gossipfour26=jsonObject.getString("Gossipfour26");
                            String Gossipfour27=jsonObject.getString("Gossipfour27");
                            String Gossipfour28=jsonObject.getString("Gossipfour28");
                            String Gossipfour29=jsonObject.getString("Gossipfour29");
                            String Gossipfour30=jsonObject.getString("Gossipfour30");

                            text1.setText(Gossipfour1);
                            text2.setText(Gossipfour2);
                            text3.setText(Gossipfour3);
                            text4.setText(Gossipfour4);
                            text5.setText(Gossipfour5);
                            text6.setText(Gossipfour6);
                            text7.setText(Gossipfour7);
                            text8.setText(Gossipfour8);
                            text9.setText(Gossipfour9);
                            text10.setText(Gossipfour10);
                            text11.setText(Gossipfour11);
                            text12.setText(Gossipfour12);
                            text13.setText(Gossipfour13);
                            text14.setText(Gossipfour14);
                            text15.setText(Gossipfour15);
                            text16.setText(Gossipfour16);
                            text17.setText(Gossipfour17);
                            text18.setText(Gossipfour18);
                            text19.setText(Gossipfour19);
                            text20.setText(Gossipfour20);
                            text21.setText(Gossipfour21);
                            text22.setText(Gossipfour22);
                            text23.setText(Gossipfour23);
                            text24.setText(Gossipfour24);
                            text25.setText(Gossipfour25);
                            text26.setText(Gossipfour26);
                            text27.setText(Gossipfour27);
                            text28.setText(Gossipfour28);
                            text29.setText(Gossipfour29);
                            text30.setText(Gossipfour30);





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