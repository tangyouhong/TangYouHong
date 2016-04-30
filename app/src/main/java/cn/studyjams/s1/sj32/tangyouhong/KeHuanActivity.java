package cn.studyjams.s1.sj32.tangyouhong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tangyouhong on 16/4/24.
 */
public class KeHuanActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science_main);

        Button button_xingqiu = (Button) findViewById(R.id.xingqiu_view);
        button_xingqiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeHuanActivity.this, XingQiuActivity.class);
                startActivity(intent);
            }
        });
        Button button_duizhang = (Button) findViewById(R.id.duizhang_view);
        button_duizhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeHuanActivity.this, DuiZhangActivity.class);
                startActivity(intent);
            }
        });
        Button button_shenghua = (Button) findViewById(R.id.shenghua_view);
        button_shenghua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeHuanActivity.this, ShengHuaActivity.class);
                startActivity(intent);
            }
        });
        Button button_chaoti = (Button) findViewById(R.id.chaoti_view);
        button_chaoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeHuanActivity.this, ChaoTiActivity.class);
                startActivity(intent);
            }
        });
    }
}
