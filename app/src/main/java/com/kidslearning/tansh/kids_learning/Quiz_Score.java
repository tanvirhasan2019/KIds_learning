package com.kidslearning.tansh.kids_learning;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Quiz_Score extends AppCompatActivity {
private TextView text;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__score);



        text=findViewById(R.id.textID);
        Bundle bundle=getIntent().getExtras();
        int data1=bundle.getInt("score");
        text.setText("Score : "+data1);

        if(data1>0)
        {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.clap);
            mediaPlayer.start();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();

    }
}
