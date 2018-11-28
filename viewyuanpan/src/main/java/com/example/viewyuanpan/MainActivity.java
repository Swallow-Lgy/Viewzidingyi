package com.example.viewyuanpan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;

public class MainActivity extends AppCompatActivity {
     CuustomCircle cuustomCircle;
     MyView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
   private void  initView(){
       cuustomCircle =  cuustomCircle = findViewById(R.id.circle);
        view = findViewById(R.id.view);
        cuustomCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degress = (float) (720+Math.random()*1000);
                RotateAnimation rotateAnimation = new RotateAnimation(0,degress,450,450);
                rotateAnimation.setDuration(5000);
                rotateAnimation.setFillAfter(true);
                view.startAnimation(rotateAnimation);
            }
        });
    }
}
