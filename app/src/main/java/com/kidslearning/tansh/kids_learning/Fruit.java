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

public class Fruit extends AppCompatActivity implements View.OnClickListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {


    private ImageButton left, right;

    private GestureDetector gestureDetector;
    //  private GestureDetector gestureDetector;
    private static final int SWIPE_DISTANCE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private TextView text;
    private ImageView image;
    private int position;
    private int fruit[]={R.drawable.a_apple, R.drawable.fruit_banana, R.drawable.fruit_black_berry, R.drawable.fruit_cherry, R.drawable.fruit_cocunut, R.drawable.fruit_grapes, R.drawable.fruit_lemon, R.drawable.fruit_orange, R.drawable.fruit_pineapple,  R.drawable.fruit_strawberry, R.drawable.fruit_watermelon};
    private TextToSpeech t1;
    String[] fruit_text = new String[]{"APPLE", " BANANA", "BLACK BERRY", "CHERRY", "COCUNUT", "GRAPE", "LEMON", "ORANGE", "PINEAPPLE", "STRAWBERRY", "WATERMELON"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);


        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);

                    t1.speak(fruit_text[position], TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });

        left=(ImageButton)findViewById(R.id.left_id);
        right=(ImageButton)findViewById(R.id.right_id);

        text=(TextView)findViewById(R.id.text_id);
        image=(ImageView)findViewById(R.id.image_id);

        image.setImageResource(fruit[position]);
        text.setText(fruit_text[position]);


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
        if(position>=0 && position<=10) {

            if (position == 10) {
                position = 0;
            } else {
                position++;
            }
            image.setImageResource(fruit[position]);
            t1.speak(fruit_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(fruit_text[position]);


        }


    }

    public void onSwipeLeft ()
    {
        //  t1.speak("you swipe right to left", TextToSpeech.QUEUE_FLUSH, null);
        if(position>=0 && position<=10) {

            if (position == 0) {
                position = 10;
            } else {
                position--;
            }
            image.setImageResource(fruit[position]);
            t1.speak(fruit_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(fruit_text[position]);



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

     /*   if(v.getId()==left.getId())
        {
            if(position>=0 && position<=10)
            {

                if(position==0)
                {
                    position=10;
                }
                else
                {
                    position--;
                }
                image.setImageResource(fruit[position]);
                t1.speak(fruit_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(fruit_text[position]);




            }
        }

        if(v.getId()==right.getId())
        {


            if(position>=0 && position<=10)
            {

                if(position==10)
                {
                    position=0;
                }
                else
                {
                    position++;
                }
               */
    }
}
