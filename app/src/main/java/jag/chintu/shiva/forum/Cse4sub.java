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

public class Cse4sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Cse4sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("SOFTWARE TESING(ST)"));
        this.movieList.add(new Subjects("MANAGEMENT SCIENCE(MS)"));
        this.movieList.add(new Subjects("MOBILE COMPUTING(MC)"));
        this.movieList.add(new Subjects("DATA MINING & DATA WAREHOUSE(DWDM)"));
        this.movieList.add(new Subjects("ENVIRONMENTAL STUDIES(ES)"));
        this.movieList.add(new Subjects("Culture, Values,Professional Ethics and IPR(CVIPR)"));
        this.movieList.add(new Subjects("ADVANCED COMPUTER ARCHITECTURE(ACA)"));
        this.movieList.add(new Subjects("SCRIPTING LANGUAGE(SL)"));
        this.movieList.add(new Subjects("CLOUD COMPUTING(CC)"));
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
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)St.class));
                }
                else if (n == 1) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Ms.class));
                }
                else if (n == 2) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Mc.class));
                }
                else if (n == 3) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Dwdm.class));
                }
                else if (n == 4) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Es.class));
                }
                else if (n == 5) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Cvipr.class));
                }
                else if (n == 6) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Aca.class));
                }
                else if (n == 7) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Sl.class));
                }
                else if (n == 8) {
                    Cse4sub.this.startActivity(new Intent((Context)Cse4sub.this, (Class)Cc.class));
                }
                else {
                    Toast.makeText(Cse4sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", Toast.LENGTH_SHORT).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
