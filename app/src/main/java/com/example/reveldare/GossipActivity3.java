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

public class GossipActivity3 extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27,text28,text29,text30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gossip3);

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




        RequestQueue queue = Volley.newRequestQueue(GossipActivity3.this);
        String url = "http://192.168.157.159/apps/load%20server%20gossip.three";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.

                        Log.d("serverRes",response);

                        try {
                            JSONObject jsonObject=new JSONObject(response);
                            String Gossipthree1=jsonObject.getString("Gossipthree1");
                            String Gossipthree2=jsonObject.getString("Gossipthree2");
                            String Gossipthree3=jsonObject.getString("Gossipthree3");
                            String Gossipthree4=jsonObject.getString("Gossipthree4");
                            String Gossipthree5=jsonObject.getString("Gossipthree5");
                            String Gossipthree6=jsonObject.getString("Gossipthree6");
                            String Gossipthree7=jsonObject.getString("Gossipthree7");
                            String Gossipthree8=jsonObject.getString("Gossipthree8");
                            String Gossipthree9=jsonObject.getString("Gossipthree9");
                            String Gossipthree10=jsonObject.getString("Gossipthree10");
                            String Gossipthree11=jsonObject.getString("Gossipthree11");
                            String Gossipthree12=jsonObject.getString("Gossipthree12");
                            String Gossipthree13=jsonObject.getString("Gossipthree13");
                            String Gossipthree14=jsonObject.getString("Gossipthree14");
                            String Gossipthree15=jsonObject.getString("Gossipthree15");
                            String Gossipthree16=jsonObject.getString("Gossipthree16");
                            String Gossipthree17=jsonObject.getString("Gossipthree17");
                            String Gossipthree18=jsonObject.getString("Gossipthree18");
                            String Gossipthree19=jsonObject.getString("Gossipthree19");
                            String Gossipthree20=jsonObject.getString("Gossipthree20");
                            String Gossipthree21=jsonObject.getString("Gossipthree21");
                            String Gossipthree22=jsonObject.getString("Gossipthree22");
                            String Gossipthree23=jsonObject.getString("Gossipthree23");
                            String Gossipthree24=jsonObject.getString("Gossipthree24");
                            String Gossipthree25=jsonObject.getString("Gossipthree25");
                            String Gossipthree26=jsonObject.getString("Gossipthree26");
                            String Gossipthree27=jsonObject.getString("Gossipthree27");
                            String Gossipthree28=jsonObject.getString("Gossipthree28");
                            String Gossipthree29=jsonObject.getString("Gossipthree29");
                            String Gossipthree30=jsonObject.getString("Gossipthree30");

                            text1.setText(Gossipthree1);
                            text2.setText(Gossipthree2);
                            text3.setText(Gossipthree3);
                            text4.setText(Gossipthree4);
                            text5.setText(Gossipthree5);
                            text6.setText(Gossipthree6);
                            text7.setText(Gossipthree7);
                            text8.setText(Gossipthree8);
                            text9.setText(Gossipthree9);
                            text10.setText(Gossipthree10);
                            text11.setText(Gossipthree11);
                            text12.setText(Gossipthree12);
                            text13.setText(Gossipthree13);
                            text14.setText(Gossipthree14);
                            text15.setText(Gossipthree15);
                            text16.setText(Gossipthree16);
                            text17.setText(Gossipthree17);
                            text18.setText(Gossipthree18);
                            text19.setText(Gossipthree19);
                            text20.setText(Gossipthree20);
                            text21.setText(Gossipthree21);
                            text22.setText(Gossipthree22);
                            text23.setText(Gossipthree23);
                            text24.setText(Gossipthree24);
                            text25.setText(Gossipthree25);
                            text26.setText(Gossipthree26);
                            text27.setText(Gossipthree27);
                            text28.setText(Gossipthree28);
                            text29.setText(Gossipthree29);
                            text30.setText(Gossipthree30);





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