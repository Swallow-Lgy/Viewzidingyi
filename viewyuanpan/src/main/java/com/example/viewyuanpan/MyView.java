package com.example.viewyuanpan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    //画笔
    Paint mPaint;
    //定义圆盘的有几个扇形
    int mCricleCount = 6;
    //定义的开始角度
    float mStarAngle = 0;
    RectF rectF;
    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public void init(){
        //对画笔进行设置
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(10);
        mPaint.setTextSize(60);
        mPaint.setStyle(Paint.Style.FILL);
        //定义长方形
        rectF = new RectF();
        //距离顶部100
        rectF.top = 100;
        //距离左边100
        rectF.left=100;
        //距离右边800
        rectF.right = 800;
        //底部800
        rectF.bottom=800;

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //循环圆盘的扇数
        for (int i=0;i<mCricleCount;i++){
            if (i%2==0){
                mPaint.setColor(Color.BLUE);
            }
            else {
                mPaint.setColor(Color.GREEN);
            }
            //开始的角度，画扇形在长方形的基础上进行改变，每个扇形的角度，是否延伸到中间，
            canvas.drawArc(rectF,mStarAngle,60,true,mPaint);
             mStarAngle+=60;
        }

    }
}
