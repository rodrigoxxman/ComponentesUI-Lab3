package com.rsalas.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class AndroidButtonActivity extends AppCompatActivity {
    private static final String TAG = AndroidButtonActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);
    }
    public void callButton1(View view){
        Log.d(TAG,  "Entró el botón 1");
        Toast.makeText(this, "Entró el botón 1", Toast.LENGTH_SHORT).show();

    }
    public void callButton2(View view){
        Log.d(TAG, "entro el boton2");
        Toast.makeText(this, "Entro el boton 2", Toast.LENGTH_SHORT).show();
    }
}
