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

public class MainActivity3 extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);



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




        RequestQueue queue = Volley.newRequestQueue(MainActivity3.this);
        String url = "http://192.168.0.123/apps/load%20server.three";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Three1=jsonObject.getString("Three1");
                            String Three2=jsonObject.getString("Three2");
                            String Three3=jsonObject.getString("Three3");
                            String Three4=jsonObject.getString("Three4");
                            String Three5=jsonObject.getString("Three5");
                            String Three6=jsonObject.getString("Three6");
                            String Three7=jsonObject.getString("Three7");
                            String Three8=jsonObject.getString("Three8");
                            String Three9=jsonObject.getString("Three9");
                            String Three10=jsonObject.getString("Three10");
                            String Three11=jsonObject.getString("Three11");
                            String Three12=jsonObject.getString("Three12");
                            String Three13=jsonObject.getString("Three13");
                            String Three14=jsonObject.getString("Three14");
                            String Three15=jsonObject.getString("Three15");
                            String Three16=jsonObject.getString("Three16");
                            String Three17=jsonObject.getString("Three17");
                            String Three18=jsonObject.getString("Three18");
                            String Three19=jsonObject.getString("Three19");
                            String Three20=jsonObject.getString("Three20");
                            String Three21=jsonObject.getString("Three21");
                            String Three22=jsonObject.getString("Three22");
                            String Three23=jsonObject.getString("Three23");
                            String Three24=jsonObject.getString("Three24");
                            String Three25=jsonObject.getString("Three25");
                            String Three26=jsonObject.getString("Three26");
                            String Three27=jsonObject.getString("Three27");
                            String Three28=jsonObject.getString("Three28");
                            String Three29=jsonObject.getString("Three29");
                            String Three30=jsonObject.getString("Three30");


                            text1.setText(Three1);
                            text2.setText(Three2);
                            text3.setText(Three3);
                            text4.setText(Three4);
                            text5.setText(Three5);
                            text6.setText(Three6);
                            text7.setText(Three7);
                            text8.setText(Three8);
                            text9.setText(Three9);
                            text10.setText(Three10);
                            text11.setText(Three11);
                            text12.setText(Three12);
                            text13.setText(Three13);
                            text14.setText(Three14);
                            text15.setText(Three15);
                            text16.setText(Three16);
                            text17.setText(Three17);
                            text18.setText(Three18);
                            text19.setText(Three19);
                            text20.setText(Three20);
                            text21.setText(Three21);
                            text22.setText(Three22);
                            text23.setText(Three23);
                            text24.setText(Three24);
                            text25.setText(Three25);
                            text26.setText(Three26);
                            text27.setText(Three27);
                            text28.setText(Three28);
                            text29.setText(Three29);
                            text30.setText(Three30);



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