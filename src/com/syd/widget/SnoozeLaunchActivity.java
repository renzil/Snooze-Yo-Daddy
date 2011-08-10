package com.syd.widget;

import com.syd.*;

import android.app.Activity;
import android.os.Bundle;

/*
 * Should be deprecated. I see no point retaining this activity
 */
public class SnoozeLaunchActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}