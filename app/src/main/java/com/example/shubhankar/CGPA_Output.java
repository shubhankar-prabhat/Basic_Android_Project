package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CGPA_Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_output);
        Button btu=findViewById(R.id.buttonend);
        btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),CGPA_Calculator.class);
                startActivity(intent);
            }
        });
        Button button=findViewById(R.id.buttonSubmit3);
        TextView ans = findViewById(R.id.answer3);
        View sub1 = findViewById(R.id.HS1);
        View sub2=findViewById(R.id.HS2);
        View sub3=findViewById(R.id.HS3);
        View sub4=findViewById(R.id.HS4);
        View sub5=findViewById(R.id.HS5);
        View sub6=findViewById(R.id.HS6);
        View sub7=findViewById(R.id.HS7);
        View sub8=findViewById(R.id.HS8);
        View sub9=findViewById(R.id.HS9);
        View sub10=findViewById(R.id.HS10);
        View sub11=findViewById(R.id.HS11);
        View sub12=findViewById(R.id.HS12);


        TextView ftxt=findViewById(R.id.ftext3);
        EditText crd1=findViewById(R.id.cr1);
        EditText cred2=findViewById(R.id.cr2);
        EditText cred3=findViewById(R.id.cr3);
        EditText cred4=findViewById(R.id.cr4);
        EditText cred5=findViewById(R.id.cr5);
        EditText cred6=findViewById(R.id.cr6);
        EditText cred7=findViewById(R.id.cr7);
        EditText cred8=findViewById(R.id.cr8);
        EditText cred9=findViewById(R.id.cr9);
        EditText cred10=findViewById(R.id.cr10);
        EditText cred11=findViewById(R.id.cr11);
        EditText cred12=findViewById(R.id.cr12);

        EditText mx1=findViewById(R.id.mm1);
        EditText max2=findViewById(R.id.mm2);
        EditText max3=findViewById(R.id.mm3);
        EditText max4=findViewById(R.id.mm4);
        EditText max5=findViewById(R.id.mm5);
        EditText max6=findViewById(R.id.mm6);
        EditText max7=findViewById(R.id.mm7);
        EditText max8=findViewById(R.id.mm8);
        EditText max9=findViewById(R.id.mm9);
        EditText max10=findViewById(R.id.mm10);
        EditText max11=findViewById(R.id.mm11);
        EditText max12=findViewById(R.id.mm12);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CGPA_Output.this, "Success", Toast.LENGTH_SHORT).show();
                int c,max=0;
                int i,j,p,gpa=0,total=0;
                String s=crd1.getText().toString();
                c= Integer.parseInt(s);
                s=mx1.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred2.getText().toString();
                c= Integer.parseInt(s);
                s=max2.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred3.getText().toString();
                c= Integer.parseInt(s);
                s=max3.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);

                s=cred4.getText().toString();
                c= Integer.parseInt(s);
                s=max4.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred5.getText().toString();
                c= Integer.parseInt(s);
                s=max5.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred6.getText().toString();
                c= Integer.parseInt(s);
                s=max6.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred7.getText().toString();
                c= Integer.parseInt(s);
                s=max7.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred8.getText().toString();
                c= Integer.parseInt(s);
                s=max8.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred9.getText().toString();
                c= Integer.parseInt(s);
                s=max9.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);

                s=cred10.getText().toString();
                c= Integer.parseInt(s);
                s=max10.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);


                s=cred11.getText().toString();
                c= Integer.parseInt(s);
                s=max11.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);

                s=cred12.getText().toString();
                c= Integer.parseInt(s);
                s=max12.getText().toString();
                if(s.equals("A+")) {
                    max = 10;
                }
                else if(s.equals("A"))
                {
                    max=9;
                }
                else if(s.equals("B+"))
                {
                    max=8;
                }
                else if(s.equals("B"))
                {
                    max=7;
                }
                else if(s.equals("C+"))
                {
                    max=6;
                }
                else if(s.equals("C"))
                {
                    max=5;
                }
                else if(s.equals("D+"))
                {
                    max=4;
                }
                else if(s.equals("D"))
                {
                    max=3;
                }
                else if(s.equals("E+"))
                {
                    max=2;
                }
                else if(s.equals("E"))
                {
                    max=1;
                }
                else{
                    max=0;
                }
                gpa=gpa+(max*c);
                total=total+(10*c);

                float g=(float) gpa;
                float t=(float) total;
                float res=g/t;
                res=res*10;
                ans.setText("Your CGPA is:" +res);

            }
        });


    }
}