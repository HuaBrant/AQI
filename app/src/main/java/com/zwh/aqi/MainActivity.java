package com.zwh.aqi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zwh.aqi.db.pm2_5;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * entry city
     */
    private EditText mEtMain;
    /**
     * 获得数据
     */
    private Button mBtMain;
    private TextView mTvMain;

    private static final String SEARCH_URL="http://www.pm25.in/api/querys/pm2_5.json"
            +"?city=%s&token=%s";
    private static final String SEARCH_KEY="5j1znBVAsnSf5xQyNQyq";
    private pm2_5 pm25;
    private String string;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mEtMain = (EditText) findViewById(R.id.etMain);
        mBtMain = (Button) findViewById(R.id.btMain);
        mBtMain.setOnClickListener(this);
        mTvMain = (TextView) findViewById(R.id.tvMain);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btMain:
                if (mEtMain.getText() !=null){
                    showText(mEtMain.getText().toString());
                }else {
                    Log.i("asfaSFAS", "onClick: edittext is null");
                }
                break;
        }
    }

    private void showText(String city) {

        String url = String.format(SEARCH_URL,city,SEARCH_KEY);

    }
}
