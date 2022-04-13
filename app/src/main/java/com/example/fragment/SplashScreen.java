package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import java.util.Objects;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView splash = findViewById(R.id.splash);

        new Handler().postDelayed(() -> {
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SplashScreen.this, splash, Objects.requireNonNull(ViewCompat.getTransitionName(splash)));
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent, options.toBundle());
        }, 500);
    }
}