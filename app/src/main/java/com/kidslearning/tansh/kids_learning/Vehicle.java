package com.kidslearning.tansh.kids_learning;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Locale;

public class Vehicle extends AppCompatActivity implements View.OnClickListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener  {

    private GestureDetector gestureDetector;
    //  private GestureDetector gestureDetector;
    private static final int SWIPE_DISTANCE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;

    private ImageButton left, right;
    private TextView text;
    private ImageView image;
    private int position;
    private int vehicle[]={R.drawable.vehicle_bus, R.drawable.vehicle_cycle, R.drawable.vehicle_jeep, R.drawable.vehicle_motorcycle, R.drawable.vehicle_plane, R.drawable.vehicle_ship, R.drawable.vehicle_tractor, R.drawable.vehicle_train, R.drawable.vehicle_tram,  R.drawable.vehicle_truck, R.drawable.vehicles_car, R.drawable.h_helicopter};
    private TextToSpeech t1;
    String[] vehicle_text = new String[]{"BUS", " BICYCLE", "JEEP", "MOTORCYCLE", "PLANE", "SHIP", "TRACTOR", "TRAIN", "TRAM", "TRUCK", "CAR", "HELICOPTER"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);


        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);

                    t1.speak(vehicle_text[position], TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });

        left=(ImageButton)findViewById(R.id.left_id);
        right=(ImageButton)findViewById(R.id.right_id);

        text=(TextView)findViewById(R.id.text_id);
        image=(ImageView)findViewById(R.id.image_id);

        image.setImageResource(vehicle[position]);
        text.setText(vehicle_text[position]);


        left.setOnClickListener(this);
        right.setOnClickListener(this);

        this.gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);
    }


    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {


        float distanceX = e2.getX() - e1.getX();
        float distanceY = e2.getY() - e1.getY();

        if (Math.abs(distanceX) > Math.abs(distanceY) && Math.abs(distanceX) > SWIPE_DISTANCE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD)
        {
            if (distanceX > 0)
                onSwipeLeft();
            else
                onSwipeRight();
            return true;
        }


        return true;

    }

    public void onSwipeRight ()
    {
        //   t1.speak("you swipe left to right", TextToSpeech.QUEUE_FLUSH, null);
        if(position>=0 && position<=11) {

            if (position == 11) {
                position = 0;
            } else {
                position++;
            }
            image.setImageResource(vehicle[position]);
            t1.speak(vehicle_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(vehicle_text[position]);

        }


    }

    public void onSwipeLeft ()
    {
        //  t1.speak("you swipe right to left", TextToSpeech.QUEUE_FLUSH, null);
        if(position>=0 && position<=11) {

            if (position == 0) {
                position = 11;
            } else {
                position--;
            }
            image.setImageResource(vehicle[position]);
            t1.speak(vehicle_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(vehicle_text[position]);


        }






    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e)
    {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e)
    {

        //  t1.speak("you pressed double", TextToSpeech.QUEUE_FLUSH, null);

        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e)
    {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        //media.release();
    }



    @Override
    public void onClick(View v) {


      /*  if (v.getId() == left.getId()) {
            if (position >= 0 && position <= 11) {

                if (position == 0) {
                    position = 11;
                } else {
                    position--;
                }
                image.setImageResource(vehicle[position]);
                t1.speak(vehicle_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(vehicle_text[position]);


            }
        }

        if (v.getId() == right.getId()) {


            if (position >= 0 && position <= 11) {

                if (position == 11) {
                    position = 0;
                } else {
                    position++;
                }
                image.setImageResource(vehicle[position]);
                t1.speak(vehicle_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(vehicle_text[position]);


            }

        }
        */
    }
}
