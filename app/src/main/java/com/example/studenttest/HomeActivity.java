package com.example.studenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView IvClass,IvWork;
    private TextView TvClass,TvWork,tvUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvUsername =findViewById(R.id.username_2);
        IvClass = findViewById(R.id.iv_class);
        IvWork = findViewById(R.id.iv_work);
        TvClass = findViewById(R.id.tv_class);
        TvWork = findViewById(R.id.tv_work);


        Intent intent = getIntent();
        String classmate = intent.getStringExtra("username");
        String result = classmate;
        tvUsername.setText(result);


        IvClass.setOnClickListener(this);
        IvWork.setOnClickListener(this);
        TvClass.setOnClickListener(this);
        TvWork.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_class:
                Intent intent = new Intent(HomeActivity.this,CourseListActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_work:
                break;
            case R.id.tv_class:
                Intent intent1 = new Intent(HomeActivity.this,CourseListActivity.class);
                startActivity(intent1);
                break;
            case R.id.tv_work:
                break;
        }
    }
}
