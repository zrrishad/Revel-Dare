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

public class CoupleActivity5 extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_couple5);

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


        RequestQueue queue = Volley.newRequestQueue(CoupleActivity5.this);
        String url = "http://192.168.0.123/apps/load%20server%20cupple.five";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Cuple1=jsonObject.getString("Cuple1");
                            String Cuple2=jsonObject.getString("Cuple2");
                            String Cuple3=jsonObject.getString("Cuple3");
                            String Cuple4=jsonObject.getString("Cuple4");
                            String Cuple5=jsonObject.getString("Cuple5");
                            String Cuple6=jsonObject.getString("Cuple6");
                            String Cuple7=jsonObject.getString("Cuple7");
                            String Cuple8=jsonObject.getString("Cuple8");
                            String Cuple9=jsonObject.getString("Cuple9");
                            String Cuple10=jsonObject.getString("Cuple10");
                            String Cuple11=jsonObject.getString("Cuple11");
                            String Cuple12=jsonObject.getString("Cuple12");
                            String Cuple13=jsonObject.getString("Cuple13");
                            String Cuple14=jsonObject.getString("Cuple14");
                            String Cuple15=jsonObject.getString("Cuple15");
                            String Cuple16=jsonObject.getString("Cuple16");
                            String Cuple17=jsonObject.getString("Cuple17");
                            String Cuple18=jsonObject.getString("Cuple18");
                            String Cuple19=jsonObject.getString("Cuple19");
                            String Cuple20=jsonObject.getString("Cuple20");
                            String Cuple21=jsonObject.getString("Cuple21");
                            String Cuple22=jsonObject.getString("Cuple22");
                            String Cuple23=jsonObject.getString("Cuple23");
                            String Cuple24=jsonObject.getString("Cuple24");
                            String Cuple25=jsonObject.getString("Cuple25");
                            String Cuple26=jsonObject.getString("Cuple26");
                            String Cuple27=jsonObject.getString("Cuple27");
                            String Cuple28=jsonObject.getString("Cuple28");
                            String Cuple29=jsonObject.getString("Cuple29");
                            String Cuple30=jsonObject.getString("Cuple30");

                            text1.setText(Cuple1);
                            text2.setText(Cuple2);
                            text3.setText(Cuple3);
                            text4.setText(Cuple4);
                            text5.setText(Cuple5);
                            text6.setText(Cuple6);
                            text7.setText(Cuple7);
                            text8.setText(Cuple8);
                            text9.setText(Cuple9);
                            text10.setText(Cuple10);
                            text11.setText(Cuple11);
                            text12.setText(Cuple12);
                            text13.setText(Cuple13);
                            text14.setText(Cuple14);
                            text15.setText(Cuple15);
                            text16.setText(Cuple16);
                            text17.setText(Cuple17);
                            text18.setText(Cuple18);
                            text19.setText(Cuple19);
                            text20.setText(Cuple20);
                            text21.setText(Cuple21);
                            text22.setText(Cuple22);
                            text23.setText(Cuple23);
                            text24.setText(Cuple24);
                            text25.setText(Cuple25);
                            text26.setText(Cuple26);
                            text27.setText(Cuple27);
                            text28.setText(Cuple28);
                            text29.setText(Cuple29);
                            text30.setText(Cuple30);





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