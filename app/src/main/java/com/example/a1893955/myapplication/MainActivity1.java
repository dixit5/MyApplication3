package com.example.a1893955.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    EditText ename1, ename2;
    Button ebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ename1 = findViewById(R.id.ename1);
        ename2 = findViewById(R.id.ename2);
        ebutton = findViewById(R.id.ebutton);

        ebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pname,ppass;
                pname=ename1.getText().toString().trim();
                ppass=ename2.getText().toString().trim();
                Intent i=new Intent(MainActivity1.this,MainActivity2.class);
                i.putExtra("ename1",pname);
                i.putExtra("ename2",ppass);
                startActivity(i);
                Toast.makeText(MainActivity1.this, "Successful", Toast.LENGTH_SHORT).show();



            }
        });

    }
}


