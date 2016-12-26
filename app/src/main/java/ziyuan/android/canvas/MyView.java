package ziyuan.android.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by Administrator on 2016/12/16.
 */

public class MyView extends View {

    private Paint  mPaint=new Paint();
    private Canvas  canvas=new Canvas();
    public MyView(Context context) {
        super(context);
        initPaint();

        canvas.drawPoint(200, 200, mPaint);     //在坐标(200,200)位置绘制一个点
        canvas.drawPoints(new float[]{          //绘制一组点，坐标位置由float数组指定
                500,500,
                500,600,
                500,700
        },mPaint);


        canvas.drawLine(300,300,500,600,mPaint);    // 在坐标(300,300)(500,600)之间绘制一条直线


        // 第一种
        canvas.drawRect(100,100,800,400,mPaint);

        // 第二种
        Rect rect = new Rect(100,100,800,400);
        canvas.drawRect(rect,mPaint);

        // 第三种
        RectF rectF = new RectF(100,100,800,400);
        canvas.drawRect(rectF,mPaint);




    }

    public  void initPaint(){
        mPaint.setColor(Color.BLACK);       //设置画笔颜色
        mPaint.setStyle(Paint.Style.FILL);  //设置画笔模式为填充
        mPaint.setStrokeWidth(10f);         //设置画笔宽度为10px
    }
}
