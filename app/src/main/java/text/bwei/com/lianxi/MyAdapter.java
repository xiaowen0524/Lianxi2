package text.bwei.com.lianxi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 1.version:
 * 2.date:2016/11/29 10:23
 * 3.update:2016/11/29.
 * 4.autour:张玉杰
 */
public class MyAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;

    public MyAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
