package com.example.hw_2_sugad21;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class drawFace {

    public void drawFace(Canvas canvas){
        Paint skinColor = new Paint();
        skinColor.setColor(0xd2b48c);
        canvas.drawCircle(100,100,200,skinColor);

        Paint browColor = new Paint();
        browColor.setColor(Color.BLUE);
        canvas.drawRect(100,175,50,200,browColor);
    }
}
