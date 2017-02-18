package nyc.c4q.tarynking.bouncingballs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by tarynking on 1/10/17.
 */
public class BouncingBall extends View {
    private Paint paintBall1;
    private float xAxis = 100;
    private float yAxis = 100;
    private DisplayMetrics metrics = new DisplayMetrics();
    private int windowWidth;
    private int windowWeight;
    private float ballRadius = 20;



    public BouncingBall(Context context) {
        super(context);
        metrics = context.getResources().getDisplayMetrics();

    }

    public BouncingBall(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BouncingBall(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BouncingBall(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paintBall1 = new Paint();
        updatePosition();
        canvas.drawCircle(xAxis,yAxis,ballRadius,paintBall1);
    }

    private void updatePosition(){
        if (xAxis==windowWidth){
            xAxis-=10;
        }else {
            xAxis+=10;
        }
    }
}
