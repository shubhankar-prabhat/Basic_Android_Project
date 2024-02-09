package com.example.shubhankar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class CGPA_Calculator extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "LocalSuppress"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_calculator);

        Button cgpa = findViewById(R.id.getCgpa);
        EditText text = findViewById(R.id.Std_Name);
        EditText text2 = findViewById(R.id.Std_Id);
        cgpa.setOnClickListener(v -> {
            String strName = text.getText().toString();
            String Id = text2.getText().toString();
            Intent intent = new Intent(getApplicationContext(), CGPA_Output.class);
            intent.putExtra("message_key", strName);
            intent.putExtra("message_key2", Id);
            startActivity(intent);
        });

    }

}
