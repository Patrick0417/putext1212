package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class build9 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //靜安
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid9);
        ImageButton b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E9%9D%9C%E5%AE%89%E6%A8%93/@24.2266898,120.5827328,17.89z/data=!3m1!5s0x34691453347de391:0x6ca82baa3eda88ae!4m9!4m8!1m0!1m5!1m1!1s0x346915ace1489c85:0xd7a239e2a04bd966!2m2!1d120.5821194!2d24.226193!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });


    }
}
