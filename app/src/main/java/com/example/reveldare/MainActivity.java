package com.example.reveldare;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
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
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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








        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        String url = "http://192.168.1.107/apps/load.server";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Number1=jsonObject.getString("Number1");
                            String Number2=jsonObject.getString("Number2");
                            String Number3=jsonObject.getString("Number3");
                            String Number4=jsonObject.getString("Number4");
                            String Number5=jsonObject.getString("Number5");
                            String Number6=jsonObject.getString("Number6");
                            String Number7=jsonObject.getString("Number7");
                            String Number8=jsonObject.getString("Number8");
                            String Number9=jsonObject.getString("Number9");
                            String Number10=jsonObject.getString("Number10");
                            String Number11=jsonObject.getString("Number11");
                            String Number12=jsonObject.getString("Number12");
                            String Number13=jsonObject.getString("Number13");
                            String Number14=jsonObject.getString("Number14");
                            String Number15=jsonObject.getString("Number15");
                            String Number16=jsonObject.getString("Number16");
                            String Number17=jsonObject.getString("Number17");
                            String Number18=jsonObject.getString("Number18");
                            String Number19=jsonObject.getString("Number19");
                            String Number20=jsonObject.getString("Number20");
                            String Number21=jsonObject.getString("Number21");
                            String Number22=jsonObject.getString("Number22");
                            String Number23=jsonObject.getString("Number23");
                            String Number24=jsonObject.getString("Number24");
                            String Number25=jsonObject.getString("Number25");
                            String Number26=jsonObject.getString("Number26");
                            String Number27=jsonObject.getString("Number27");
                            String Number28=jsonObject.getString("Number28");
                            String Number29=jsonObject.getString("Number29");
                            String Number30=jsonObject.getString("Number30");

                            text1.setText(Number1);
                            text2.setText(Number2);
                            text3.setText(Number3);
                            text4.setText(Number4);
                            text5.setText(Number5);
                            text6.setText(Number6);
                            text7.setText(Number7);
                            text8.setText(Number8);
                            text9.setText(Number9);
                            text10.setText(Number10);
                            text11.setText(Number11);
                            text12.setText(Number12);
                            text13.setText(Number13);
                            text14.setText(Number14);
                            text15.setText(Number15);
                            text16.setText(Number16);
                            text17.setText(Number17);
                            text18.setText(Number18);
                            text19.setText(Number19);
                            text20.setText(Number20);
                            text21.setText(Number21);
                            text22.setText(Number22);
                            text23.setText(Number23);
                            text24.setText(Number24);
                            text25.setText(Number25);
                            text26.setText(Number26);
                            text27.setText(Number27);
                            text28.setText(Number28);
                            text29.setText(Number29);
                            text30.setText(Number30);





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
