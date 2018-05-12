package com.example.chenzhiran.zmgplt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class GridViewAdapter extends BaseAdapter {
    private Context mContext;

    private LayoutInflater mLayoutInflater;

    private List<ProductInfo> mProductInfos = new ArrayList<>();

    public GridViewAdapter(Context context, List<ProductInfo> userInfos) {
        mContext = context;
        mProductInfos = userInfos;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // 有多少条数据
        return mProductInfos.size();
    }

    @Override
    public Object getItem(int position) {
        // 返回某一条数据对象
        return mProductInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 返回一个视图

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_product_info, null);
            viewHolder = new ViewHolder();
            // 获取控件
            viewHolder.nameTextView = (TextView) convertView.findViewById(R.id.name_text_view);
            viewHolder.ageTextView = (TextView) convertView.findViewById(R.id.age_text_view);
            viewHolder.avatarImageView = (ImageView) convertView.findViewById(R.id.avatar_image_view);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // 和数据之间进行绑定
        viewHolder.nameTextView.setText(mProductInfos.get(position).getProductDesription());
        viewHolder.ageTextView.setText(String.valueOf(mProductInfos.get(position).getPrice()));
        viewHolder.avatarImageView.setImageResource((mProductInfos.get(position).getAvatarUrl()));

        return convertView;
    }

    class ViewHolder {
        TextView nameTextView;
        TextView ageTextView;
        ImageView avatarImageView;
    }
}
