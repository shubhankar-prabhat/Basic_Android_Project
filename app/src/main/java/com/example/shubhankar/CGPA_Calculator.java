package com.example.shubhankar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CGPA_Calculator extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView TextView;
    private EditText editText2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_output);
        Button bt=findViewById(R.id.buttonmain);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mint=new Intent(getApplicationContext(),CGPA_Output.class);
                startActivity(mint);
            }
        });
        button=findViewById(R.id.buttonSubmit);
        TextView ans = findViewById(R.id.answer);
        View sub1 = findViewById(R.id.HS1);
        View sub2=findViewById(R.id.HS2);
        View sub3=findViewById(R.id.HS3);
        View sub4=findViewById(R.id.HS4);
        View sub5=findViewById(R.id.HS5);
        View sub6=findViewById(R.id.HS6);
        TextView ftxt=findViewById(R.id.ftext);
        EditText cred1=findViewById(R.id.cr1);
        EditText cred2=findViewById(R.id.cr2);
        EditText cred3=findViewById(R.id.cr3);
        EditText cred4=findViewById(R.id.cr4);
        EditText cred5=findViewById(R.id.cr5);
        EditText cred6=findViewById(R.id.cr6);
        EditText cred7=findViewById(R.id.cr7);
        EditText cred8=findViewById(R.id.cr8);
        EditText cred9=findViewById(R.id.cr9);

        EditText max1=findViewById(R.id.mm1);
        EditText max2=findViewById(R.id.mm2);
        EditText max3=findViewById(R.id.mm3);
        EditText max4=findViewById(R.id.mm4);
        EditText max5=findViewById(R.id.mm5);
        EditText max6=findViewById(R.id.mm6);
        EditText max7=findViewById(R.id.mm7);
        EditText max8=findViewById(R.id.mm8);
        EditText max9=findViewById(R.id.mm9);

        EditText o1=findViewById(R.id.om1);
        EditText o2=findViewById(R.id.om2);
        EditText o3=findViewById(R.id.om3);
        EditText o4=findViewById(R.id.om4);
        EditText o5=findViewById(R.id.om5);
        EditText o6=findViewById(R.id.om6);
        EditText o7=findViewById(R.id.om7);
        EditText o8=findViewById(R.id.om8);
        EditText o9=findViewById(R.id.om9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CGPA_Calculator.this, "Success", Toast.LENGTH_SHORT).show();
                int c;
                float mm;
                float om;
                float per;
                int i,j,p,gpa=0,total=0;
                String s=cred1.getText().toString();
                c= Integer.parseInt(s);
                s=max1.getText().toString();
                mm= Float.parseFloat(s);
                s=o1.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);

                s=cred2.getText().toString();
                c= Integer.parseInt(s);
                s=max2.getText().toString();
                mm= Float.parseFloat(s);
                s=o2.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);

                s=cred3.getText().toString();
                c= Integer.parseInt(s);
                s=max3.getText().toString();
                mm= Float.parseFloat(s);
                s=o3.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);

                s=cred4.getText().toString();
                c= Integer.parseInt(s);
                s=max4.getText().toString();
                mm= Float.parseFloat(s);
                s=o4.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);


                s=cred5.getText().toString();
                c= Integer.parseInt(s);
                s=max5.getText().toString();
                mm= Float.parseFloat(s);
                s=o5.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);

                s=cred6.getText().toString();
                c= Integer.parseInt(s);
                s=max6.getText().toString();
                mm= Float.parseFloat(s);
                s=o6.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);


                s=cred7.getText().toString();
                c= Integer.parseInt(s);
                s=max7.getText().toString();
                mm= Float.parseFloat(s);
                s=o7.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);


                s=cred8.getText().toString();
                c= Integer.parseInt(s);
                s=max8.getText().toString();
                mm= Float.parseFloat(s);
                s=o8.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
                total=total+(10*c);


                s=cred9.getText().toString();
                c= Integer.parseInt(s);
                s=max9.getText().toString();
                mm= Float.parseFloat(s);
                s=o9.getText().toString();
                om= Float.parseFloat(s);
                per=om/mm;
                per=per*10;
                p=(int) per;
                p++;
                if(p>10)
                {
                    p=10;
                }
                gpa=gpa+(p*c);
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