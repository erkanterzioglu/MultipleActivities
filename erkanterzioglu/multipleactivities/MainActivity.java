package com.erkanterzioglu.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    String username;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textView=findViewById(R.id.textView);
    editText=findViewById(R.id.nameText);

    username="";




    }

public void changeActivity(View view){
    username=editText.getText().toString();
    Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
    intent.putExtra("userInput",username);

    startActivity(intent);





    }



}