package com.example.chenzhiran.zmgplt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity {
    private Button mProductLinkButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.product_linkButton:
                    Intent intent = new Intent(ProductActivity.this, PurchaseActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    };

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        mProductLinkButton = (Button)findViewById(R.id.product_linkButton);
        mProductLinkButton.setOnClickListener(mOnClickListener);

    }
}
