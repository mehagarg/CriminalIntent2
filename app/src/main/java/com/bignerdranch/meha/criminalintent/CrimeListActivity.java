package com.bignerdranch.meha.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by meha on 3/23/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
