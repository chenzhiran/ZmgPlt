package com.example.chenzhiran.zmgplt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.chenzhiran.zmgplt.R.id.like_layout_imageButton;

class MyActivity extends AppCompatActivity {

    private Button mMyOrderButton;
    private Button mMyLikeButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.my_order_button:
                    Intent intent = new Intent(MyActivity.this, OrderActivity.class);
                    startActivity(intent);
                    break;
                case R.id.my_like_button:
                    Intent intent1 = new Intent(MyActivity.this, LikeActivity.class);
                    startActivity(intent1);
                    break;
            }
        }
    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mMyOrderButton = (Button)findViewById(R.id.my_order_button);
        mMyLikeButton = (Button)findViewById(R.id.my_like_button);

        mMyOrderButton.setOnClickListener(mOnClickListener);
        mMyLikeButton.setOnClickListener(mOnClickListener);



    }
}
