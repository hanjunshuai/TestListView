package hjs.shougang.com.testlistviewgit;
/**
 * SimpleAdapter
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/14 0014.
 */

public class ListView_SimpleAdapter extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.lv_main);
        //准备集合数据
        List<Map<String, Object>>
                data = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("icon", R.drawable.f1);
        map.put("name", "name--1");
        map.put("content", "content--1");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f1);
        map.put("name", "name--2");
        map.put("content", "content--2");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f3);
        map.put("name", "name--3");
        map.put("content", "content--3");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f4);
        map.put("name", "name--4");
        map.put("content", "content--4");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f5);
        map.put("name", "name--5");
        map.put("content", "content--5");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f6);
        map.put("name", "name--6");
        map.put("content", "content--6");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f7);
        map.put("name", "name--7");
        map.put("content", "content--7");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f8);
        map.put("name", "name--8");
        map.put("content", "content--8");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f6);
        map.put("name", "name--9");
        map.put("content", "content--9");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f4);
        map.put("name", "name--10");
        map.put("content", "content--10");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.f10);
        map.put("name", "name--11");
        map.put("content", "content--11");
        data.add(map);

        //map对象中的key的数组，用于得到对应的value
        String[] from = {"icon", "name", "content"};
        int[] to = {R.id.iv_item_sim_icon, R.id.tv_item_sim_name, R.id.tv_item_sim_content};

        //准备SimpleAdapter对象
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.item_simple, from, to);
        //设置Adapter显示列表
        listView.setAdapter(adapter);
    }

}
