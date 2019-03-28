package com.example.a0320;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class SecondActivity extends Activity {
    private static final String TAG = "SecondActivity";
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        image = (ImageView) findViewById(R.id.image);
        if (getIntent() != null) {
            int res = getIntent().getIntExtra("imageRes", 0);
            if (res != 0) {
                Log.i(TAG, "onCreate: " + res);
                image.setImageResource(res);
            }
        } else {
            Log.i(TAG, "onCreate: getIntent()==null");
        }
        Log.i(TAG, "onCreate: ");
    }
}