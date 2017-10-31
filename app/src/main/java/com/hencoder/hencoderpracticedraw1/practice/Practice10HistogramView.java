package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(3);
        canvas.drawLine(100,30,100,400,paint);
        canvas.drawLine(100,400,700,400,paint);
        canvas.drawPoint(97,310,paint);
        canvas.drawPoint(97,210,paint);
        canvas.drawPoint(97,130,paint);
        canvas.drawPoint(97,40,paint);
        paint.setTextSize(20);
        canvas.drawText("100",50,320,paint);
        canvas.drawText("200",50,220,paint);
        canvas.drawText("300",50,140,paint);
        canvas.drawText("400",50,50,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(120,390,170,400,paint);
        canvas.drawRect(190,350,240,400,paint);
        canvas.drawRect(260,350,310,400,paint);
        canvas.drawRect(330,250,380,400,paint);
        canvas.drawRect(400,190,450,400,paint);
        canvas.drawRect(470,140,520,400,paint);
        canvas.drawRect(540,250,590,400,paint);
        paint.setTextSize(18);
        paint.setColor(Color.WHITE);
        canvas.drawText("Froyo",120,420,paint);
        canvas.drawText("GB",200,420,paint);
        canvas.drawText("ICS",270,420,paint);
        canvas.drawText("JB",340,420,paint);
        canvas.drawText("KitKat",400,420,paint);
        canvas.drawText("L",495,420,paint);
        canvas.drawText("M",560,420,paint);
        paint.setTextSize(30);
        paint.setColor(Color.WHITE);
        canvas.drawText("直方图",300,480,paint);
    }
}
