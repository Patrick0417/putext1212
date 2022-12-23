package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class build1 extends AppCompatActivity {
    //任垣
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid1);

        ImageButton b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//433%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E4%BB%BB%E5%9E%A3%E6%A8%93/@24.2268747,120.5785164,17z/data=!4m17!1m7!3m6!1s0x346915ac994f36f9:0xe2f43b32aab52809!2zNDMz5Y-w5Lit5biC5rKZ6bm_5Y2A5Lu75Z6j5qiT!3b1!8m2!3d24.2268698!4d120.5810913!4m8!1m0!1m5!1m1!1s0x346915ac994f36f9:0xe2f43b32aab52809!2m2!1d120.5810913!2d24.2268698!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });



    }
}
