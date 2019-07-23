package com.bwei.democircle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @Auther :Hming
 * @Date : 2019/7/23  14:10
 * @Description: CircleView
 */
public class CircleView extends View {

    private Paint paint;
    private int cx;
    private int cy;

    public CircleView(Context context) {
        this(context, null);
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint(context, attrs);
    }

    /*
     * 初始化数据
     *
     * */
    private void initPaint(Context context, AttributeSet attrs) {
        // paint.setAntiAlias(true);
        //        paint.setStyle(Paint.Style.STROKE);
        //        paint.setStrokeWidth(10);
        //        paint.setDither(true);
        //        paint.setColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
        // 初始化画笔
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setDither(true);
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(cx, cy, 100, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                cx = (int) event.getX();
                cy = (int) event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                cx = (int) event.getX();
                cy = (int) event.getY();
                break;
            case MotionEvent.ACTION_UP:
                cx = 100;
                cy = 100;
                break;
        }
        invalidate();
        return true;
    }
}

