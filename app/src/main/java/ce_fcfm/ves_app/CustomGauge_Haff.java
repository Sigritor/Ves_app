package ce_fcfm.ves_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by A1 on 16-01-2015.
 */
public class CustomGauge_Haff extends ImageView {
    private static Paint paint1;
    private static Paint paint2;
    private final float PI = 3.141592f;
    private int maxval = 0;
    private int minval = 0;
    private int step;
    private float angini, angfin, angstep;
    private int val;

    public CustomGauge_Haff(Context context, AttributeSet attrs) {
        super(context, attrs);
        maxval = attrs.getAttributeIntValue("http://schemas.android.com/apk/res-auto","MaxValue",160);
        minval = attrs.getAttributeIntValue("http://schemas.android.com/apk/res-auto","MinValue",0);
        step   = attrs.getAttributeIntValue("http://schemas.android.com/apk/res-auto","Paso",20);
        angini = attrs.getAttributeFloatValue("http://schemas.android.com/apk/res-auto","AnguloInicial",0f)*PI/180;
        angfin = attrs.getAttributeFloatValue("http://schemas.android.com/apk/res-auto","AnguloFinal",180f)*PI/180;
        angstep = attrs.getAttributeFloatValue("http://schemas.android.com/apk/res-auto","PasoAngular",30f)*PI/180;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        GaugeBackground(canvas);
        advanceNeedle();
        drawNeedle(val2ang(val), canvas);
        invalidate();
    }

    private void GaugeBackground(Canvas canvas){

    }
    private void drawNeedle(float ang, Canvas canvas){

    }
    private void advanceNeedle(){

    }
    private float val2ang(int val){
        return 0;
    }
    public void MoveNeedle(int obj){

    }
}

