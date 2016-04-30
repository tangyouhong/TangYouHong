package cn.studyjams.s1.sj32.tangyouhong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tangyouhong on 16/4/24.
 */
public class GuZhuangActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ancient_main);

        Button button_langya = (Button) findViewById(R.id.langya_view);
        button_langya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuZhuangActivity.this, LangYaActivity.class);
                startActivity(intent);
            }
        });
        Button button_nvyi = (Button) findViewById(R.id.nvyi_view);
        button_nvyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuZhuangActivity.this, NvYiActivity.class);
                startActivity(intent);
            }
        });
        Button button_qingqiu = (Button) findViewById(R.id.qingqiu_view);
        button_qingqiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuZhuangActivity.this, QingQiuActivity.class);
                startActivity(intent);
            }
        });
        Button button_wumeiniang = (Button) findViewById(R.id.wumeiniang_view);
        button_wumeiniang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuZhuangActivity.this, WuMeiNiangActivity.class);
                startActivity(intent);
            }
        });
    }
}
