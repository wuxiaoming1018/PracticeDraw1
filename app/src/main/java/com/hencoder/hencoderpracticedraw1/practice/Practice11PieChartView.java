package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paintA = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintA.setColor(Color.RED);
        canvas.drawArc(100,50,500,450,-180,110,true,paintA);
        paintA.setColor(Color.YELLOW);
        canvas.drawArc(110,60,510,460,-70,65,true,paintA);
        paintA.setColor(Color.parseColor("#8C369E"));
        canvas.drawArc(110,60,510,460,0,8,true,paintA);
        paintA.setColor(Color.parseColor("#859292"));
        canvas.drawArc(110,60,510,460,13,8,true,paintA);
        paintA.setColor(Color.parseColor("#309886"));
        canvas.drawArc(110,60,510,460,26,44,true,paintA);
        paintA.setColor(Color.parseColor("#3695F3"));
        canvas.drawArc(110,60,510,460,75,105,true,paintA);
    }
}
