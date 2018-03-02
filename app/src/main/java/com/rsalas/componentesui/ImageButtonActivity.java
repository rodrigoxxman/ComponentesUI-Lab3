package com.rsalas.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity {

    private static final String TAG="Mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
    }
    public void firstImageButton(View view){
        Log.d(TAG, "MENSAJE");
        Toast.makeText(this, "MENSAJE", Toast.LENGTH_SHORT).show();
    }
}
