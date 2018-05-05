package com.example.chenzhiran.zmgplt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.chenzhiran.zmgplt.R.id.like_layout_imageButton;

public class MainActivity extends AppCompatActivity {

    private Button mProductButton;
    private Button mMyButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.product_button:
                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                    startActivity(intent);
                    break;
                case R.id.like_layout_imageButton:
                    startActivity(intent1);
                    break;
            }
        }
    };


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProductButton = (Button)findViewById(R.id.product_button);
        mMyButton = (Button)findViewById(like_layout_imageButton);

        mProductButton.setOnClickListener(mOnClickListener);
        mMyButton.setOnClickListener(mOnClickListener);

    }




}
