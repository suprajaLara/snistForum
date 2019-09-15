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

public class Cse1sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Cse1sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("COMPUTER PROGRAMMING(CP)"));
        this.movieList.add(new Subjects("PHYSICS-I"));
        this.movieList.add(new Subjects("CHEMISTRY-I"));
        this.movieList.add(new Subjects("DATA STRUCTURES(DS&C++)"));
        this.movieList.add(new Subjects("PHYSICS-II"));
        this.movieList.add(new Subjects("CHEMISTRY-II"));
        this.movieList.add(new Subjects("BASIC MECHANICAL ENGINEERING(BME)"));
        ((RecyclerView.Adapter)this.mAdapter).notifyDataSetChanged();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_cse3sub);
        this.recyclerView = (RecyclerView)this.findViewById(R.id.rcv);
        this.mAdapter = new SubjectsAdapter(this.movieList);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getApplicationContext()));
        this.recyclerView.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        this.recyclerView.setAdapter((RecyclerView.Adapter)this.mAdapter);
        this.recyclerView.addOnItemTouchListener((RecyclerView.OnItemTouchListener)new SubjectsItemClickListener(this.getApplicationContext(), this.recyclerView, (SubjectsItemClickListener.OnItemClickListener)new SubjectsItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(final View view, final int n) {
                if (n == 0) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Cp.class));
                }
                else if (n == 1) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Ep1.class));
                }
                else if (n == 2) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Ec1.class));
                }
                else if (n == 3) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Dsc.class));
                }
                else if (n == 4) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Ep2.class));
                }
                else if (n == 5) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Ec2.class));
                }
                else if (n == 6) {
                    Cse1sub.this.startActivity(new Intent((Context)Cse1sub.this, (Class)Bme.class));
                }
                else {
                    Toast.makeText(Cse1sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", Toast.LENGTH_SHORT).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
