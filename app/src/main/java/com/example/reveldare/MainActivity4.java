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

public class MainActivity4 extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main4);


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





        RequestQueue queue = Volley.newRequestQueue(MainActivity4.this);
        String url = "http://192.168.0.123/apps/load%20server.four";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Four1=jsonObject.getString("Four1");
                            String  Four2=jsonObject.getString("Four2");
                            String  Four3=jsonObject.getString("Four3");
                            String  Four4=jsonObject.getString("Four4");
                            String  Four5=jsonObject.getString("Four5");

                            String Four6=jsonObject.getString("Four6");
                            String  Four7=jsonObject.getString("Four7");
                            String  Four8=jsonObject.getString("Four8");
                            String  Four9=jsonObject.getString("Four9");
                            String  Four10=jsonObject.getString("Four10");

                            String Four11=jsonObject.getString("Four11");
                            String  Four12=jsonObject.getString("Four12");
                            String  Four13=jsonObject.getString("Four13");
                            String  Four14=jsonObject.getString("Four14");
                            String  Four15=jsonObject.getString("Four15");

                            String Four16=jsonObject.getString("Four16");
                            String  Four17=jsonObject.getString("Four17");
                            String  Four18=jsonObject.getString("Four18");
                            String  Four19=jsonObject.getString("Four19");
                            String  Four20=jsonObject.getString("Four20");

                            String Four21=jsonObject.getString("Four21");
                            String  Four22=jsonObject.getString("Four22");
                            String  Four23=jsonObject.getString("Four23");
                            String  Four24=jsonObject.getString("Four24");
                            String  Four25=jsonObject.getString("Four25");

                            String Four26=jsonObject.getString("Four26");
                            String  Four27=jsonObject.getString("Four27");
                            String  Four28=jsonObject.getString("Four28");
                            String  Four29=jsonObject.getString("Four29");
                            String  Four30=jsonObject.getString("Four30");




                            text1.setText(Four1);
                            text2.setText(Four2);
                            text3.setText(Four3);
                            text4.setText(Four4);
                            text5.setText(Four5);

                            text6.setText(Four6);
                            text7.setText(Four7);
                            text8.setText(Four8);
                            text9.setText(Four9);
                            text10.setText(Four10);

                            text11.setText(Four11);
                            text12.setText(Four12);
                            text13.setText(Four13);
                            text14.setText(Four14);
                            text15.setText(Four15);

                            text16.setText(Four16);
                            text17.setText(Four17);
                            text18.setText(Four18);
                            text19.setText(Four19);
                            text20.setText(Four20);

                            text21.setText(Four21);
                            text22.setText(Four22);
                            text23.setText(Four23);
                            text24.setText(Four24);
                            text25.setText(Four25);

                            text26.setText(Four26);
                            text27.setText(Four27);
                            text28.setText(Four28);
                            text29.setText(Four29);
                            text30.setText(Four30);





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