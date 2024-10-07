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

public class MainActivity2 extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);



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





        RequestQueue queue = Volley.newRequestQueue(MainActivity2.this);
        String url = "http://192.168.1.107/apps/load%20server.two";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                         String Two1=jsonObject.getString("Two1");
                            String Two2=jsonObject.getString("Two2");
                            String Two3=jsonObject.getString("Two3");
                            String Two4=jsonObject.getString("Two4");
                            String Two5=jsonObject.getString("Two5");

                            String Two6=jsonObject.getString("Two6");
                            String Two7=jsonObject.getString("Two7");
                            String Two8=jsonObject.getString("Two8");
                            String Two9=jsonObject.getString("Two9");
                            String Two10=jsonObject.getString("Two10");
                            String Two11=jsonObject.getString("Two11");
                            String Two12=jsonObject.getString("Two12");
                            String Two13=jsonObject.getString("Two13");
                            String Two14=jsonObject.getString("Two14");
                            String Two15=jsonObject.getString("Two15");
                            String Two16=jsonObject.getString("Two16");
                            String Two17=jsonObject.getString("Two17");
                            String Two18=jsonObject.getString("Two18");
                            String Two19=jsonObject.getString("Two19");
                            String Two20=jsonObject.getString("Two20");
                            String Two21=jsonObject.getString("Two21");
                            String Two22=jsonObject.getString("Two22");
                            String Two23=jsonObject.getString("Two23");
                            String Two24=jsonObject.getString("Two24");
                            String Two25=jsonObject.getString("Two25");
                            String Two26=jsonObject.getString("Two26");
                            String Two27=jsonObject.getString("Two27");
                            String Two28=jsonObject.getString("Two28");
                            String Two29=jsonObject.getString("Two29");
                            String Two30=jsonObject.getString("Two30");



                            text1.setText(Two1);
                            text2.setText(Two2);
                           text3.setText(Two3);
                           text4.setText(Two4);
                            text5.setText(Two5);
                            text6.setText(Two6);
                            text7.setText(Two7);
                            text8.setText(Two8);
                            text9.setText(Two9);
                            text10.setText(Two10);
                            text11.setText(Two11);
                            text12.setText(Two12);
                            text13.setText(Two13);
                            text14.setText(Two14);
                            text15.setText(Two15);
                            text16.setText(Two16);
                            text17.setText(Two17);
                            text18.setText(Two18);
                            text19.setText(Two19);
                            text20.setText(Two20);
                            text21.setText(Two21);
                            text22.setText(Two22);
                            text23.setText(Two23);
                            text24.setText(Two24);
                            text25.setText(Two25);
                            text26.setText(Two26);
                            text27.setText(Two27);
                            text28.setText(Two28);
                            text29.setText(Two29);
                            text30.setText(Two30);




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