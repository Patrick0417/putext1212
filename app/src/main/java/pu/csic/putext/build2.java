package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class build2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //蓋夏圖書館
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid2);
        ImageButton b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//433%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E5%8F%B0%E7%81%A3%E5%A4%A7%E9%81%93%E4%B8%83%E6%AE%B5200%E8%99%9F%E9%9D%9C%E5%AE%9C%E5%A4%A7%E5%AD%B8%E8%93%8B%E5%A4%8F%E5%9C%96%E6%9B%B8%E9%A4%A8/@24.2262703,120.5787239,17z/data=!4m16!1m6!3m5!1s0x346915ab72c1a811:0x631cd5c14123e536!2z6Z2c5a6c5aSn5a246JOL5aSP5ZyW5pu46aSo!8m2!3d24.2262654!4d120.5812988!4m8!1m0!1m5!1m1!1s0x346915ab72c1a811:0x631cd5c14123e536!2m2!1d120.5812988!2d24.2262654!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });
        ImageButton b0phone = findViewById(R.id.build0phone);
        b0phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phone = Uri.parse("tel://0423638001");
                Intent it = new Intent(Intent.ACTION_DIAL,phone);
                startActivity(it);
            }
        });


    }
}
