package com.example.a0320;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_01).setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button_01:{
                Intent intent = new Intent();
                intent.setClass(this, FirstActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
