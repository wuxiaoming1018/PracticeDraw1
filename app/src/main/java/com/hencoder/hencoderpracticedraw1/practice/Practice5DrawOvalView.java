package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        //参数一:椭圆最左侧距离画布左侧坐标(距离)
        //参数二:椭圆最上侧距离画布上侧坐标(距离)
        //参数三:椭圆最右侧距离画布左侧坐标(距离)
        //参数四:椭圆最下侧距离画布上侧坐标(距离)
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawOval(100,100,500,350,paint);
    }
}
