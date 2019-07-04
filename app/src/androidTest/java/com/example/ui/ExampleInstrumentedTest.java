package com.example.ui;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.ui", appContext.getPackageName());
    }
}
    List<Map<String, Object>> simpleList = new ArrayList<Map<String, Object>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSimpleList();

        ListView listView = (ListView)findViewById(R.id.listView1);
        SimpleAdapter adapter = new SimpleAdapter(this, simpleList, R.layout.simpleadapter,
                new String[] {"title","content","drawable"},
                new int[] {R.id.tvTitle,R.id.tvContent,R.id.imageView1});
        listView.setAdapter(adapter);
    }

    private void initSimpleList(){
        String[] titles = {"title1", "title2", "title3","title4", "title5", "title6"};
        String[] contents = {"content1", "content2", "content3","content4", "content5", "content6"};
        int[] drawableIds = {R.drawable.computer,R.drawable.excel,R.drawable.game,
                R.drawable.gc,R.drawable.network,R.drawable.pdf};
        Map<String, Object> map;
        for(int i=0;i<6;i++){
            map = new HashMap<String, Object>();
            map.put("title", titles[i]);
            map.put("content", contents[i]);
            map.put("drawable", drawableIds[i]);
            simpleList.add(map);
        }
    }
