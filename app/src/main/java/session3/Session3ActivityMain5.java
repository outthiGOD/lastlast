package session3;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.session1.R;

import session4.Session4ActivityMain3;
import session5.Session5ActivityMain1;

public class Session3ActivityMain5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session3_activity_main5);

        ImageView anim = findViewById(R.id.anim);

        anim.setBackgroundResource(R.drawable.animation);

        AnimationDrawable frameAnimation = (AnimationDrawable) anim.getBackground();

        new CountDownTimer(2650, 1000) {

            public void onTick(long millisUntilFinished) {
                frameAnimation.start();
            }

            public void onFinish() {
                frameAnimation.stop();
                anim.setBackground(getDrawable(R.drawable.sucsess1));
                TextView suc = findViewById(R.id.textView37);
                suc.setText("Transaction Successful");
            }

        }.start();
    }

    public void Track(View v){
        Intent intent = new Intent(this, Session4ActivityMain3.class);
        startActivity(intent);
    }

    public void Home(View v){
        Intent intent = new Intent(this, Session5ActivityMain1.class);
        startActivity(intent);
    }
}