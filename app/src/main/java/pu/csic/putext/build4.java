package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class build4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //至善
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid4);
        ImageButton b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E8%87%B3%E5%96%84%E6%A8%93/@24.2235558,120.5778217,17.25z/data=!4m9!4m8!1m0!1m5!1m1!1s0x346915acaa653d3b:0xb0f146c4cfcf04fd!2m2!1d120.5804509!2d24.2283679!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });


    }
}
