package session4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.session1.R;

import session3.Session3ActivityMain1;
import session3.Session3ActivityMain4;
import session5.Session5ActivityMain1;

public class Session4ActivityMain3 extends AppCompatActivity {
    private ImageButton image,image1,image2,image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session4_activity_main3);
        image=findViewById(R.id.imageButton16);
        image1=findViewById(R.id.home);
        image2=findViewById(R.id.walet);
        image3=findViewById(R.id.track);
        image.setImageDrawable(getDrawable(R.drawable.proflect));
        image1.setImageDrawable(getDrawable(R.drawable.home));
        image2.setImageDrawable(getDrawable(R.drawable.walet));
        image3.setImageDrawable(getDrawable(R.drawable.track1));
    }
    public void Profile(View v){
        Intent intent = new Intent(this, Session3ActivityMain1.class);
        startActivity(intent);
    }
    public void Walet(View v){
        Intent intent = new Intent(this, Session4ActivityMain1.class);
        startActivity(intent);
    }
    public void Home(View v){
        Intent intent = new Intent(this, Session5ActivityMain1.class);
        startActivity(intent);
    }

    public void Next1(View v){

        Intent intent = new Intent(this, Session4ActivityMain4.class);
        startActivity(intent);
    }
}