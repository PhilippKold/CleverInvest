package org.tensorflow.demo.env;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.Image;
import android.widget.ImageButton;

import org.tensorflow.demo.R;

/**
 * Created by juliankling on 05.10.17.
 */

public class ImageButtonCanvas {
    private final Bitmap image;


    public ImageButtonCanvas(Bitmap image) {
        this.image = image;
    }

    public void drawImage(final Canvas canvas, final float posX, final float posY) {
        Paint p=new Paint();
        p.setColor(Color.RED);
        canvas.drawBitmap(image, new Rect((int) posX,(int)posY,384,384), new Rect((int)posX,(int)posY,384,384), p);
    }
}
