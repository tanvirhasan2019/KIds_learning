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

public class Animal extends AppCompatActivity implements View.OnClickListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

  //  private ImageButton left, right;
    private TextView text;
    private GestureDetector gestureDetector;
    private static final int SWIPE_DISTANCE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;
    private ImageView image;
    private int position;
    private int animal[]={R.drawable.animal_cow, R.drawable.animal_camel, R.drawable.animal_deer, R.drawable.animal_elephant, R.drawable.animal_fox1, R.drawable.animal_giraffe, R.drawable.animal_hippo,  R.drawable.animal_kangaroo,  R.drawable.animal_lion, R.drawable.animal_monkey, R.drawable.animal_zebra, R.drawable.animal_yak, R.drawable.animal_wolf, R.drawable.animal_tiger, R.drawable.animal_squirell, R.drawable.animal_platypus, R.drawable.animal_panda};
    private TextToSpeech t1;
    String[] animal_text = new String[]{"COW", " CAMEL", "DEER", "ELEPHANT", "FOX", "GIRAFFE", "HIPPOPOTAMUS", "KANGAROO", "LION", "MONKEY", "ZEBRA", "YAK", "WOLF", "TIGER", "SQUIRREL", "PLATYPUS", "PANDA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);




        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);

                    t1.speak(animal_text[position], TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });
        this.gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);


      //  left=(ImageButton)findViewById(R.id.left_id);
      //  right=(ImageButton)findViewById(R.id.right_id);

        text=(TextView)findViewById(R.id.text_id);
        image=(ImageView)findViewById(R.id.image_id);

        image.setImageResource(animal[position]);
        text.setText(animal_text[position]);


      //  left.setOnClickListener(this);
      //  right.setOnClickListener(this);



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
        if(position>=0 && position<=16) {

            if (position == 16) {
                position = 0;
            } else {
                position++;
            }
            image.setImageResource(animal[position]);
            t1.speak(animal_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(animal_text[position]);
        }


    }

    public void onSwipeLeft ()
    {
        //  t1.speak("you swipe right to left", TextToSpeech.QUEUE_FLUSH, null);
        if(position>=0 && position<=16) {

            if (position == 0) {
                position = 16;
            } else {
                position--;
            }
            image.setImageResource(animal[position]);
            t1.speak(animal_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(animal_text[position]);
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

       /* if(v.getId()==left.getId())
        {
            if(position>=0 && position<=16)
            {

                if(position==0)
                {
                    position=16;
                }
                else
                {
                    position--;
                }
                image.setImageResource(animal[position]);
                t1.speak(animal_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(animal_text[position]);




            }
        }

        if(v.getId()==right.getId())
        {


            if(position>=0 && position<=16)
            {

                if(position==16)
                {
                    position=0;
                }
                else
                {
                    position++;
                }
                image.setImageResource(animal[position]);
                t1.speak(animal_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(animal_text[position]);



            }

        }*/
    }
}
