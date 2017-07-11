package com.shortprogramming.testingg2friends;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by matthew on 7/2/17.
 */

public class GameView extends View {

    public GameView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Clear the previous canvas (frame)
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);

        canvas.drawCircle(canvas.getHeight()/2, canvas.getWidth()/2, canvas.getWidth()/2, paint);

    }


}
