package com.example.manhvan.chuan2demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnThanhToan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnThanhToan.setOnClickListener(this);
    }

    private void initView() {
        btnThanhToan=findViewById(R.id.btn_Momo);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_Momo:{

                Bundle data = new Bundle();
                Intent intent = new Intent(MainActivity.this, PaymentActivity.class);


                startActivity(intent);break;
            }
        }
    }
}
