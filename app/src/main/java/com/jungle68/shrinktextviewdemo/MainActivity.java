package com.jungle68.shrinktextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.jungle68.shrinktextviewdemo.utils.TextViewUtils;
import com.jungle68.shrinktextviewdemo.utils.TextViewUtilsTmp;

public class MainActivity extends AppCompatActivity {


    private TextView mTvTest;
    private TextView mTvTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jungle68_activity_main);

        mTvTest = (TextView) findViewById(R.id.tv_test);
        mTvTest2 = (TextView) findViewById(R.id.tv_test2);

        new TextViewUtils(mTvTest, getString(R.string.jungle68_txet_tip));

        TextViewUtilsTmp.newInstance(mTvTest2, getString(R.string.jungle68_txet_tip))
                .spanTextColor(getResources().getColor(R
                        .color.colorAccent))
                .position(0, 50)
                .disPlayText(false)
                .onSpanTextClickListener(new TextViewUtilsTmp.OnSpanTextClickListener() {
                    @Override
                    public void setSpanText(TextView view, boolean canNotRead) {
                        Toast.makeText(MainActivity.this,"clicked  me ",Toast.LENGTH_SHORT).show();
                    }
                })
                .build();
    }

}
