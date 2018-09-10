package com.dongnao.lsn4_paint_radarview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    private RadarView mRadarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadarView = (RadarView) findViewById(R.id.radarview);
    }

    public void start(View view){
        mRadarView.startScan();
    }

    public void stop(View view){
        mRadarView.stopScan();
    }
}
