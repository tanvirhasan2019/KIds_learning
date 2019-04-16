package com.kidslearning.tansh.kids_learning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Credit extends AppCompatActivity implements View.OnClickListener {


  //  private ImageView image;
    //private TextView text;
    private CardView aminur_sir, fatima_mam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);




        aminur_sir=findViewById(R.id.AminurSIRID);
        fatima_mam=findViewById(R.id.FatimaMAMID);


        aminur_sir.setOnClickListener(this);
        fatima_mam.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==aminur_sir.getId())
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/aminur.artx90"));
            startActivity(intent);
        }

        if(v.getId()==fatima_mam.getId())
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/fatima.mirza.3094"));
            startActivity(intent);
        }

    }
}
