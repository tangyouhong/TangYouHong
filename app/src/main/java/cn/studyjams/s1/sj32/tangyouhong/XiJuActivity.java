package cn.studyjams.s1.sj32.tangyouhong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tangyouhong on 16/4/24.
 */
public class XiJuActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smile_main);

        Button button_xijuzhiwang = (Button) findViewById(R.id.xijuzhiwang_view);
        button_xijuzhiwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiJuActivity.this, XiJuZhiWangActivity.class);
                startActivity(intent);
            }
        });
        Button button_gangjiong = (Button) findViewById(R.id.gangjiong_view);
        button_gangjiong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiJuActivity.this, GangJiongActivity.class);
                startActivity(intent);
            }
        });
        Button button_zhuoyaoji = (Button) findViewById(R.id.zhuoyaoji_view);
        button_zhuoyaoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiJuActivity.this, ZhuoYaoJiActivity.class);
                startActivity(intent);
            }
        });
        Button button_wanwan= (Button) findViewById(R.id.wanwanmeixiangdao_view);
        button_wanwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XiJuActivity.this, WanWanActivity.class);
                startActivity(intent);
            }
        });
    }

}
