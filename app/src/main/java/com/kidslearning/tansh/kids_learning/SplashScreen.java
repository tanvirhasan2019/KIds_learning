package com.kidslearning.tansh.kids_learning;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class SplashScreen extends AppCompatActivity {

    private TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                   // t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                    float speed= 1/5;
                    t1.setSpeechRate(speed);
                    t1.speak("welcome to kids learning", TextToSpeech.QUEUE_FLUSH, null);
                    sleep(2000);


                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}

