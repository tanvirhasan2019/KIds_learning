package com.kidslearning.tansh.kids_learning;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.Locale;


public class Letter  extends AppCompatActivity implements View.OnClickListener {

    private Button asp, b, c, d, e, f, gf, h, i, j, k, l, m, nns, os, p, q, r, s, t, u, Vs, w, x, y, z;



    TextToSpeech t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter);


        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                    t1.setSpeechRate(1);
                }
            }
        });



        asp = (Button) this.findViewById(R.id.asound_id);
        b = (Button) this.findViewById(R.id.b_id);
        c = (Button) this.findViewById(R.id.c_id);
        d = (Button) this.findViewById(R.id.d_id);
        e = (Button) this.findViewById(R.id.e_id);
        f = (Button) this.findViewById(R.id.f_id);
        gf = (Button) this.findViewById(R.id.gg_id);
        h = (Button) this.findViewById(R.id.h_id);
        i = (Button) this.findViewById(R.id.i_id);
        j = (Button) this.findViewById(R.id.j_id);
        k = (Button) this.findViewById(R.id.k_id);
        l = (Button) this.findViewById(R.id.l_id);
        m = (Button) this.findViewById(R.id.m_id);
        nns = (Button) this.findViewById(R.id.nn_id);
        os = (Button) this.findViewById(R.id.oo_id);
        p = (Button) this.findViewById(R.id.p_id);
        q = (Button) this.findViewById(R.id.q_id);
        r = (Button) this.findViewById(R.id.r_id);
        s = (Button) this.findViewById(R.id.s_id);
        t = (Button) this.findViewById(R.id.t_id);
        u = (Button) this.findViewById(R.id.u_id);
        Vs = (Button) this.findViewById(R.id.v_id);
        w = (Button) this.findViewById(R.id.w_id);
        x = (Button) this.findViewById(R.id.x_id);
        y = (Button) this.findViewById(R.id.y_id);
        z = (Button) this.findViewById(R.id.z_id);


        asp.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        gf.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        nns.setOnClickListener(this);
        os.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        Vs.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == asp.getId())
        {
            String toSpeak="A";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }


        if (v.getId() == b.getId())
        {

            String toSpeak="B";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == c.getId())
        {
            String toSpeak="C";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == d.getId())
        {

            String toSpeak="D";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
        }

        if (v.getId() == e.getId())
        {

            String toSpeak="e";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
        }

        if (v.getId() == f.getId())
        {

            String toSpeak="F";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == gf.getId())
        {

            String toSpeak="G";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == h.getId())
        {


            String toSpeak="H";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == i.getId())
        {

            String toSpeak="I";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == j.getId())
        {

            String toSpeak="J";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == k.getId())
        {

            String toSpeak="K";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == l.getId())
        {

            String toSpeak="L";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == m.getId())
        {

            String toSpeak="M";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == nns.getId())
        {

            String toSpeak="N";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == os.getId())
        {
            String toSpeak="O";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == p.getId())
        {

            String toSpeak="P";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == q.getId())
        {
            String toSpeak="Q";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


        }
        if (v.getId() == r.getId())
        {
            String toSpeak="R";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }
        if (v.getId() == s.getId())
        {
            String toSpeak="s";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


        }
        if (v.getId() == t.getId())
        {
            String toSpeak="T";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }
        if (v.getId() == u.getId())
        {
            String toSpeak="U";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }
        if (v.getId() == Vs.getId())
        {
            String toSpeak="V";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


        }



        if (v.getId() == w.getId())
        {
            String toSpeak="w";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        if (v.getId() == x.getId())
        {
            String toSpeak="X";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


        }
        if (v.getId() == y.getId())
        {
            String toSpeak="y";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


        }

        if (v.getId() == z.getId())
        {
            String toSpeak="z";
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

   }


}

