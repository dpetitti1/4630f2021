package com.example.room8s_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;

    private Button button;

    private TextView dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dateTimeDisplay = (TextView) findViewById(R.id.text_date_display);
        calendar = Calendar.getInstance();

        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //SimpleDateFormat simpleDateFormat;
        date = SimpleDateFormat.getDateInstance().format(calendar.getTime());
        dateTimeDisplay.setText(date);


        Button event_button = (Button) findViewById(R.id.event_button);


    }

    public void startEvent(View view){
        Intent intent = new Intent(this, Events_list.class);
        startActivity(intent);
    }

    public void startChores(View view){
        Intent intent = new Intent(this, Chores_list.class);
        startActivity(intent);
    }

    public void startShopping(View view){
        Intent intent = new Intent(this, Shopping_list.class);
        startActivity(intent);
    }

    public void startChat(View view){
        Intent intent = new Intent(this, Chat.class);
        startActivity(intent);
    }

}
