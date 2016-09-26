package com.example.codetribe.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input =(EditText)findViewById(R.id.input_txt);
    }
    public void goNext(View v){
        String data =input.getText().toString();
        //move to next activity
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        //send data to next activity
        i.putExtra("data",data);
        startActivity(i);

    }
}
