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

public class Cse2sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Cse2sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("OBJECTT ORIENTED PROGRAMMING THROUGH JAVA(OOPJ)"));
        this.movieList.add(new Subjects("MATHEMATICAL FOUNDATIONS OF COMPUTER SCIENCE(MFCS)"));
        this.movieList.add(new Subjects("SWITCHING THEORY AND LOGIC DESIGN(STLD)"));
        this.movieList.add(new Subjects("BASIC ELECTRONICS(BE,EDC)"));
        this.movieList.add(new Subjects("BASIC ELECTRICAL ENGINEERING(BEE)"));
        this.movieList.add(new Subjects("DATA BASE MANAGEMENT SYSTEMS(DBMS)"));
        this.movieList.add(new Subjects("DESIGN AND ANALYSIS OF ALGORITHMS(DAA)"));
        this.movieList.add(new Subjects("COMPUTER ORGANIZATION AND MICROPROCESSOR AND INTERFACING(COMPI)"));
        this.movieList.add(new Subjects("PROBABILITY AND STATISTICS(P&S)"));
        this.movieList.add(new Subjects("DATA COMMUNICATIONS(DC)"));
        this.movieList.add(new Subjects("MANERGERIAL ECONOMICS & FINANCIAL ANALYSIS(MEFA)"));
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
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Oopj.class));
                }
                else if (n == 1) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Mfcs.class));
                }
                else if (n == 2) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Stld.class));
                }
                else if (n == 3) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Edc.class));
                }
                else if (n == 4) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Bee.class));
                }
                else if (n == 5) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Dbms.class));
                }
                else if (n == 6) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Daa.class));
                }
                else if (n == 7) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Compi.class));
                }
                else if (n == 8) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)PS.class));
                }
                else if (n == 9) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Dc.class));
                }
                else if (n == 10) {
                    Cse2sub.this.startActivity(new Intent((Context)Cse2sub.this, (Class)Mefa.class));
                }
                else {
                    Toast.makeText(Cse2sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", Toast.LENGTH_SHORT).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
