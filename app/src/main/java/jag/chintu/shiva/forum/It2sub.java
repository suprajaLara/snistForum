package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class It2sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public It2sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("ELEMENTS OF ELECTRONICS ENGINEERING(EDC)"));
        this.movieList.add(new Subjects("OBJECTT ORIENTED PROGRAMMING THROUGH JAVA(OOPJ)"));
        this.movieList.add(new Subjects("DLD"));
        this.movieList.add(new Subjects("MATHEMATICAL FOUNDATIONS OF COMPUTER SCIENCE(MFCS)"));
        this.movieList.add(new Subjects("DATABASE MANAGEMENT SYSTEM(DBMS)"));
        this.movieList.add(new Subjects("COMPUTER ORAGNISATION"));
        this.movieList.add(new Subjects("DATA COMMUNICATION"));
        this.movieList.add(new Subjects("PROBABILITY & STATISTICS"));
        this.movieList.add(new Subjects("SPSL"));
        this.movieList.add(new Subjects("DESIGN AND ANALYSIS OF ALGORITHMS(DAA)"));
        this.movieList.add(new Subjects("ELEMENTS OF ELECTRICAL ENGINEERING(BE)"));
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
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Edc.class));
                }
                else if (n == 1) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Oopj.class));
                }
                else if (n == 2) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Stld.class));
                }
                else if (n == 3) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Mfcs.class));
                }
                else if (n == 4) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Dbms.class));
                }
                else if (n == 5) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Co.class));
                }
                else if (n == 6) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Dc.class));
                }
                else if (n == 7) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)PS.class));
                }
                else if (n == 8) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Sl.class));
                }
                else if (n == 9) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Daa.class));
                }
                else if (n == 10) {
                    It2sub.this.startActivity(new Intent((Context)It2sub.this, (Class)Edc.class));
                }
                else {
                    Toast.makeText(It2sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
