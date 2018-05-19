package id.kampung.belajarfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    private String title[] =new String[]{"Tab1","Tab2"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new Tab1Fragment();
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return title.length;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
