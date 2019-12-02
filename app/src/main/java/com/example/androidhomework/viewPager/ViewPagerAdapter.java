package com.example.androidhomework.viewPager;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.androidhomework.MainActivity;
import com.example.androidhomework.fragment.FIfthFragment;
import com.example.androidhomework.fragment.FirstFragment;
import com.example.androidhomework.fragment.FourthFragment;
import com.example.androidhomework.fragment.SecondFragment;
import com.example.androidhomework.fragment.SeventhFragment;
import com.example.androidhomework.fragment.SixthFragment;
import com.example.androidhomework.fragment.ThirdFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
@Override
    public CharSequence getPageTitle(int position) {
        return "第" + (position+1) +"个";
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Fragment fragment1 = new FirstFragment();
            return fragment1;
        }
        else if(position == 1){
            Fragment fragment2 = new SecondFragment();
            return  fragment2;
        }
        else if (position == 2){
            Fragment fragment3 = new ThirdFragment();
            return fragment3;
        }
        else if (position == 3){
            Fragment fragment4 = new FourthFragment();
            return fragment4;
        }
        else if (position == 4){
            Fragment fragment5 = new FIfthFragment();
            return fragment5;
        }
        else if (position == 5){
            Fragment fragment6 = new SixthFragment();
            return fragment6;
        }
        else if (position == 6){
            Fragment fragment7 = new SeventhFragment();
            return fragment7;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 7;
    }
}



