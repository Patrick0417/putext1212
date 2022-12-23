package pu.csic.putext;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class aboutpu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutpu);

        Button btn6 = findViewById(R.id.button6); //主顧
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,bulid0.class);
                startActivity(intent);

            }
        });
        Button btn15 = findViewById(R.id.button15); //任淵
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build1.class);
                startActivity(intent);

            }
        });
        Button btn4 = findViewById(R.id.button4); //圖書館
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build2.class);
                startActivity(intent);

            }
        });
        Button btn13 = findViewById(R.id.button13); //博奪
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build3.class);
                startActivity(intent);

            }
        });
        Button btn14 = findViewById(R.id.button14); //至善
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build4.class);
                startActivity(intent);

            }
        });
        Button btn12 = findViewById(R.id.button12); //溪嘉
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build5.class);
                startActivity(intent);

            }
        });
        Button btn11 = findViewById(R.id.button11); //聖母堂
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build6.class);
                startActivity(intent);

            }
        }); //文興
        Button btn10 = findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build7.class);
                startActivity(intent);

            }
        });
        //方濟
        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build8.class);
                startActivity(intent);

            }
        });
        // 靜安
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build9.class);
                startActivity(intent);

            }
        });
        // 思源
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build10.class);
                startActivity(intent);

            }
        });
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(aboutpu.this,build11.class);
                startActivity(intent);

            }
        });

    }
}
