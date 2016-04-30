package cn.studyjams.s1.sj32.tangyouhong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tangyouhong on 16/4/24.
 */
public class KongBuActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terror_main);

        Button button_bixian = (Button) findViewById(R.id.bixian_view);
        button_bixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KongBuActivity.this, BiXianActivity.class);
                startActivity(intent);
            }
        });
        Button button_jianghshi = (Button) findViewById(R.id.jiangshi_view);
        button_jianghshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KongBuActivity.this, JiangShiActivity.class);
                startActivity(intent);
            }
        });
        Button button_zhouyuan = (Button) findViewById(R.id.zhouyuan_view);
        button_zhouyuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KongBuActivity.this, ZhouYuanActivity.class);
                startActivity(intent);
            }
        });
        Button button_yimei= (Button) findViewById(R.id.yimei_view);
        button_yimei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KongBuActivity.this, YiMeiActivity.class);
                startActivity(intent);
            }
        });
    }
}
