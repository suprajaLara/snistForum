package jag.chintu.shiva.forum;

import android.support.v7.widget.*;
import android.graphics.drawable.*;
import android.content.*;
import android.content.res.*;
import android.view.*;
import android.graphics.*;

public class DividerItemDecoration extends ItemDecoration
{
    private static final int[] ATTRS;
    public static final int HORIZONTAL_LIST = 0;
    public static final int VERTICAL_LIST = 1;
    private Drawable mDivider;
    private int mOrientation;
    
    static {
        ATTRS = new int[] { 16843284 };
    }
    
    public DividerItemDecoration(final Context context, final int orientation) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(DividerItemDecoration.ATTRS);
        this.mDivider = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.setOrientation(orientation);
    }
    
    public void drawHorizontal(final Canvas canvas, final RecyclerView recyclerView) {
        final int paddingTop = recyclerView.getPaddingTop();
        final int height = recyclerView.getHeight();
        final int paddingBottom = recyclerView.getPaddingBottom();
        for (int childCount = recyclerView.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = recyclerView.getChildAt(i);
            final int n = child.getRight() + ((LayoutParams)child.getLayoutParams()).rightMargin;
            this.mDivider.setBounds(n, paddingTop, n + this.mDivider.getIntrinsicHeight(), height - paddingBottom);
            this.mDivider.draw(canvas);
        }
    }
    
    public void drawVertical(final Canvas canvas, final RecyclerView recyclerView) {
        final int paddingLeft = recyclerView.getPaddingLeft();
        final int width = recyclerView.getWidth();
        final int paddingRight = recyclerView.getPaddingRight();
        for (int childCount = recyclerView.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = recyclerView.getChildAt(i);
            final int n = child.getBottom() + ((LayoutParams)child.getLayoutParams()).bottomMargin;
            this.mDivider.setBounds(paddingLeft, n, width - paddingRight, n + this.mDivider.getIntrinsicHeight());
            this.mDivider.draw(canvas);
        }
    }
    
    @Override
    public void getItemOffsets(final Rect rect, final View view, final RecyclerView recyclerView, final State state) {
        if (this.mOrientation == 1) {
            rect.set(0, 0, 0, this.mDivider.getIntrinsicHeight());
        }
        else {
            rect.set(0, 0, this.mDivider.getIntrinsicWidth(), 0);
        }
    }
    
    @Override
    public void onDrawOver(final Canvas canvas, final RecyclerView recyclerView, final State state) {
        if (this.mOrientation == 1) {
            this.drawVertical(canvas, recyclerView);
        }
        else {
            this.drawHorizontal(canvas, recyclerView);
        }
    }
    
    public void setOrientation(final int mOrientation) {
        if (mOrientation != 0 && mOrientation != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.mOrientation = mOrientation;
    }
}
