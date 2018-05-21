package com.example.chenzhiran.zmgplt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MyActivity extends AppCompatActivity {
    private Button mProductOrderButton;
    private Button mMyLikeButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.order_button:
                    Intent intent = new Intent(MyActivity.this, OrderActivity.class);
                    startActivity(intent);
                    break;
                case R.id.like_button:
                    Intent intent1 = new Intent(MyActivity.this, MyLikeActivity.class);
                    startActivity(intent1);
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mProductOrderButton = (Button)findViewById(R.id.order_button);
        mProductOrderButton.setOnClickListener(mOnClickListener);

        mMyLikeButton = (Button)findViewById(R.id.like_button);
        mMyLikeButton.setOnClickListener(mOnClickListener);

    }
}
