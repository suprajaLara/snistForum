package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Ece4sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Ece4sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("MANAGEMENT SCIENCE"));
        this.movieList.add(new Subjects("COMPUTER NETWORKS"));
        this.movieList.add(new Subjects("Culture, Values,Professional Ethics&IPR"));
        this.movieList.add(new Subjects("CELLULAR & MOBILE COMMINICATION"));
        this.movieList.add(new Subjects("VLSI TECHNOLOGY & DESIGN"));
        this.movieList.add(new Subjects("OPTICAL COMMUNICATION"));
        this.movieList.add(new Subjects("MICROWAVE ENGINEERING"));
        this.movieList.add(new Subjects("Wireless Communication Networks "));
        this.movieList.add(new Subjects("Radar Systems"));
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
                    Ece4sub.this.startActivity(new Intent((Context)Ece4sub.this, (Class)Ms.class));
                }
                else if (n == 1) {
                    Ece4sub.this.startActivity(new Intent((Context)Ece4sub.this, (Class)Cn.class));
                }
                else if (n == 2) {
                    Ece4sub.this.startActivity(new Intent((Context)Ece4sub.this, (Class)Cvipr.class));
                }
                else {
                    Toast.makeText(Ece4sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
