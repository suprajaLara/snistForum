package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Eee4sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Eee4sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Culture, Values,Professional Ethics and IPR"));
        this.movieList.add(new Subjects("Environmental Studies"));
        this.movieList.add(new Subjects("Data Base Management Systems"));
        this.movieList.add(new Subjects("Non conventional Sources of Energy"));
        this.movieList.add(new Subjects("Power Semi Conductor Drives"));
        this.movieList.add(new Subjects("Power Station Practice"));
        this.movieList.add(new Subjects("Project Management & Structured Finance"));
        this.movieList.add(new Subjects("Electrical Distribution System"));
        this.movieList.add(new Subjects("Control of Electric Drives"));
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
                    Eee4sub.this.startActivity(new Intent((Context)Eee4sub.this, (Class)Cvipr.class));
                }
                else if (n == 1) {
                    Eee4sub.this.startActivity(new Intent((Context)Eee4sub.this, (Class)Es.class));
                }
                else if (n == 2) {
                    Eee4sub.this.startActivity(new Intent((Context)Eee4sub.this, (Class)Dbms.class));
                }
                else {
                    Toast.makeText(Eee4sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
