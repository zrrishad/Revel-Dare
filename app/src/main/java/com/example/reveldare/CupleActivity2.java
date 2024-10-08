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

public class CupleActivity2 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;
    LottieAnimationView animationView;
    HorizontalScrollView edScorrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cuple2);

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

        RequestQueue queue = Volley.newRequestQueue(CupleActivity2.this);
        String url = "http://192.168.1.107/apps/load%20server%20cupple.two";

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
                            String Cupletwo1=jsonObject.getString("Cuple1");
                            String Cupletwo2=jsonObject.getString("Cuple2");
                            String Cupletwo3=jsonObject.getString("Cuple3");
                            String Cupletwo4=jsonObject.getString("Cuple4");
                            String Cupletwo5=jsonObject.getString("Cuple5");
                            String Cupletwo6=jsonObject.getString("Cuple6");
                            String Cupletwo7=jsonObject.getString("Cuple7");
                            String Cupletwo8=jsonObject.getString("Cuple8");
                            String Cupletwo9=jsonObject.getString("Cuple9");
                            String Cupletwo10=jsonObject.getString("Cuple10");
                            String Cupletwo11=jsonObject.getString("Cuple11");
                            String Cupletwo12=jsonObject.getString("Cuple12");
                            String Cupletwo13=jsonObject.getString("Cuple13");
                            String Cupletwo14=jsonObject.getString("Cuple14");
                            String Cupletwo15=jsonObject.getString("Cuple15");
                            String Cupletwo16=jsonObject.getString("Cuple16");
                            String Cupletwo17=jsonObject.getString("Cuple17");
                            String Cupletwo18=jsonObject.getString("Cuple18");
                            String Cupletwo19=jsonObject.getString("Cuple19");
                            String Cupletwo20=jsonObject.getString("Cuple20");
                            String Cupletwo21=jsonObject.getString("Cuple21");
                            String Cupletwo22=jsonObject.getString("Cuple22");
                            String Cupletwo23=jsonObject.getString("Cuple23");
                            String Cupletwo24=jsonObject.getString("Cuple24");
                            String Cupletwo25=jsonObject.getString("Cuple25");
                            String Cupletwo26=jsonObject.getString("Cuple26");
                            String Cupletwo27=jsonObject.getString("Cuple27");
                            String Cupletwo28=jsonObject.getString("Cuple28");
                            String Cupletwo29=jsonObject.getString("Cuple29");
                            String Cupletwo30=jsonObject.getString("Cuple30");

                            text1.setText(Cupletwo1);
                            text2.setText(Cupletwo2);
                            text3.setText(Cupletwo3);
                            text4.setText(Cupletwo4);
                            text5.setText(Cupletwo5);
                            text6.setText(Cupletwo6);
                            text7.setText(Cupletwo7);
                            text8.setText(Cupletwo8);
                            text9.setText(Cupletwo9);
                            text10.setText(Cupletwo10);
                            text11.setText(Cupletwo11);
                            text12.setText(Cupletwo12);
                            text13.setText(Cupletwo13);
                            text14.setText(Cupletwo14);
                            text15.setText(Cupletwo15);
                            text16.setText(Cupletwo16);
                            text17.setText(Cupletwo17);
                            text18.setText(Cupletwo18);
                            text19.setText(Cupletwo19);
                            text20.setText(Cupletwo20);
                            text21.setText(Cupletwo21);
                            text22.setText(Cupletwo22);
                            text23.setText(Cupletwo23);
                            text24.setText(Cupletwo24);
                            text25.setText(Cupletwo25);
                            text26.setText(Cupletwo26);
                            text27.setText(Cupletwo27);
                            text28.setText(Cupletwo28);
                            text29.setText(Cupletwo29);
                            text30.setText(Cupletwo30);





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