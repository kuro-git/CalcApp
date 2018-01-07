package jp.techacademy.shintarou.nakajima.calcapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* +ボタン */
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        /* -ボタン */
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        /* xボタン */
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        /* ボタン */
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        //変数の設定

    }

    @Override
    /*どのボタンが押されたかを判定するif文？　値をSecondActivityへIntent？*/
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        //VALUE1のvalueは、一個目入力EditTextの値
        intent.putExtra("VALUE1", 10);
        //VALUE2のvalueは、二個目入力EditTextの値
        intent.putExtra("VALUE2", 20);
        startActivity(intent);
    }
}
