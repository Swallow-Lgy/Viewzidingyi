package com.example.viewyuanpan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CuustomCircle extends View {
    Paint mPaint;
    public CuustomCircle(Context context) {
        super(context);
        init();
    }

    public CuustomCircle(Context context,  AttributeSet attrs) {
        super(context, attrs);
        init();
    }
     public void  init(){
         mPaint = new Paint();
         mPaint.setColor(Color.RED);
         mPaint.setStrokeWidth(10);
         mPaint.setTextSize(60);
         mPaint.setStyle(Paint.Style.FILL);
     }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //长方形
        RectF rectF = new RectF();
        //
        rectF.top=100;
        rectF.bottom=400;
        rectF.right=550;
        rectF.left=350;
        mPaint.setColor(Color.BLACK);
        canvas.drawArc(rectF,60,60,true,mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(450,450,150,mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("开始",400,450,mPaint);
    }
}
