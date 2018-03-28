package com.example.paras.assignment_91;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInf = getMenuInflater();
        menuInf.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.redCol:
                tv.setTextColor(Color.RED);
                Toast.makeText(MainActivity.this, "Red Coloured Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.blueCol:
                tv.setTextColor(Color.BLUE);
                Toast.makeText(MainActivity.this, "Blue Coloured Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.greenCol:
                tv.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "Green Coloured Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.grayCol:
                tv.setTextColor(Color.GRAY);
                Toast.makeText(MainActivity.this, "Grey Coloured Text", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

