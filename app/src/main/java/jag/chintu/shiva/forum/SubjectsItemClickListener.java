package jag.chintu.shiva.forum;

//import android.support.v7.widget.*;
import android.content.*;
import android.view.*;

import androidx.recyclerview.widget.RecyclerView;

public class SubjectsItemClickListener implements RecyclerView.OnItemTouchListener
{
    GestureDetector mGestureDetector;
    private OnItemClickListener mListener;
    
    public SubjectsItemClickListener(final Context context, final RecyclerView recyclerView, final OnItemClickListener mListener) {
        this.mListener = mListener;
        this.mGestureDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener() {
            public void onLongPress(final MotionEvent motionEvent) {
                final View childViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (childViewUnder != null && SubjectsItemClickListener.this.mListener != null) {
                    SubjectsItemClickListener.this.mListener.onLongItemClick(childViewUnder, recyclerView.getChildAdapterPosition(childViewUnder));
                }
            }
            
            public boolean onSingleTapUp(final MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(final RecyclerView recyclerView, final MotionEvent motionEvent) {
        final View childViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        boolean b;
        if (childViewUnder != null && this.mListener != null && this.mGestureDetector.onTouchEvent(motionEvent)) {
            this.mListener.onItemClick(childViewUnder, recyclerView.getChildAdapterPosition(childViewUnder));
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public void onRequestDisallowInterceptTouchEvent(final boolean b) {
    }
    
    @Override
    public void onTouchEvent(final RecyclerView recyclerView, final MotionEvent motionEvent) {
    }
    
    public interface OnItemClickListener
    {
        void onItemClick(final View p0, final int p1);
        
        void onLongItemClick(final View p0, final int p1);
    }
}
