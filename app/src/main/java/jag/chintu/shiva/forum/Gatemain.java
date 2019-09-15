package jag.chintu.shiva.forum;

//import android.support.v7.app.*;
import java.util.*;
import android.os.*;
//import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Gatemain extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Gatemain() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("GATE 2015"));
        this.movieList.add(new Subjects("GATE 2013-14"));
        ((RecyclerView.Adapter)this.mAdapter).notifyDataSetChanged();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_cse3sub);
        this.recyclerView = (RecyclerView)this.findViewById(R.id.recycler_view);
        this.mAdapter = new SubjectsAdapter(this.movieList);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getApplicationContext()));
        this.recyclerView.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        this.recyclerView.setAdapter((RecyclerView.Adapter)this.mAdapter);
        this.recyclerView.addOnItemTouchListener((RecyclerView.OnItemTouchListener)new SubjectsItemClickListener(this.getApplicationContext(), this.recyclerView, (SubjectsItemClickListener.OnItemClickListener)new SubjectsItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(final View view, final int n) {
                if (n == 0) {
                    Gatemain.this.startActivity(new Intent((Context)Gatemain.this, (Class)Gate.class));
                }
                else if (n == 1) {
                    Gatemain.this.startActivity(new Intent((Context)Gatemain.this, (Class)Gatec.class));
                }
                else {
                    Toast.makeText(Gatemain.this.getApplicationContext(), (CharSequence)"orange", Toast.LENGTH_SHORT).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
