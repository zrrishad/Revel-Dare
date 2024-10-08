package com.example.reveldare;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class GossipActivity1 extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;
    LottieAnimationView animationView;
    HorizontalScrollView edScorrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gossip1);

        animationView=findViewById(R.id.animationView);
        edScorrl=findViewById(R.id.edScorrl);

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


        RequestQueue queue = Volley.newRequestQueue(GossipActivity1.this);
        String url = "http://192.168.1.107/apps/load%20server%20gossip.one";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        animationView.setVisibility(View.GONE);
                        edScorrl.setVisibility(View.VISIBLE);

                        


                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Gossipone1=jsonObject.getString("Gossipone1");
                            String Gossipone2=jsonObject.getString("Gossipone2");
                            String Gossipone3=jsonObject.getString("Gossipone3");
                            String Gossipone4=jsonObject.getString("Gossipone4");
                            String Gossipone5=jsonObject.getString("Gossipone5");
                            String Gossipone6=jsonObject.getString("Gossipone6");
                            String Gossipone7=jsonObject.getString("Gossipone7");
                            String Gossipone8=jsonObject.getString("Gossipone8");
                            String Gossipone9=jsonObject.getString("Gossipone9");
                            String Gossipone10=jsonObject.getString("Gossipone10");
                            String Gossipone11=jsonObject.getString("Gossipone11");
                            String Gossipone12=jsonObject.getString("Gossipone12");
                            String Gossipone13=jsonObject.getString("Gossipone13");
                            String Gossipone14=jsonObject.getString("Gossipone14");
                            String Gossipone15=jsonObject.getString("Gossipone15");
                            String Gossipone16=jsonObject.getString("Gossipone16");
                            String Gossipone17=jsonObject.getString("Gossipone17");
                            String Gossipone18=jsonObject.getString("Gossipone18");
                            String Gossipone19=jsonObject.getString("Gossipone19");
                            String Gossipone20=jsonObject.getString("Gossipone20");
                            String Gossipone21=jsonObject.getString("Gossipone21");
                            String Gossipone22=jsonObject.getString("Gossipone22");
                            String Gossipone23=jsonObject.getString("Gossipone23");
                            String Gossipone24=jsonObject.getString("Gossipone24");
                            String Gossipone25=jsonObject.getString("Gossipone25");
                            String Gossipone26=jsonObject.getString("Gossipone26");
                            String Gossipone27=jsonObject.getString("Gossipone27");
                            String Gossipone28=jsonObject.getString("Gossipone28");
                            String Gossipone29=jsonObject.getString("Gossipone29");
                            String Gossipone30=jsonObject.getString("Gossipone30");

                            text1.setText(Gossipone1);
                            text2.setText(Gossipone2);
                            text3.setText(Gossipone3);
                            text4.setText(Gossipone4);
                            text5.setText(Gossipone5);
                            text6.setText(Gossipone6);
                            text7.setText(Gossipone7);
                            text8.setText(Gossipone8);
                            text9.setText(Gossipone9);
                            text10.setText(Gossipone10);
                            text11.setText(Gossipone11);
                            text12.setText(Gossipone12);
                            text13.setText(Gossipone13);
                            text14.setText(Gossipone14);
                            text15.setText(Gossipone15);
                            text16.setText(Gossipone16);
                            text17.setText(Gossipone17);
                            text18.setText(Gossipone18);
                            text19.setText(Gossipone19);
                            text20.setText(Gossipone20);
                            text21.setText(Gossipone21);
                            text22.setText(Gossipone22);
                            text23.setText(Gossipone23);
                            text24.setText(Gossipone24);
                            text25.setText(Gossipone25);
                            text26.setText(Gossipone26);
                            text27.setText(Gossipone27);
                            text28.setText(Gossipone28);
                            text29.setText(Gossipone29);
                            text30.setText(Gossipone30);





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