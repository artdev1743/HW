package com.example.inika.drawingtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ArcShapeActivity extends DrawingActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc_shape);
        setContentView(new ArcShapeActivity.ViewWithArc(this));
    }

    private static class ViewWithArc extends View {

        public ViewWithArc(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {

            try {
                ShapeDrawable pacMan = new ShapeDrawable(new ArcShape(0, 345));
                pacMan.setIntrinsicHeight(100);
                pacMan.setIntrinsicWidth(100);
                pacMan.getPaint().setColor(Color.MAGENTA);
                ImageView iView = (ImageView) findViewById(R.id.imageView);
                iView.setImageDrawable(pacMan);
            } catch (Exception ex) {
                String a = "Hello";
            }
        }
    }
}