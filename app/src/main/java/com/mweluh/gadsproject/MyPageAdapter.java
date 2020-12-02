package com.mweluh.gadsproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPageAdapter extends FragmentStateAdapter {
    public MyPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position){
        case 0:
            return new LeaderFragment();
           case 1:
               return new SkillFragment();
             default:
                return new LeaderFragment();}
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
