package com.xuhuanli.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.xuhuanli.androidutils.appinfo.AppUtil;
import com.xuhuanli.androidutils.keyboard.KeyBoardUtil;
import com.xuhuanli.androidutils.sharedpreference.IPreference;

public class MainActivity extends AppCompatActivity {

    private IPreference mSp;
    private TextView mShowData;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowData = findViewById(R.id.tv_show_data);
        mEditText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        mSp = IPreference.prefHolder.getPreference(this);
        mSp.put("key", "value");
        JsonTest jsonTest = new JsonTest();
        jsonTest.resolveJson();
    }

    public void getData(View view) {
        if (mSp == null) {
            mSp = IPreference.prefHolder.getPreference(this);
            mSp.put("key", "value");
        }
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

    public void showIme(View view) {
        KeyBoardUtil.displayIme(mEditText);
    }

    public void hideIme(View view) {
        KeyBoardUtil.hideIme(mEditText);
    }
}
