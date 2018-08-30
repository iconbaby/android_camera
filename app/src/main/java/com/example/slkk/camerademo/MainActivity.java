package com.example.slkk.camerademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CameraPreview cameraPreview = new CameraPreview(this);
        FrameLayout frameLayout = findViewById(R.id.cameraView);
        frameLayout.addView(cameraPreview);

    }
}
