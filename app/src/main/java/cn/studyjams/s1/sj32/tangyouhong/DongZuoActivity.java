package cn.studyjams.s1.sj32.tangyouhong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tangyouhong on 16/4/24.
 */
public class DongZuoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_main);

        Button button_yingxiong = (Button) findViewById(R.id.yingxiong_view);
        button_yingxiong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DongZuoActivity.this, YingXiongActivity.class);
                startActivity(intent);
            }
        });
        Button button_gongfu = (Button) findViewById(R.id.gongfu_view);
        button_gongfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DongZuoActivity.this, GongFuActivity.class);
                startActivity(intent);
            }
        });
        Button button_mingbu = (Button) findViewById(R.id.mingbu_view);
        button_mingbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DongZuoActivity.this, MingBuActivity.class);
                startActivity(intent);
            }
        });
        Button button_hengchong = (Button) findViewById(R.id.hengchong_view);
        button_hengchong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DongZuoActivity.this, HengChongActivity.class);
                startActivity(intent);
            }
        });
    }
}
