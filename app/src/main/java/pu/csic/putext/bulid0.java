package pu.csic.putext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bulid0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulid0);

        Button b0map = findViewById(R.id.build0map);
        b0map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri web = Uri.parse("https://www.google.com/maps/dir//433%E5%8F%B0%E4%B8%AD%E5%B8%82%E6%B2%99%E9%B9%BF%E5%8D%80%E4%B8%BB%E9%A1%A7%E6%A8%93/@24.2270384,120.5813821,17z/data=!4m17!1m7!3m6!1s0x346915ad3a460ea9:0x7739c6a8980681dd!2zNDMz5Y-w5Lit5biC5rKZ6bm_5Y2A5Li76aGn5qiT!3b1!8m2!3d24.2270384!4d120.5835708!4m8!1m0!1m5!1m1!1s0x346915ad3a460ea9:0x7739c6a8980681dd!2m2!1d120.5835708!2d24.2270384!3e3");
                Intent it = new Intent(Intent.ACTION_VIEW,web);
                startActivity(it);
            }
        });
    }
}
