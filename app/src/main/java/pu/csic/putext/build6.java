package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class build6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //聖母堂
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid6);
        Button b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E5%8F%B0%E7%81%A3%E5%A4%A7%E9%81%93%E4%B8%83%E6%AE%B5%E4%B8%BB%E9%A1%A7%E8%81%96%E6%AF%8D%E5%A0%82/@24.2271771,120.5784258,18z/data=!3m1!5s0x34691453347de391:0x6ca82baa3eda88ae!4m9!4m8!1m0!1m5!1m1!1s0x3469145334c80b19:0x1567c4182a9bf873!2m2!1d120.581416!2d24.2280322!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });


    }
}
