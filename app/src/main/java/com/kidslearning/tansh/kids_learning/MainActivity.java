package com.kidslearning.tansh.kids_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private CircleImageView letter, words, numbers, colors, shapes, days, months, fruits, animals, vehicles, bodys, occupations, OnlineGames, Quiz, Credit, Youtube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letter=(CircleImageView)findViewById(R.id.letter_id);
        words=(CircleImageView)findViewById(R.id.words_id);
        numbers=(CircleImageView)findViewById(R.id.number_id);
        colors=(CircleImageView)findViewById(R.id.color_id);
        shapes=(CircleImageView)findViewById(R.id.shape_id);
        days=(CircleImageView)findViewById(R.id.day_id);
        months=(CircleImageView)findViewById(R.id.month_id);
        fruits=(CircleImageView)findViewById(R.id.fruit_id);
        animals=(CircleImageView)findViewById(R.id.animal_id);
        vehicles=(CircleImageView)findViewById(R.id.vehicle_id);
        bodys=(CircleImageView)findViewById(R.id.body_id);
        occupations=(CircleImageView)findViewById(R.id.occupation_id);
        OnlineGames=(CircleImageView)findViewById(R.id.Games_id);
        Quiz=(CircleImageView)findViewById(R.id.QuizId);
        Credit=(CircleImageView)findViewById(R.id.CreditID);
        Youtube=findViewById(R.id.YoutubeID);








        letter.setOnClickListener(this);
        words.setOnClickListener(this);
        numbers.setOnClickListener(this);
        colors.setOnClickListener(this);
        shapes.setOnClickListener(this);
        days.setOnClickListener(this);
        months.setOnClickListener(this);
        fruits.setOnClickListener(this);
        animals.setOnClickListener(this);
        vehicles.setOnClickListener(this);
        bodys.setOnClickListener(this);
        occupations.setOnClickListener(this);
        OnlineGames.setOnClickListener(this);
        Quiz.setOnClickListener(this);
        Credit.setOnClickListener(this);
        Youtube.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {
        if(v.getId()==letter.getId())
         {
            Intent intent=new Intent(MainActivity.this, Letter.class);
           startActivity(intent);
         }
        if(v.getId()==words.getId())
        {
            Intent intent=new Intent(MainActivity.this, Words.class);
            startActivity(intent);
        }
        if(v.getId()==numbers.getId())
        {
            Intent intent=new Intent(MainActivity.this, Number .class);
            startActivity(intent);
        }

        if(v.getId()==colors.getId())
        {
            Intent intent=new Intent(MainActivity.this, Color .class);
            startActivity(intent);
        }
        if(v.getId()==shapes.getId())
        {
            Intent intent=new Intent(MainActivity.this, Shape .class);
            startActivity(intent);
        }

        if(v.getId()==days.getId())
        {
            Intent intent=new Intent(MainActivity.this, Day .class);
            startActivity(intent);
        }

        if(v.getId()==months.getId())
        {
            Intent intent=new Intent(MainActivity.this, Month .class);
            startActivity(intent);
        }
        if(v.getId()==fruits.getId())
        {
            Intent intent=new Intent(MainActivity.this, Fruit .class);
            startActivity(intent);
        }

        if(v.getId()==animals.getId())
        {
            Intent intent=new Intent(MainActivity.this, Animal .class);
            startActivity(intent);
        }

        if(v.getId()==vehicles.getId())
        {
            Intent intent=new Intent(MainActivity.this, Vehicle  .class);
            startActivity(intent);
        }

        if(v.getId()==bodys.getId())
        {
            Intent intent=new Intent(MainActivity.this, Body  .class);
            startActivity(intent);
        }

        if(v.getId()==occupations.getId())
        {
            Intent intent=new Intent(MainActivity.this, Occupation  .class);
            startActivity(intent);
        }
        if(v.getId()==OnlineGames.getId())
        {
            Intent intent=new Intent(MainActivity.this, Onlinegames.class);
            startActivity(intent);
        }

       if(v.getId()==Quiz.getId())
        {
            Intent intent=new Intent(MainActivity.this, Quiz_test.class);
            startActivity(intent);
        }

        if(v.getId()==Credit.getId())
        {
            Intent intent=new Intent(MainActivity.this, Credit.class);
            startActivity(intent);
        }

        if(v.getId()==Youtube.getId())
        {
            Intent intent=new Intent(MainActivity.this, Youtube_link.class);
            startActivity(intent);
        }

    }
}
