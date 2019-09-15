package jag.chintu.shiva.forum;

//import android.support.v7.app.*;
import java.util.*;
//import android.support.v7.widget.*;
import android.content.*;
import android.widget.*;
import android.view.*;
import android.os.*;
//import android.support.annotation.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Cseyears extends AppCompatActivity
{
    private ArrayList deom;
    Button y1;
    Button y2;
    Button y3;
    Button y4;
    
    public void intiative() {
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R.id.rcv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getApplicationContext()));
        (this.deom = new ArrayList()).add(new Deom("I YEAR", R.drawable.one1));
        this.deom.add(new Deom("II YEAR", R.drawable.two1));
        this.deom.add(new Deom("III YEAR", R.drawable.three1));
        this.deom.add(new Deom("IV YEAR", R.drawable.four));
        this.deom.add(new Deom("GATE PAPERS", R.drawable.five));
        recyclerView.setAdapter((RecyclerView.Adapter)new RVAdapter(this.deom));
        recyclerView.addOnItemTouchListener((RecyclerView.OnItemTouchListener)new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(Cseyears.this.getApplicationContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener() {
                public boolean onSingleTapUp(final MotionEvent motionEvent) {
                    return true;
                }
            });
            
            @Override
            public boolean onInterceptTouchEvent(final RecyclerView recyclerView, final MotionEvent motionEvent) {
                final View childViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (childViewUnder != null && this.gestureDetector.onTouchEvent(motionEvent)) {
                    final int childAdapterPosition = recyclerView.getChildAdapterPosition(childViewUnder);
                    if (childAdapterPosition == 0) {
                        Cseyears.this.startActivity(new Intent((Context)Cseyears.this, (Class)Cse1sub.class));
                    }
                    if (childAdapterPosition == 1) {
                        Cseyears.this.startActivity(new Intent((Context)Cseyears.this, (Class)Cse2sub.class));
                    }
                    if (childAdapterPosition == 2) {
                        Cseyears.this.startActivity(new Intent((Context)Cseyears.this, (Class)Cse3sub.class));
                    }
                    if (childAdapterPosition == 3) {
                        Cseyears.this.startActivity(new Intent((Context)Cseyears.this, (Class)Cse4sub.class));
                    }
                    if (childAdapterPosition == 4) {
                        Cseyears.this.startActivity(new Intent((Context)Cseyears.this, (Class)Gatemain.class));
                        Toast.makeText(Cseyears.this.getApplicationContext(), (CharSequence)"gate", Toast.LENGTH_SHORT).show();
                    }
                }
                return false;
            }
            
            @Override
            public void onRequestDisallowInterceptTouchEvent(final boolean b) {
            }
            
            @Override
            public void onTouchEvent(final RecyclerView recyclerView, final MotionEvent motionEvent) {
            }
        });
    }
    
    @Override
    protected void onCreate(@Nullable final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.years);
        this.intiative();
    }
}
