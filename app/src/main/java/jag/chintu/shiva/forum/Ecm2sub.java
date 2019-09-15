package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Ecm2sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Ecm2sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("ELECTRONIC DEVICES & CIRCUITS"));
        this.movieList.add(new Subjects("OOPJAVA"));
        this.movieList.add(new Subjects("SWITCHING THEORY & LOGIC DESIGN"));
        this.movieList.add(new Subjects("ELEMENTS OF MECHANICAL ENGINEERING(BME)"));
        this.movieList.add(new Subjects("DATABASE MANAGEMENT SYSTEM"));
        this.movieList.add(new Subjects("PROBABILITY & STATISTICS"));
        this.movieList.add(new Subjects("SOFTWARE ENGINEERING"));
        this.movieList.add(new Subjects("COMPUTER ORAGANIZATION & ARCHITECTURE"));
        this.movieList.add(new Subjects("DISCRETE STRUCTRES & GRAPH THEROY"));
        this.movieList.add(new Subjects("PULSE & DIGITAL CIRCUITS"));
        this.movieList.add(new Subjects("ELECTRICAL TECHNOLOGY"));
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
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Edc.class));
                }
                else if (n == 1) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Oopj.class));
                }
                else if (n == 2) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Stld.class));
                }
                else if (n == 3) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Bme.class));
                }
                else if (n == 4) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Dbms.class));
                }
                else if (n == 5) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)PS.class));
                }
                else if (n == 6) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Se.class));
                }
                else if (n == 7) {
                    Ecm2sub.this.startActivity(new Intent((Context)Ecm2sub.this, (Class)Co.class));
                }
                else {
                    Toast.makeText(Ecm2sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
