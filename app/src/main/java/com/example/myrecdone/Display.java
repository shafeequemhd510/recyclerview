package com.example.myrecdone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        ImageView imageView;


        int imageId=getIntent().getIntExtra("imageId",0);
        Toast.makeText(this, imageId+"", Toast.LENGTH_SHORT).show();
        imageView=findViewById(R.id.imageView2);
        imageView.setImageResource(imageId);








      /*  ImageView imageView;
       int imageId= getIntent().getIntExtra("imageId",0);
        Toast.makeText(this, imageId+"", Toast.LENGTH_SHORT).show();
        imageView=findViewById(R.id.imageView2);
        imageView.setImageResource(imageId);
*/

    }
}
