package com.example.user.lick2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
    }

    public void click(View view) {
        if(x<=6){
        btn.setText("this is click number"+x);
        x=x+1;}
        else{
            btn.setText("enough to click ");
            x=0;
            }
    }
}
