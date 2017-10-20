package droidtuts4you.com.tablayoutexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class ViewPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);

        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstFragment tab1 = new FirstFragment();
                return tab1;

            case 1:
                SecondFragment tab2 = new SecondFragment();
                return tab2;

            case 2:
                ThirdFragment tab3 = new ThirdFragment();
                return tab3;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {

        return mNumOfTabs;

    }
}