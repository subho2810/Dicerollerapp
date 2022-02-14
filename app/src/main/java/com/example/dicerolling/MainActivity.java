package com.example.dicerolling;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView diceresult;
    ImageView img;
    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.rollbutton);
        diceresult=findViewById(R.id.diceresult);
        img=findViewById(R.id.diceimage);
        layout=findViewById(R.id.RelativeLayout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int rollresult=rand.nextInt(6)+1;
                diceresult.setText("\t\t\t\t\t\t\t\t\t\t"+Integer.toString(rollresult));
                switch (rollresult) {
                    case 1:
                        img.setImageResource(R.drawable.dice1);
                        layout.setBackgroundColor(Color.YELLOW);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.dice2);
                        layout.setBackgroundColor(Color.MAGENTA);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.dice3);
                        layout.setBackgroundColor(Color.LTGRAY);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.dice4);
                        layout.setBackgroundColor(Color.GREEN);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.dice5);
                        layout.setBackgroundColor(Color.CYAN);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.dice6);
                        layout.setBackgroundColor(Color.RED);
                        break;

                }


            }
        });
    }
}