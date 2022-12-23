package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class build8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //方濟
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid8);
        ImageButton b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E6%96%B9%E6%BF%9F%E6%A8%93%E6%96%B9%E6%BF%9F%E6%A8%93/@24.2272651,120.5830431,18.26z/data=!3m1!5s0x34691453347de391:0x6ca82baa3eda88ae!4m9!4m8!1m0!1m5!1m1!1s0x34691452ce932a49:0x870ba45a07b67338!2m2!1d120.583546!2d24.2279371!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });


    }
}
