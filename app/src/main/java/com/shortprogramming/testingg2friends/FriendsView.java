package com.shortprogramming.testingg2friends;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

/**
 * Created by matthew on 7/3/17.
 */

public class FriendsView extends GameView{

    public FriendsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFriendsView();
    }
    public FriendsView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initFriendsView();
    }
    private void initFriendsView() {
        setFocusable(true);
        Resources r = this.getContext().getResources();
    }

}
