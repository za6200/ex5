package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
    }
    public void next(View view)
    {
        Random rnd = new Random();
        int y = rnd.nextInt(3)+1;
        switch(y)
        {
            case 1:
                imageButton.setImageResource(R.drawable.n1);
                break;
            case 2:
                imageButton.setImageResource(R.drawable.n2);
                break;
            case 3:
                imageButton.setImageResource(R.drawable.n3);
                break;
        }
    }
}