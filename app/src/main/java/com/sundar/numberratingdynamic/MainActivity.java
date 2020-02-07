package com.sundar.numberratingdynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RelativeLayout rl;
    RatingBar rating;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rl = (RelativeLayout) findViewById(R.id.r1);
        t1 = (TextView) findViewById(R.id.textView2);

        rating = new RatingBar (MainActivity.this);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams
                ((int) RelativeLayout.LayoutParams.WRAP_CONTENT, (int) RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.topMargin = 180;
        params.leftMargin = 20;

        rating.setLayoutParams(params);

        rl.addView(rating);

        rating.setNumStars(6);
        rating.setRating(3);
        rating.setStepSize((float) 0.5);

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                // TODO Auto-generated method stub

                t1.setText(String.valueOf(rating));
            }
        });
    }


}

