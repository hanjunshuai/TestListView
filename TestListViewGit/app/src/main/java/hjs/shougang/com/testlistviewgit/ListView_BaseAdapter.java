package hjs.shougang.com.testlistviewgit;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/15 0015.
 */

public class ListView_BaseAdapter extends AppCompatActivity {
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

        adapter = new MyAdapter(this,data);

        listView.setAdapter(adapter);

    }

    private void add() {

    }
}
