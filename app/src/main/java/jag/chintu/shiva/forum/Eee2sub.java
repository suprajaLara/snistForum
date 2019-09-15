package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Eee2sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Eee2sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Electronic Devices and Circuits"));
        this.movieList.add(new Subjects("Java Programming"));
        this.movieList.add(new Subjects("Switching Theory & Logic Design"));
        this.movieList.add(new Subjects("Probability and Statistics "));
        this.movieList.add(new Subjects("Fluied Mechanic and Hydralic Machinery"));
        this.movieList.add(new Subjects("Electro Magnetic Fields"));
        this.movieList.add(new Subjects("Circuits & Networks \u2013 II"));
        this.movieList.add(new Subjects("Power System - I"));
        this.movieList.add(new Subjects("Electrical Machines - I"));
        this.movieList.add(new Subjects("Electrical Machines - II"));
        this.movieList.add(new Subjects("Electronic Circuits"));
        this.movieList.add(new Subjects("Control Systems"));
        ((RecyclerView.Adapter)this.mAdapter).notifyDataSetChanged();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968605);
        this.recyclerView = (RecyclerView)this.findViewById(2131493038);
        this.mAdapter = new SubjectsAdapter(this.movieList);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getApplicationContext()));
        this.recyclerView.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        this.recyclerView.setAdapter((RecyclerView.Adapter)this.mAdapter);
        this.recyclerView.addOnItemTouchListener((RecyclerView.OnItemTouchListener)new SubjectsItemClickListener(this.getApplicationContext(), this.recyclerView, (SubjectsItemClickListener.OnItemClickListener)new SubjectsItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(final View view, final int n) {
                if (n == 0) {
                    Eee2sub.this.startActivity(new Intent((Context)Eee2sub.this, (Class)Edc.class));
                }
                else if (n == 1) {
                    Eee2sub.this.startActivity(new Intent((Context)Eee2sub.this, (Class)Oopj.class));
                }
                else if (n == 2) {
                    Eee2sub.this.startActivity(new Intent((Context)Eee2sub.this, (Class)Stld.class));
                }
                else if (n == 3) {
                    Eee2sub.this.startActivity(new Intent((Context)Eee2sub.this, (Class)PS.class));
                }
                else {
                    Toast.makeText(Eee2sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
