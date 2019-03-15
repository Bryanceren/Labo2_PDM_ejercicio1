package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView fake;
    private EditText user;
    private  EditText pass;
    private Button btn;

    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            fake.setText(user.getText());
        };
    };
    private View.OnLongClickListener clickListener2 = new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {
            fake.setText(pass.getText());
            return true;
        };
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText) findViewById(R.id.user);
        pass=(EditText) findViewById(R.id.pass);
        fake=(TextView) findViewById(R.id.fake);
        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(clickListener);
        btn.setOnLongClickListener(clickListener2);
    }


};


