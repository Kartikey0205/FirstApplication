package com.kartikey.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity<V> extends AppCompatActivity {

    public void Wish(View view){
        Toast.makeText(this, "Best Wishes from Kartikey Dubey....", Toast.LENGTH_SHORT).show();
    }
    public void Send(View view){
        Toast.makeText(this, "Sending Message...", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}