package com.erikriosetiawan.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Point;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        // Get current display info
//        WindowManager windowManager = getWindowManager();
//        Point size = new Point();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
//            windowManager.getDefaultDisplay().getSize(size);
//            if (size.x > size.y) {
//                // Landscape mode
//                OneFragment oneFragment = new OneFragment();
//                // android.R.id.content refers to the content view of the activity
//                fragmentTransaction.replace(android.R.id.content, oneFragment);
//            } else {
//                // Potrait mode
//                TwoFragment twoFragment = new TwoFragment();
//                fragmentTransaction.replace(android.R.id.content, twoFragment);
//            }
//        } else {
//            Display display = windowManager.getDefaultDisplay();
//            if (display.getRotation() == Surface.ROTATION_90 || display.getRotation() == Surface.ROTATION_270) {
//                // Landscape mode
//                OneFragment oneFragment = new OneFragment();
//                fragmentTransaction.replace(android.R.id.content, oneFragment);
//            } else {
//                TwoFragment twoFragment = new TwoFragment();
//                fragmentTransaction.replace(android.R.id.content, twoFragment);
//            }
//        }
//
//        fragmentTransaction.commit();
    }

    public void doPositiveClick() {
        Toast.makeText(this, "You clicked on 'OK' button", Toast.LENGTH_SHORT).show();
    }

    public void doNegativeClick() {
        Toast.makeText(this, "You clicked on 'Cancel' button", Toast.LENGTH_SHORT).show();
    }
}
