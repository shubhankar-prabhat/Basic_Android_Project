package com.example.shubhankar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentprofile extends AppCompatActivity {

    DatabaseHelper myDb;
    Button btn_insert_data,btn_dataView,btn_updateData,btn_deleteData;
    EditText text_Name,text_Surname,text_Marks,text_ID;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);

        myDb = new DatabaseHelper(this);
        btn_insert_data=(Button) findViewById(R.id.btn_insert);

        text_Name=(EditText) findViewById(R.id.editTextName);
        text_Surname=(EditText) findViewById(R.id.editTextSubject);
        text_Marks=(EditText) findViewById(R.id.editTextMarks);
        btn_dataView=(Button) findViewById(R.id.btn_ViewAll);

        btn_updateData=(Button) findViewById(R.id.btn_Update);
        text_ID=(EditText)findViewById(R.id.editTextID);

        btn_deleteData=(Button) findViewById(R.id.btn_Delete);

        btn_insert_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isinserted =  myDb.insertData(
                        text_ID.getText().toString(),
                        text_Name.getText().toString(),
                        text_Surname.getText().toString(),
                        text_Marks.getText().toString());

                if(isinserted == true){
                        Toast.makeText(getApplicationContext(), "Data Inserted", Toast.LENGTH_SHORT).show();
                }
                else{
                        Toast.makeText(getApplicationContext(), "Data not Inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn_dataView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor cur = myDb.getAllData();

                if(cur.getCount() == 0){
                    showMessage("Error","No Data Found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();

                while (cur.moveToNext()){

                    buffer.append("ID: "+ cur.getString(0)+"\n");
                    buffer.append("Name: "+ cur.getString(1)+"\n");
                    buffer.append("Surname: "+ cur.getString(2)+"\n");
                    buffer.append("Marks: "+ cur.getString(3)+"\n");

                }

                showMessage("Data",buffer.toString());

            }
        });

        btn_updateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isUpdate= myDb.updateData(text_ID.getText().toString(),text_Name.getText().toString(),
                        text_Surname.getText().toString(),text_Marks.getText().toString());

                if(isUpdate == true){
                        Toast.makeText(getApplicationContext(), "Data Updated", Toast.LENGTH_SHORT).show();
                }
                else{
                        Toast.makeText(getApplicationContext(), "Data not Updated", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn_deleteData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer deletedRow = myDb.deleteData(text_ID.getText().toString());

                if(deletedRow>0){
                        Toast.makeText(getApplicationContext(), "Data Deleted", Toast.LENGTH_SHORT).show();
                }
                else{
                        Toast.makeText(getApplicationContext(), "Data not Deleted", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    public void showMessage(String title, String Message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }

}
