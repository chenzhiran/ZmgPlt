package com.example.chenzhiran.zmgplt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MyLikeActivity extends AppCompatActivity{
    private ImageButton mMyButton;
    private GridView mProductGridView;
    private List<ProductInfo> mProductInfos;

    //跳转到我的页面
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {

                case R.id.like_layout_imageButton3:
                    Intent intent1 = new Intent(MyLikeActivity.this, MyActivity.class);
                    startActivity(intent1);
                    break;

            }
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_like);

        mMyButton = (ImageButton)this.findViewById(R.id.like_layout_imageButton3);
        mMyButton.setOnClickListener(mOnClickListener);

        mProductGridView = (GridView) findViewById(R.id.grid_view2);
        mProductInfos = new ArrayList<>();
        mProductInfos.add(new ProductInfo("春夏的牛仔", 121,R.drawable.timg));
        mProductInfos.add(new ProductInfo("干练风哈哈", 262,R.drawable.timg_1));
        mProductInfos.add(new ProductInfo("韩版宽小个", 281,R.drawable.timg_2));
        mProductInfos.add(new ProductInfo("牛仔裤复古", 421,R.drawable.timg_3));
        mProductInfos.add(new ProductInfo("黑色腰带配", 121,R.drawable.timg_4));
        mProductInfos.add(new ProductInfo("卷边牛仔裤", 721,R.drawable.timg_5));
        mProductInfos.add(new ProductInfo("高腰是主流", 221,R.drawable.timg_6));
        mProductInfos.add(new ProductInfo("高到银河系", 231,R.drawable.timg_17));
        mProductInfos.add(new ProductInfo("各种包裙啊", 271,R.drawable.timg_8));
        mProductInfos.add(new ProductInfo("复古风大爱", 291,R.drawable.timg_19));
        mProductInfos.add(new ProductInfo("耳环必备品", 321,R.drawable.timg_10));
        mProductInfos.add(new ProductInfo("很多新花样", 261,R.drawable.timg_11));
        mProductInfos.add(new ProductInfo("韩国女生人", 621,R.drawable.timg_12));
        mProductInfos.add(new ProductInfo("春夏秋都可", 282,R.drawable.timg_13));
        mProductInfos.add(new ProductInfo("喜欢紧身的", 221,R.drawable.timg_14));
        mProductInfos.add(new ProductInfo("大热的网球", 621,R.drawable.timg_15));
        mProductInfos.add(new ProductInfo("百褶学生裙", 271,R.drawable.timg_18));
        mProductInfos.add(new ProductInfo("这个网球衫", 241,R.drawable.timg_19));

        final GridViewAdapter productAdapter = new GridViewAdapter(MyLikeActivity.this, mProductInfos);

        mProductGridView.setAdapter(productAdapter);


        mProductGridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(MyLikeActivity.this, ProductActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MyLikeActivity.this, ProductActivity.class);
                        startActivity(intent1);
                        break;



                }

            }
        });



    }


}
