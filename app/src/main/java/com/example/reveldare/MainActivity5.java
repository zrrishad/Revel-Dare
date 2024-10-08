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

public class MainActivity5 extends AppCompatActivity {

    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;
    LottieAnimationView animationView;
    HorizontalScrollView edScorrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

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



        RequestQueue queue = Volley.newRequestQueue(MainActivity5.this);
        String url = "http://192.168.1.107/apps/load%20server.five";

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
                            String Five1=jsonObject.getString("Five1");
                            String  Five2=jsonObject.getString("Five2");
                            String  Five3=jsonObject.getString("Five3");
                            String  Five4=jsonObject.getString("Five4");
                            String  Five5=jsonObject.getString("Five5");

                            String Five6=jsonObject.getString("Five6");
                            String  Five7=jsonObject.getString("Five7");
                            String  Five8=jsonObject.getString("Five8");
                            String  Five9=jsonObject.getString("Five9");
                            String  Five10=jsonObject.getString("Five10");

                            String Five11=jsonObject.getString("Five11");
                            String  Five12=jsonObject.getString("Five12");
                            String  Five13=jsonObject.getString("Five13");
                            String  Five14=jsonObject.getString("Five14");
                            String  Five15=jsonObject.getString("Five15");

                            String Five16=jsonObject.getString("Five16");
                            String Five17=jsonObject.getString("Five17");
                            String Five18=jsonObject.getString("Five18");
                            String  Five19=jsonObject.getString("Five19");
                            String  Five20=jsonObject.getString("Five20");

                            String Five21=jsonObject.getString("Five21");
                            String  Five22=jsonObject.getString("Five22");
                            String  Five23=jsonObject.getString("Five23");
                            String  Five24=jsonObject.getString("Five24");
                            String  Five25=jsonObject.getString("Five25");

                            String Five26=jsonObject.getString("Five26");
                            String  Five27=jsonObject.getString("Five27");
                            String  Five28=jsonObject.getString("Five28");
                            String  Five29=jsonObject.getString("Five29");
                            String  Five30=jsonObject.getString("Five30");




                            text1.setText(Five1);
                            text2.setText(Five2);
                            text3.setText(Five3);
                            text4.setText(Five4);
                            text5.setText(Five5);

                            text6.setText(Five6);
                            text7.setText(Five7);
                            text8.setText(Five8);
                            text9.setText(Five9);
                            text10.setText(Five10);

                            text11.setText(Five11);
                            text12.setText(Five12);
                            text13.setText(Five13);
                            text14.setText(Five14);
                            text15.setText(Five15);

                            text16.setText(Five16);
                            text17.setText(Five17);
                            text18.setText(Five18);
                            text19.setText(Five19);
                            text20.setText(Five20);

                            text21.setText(Five21);
                            text22.setText(Five22);
                            text23.setText(Five23);
                            text24.setText(Five24);
                            text25.setText(Five25);

                            text26.setText(Five26);
                            text27.setText(Five27);
                            text28.setText(Five28);
                            text29.setText(Five29);
                            text30.setText(Five30);





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