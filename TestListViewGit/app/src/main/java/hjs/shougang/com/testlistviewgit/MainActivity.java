package hjs.shougang.com.testlistviewgit;
/**
 * Listview+ArrayAdapter
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.lv_main);
        //准备集合数据
        String[] dada = {"A", "B", "C", "D", "E", "F", "g", "H", "I", "J", "K", "O", "P", "D", "DS"};
        //准备ArrayAdapter对象
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_arraay_adapter, dada);
        //设置Adapter显示列表
        listView.setAdapter(adapter);
    }
}
