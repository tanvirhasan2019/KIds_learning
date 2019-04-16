package com.kidslearning.tansh.kids_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Quiz_test extends AppCompatActivity {

private Button submit;
private ImageView image;
private RadioButton radio1, radio2, radio3, radio4;
int Question[]={R.drawable.fruit_orange, R.drawable.animal_cow, R.drawable.y_yellow, R.drawable.animal_elephant, R.drawable.animal_zebra, R.drawable.oc_doctor, R.drawable.color_green,  R.drawable.vehicle_train, R.drawable.vehicle_jeep, R.drawable.shape_cylinder, R.drawable.shape_circle};
String answer[]={"Orange", "Cow", "Yellow", "Elephant", "Zebra", "Doctor", "Green","Train", "Jeep", "Cylinder", "Circle"};
String Choose[]={"Banana", "Mangoo", "WaterMelon", "Orange", "Zebra", "Cow", "Elephant", "Tiger", "Yellow", "Black", "White", "Blue", "Elephant", "Zebra", "Cow", "Fox", "Monkey", "Horse", "Zebra", "Tiger", "Doctor", "Carpenter", "Scintist", "Driver", "Red", "Green", "Black", "Magenta",  "Train", "Jeep", "Helicopter", "Bus", "Jeep", "Helicopter", "Bus", "Cycle", "Rectangle", "Circle", "Cylinder", "Square", "Rectangle", "Triangle", "Cylinder", "Circle"};
int position=0;
int choice=0;
int score=0;
String userans[]=new String[100];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_test);

        radio1=findViewById(R.id.radio1ID);
        radio2=findViewById(R.id.radio2ID);
        radio3=findViewById(R.id.radio3ID);
        radio4=findViewById(R.id.radio4ID);
        submit=findViewById(R.id.SubmitID);

        image=findViewById(R.id.ImageTestID);
        image.setImageResource(Question[position]);
       // image.setBackgroundResource(Question[position]);

        radio1.setText(Choose[choice]);
        radio2.setText(Choose[choice+1]);
        radio3.setText(Choose[choice+2]);
        radio4.setText(Choose[choice+3]);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(radio1.isChecked())
                {
                    userans[position]=radio1.getText().toString();
                }
                if(radio2.isChecked())
                {
                    userans[position]=radio2.getText().toString();
                }

                if(radio3.isChecked())
                {
                    userans[position]=radio3.getText().toString();
                }
                if(radio4.isChecked())
                {
                    userans[position]=radio4.getText().toString();
                }

                if(userans[position]==answer[position])
                {
                    score++;
                }

                if(position==10)
                {
                    Intent intent=new Intent(Quiz_test.this, Quiz_Score.class);
                    intent.putExtra("score", score);
                    position=0;
                    choice=0;
                    score=0;
                    startActivity(intent);
                   // position=0;
                }


                position++;
                choice = choice+4;

                image.setImageResource(Question[position]);
                // image.setBackgroundResource(Question[position]);

                radio1.setText(Choose[choice]);
                radio2.setText(Choose[choice+1]);
                radio3.setText(Choose[choice+2]);
                radio4.setText(Choose[choice+3]);


            }

        });

        }
}
