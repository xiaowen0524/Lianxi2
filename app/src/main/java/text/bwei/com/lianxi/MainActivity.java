package text.bwei.com.lianxi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private Button a, b, c;
    private ViewPager viewpager;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setviewpager();
        dianji();
        Log.d("**********MainActivity", "onCreate()");
        jieshouA();
    }

    public void jieshouA() {
        Intent intentA = getIntent();
        int AtB = intentA.getIntExtra("fragment", -1);
        viewpager.setCurrentItem(AtB);

    }


    public void setviewpager() {
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(new MyAdapter(getSupportFragmentManager(), setFragment()));
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                color(position);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void dianji() {
        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(0);
                color(0);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(1);
                color(1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(2);
                color(2);
            }
        });
    }

    public void color(int index) {
        switch (index) {
            case 0:
                a.setTextColor(Color.RED);
                b.setTextColor(Color.BLACK);
                c.setTextColor(Color.BLACK);
                break;
            case 1:
                a.setTextColor(Color.BLACK);
                b.setTextColor(Color.RED);
                c.setTextColor(Color.BLACK);
                break;
            case 2:
                a.setTextColor(Color.BLACK);
                b.setTextColor(Color.BLACK);
                c.setTextColor(Color.RED);
                break;
        }
    }

    public List<Fragment> setFragment() {
        list = new ArrayList<>();
        list.add(new AActivity());
        list.add(new BActivity());
        list.add(new CActivity());
        return list;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("**********MainActivity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("**********MainActivity", "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("**********MainActivity", "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("**********MainActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("**********MainActivity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("**********MainActivity", "onDestroy()");
    }


}
