package com.example.graphicalprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Size
import android.view.View



class Canvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint : Paint= Paint()
        paint.setColor(Color.GRAY)
        canvas?.drawPaint(paint)

        paint.setColor(Color.BLUE)
        paint.textSize=60f
        canvas?.drawLine(800f,800f,800f,1150f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("LINE", 750f, 730f, paint);


        paint.setColor(Color.WHITE)
        paint.textSize=60f
        canvas?.drawCircle(250f,400f,160f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("CIRCLE", 140f, 150f, paint);


        paint.setColor(Color.YELLOW)
        paint.textSize=60f
        canvas?.drawRect(600f,200f,950f,550f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("SQUARE", 650f, 140f, paint);


        paint.setColor(Color.RED)
        paint.textSize=60f
        canvas?.drawRect(150f,800f,400f,1300f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("RECTANGLE", 120f, 730f, paint);


        paint.setColor(Color.GREEN)
        paint.textSize=60f
        canvas?.drawOval(500f,1300f,800f,1850f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("OVAL", 560f, 1250f, paint);

        paint.textSize=60f
        paint.setColor(Color.WHITE)
        canvas?.drawText("Done By-", 120f, 1500f, paint);

        paint.textSize=60f
        paint.setColor(Color.WHITE)
        canvas?.drawText("200701241", 120f, 1600f, paint);
    }
}