package com.example.celestial.celesandroid;

/**
 * Created by celestial on 2017/7/1.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class NormalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);
        Button But = (Button) findViewById(R.id.button3);
        But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.notion.so/zysjxl1/Reading-List-3aca2269edd34f6c927aeab2bacfd62c"));
                startActivity(intent);
            }
        });
    }

}