package com.example.arces.flip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void launchGame(int rows, int columns, int maxLoop) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("Rows", rows);
        intent.putExtra("Columns", columns);
        intent.putExtra("MaxLoop", maxLoop);
        startActivityForResult(intent, 0);
    }
}