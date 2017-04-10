
package com.example.fujitsu.fragment63;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView mlstview;
    private NameAdapter  mNameAdapter;

    private ArrayList<custome> dummydata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlstview = (ListView) findViewById(R.id.frag_lst);

        dummydata=new ArrayList<>();
        custome c1 = new custome(R.drawable.youtubepic,"Youtube");
        custome c2 = new custome (R.drawable.ebloggerpic,"Eblogger");

        dummydata.add(c1);
        dummydata.add(c2);

        mNameAdapter = new NameAdapter(MainActivity.this,dummydata);

        mlstview.setAdapter(mNameAdapter);


    }
}
