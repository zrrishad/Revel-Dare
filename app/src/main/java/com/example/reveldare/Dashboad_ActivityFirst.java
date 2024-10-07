package com.example.reveldare;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Dashboad_ActivityFirst extends AppCompatActivity implements NetworkChangeReceiver.NetworkChangeListener{


    AlertDialog dialog;
    NetworkChangeReceiver networkChangeReceiver = new NetworkChangeReceiver(this);



    CardView button1,button2,button3;

    ImageSlider imageSli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboad_first);

       button1=findViewById(R.id.button1);
       button2=findViewById(R.id.button2);
       button3=findViewById(R.id.button3);


        imageSli=findViewById(R.id.imageSli);

        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.pic_18, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_8, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_9, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_10, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_11, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_12, ScaleTypes.FIT));

        imageSli.setImageList(slideModels, ScaleTypes.FIT);


      button1.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View view) {
              Intent myIntent=new Intent(Dashboad_ActivityFirst.this,Dashboard.class);
               startActivity(myIntent);
           }
        });

 button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myIntent=new Intent(Dashboad_ActivityFirst.this,CupleDashboad.class);
        startActivity(myIntent);

    }
  });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(Dashboad_ActivityFirst.this,GossipDashboard.class);
                startActivity(myIntent);

            }
        });







    }



    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(networkChangeReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(networkChangeReceiver);
    }





    @Override
    public void onNetworkChanged(boolean isConnected) {
        if (isConnected) {

            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
                dialog = null;
            }

        } else {

            if (dialog == null || !dialog.isShowing()) {

                ShowDialog();
            }

        }
    }







    private void ShowDialog() {

        dialog = new AlertDialog.Builder(Dashboad_ActivityFirst.this)
                .setView(R.layout.no_internet_dialog)
                .setCancelable(false)
                .create();
        dialog.show();


        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));


        TextView playButton = dialog.findViewById(R.id.playButton);

        playButton.setOnClickListener(view->{

            Toast.makeText(this, "Please Check Internet", Toast.LENGTH_SHORT).show();
        });


    }








    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(Dashboad_ActivityFirst.this)
                .setMessage("ARE YOU SURE YOU WANT TO EXIT")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }

                })
                .setNegativeButton("No",null)
                .show();

    }
}