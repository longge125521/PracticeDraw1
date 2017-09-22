package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaint;
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        mPaint = new Paint();
        mPaint.setColor(Color.DKGRAY);
        mPaint.setAntiAlias(true);
//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW
        canvas.drawCircle(200, 200, 100, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);//划线模式
        canvas.drawCircle(400, 200, 100, mPaint);
        mPaint.setStrokeWidth(20);
        canvas.drawCircle(400, 400, 100, mPaint);
        mPaint.setStyle(Paint.Style.FILL);//填充模式
        mPaint.setColor(Color.parseColor("#c08a8a"));
        canvas.drawCircle(200, 400, 100, mPaint);
    }
}
