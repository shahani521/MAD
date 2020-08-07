package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String mg1="com.example.intentsproj.MESSAGE!";
    public static final String mg2="com.example.intentsproj.MSG2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }

    public void sendData(View view ){
Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
        EditText text1= (EditText)findViewById(R.id.text1);
        EditText text2= (EditText)findViewById(R.id.text2);

        String message1=text1.getText().toString();
        String message2=text2.getText().toString();

        intent.putExtra(mg1,message1);
        intent.putExtra(mg2,message2);



        startActivity(intent);

        Context context = getApplicationContext(); //The context to

        CharSequence message = "You just clicked the OK button";
//Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 300, 2000);



    }


}