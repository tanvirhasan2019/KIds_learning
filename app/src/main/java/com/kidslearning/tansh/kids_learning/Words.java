package com.kidslearning.tansh.kids_learning;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Locale;

public class Words extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{


   // private ImageButton play;
    private ImageView image, symbol;
    private int position =0;
    private ImageButton play;
    private TextView text;

    private GestureDetector gestureDetector;
  //  private GestureDetector gestureDetector;
    private static final int SWIPE_DISTANCE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;

    private int alphabet[]={R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i,  R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n,  R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r, R.drawable.s,  R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x,  R.drawable.y, R.drawable.z};

    private int alphabet_symbol[]={R.drawable.a_apple, R.drawable.b_ball, R.drawable.c_cat, R.drawable.d_dog, R.drawable.e_egg, R.drawable.f_frog, R.drawable.g_gorilla, R.drawable.h_helicopter, R.drawable.i_igloo,  R.drawable.j_jug, R.drawable.k_kite, R.drawable.l_lion, R.drawable.m_mango, R.drawable.n_nest,  R.drawable.o_orange, R.drawable.p_penguine, R.drawable.queen, R.drawable.r_rabbit, R.drawable.sun,  R.drawable.t_train, R.drawable.u_umbrella, R.drawable.v_violin, R.drawable.w_watermelon, R.drawable.x_xylophone,  R.drawable.y_yellow, R.drawable.z_zoo};

    String[] words_text = new String[]{"APPLE", "BALL", "CAT", "DOG", "EGG", "FROG", "GORILLA", "HELICOPTER", "IGLOO", "JUG", "KITE", "LION", "MANGOE", "NEST", "ORANGE", "PENGUINE", "QUEEN", "RABBIT", "SUN", "TRAIN", "UMBRELLA", "VIOLIN", "WATERMELON", "XYLOPHONE","YELLOW", "ZOO"};
    private String []words=new String[]{"a for apple", "b for ball", "c for cat", "d for dog", "e for egg", "f for frog", "g for gorilla", "h for helicopter", "i for igloo", "j for jug", "k for kite", "l for lion", "m for mangoe", "n for nest", "o for orange", "p for penguine", "q for queen", "r for rabbit", "s for sun", "t for train", "u for umbrella", "v for violin", "w for watermelon", "x for xylophone", "y for yellow", "z for zoo"};
    private TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_words);





       // left=(ImageButton)findViewById(R.id.left_id);
       // right=(ImageButton)findViewById(R.id.right_id);
        image=(ImageView)findViewById(R.id.image_id);
        symbol=(ImageView)findViewById(R.id.symbol_id);
        play=(ImageButton)findViewById(R.id.play_id);
        text=(TextView)findViewById(R.id.text_id);


        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                    t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });


        this.gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);


        image.setBackgroundResource(alphabet[position]);
        image.setImageResource(alphabet[position]);
        symbol.setImageResource(alphabet_symbol[position]);
        text.setText(words_text[position]);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        // t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);

      //  left.setOnClickListener(this);
      //  right.setOnClickListener(this);
       // play.setOnClickListener(this);


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
        if(position>=0 && position<=25) {

            if (position == 25) {
                position = 0;
            } else {
                position++;
            }
            image.setImageResource(alphabet[position]);
            symbol.setImageResource(alphabet_symbol[position]);
            t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);
            text.setText(words_text[position]);
        }


        }

    public void onSwipeLeft ()
    {
        //  t1.speak("you swipe right to left", TextToSpeech.QUEUE_FLUSH, null);
        if(position>=0 && position<=25) {

            if (position == 0) {
                position = 25;
            } else {
                position--;
            }
            image.setImageResource(alphabet[position]);
            symbol.setImageResource(alphabet_symbol[position]);
            t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);
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


 /*   @Override
    public void onClick(View v) {


      /*  if(v.getId()==left.getId())
        {
            if(position>=0 && position<=25)
            {

                if(position==0)
                {
                    position=25;
                }
                else
                {
                    position--;
                }
                image.setImageResource(alphabet[position]);
                symbol.setImageResource(alphabet_symbol[position]);
                t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(words_text[position]);



            }
        }

        if(v.getId()==right.getId())
        {


            if(position>=0 && position<=25)
            {

                if(position==25)
                {
                    position=0;
                }
                else
                {
                    position++;
                }
                image.setImageResource(alphabet[position]);
                symbol.setImageResource(alphabet_symbol[position]);
                t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);
                text.setText(words_text[position]);


            }

        }


        if(v.getId()==play.getId())
        {
            t1.speak(words[position], TextToSpeech.QUEUE_FLUSH, null);

        }
    }
    */


}
