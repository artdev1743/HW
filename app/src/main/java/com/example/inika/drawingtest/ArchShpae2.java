package com.example.inika.drawingtest;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ArchShpae2 extends DrawingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arch_shpae2);

        ShapeDrawable pacMan =
                new ShapeDrawable(new ArcShape(0, 345));
        pacMan.setIntrinsicHeight(100);
        pacMan.setIntrinsicWidth(100);
        pacMan.getPaint().setColor(Color.MAGENTA);
        ImageView iView = (ImageView) findViewById(R.id.imageView2);
        iView.setImageDrawable(pacMan);

    }
}