package com.example.lab2_muzammil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class FullImageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstaceSate){
        super.onCreate(savedInstaceSate);
        setContentView(R.layout.full_image);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter ImageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(ImageAdapter.thumbImages[position]);

        Toast.makeText(this,"Full view image  "+ position,Toast.LENGTH_SHORT).show();

    }
}
