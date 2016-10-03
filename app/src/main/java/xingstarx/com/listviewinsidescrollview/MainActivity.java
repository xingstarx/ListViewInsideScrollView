package xingstarx.com.listviewinsidescrollview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private ListView mListView;
    private TextView mFooterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(android.R.id.list);
        mFooterView = (TextView) findViewById(R.id.footer_view);
        mListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, generateData()));
    }

    private List<String> generateData() {
        List<String> dataList = new ArrayList<>();
        for (int i = 0; i< 20; i++) {
            dataList.add("Android Developer " + i);
        }
        Log.e(TAG, "dataList.size() == " + dataList.size());
        return dataList;
    }
}
