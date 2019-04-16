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

public class Number extends AppCompatActivity implements View.OnClickListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetector gestureDetector;
    //  private GestureDetector gestureDetector;
    private static final int SWIPE_DISTANCE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;

    private ImageButton left, right;
    private TextView text;
    private ImageView image;
    private int position;

    private int number[]={R.drawable.num_one, R.drawable.num_two, R.drawable.num_three, R.drawable.num_four, R.drawable.num_five, R.drawable.num_six, R.drawable.num_seven, R.drawable.num_eight, R.drawable.num_nine,  R.drawable.num_ten, R.drawable.num_elevn, R.drawable.num_twlv, R.drawable.num_thirteen, R.drawable.num_fourteen,  R.drawable.num_fifteen, R.drawable.num_sixteen, R.drawable.num_seventeen, R.drawable.num_eighteen, R.drawable.num_nineteen, R.drawable.num_twenty};

    String[] number_text = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    String[] words_text = new String[]{"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY"};

    private TextToSpeech t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);




        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);

                    t1.speak(number_text[position], TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });

        left=(ImageButton)findViewById(R.id.left_id);
        right=(ImageButton)findViewById(R.id.right_id);

        text=(TextView)findViewById(R.id.text_id);
        image=(ImageView)findViewById(R.id.image_id);

        image.setImageResource(number[position]);
        text.setText(words_text[position]);


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
        if(position>=0 && position<=19) {

            if (position == 19) {
                position = 0;
            } else {
                position++;
            }
            image.setImageResource(number[position]);
            t1.speak(number_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(words_text[position]);

        }


    }

    public void onSwipeLeft ()
    {
        //  t1.speak("you swipe right to left", TextToSpeech.QUEUE_FLUSH, null);
        if(position>=0 && position<=19) {

            if (position == 0) {
                position = 19;
            } else {
                position--;
            }
            image.setImageResource(number[position]);
            t1.speak(number_text[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(words_text[position]);

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
            if(position>=0 && position<=19)
            {

                if(position==0)
                {
                    position=19;
                }
                else
                {
                    position--;
                }
                image.setImageResource(number[position]);
                t1.speak(number_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(words_text[position]);




            }
        }

        if(v.getId()==right.getId())
        {


            if(position>=0 && position<=19)
            {

                if(position==19)
                {
                    position=0;
                }
                else
                {
                    position++;
                }

                image.setImageResource(number[position]);
                t1.speak(number_text[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(words_text[position]);


            }

        }
        */
    }
}
