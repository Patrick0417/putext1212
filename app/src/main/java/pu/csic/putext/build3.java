package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class build3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //伯鐸
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid3);
        ImageButton b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E4%BC%AF%E9%90%B8%E6%A8%93/@24.2255555,120.5815963,18z/data=!4m9!4m8!1m0!1m5!1m1!1s0x346915ac9172bd81:0x63f4e235468bc683!2m2!1d120.5806172!2d24.2261711!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });


    }
}
