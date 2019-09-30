package com.example.dia1tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BatchDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch_detail);

        Intent intent = getIntent();
        final String itemLeido = intent.getStringExtra("FIRST_MESSAGE");

        FloatingActionButton fab = findViewById(R.id.floatingActionButton3);

        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.hm.remove(itemLeido);
                finish();
                //onBackPressed();
            }
        });




        //TextView tv = findViewById(R.id.textView)  ;
        //tv.setText(item);

        //MainActivity.hm.get(item);

        TextView tv = findViewById(R.id.textView)  ;
        tv.setText(MainActivity.hm.get(itemLeido).ID);
        TextView tv2 = findViewById(R.id.textView2)  ;
        tv2.setText(MainActivity.hm.get(itemLeido).tipo);
        TextView tv3 = findViewById(R.id.textView3)  ;
        tv3.setText(MainActivity.hm.get(itemLeido).otros);


    }
}
