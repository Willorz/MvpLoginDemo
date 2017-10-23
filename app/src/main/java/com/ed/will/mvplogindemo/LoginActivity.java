package com.ed.will.mvplogindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUser,edtPsw;
    private Button btnLogin,btnClear;
    private ProgressBar pgbLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        edtUser= (EditText) findViewById(R.id.username_edt);
        edtPsw= (EditText) findViewById(R.id.password_edt);
        btnLogin= (Button) findViewById(R.id.login_btn);
        btnClear= (Button) findViewById(R.id.clear_btn);
        pgbLogin= (ProgressBar) findViewById(R.id.login_progress);
    }
}
