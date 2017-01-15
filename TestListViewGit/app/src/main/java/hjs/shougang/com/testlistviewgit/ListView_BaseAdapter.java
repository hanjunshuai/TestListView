package hjs.shougang.com.testlistviewgit;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/15 0015.
 */

public class ListView_BaseAdapter extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    private ListView listView;
    private MyAdapter adapter;
    private List<ShopInfo> data;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    private void initview() {
        listView = (ListView) findViewById(R.id.lv_main);

        data = new ArrayList<>();
        data.add(new ShopInfo(R.drawable.f1, "name---1", "content---1"));
        data.add(new ShopInfo(R.drawable.f2, "name---2", "content---2"));
        data.add(new ShopInfo(R.drawable.f3, "name---3", "content---3"));
        data.add(new ShopInfo(R.drawable.f3, "name---4", "content---4"));
        data.add(new ShopInfo(R.drawable.f4, "name---5", "content---5"));
        data.add(new ShopInfo(R.drawable.f4, "name---6", "content---6"));
        data.add(new ShopInfo(R.drawable.f7, "name---7", "content---7"));
        data.add(new ShopInfo(R.drawable.f8, "name---8", "content---8"));
        data.add(new ShopInfo(R.drawable.f9, "name---9", "content---9"));
        data.add(new ShopInfo(R.drawable.f10, "name---10", "content---10"));
        data.add(new ShopInfo(R.drawable.f5, "name---11", "content---11"));
        data.add(new ShopInfo(R.drawable.f6, "name---12", "content---12"));

        adapter = new MyAdapter(this, data);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);

    }

    /**
     * listview的点击事件
     *
     * @param parent：ListView
     * @param view：当前行Item的视图
     * @param position：当前行的下标
     * @param id：
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //提示当前行的应用名称
        String name = data.get(position).getName();
        //提示
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    /**
     * listView的长按事件
     *
     * @param parent
     * @param view
     * @param position
     * @param id
     * @return
     */
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
        new AlertDialog.Builder(this)
                .setTitle("输出数据")
                .setMessage("确定删除吗")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //删除当前的数据
                        data.remove(position);
                        //更新
                        adapter.notifyDataSetChanged();//通知更新列表

                        Toast.makeText(ListView_BaseAdapter.this, "删除成功", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", null)
                .show();

        return false;
    }
}
