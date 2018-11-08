package com.example.farras23.penghitungdiskon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.farras23.penghitungdiskon.MainActivity;
import com.example.farras23.penghitungdiskon.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        //menghilangkan ActionBar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
