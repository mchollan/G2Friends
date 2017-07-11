package com.shortprogramming.testingg2friends;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class G2Friends extends Activity {

    private static String SAVEDINSTANCE_KEY = "G2Friends-stance";

    private View mFrameLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // No Title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.g2_friends);
        mFrameLayout = findViewById(R.id.g2Friends);

        mFrameLayout.setOnClickListener( new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Log.d("G2Friends", "Clicked the view!");
           }
        });

        if (savedInstanceState == null) {
            // We were just launched -- set up a new game

        } else {
            // We are being restored
            Bundle map = savedInstanceState.getBundle(SAVEDINSTANCE_KEY);
            if (map != null) {

            } else {

            }
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Pause the game along with the activity
        //mSnakeView.setMode(SnakeView.PAUSE);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        //Store the game state
        //outState.putBundle(SAVEDINSTANCE_KEY, mSnakeView.saveState());
    }
}
