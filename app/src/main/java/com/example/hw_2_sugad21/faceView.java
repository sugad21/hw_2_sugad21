package com.example.hw_2_sugad21;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.util.AttributeSet;
import android.view.SurfaceView;

public class faceView extends SurfaceView{
    drawFace dFace;
    public faceView(Context context) {
        super(context);
        init();
    }

    public faceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public faceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        dFace = new drawFace();
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {

            dFace.drawFace(canvas);


    }

    public void update(){
        invalidate();
        postInvalidate();
    }

}
