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

public class GossipActivity2 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gossip2);

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



        RequestQueue queue = Volley.newRequestQueue(GossipActivity2.this);
        String url = "http://192.168.157.159/apps/load%20server%20gossip.two";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Gossiptwo1=jsonObject.getString("Gossiptwo1");
                            String Gossiptwo2=jsonObject.getString("Gossiptwo2");
                            String Gossiptwo3=jsonObject.getString("Gossiptwo3");
                            String Gossiptwo4=jsonObject.getString("Gossiptwo4");
                            String Gossiptwo5=jsonObject.getString("Gossiptwo5");
                            String Gossiptwo6=jsonObject.getString("Gossiptwo6");
                            String Gossiptwo7=jsonObject.getString("Gossiptwo7");
                            String Gossiptwo8=jsonObject.getString("Gossiptwo8");
                            String Gossiptwo9=jsonObject.getString("Gossiptwo9");
                            String Gossiptwo10=jsonObject.getString("Gossiptwo10");
                            String Gossiptwo11=jsonObject.getString("Gossiptwo11");
                            String Gossiptwo12=jsonObject.getString("Gossiptwo12");
                            String Gossiptwo13=jsonObject.getString("Gossiptwo13");
                            String Gossiptwo14=jsonObject.getString("Gossiptwo14");
                            String Gossiptwo15=jsonObject.getString("Gossiptwo15");
                            String Gossiptwo16=jsonObject.getString("Gossiptwo16");
                            String Gossiptwo17=jsonObject.getString("Gossiptwo17");
                            String Gossiptwo18=jsonObject.getString("Gossiptwo18");
                            String Gossiptwo19=jsonObject.getString("Gossiptwo19");
                            String Gossiptwo20=jsonObject.getString("Gossiptwo20");
                            String Gossiptwo21=jsonObject.getString("Gossiptwo21");
                            String Gossiptwo22=jsonObject.getString("Gossiptwo22");
                            String Gossiptwo23=jsonObject.getString("Gossiptwo23");
                            String Gossiptwo24=jsonObject.getString("Gossiptwo24");
                            String Gossiptwo25=jsonObject.getString("Gossiptwo25");
                            String Gossiptwo26=jsonObject.getString("Gossiptwo26");
                            String Gossiptwo27=jsonObject.getString("Gossiptwo27");
                            String Gossiptwo28=jsonObject.getString("Gossiptwo28");
                            String Gossiptwo29=jsonObject.getString("Gossiptwo29");
                            String Gossiptwo30=jsonObject.getString("Gossiptwo30");

                            text1.setText(Gossiptwo1);
                            text2.setText(Gossiptwo2);
                            text3.setText(Gossiptwo3);
                            text4.setText(Gossiptwo4);
                            text5.setText(Gossiptwo5);
                            text6.setText(Gossiptwo6);
                            text7.setText(Gossiptwo7);
                            text8.setText(Gossiptwo8);
                            text9.setText(Gossiptwo9);
                            text10.setText(Gossiptwo10);
                            text11.setText(Gossiptwo11);
                            text12.setText(Gossiptwo12);
                            text13.setText(Gossiptwo13);
                            text14.setText(Gossiptwo14);
                            text15.setText(Gossiptwo15);
                            text16.setText(Gossiptwo16);
                            text17.setText(Gossiptwo17);
                            text18.setText(Gossiptwo18);
                            text19.setText(Gossiptwo19);
                            text20.setText(Gossiptwo20);
                            text21.setText(Gossiptwo21);
                            text22.setText(Gossiptwo22);
                            text23.setText(Gossiptwo23);
                            text24.setText(Gossiptwo24);
                            text25.setText(Gossiptwo25);
                            text26.setText(Gossiptwo26);
                            text27.setText(Gossiptwo27);
                            text28.setText(Gossiptwo28);
                            text29.setText(Gossiptwo29);
                            text30.setText(Gossiptwo30);





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