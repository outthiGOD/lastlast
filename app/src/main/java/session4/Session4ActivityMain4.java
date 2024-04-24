package session4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.session1.R;

public class Session4ActivityMain4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session4_activity_main4);
    }
//    public void Report(View v){
//        Intent intent = new Intent(this, SendAPackage.class);
//        startActivity(intent);
//    }


    public void Sucsessful(View v){
        Intent intent = new Intent(this, Session4ActivityMain5.class);
        startActivity(intent);
    }
    public void Right(View v){
        Intent intent = new Intent(this, Session4ActivityMain3.class);
        startActivity(intent);
    }
}