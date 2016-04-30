package cn.studyjams.s1.sj32.tangyouhong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_smile = (Button) findViewById(R.id.smile_view);
        button_smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XiJuActivity.class);
                startActivity(intent);
            }
        });
        Button button_action = (Button) findViewById(R.id.action_view);
        button_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DongZuoActivity.class);
                startActivity(intent);
            }
        });
        Button button_science = (Button) findViewById(R.id.science_view);
        button_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KeHuanActivity.class);
                startActivity(intent);
            }
        });
        Button button_terror = (Button) findViewById(R.id.terror_view);
        button_terror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KongBuActivity.class);
                startActivity(intent);
            }
        });
        Button button_ancient = (Button) findViewById(R.id.ancient_view);
        button_ancient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GuZhuangActivity.class);
                startActivity(intent);
            }
        });

    }
}
