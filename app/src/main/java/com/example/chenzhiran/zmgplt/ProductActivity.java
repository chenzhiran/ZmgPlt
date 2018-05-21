package com.example.chenzhiran.zmgplt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProductActivity extends AppCompatActivity {
    private ImageButton mSearchButton;
    private ImageButton mLikeButton;


    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.search_layout_imageButton1:
                    Intent intent1 = new Intent(ProductActivity.this, MainActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.like_layout_imageButton1:
                    Intent intent3 = new Intent(ProductActivity.this, MyActivity.class);
                    startActivity(intent3);
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        mSearchButton = (ImageButton)this.findViewById(R.id.search_layout_imageButton1);
        mLikeButton = this.findViewById(R.id.like_layout_imageButton1);

        mSearchButton.setOnClickListener(mOnClickListener);
        mLikeButton.setOnClickListener(mOnClickListener);


    }
}
