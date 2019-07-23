package com.bwei.democircle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther :Hming
 * @Date : 2019/7/23  14:10
 * @Description: LineView
 */
public class LineView extends View {

    private Paint dotPaint, newDotPaint, rectPaint;
    List<Paint> paintList = new ArrayList<>();

    public LineView(Context context) {
        this(context, null);
    }

    public LineView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint(context, attrs);
    }

    private void initPaint(Context context, AttributeSet attrs) {
        // 初始化三个画笔
        dotPaint = new Paint();
        dotPaint.setStyle(Paint.Style.FILL);
        dotPaint.setColor(Color.RED);
        dotPaint.setDither(true);
        dotPaint.setAntiAlias(true);

        newDotPaint = new Paint();
        newDotPaint.setStyle(Paint.Style.FILL);
        newDotPaint.setColor(Color.GREEN);
        newDotPaint.setDither(true);
        newDotPaint.setAntiAlias(true);

        rectPaint = new Paint();
        rectPaint.setStyle(Paint.Style.STROKE);
        rectPaint.setStrokeWidth(5);
        rectPaint.setColor(Color.GREEN);
        rectPaint.setDither(true);
        rectPaint.setAntiAlias(true);
    }

    private int dotX, dotY;
    private int rectL, rectT, rectR, rectB;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Paint paint : paintList) {
            //canvas.drawCircle();
        }
        canvas.drawRect(rectL, rectT, rectR, rectB, rectPaint);
    }
}
