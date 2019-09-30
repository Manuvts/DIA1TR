package com.example.dia1tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;



public class MainActivity extends AppCompatActivity {
    //public static final String FIRST_MESSAGE = null ;
    public static HashMap<String,Item> hm = new HashMap<String,Item>();

    private  HashMap<String,Item> initData()
    {
        HashMap<String,Item>  dic = new HashMap<String, Item>();
        dic.put("1111",  new Item("1111", "tipo "+ "1111" , "otros " + "1111"));
        dic.put("2222",  new Item("2222", "tipo "+ "2222" , "otros " + "2222"));
        dic.put("3333",  new Item("3333", "tipo "+ "3333" , "otros " + "3333"));
        dic.put("4444",  new Item("4444", "tipo "+ "4444" , "otros " + "4444"));

        return dic;
    }

    @Override
    protected void onResume() {
        super.onResume();


        setContentView(R.layout.activity_main);
        ArrayList<String> ListaDispositivos = new ArrayList<String>();


        TableLayout tabla = findViewById(R.id.Tabla);


        for (Map.Entry<String, Item> valor: hm.entrySet()){

            Item dispositivo = valor.getValue();
            TextView textview = new TextView(this.getApplicationContext());
            textview.setText(dispositivo.getID());


            Button btn = new Button(this);

            btn.setText("boton");
            btn.setTag(dispositivo.getID());
            btn.setOnClickListener(buttonClickListener);


            TableRow tablerow = new TableRow(this.getApplicationContext()) ;

            tablerow.addView(textview);
            tablerow.addView(btn);
            tabla.addView(tablerow);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        hm = initData();


        setContentView(R.layout.activity_main);
        ArrayList<String> ListaDispositivos = new ArrayList<String>();


        TableLayout tabla = findViewById(R.id.Tabla);

        for (Map.Entry<String, Item> valor: hm.entrySet()){

            Item dispositivo = valor.getValue();
            TextView textview = new TextView(this.getApplicationContext());
            textview.setText(dispositivo.getID());


            Button btn = new Button(this);

            btn.setText("boton");
            btn.setTag(dispositivo.getID());
            btn.setOnClickListener(buttonClickListener);


            TableRow tablerow = new TableRow(this.getApplicationContext()) ;

            tablerow.addView(textview);
            tablerow.addView(btn);
            tabla.addView(tablerow);

        }

    }

    Button.OnClickListener buttonClickListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v){

            Intent intent = new Intent(v.getContext(),BatchDetailActivity.class);
            intent.putExtra("FIRST_MESSAGE",v.getTag().toString());
            startActivity(intent);
        }

    };



}
