package com.example.administrator.wintervacationfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.btn1);
        final TextView textView=(TextView)findViewById(R.id.textView);
        Switch mswitch=(Switch)findViewById(R.id.switch1);


        mswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    textView.setText("有点快乐");
                }else {
                    textView.setText("不快乐");
                }
                Log.e("MainActivity", textView.toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("现在不快乐");
                String s=textView.toString();
                Log.e("MainActivity","hahahah");
            }
        });
    }
}
