package com.example.ium.sitneat;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Simone on 07/02/18.
 */

public class AntiSwipeViewer extends ViewPager {
    private boolean swipeable;

    public AntiSwipeViewer(Context context) {
        super(context);
    }

    public AntiSwipeViewer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.swipeable = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.swipeable) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.swipeable) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    public void setSwipeable(boolean swipeable) {
        this.swipeable = swipeable;
    }
}
