package com.example.belajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    private String message = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        edittext = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View_v){
               if(edittext.getText().toString().length()>0){
                   showMessage(message.concat(edittext.getText().toString()));
               }
           }
        });
    }

    private void initializeLogic() {
        message = "Your message is ";
    }


    //created automatically
    private void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    private int getRandom(int _minValue, int _maxValue) {
        Random random = new Random();
        return random.nextInt(_maxValue- _minValue+1) + _minValue
    }

    public java.util.ArrayList<integer>getCheckedItemPositionsTpoArray
}
