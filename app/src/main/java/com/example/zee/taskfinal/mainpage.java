package com.example.zee.taskfinal;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
    }
    public void fire(View view)
    {
        Intent intent= new Intent(this,data.class);
        startActivity(intent);
    }
    int index=1;
    public  void col(View v)
    {   ConstraintLayout fra=findViewById(R.id.fr);

        if(index==1)
        {
            fra.setBackgroundColor(Color.YELLOW);
            index=2;
        }
        else if(index==2)
        {
            fra.setBackgroundColor(Color.BLUE);
            index=3;
        }
        else if(index==3)
        {
            fra.setBackgroundColor(Color.WHITE);
            index=1;
        }
    }

    public void insta(View vi)
    {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
