package com.example.belajar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        logic();
    }

    private void logic() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height = Double.parseDouble(textView1.getText().toString());
                double weight = Double.parseDouble(textView2.getText().toString());
                double area = height*weight;
                textView3.setText(area+"");
            }
        });
    }

    private void initUI(){
        button = (Button) findViewById(R.id.button1);
        textView1 = (TextView) findViewById(R.id.editText1);
        textView2 = (TextView) findViewById(R.id.editText2);
        textView3 = (TextView) findViewById(R.id.editText3);
    }

}
