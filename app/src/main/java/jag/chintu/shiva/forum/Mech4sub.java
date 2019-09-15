package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Mech4sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Mech4sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Culture, Values, Professional Ethics and IPR"));
        this.movieList.add(new Subjects("Operations Research"));
        this.movieList.add(new Subjects("Management Science"));
        this.movieList.add(new Subjects("Power Plant Engineering"));
        this.movieList.add(new Subjects("Principle of Finite Element Methods"));
        this.movieList.add(new Subjects("Refrigeration and Air Conditioning"));
        this.movieList.add(new Subjects("Automobile Engineering"));
        this.movieList.add(new Subjects("Project Management and Structured Finance"));
        this.movieList.add(new Subjects("Automation in Manufacturing"));
        this.movieList.add(new Subjects("Composite Materail"));
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
                    Mech4sub.this.startActivity(new Intent((Context)Mech4sub.this, (Class)Cvipr.class));
                }
                else if (n == 1) {
                    Mech4sub.this.startActivity(new Intent((Context)Mech4sub.this, (Class)Or.class));
                }
                else if (n == 2) {
                    Mech4sub.this.startActivity(new Intent((Context)Mech4sub.this, (Class)Ms.class));
                }
                else {
                    Toast.makeText(Mech4sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
