package com.xuhuanli.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.xuhuanli.androidutils.appinfo.AppUtil;
import com.xuhuanli.androidutils.sharedpreference.IPreference;

public class MainActivity extends AppCompatActivity {

    private IPreference mSp;
    private TextView mShowData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowData = findViewById(R.id.tv_show_data);
    }

    public void onClick(View view) {
        mSp = IPreference.prefHolder.getPreference(this);
        mSp.put("key", "value");
        JsonTest jsonTest = new JsonTest();
        jsonTest.resolveJson();
    }

    public void getData(View view) {
        mShowData.setText(mSp.getString("key"));
    }

    public void getAppName(View view) {
        mShowData.setText(AppUtil.getAppName(this));
    }

    public void getAppVersionName(View view) {
        mShowData.setText(AppUtil.getAppVersionName(this));
    }

    public void getAppVersionCode(View view) {
        mShowData.setText(String.valueOf(AppUtil.getAppVersionCode(this)));
    }
}
