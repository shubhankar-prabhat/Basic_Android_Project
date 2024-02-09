package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CGPA_Output extends AppCompatActivity {


    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_output);


        TextView receiver_msg = findViewById(R.id.Data);
        TextView receiver_msg2 = findViewById(R.id.Data2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        String str2 = intent.getStringExtra("message_key2");
        receiver_msg.setText(str);
        receiver_msg2.setText(str2);
    }
}