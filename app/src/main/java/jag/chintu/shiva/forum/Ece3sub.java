package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Ece3sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Ece3sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("JAVA PROGRAMMING"));
        this.movieList.add(new Subjects("BASIC MECHANICAL ENGINEERING(BME)"));
        this.movieList.add(new Subjects("MANAGERIAL ECONOMICS & FINANCIAL ANALYSIS"));
        this.movieList.add(new Subjects("COMPUTER ORGANIZATION"));
        this.movieList.add(new Subjects("GENERAL MANAGEMENT AND ENTREPRENEURSHIP"));
        this.movieList.add(new Subjects("DIGITAL COMMUNICATIONS"));
        this.movieList.add(new Subjects("LINEAR AND DIGITAL IC APPLICATIONS"));
        this.movieList.add(new Subjects("DIGITAL SIGNAL PROCESSING"));
        this.movieList.add(new Subjects("ANALOG COMMUNICATIONS"));
        this.movieList.add(new Subjects("ANTENNAS AND WAVE PROPAGATION"));
        this.movieList.add(new Subjects("MICROPROCESSORS, MICROCONTROLLERS & APPLICATIONS"));
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
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Oopj.class));
                }
                else if (n == 1) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Bme.class));
                }
                else if (n == 2) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Mefa.class));
                }
                else if (n == 3) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Compi.class));
                }
                else if (n == 4) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Ent.class));
                }
                else if (n == 5) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Dc.class));
                }
                else if (n == 6) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Ldic.class));
                }
                else if (n == 10) {
                    Ece3sub.this.startActivity(new Intent((Context)Ece3sub.this, (Class)Mpmc.class));
                }
                else {
                    Toast.makeText(Ece3sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
