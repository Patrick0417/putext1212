package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class build5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //希嘉
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid5);
        Button b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com.tw/maps/dir//%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E5%B8%8C%E5%98%89%E5%AD%B8%E8%8B%91/@24.226293,120.5912701,16z/data=!4m9!4m8!1m0!1m5!1m1!1s0x346915aca5bef005:0x9c2c0357ec51dd7!2m2!1d120.5801765!2d24.2275001!3e3?hl=zh-TW&authuser=0");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });


    }
}
