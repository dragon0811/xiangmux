package com.example.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mvp.home.model.HomeListModeInter;
import com.example.mvp.home.view.IHomeListView;

public class MainActivity extends AppCompatActivity implements IHomeListView {
    private HomeListModeInter homeListModeInter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv);
        homeListModeInter=new HomeListModeInter((HomeListModeInter.ModuleInterface) this);
        //homeListModeInter.
    }

    public void getViewData(String data) {
        textView.setText(data);
    }
}
