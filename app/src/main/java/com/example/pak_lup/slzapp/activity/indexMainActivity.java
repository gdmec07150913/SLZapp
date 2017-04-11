package com.example.pak_lup.slzapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;

public class indexMainActivity extends AppCompatActivity {
    Toolbar toobar;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indexmain);
        findView();


        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//返回按钮的显示与实现
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle bundle=getIntent().getExtras();
        int id=bundle.getInt("photo");
        String message=bundle.getString("message");
        ImageView Iv=(ImageView) findViewById(R.id.roundImageView);
        Iv.setImageResource(id);
        TextView tv=(TextView) findViewById(R.id.tv_message);
        tv.setText(message);


//        toolbar.setNavigationIcon();
//        toolbar.setNavigationOnClickListener();
//        toolbar.setTitle();
//        toolbar.inflateMenu();
    }

    private void findView() {
        toobar= (Toolbar) findViewById(R.id.toolbar);
        tv= (TextView) findViewById(R.id.tv_title);
        tv.setText("主题详情");
        toobar.setTitle("");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
