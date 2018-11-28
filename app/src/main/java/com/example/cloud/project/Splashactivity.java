package com.example.cloud.project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashactivity extends AppCompatActivity{
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splashactivity.this, MapsActivity2.class);
                Splashactivity.this.startActivity(mainIntent);
                Splashactivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
