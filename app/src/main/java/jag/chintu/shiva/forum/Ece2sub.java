package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Ece2sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Ece2sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("NETWORK ANALYSIS(NA)"));
        this.movieList.add(new Subjects("PROBABILITY AND STATISTICS"));
        this.movieList.add(new Subjects("BASIC MECHANICAL ENGINEERING(BME)"));
        this.movieList.add(new Subjects("ENVIRONMENTAL STUDIES"));
        this.movieList.add(new Subjects("SWITCHING THEORY AND LOGIC DESIGN"));
        this.movieList.add(new Subjects("ELECTRICAL TECHNOLOGY(ET)"));
        this.movieList.add(new Subjects("ELECTRONIC CIRCUIT ANALYSIS"));
        this.movieList.add(new Subjects("SIGNALS AND SYSTEMS"));
        this.movieList.add(new Subjects("PULSE AND DIGITAL CIRCUITS"));
        this.movieList.add(new Subjects("ELECTROMAGNETIC THEORY AND TRANSMISSION LINES"));
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
                    Ece2sub.this.startActivity(new Intent((Context)Ece2sub.this, (Class)Na.class));
                }
                else if (n == 1) {
                    Ece2sub.this.startActivity(new Intent((Context)Ece2sub.this, (Class)PS.class));
                }
                else if (n == 2) {
                    Ece2sub.this.startActivity(new Intent((Context)Ece2sub.this, (Class)Bme.class));
                }
                else if (n == 3) {
                    Ece2sub.this.startActivity(new Intent((Context)Ece2sub.this, (Class)Es.class));
                }
                else {
                    Toast.makeText(Ece2sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
