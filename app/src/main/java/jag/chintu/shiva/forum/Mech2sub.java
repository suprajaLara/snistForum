package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Mech2sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Mech2sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Elements of Electronics Engineering"));
        this.movieList.add(new Subjects("Probability and Statistics"));
        this.movieList.add(new Subjects("Operations Research"));
        this.movieList.add(new Subjects("Fluied Mechanic and Hydralic Machinery"));
        this.movieList.add(new Subjects("Mechanics of Solids"));
        this.movieList.add(new Subjects("Metallurgy & Material Science"));
        this.movieList.add(new Subjects("Thermodynamics"));
        this.movieList.add(new Subjects("Applied Thermodynamics - I"));
        this.movieList.add(new Subjects("Manufacturing Processes"));
        this.movieList.add(new Subjects("Elements of Electrical Engineering"));
        this.movieList.add(new Subjects("Machine Drawing and Computer aided drawing"));
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
                    Mech2sub.this.startActivity(new Intent((Context)Mech2sub.this, (Class)Edc.class));
                }
                else if (n == 1) {
                    Mech2sub.this.startActivity(new Intent((Context)Mech2sub.this, (Class)PS.class));
                }
                else if (n == 2) {
                    Mech2sub.this.startActivity(new Intent((Context)Mech2sub.this, (Class)Or.class));
                }
                else {
                    Toast.makeText(Mech2sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
