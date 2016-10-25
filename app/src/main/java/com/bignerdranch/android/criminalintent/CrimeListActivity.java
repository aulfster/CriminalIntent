package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by csidd on 2016-10-25.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}