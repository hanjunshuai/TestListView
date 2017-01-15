package hjs.shougang.com.testlistviewgit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/1/15 0015.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<ShopInfo> list;

    //    private
    public MyAdapter(Context context, List<ShopInfo> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //返回带数据当前行的item视图对象
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_baseadapter, parent, false);
        }
        ShopInfo shopInfo = list.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.image_base);
        TextView name = (TextView) convertView.findViewById(R.id.tv_base_name);
        TextView content = (TextView) convertView.findViewById(R.id.tv_base_content);

        img.setImageResource(shopInfo.getIcon());
        name.setText(shopInfo.getName());
        content.setText(shopInfo.getContent());
        return convertView;
    }
}
