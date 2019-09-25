package com.example.studenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_username;
    private EditText et_password;
    private Button btnLogin, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username = findViewById(R.id.username);
        et_password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login);
        btnExit = findViewById(R.id.exit);

        btnLogin.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String username = et_username.getText().toString();
        String password = et_password.getText().toString();
        switch (view.getId()){
            case R.id.login:
                if (username.equals("123") && password.equals("123")) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("username", et_username.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"请输入用户名或密码",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.exit:
                finish();
                break;
        }
    }
}
