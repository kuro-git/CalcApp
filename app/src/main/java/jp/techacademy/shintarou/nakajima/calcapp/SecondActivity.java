package jp.techacademy.shintarou.nakajima.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");

        //どのボタンが押されたかを判定するif文？
        //足し算
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 + value2));
        //引き算
        /*
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 - value2));
        */
        //掛け算
        /*
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 * value2));
        */
        //割り算
        /*
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 / value2));
        */
    }
}
