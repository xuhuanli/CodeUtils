package com.xuhuanli.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xuhuanli.androidutils.sharedpreference.IPreference;

public class MainActivity extends AppCompatActivity {

    private IPreference mSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        mSp = IPreference.prefHolder.getPreference(this);
        mSp.put("key","value");
    }

    public void getData(View view) {
        TextView showData = findViewById(R.id.tv_show_data);
        showData.setText(mSp.getString("key"));
    }
}
