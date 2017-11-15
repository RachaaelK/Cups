package sg.com.kaplan.cups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private Swipe swipe;//step1


    //step3
    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipe = new Swipe();
        swipe.setListener(new SwipeListener() {
            @Override
            public void onSwipingLeft(MotionEvent event) {

            }

            @Override
            public void onSwipedLeft(MotionEvent event) {
                Toast.makeText(Main3Activity.this, "LEFT", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipingRight(MotionEvent event) {

            }

            @Override
            public void onSwipedRight(MotionEvent event) {
                Toast.makeText(Main3Activity.this, "RIGHT", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipingUp(MotionEvent event) {

            }

            @Override
            public void onSwipedUp(MotionEvent event) {
                Toast.makeText(MainActivity.this, "UP", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipingDown(MotionEvent event) {

            }

            @Override
            public void onSwipedDown(MotionEvent event) {
                Toast.makeText(MainActivity.this, "DOWN", Toast.LENGTH_SHORT).show();
            }
        });

    }
}