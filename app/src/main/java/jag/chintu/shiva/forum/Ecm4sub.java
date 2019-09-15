package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Ecm4sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Ecm4sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("MANAGEMENT SCIENCE"));
        this.movieList.add(new Subjects("DATAMINING & DATA WAREHOUSE"));
        this.movieList.add(new Subjects("SOFTWARE ENGINEERING"));
        this.movieList.add(new Subjects("OOAD"));
        this.movieList.add(new Subjects("SOFTWARE PROJECT MANAGEMENT"));
        this.movieList.add(new Subjects("COMPILER DESIGN"));
        this.movieList.add(new Subjects("MANAGEMENT SCIENCE"));
        this.movieList.add(new Subjects("CRYPTOGRAPHY & NETWORK SECURITY"));
        this.movieList.add(new Subjects("EMBEDDED & REAL TIME SYSTEMS"));
        this.movieList.add(new Subjects("DIGITAL SIGNAL PROCESSING"));
        this.movieList.add(new Subjects("VLSI DESIGN"));
        this.movieList.add(new Subjects("PROJECT MANAGEMENT & STRUCTURED FINANCE"));
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
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Ms.class));
                }
                else if (n == 1) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Dwdm.class));
                }
                else if (n == 2) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Se.class));
                }
                else if (n == 3) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Ooad.class));
                }
                else if (n == 4) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Spm.class));
                }
                else if (n == 5) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Cd.class));
                }
                else if (n == 6) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Ms.class));
                }
                else if (n == 7) {
                    Ecm4sub.this.startActivity(new Intent((Context)Ecm4sub.this, (Class)Cn.class));
                }
                else {
                    Toast.makeText(Ecm4sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
