package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class It4sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public It4sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Culture, Values,Professional Ethics and IPR(CVIPR)"));
        this.movieList.add(new Subjects("MANAGEMENT SCIENCE"));
        this.movieList.add(new Subjects("CRYPTOGRAPHY& NETWORK SECURITY"));
        this.movieList.add(new Subjects("ENVIRONMENTAL STUDIES"));
        this.movieList.add(new Subjects("SOFTWARE TESING"));
        this.movieList.add(new Subjects("WEB TECHNOLOGY"));
        this.movieList.add(new Subjects("MOBILE COMPUTING"));
        this.movieList.add(new Subjects("SCRIPTING LANGUAGE"));
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
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Cvipr.class));
                }
                else if (n == 1) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Ms.class));
                }
                else if (n == 2) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Cn.class));
                }
                else if (n == 3) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Es.class));
                }
                else if (n == 4) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)St.class));
                }
                else if (n == 5) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Wt.class));
                }
                else if (n == 6) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Mc.class));
                }
                else if (n == 7) {
                    It4sub.this.startActivity(new Intent((Context)It4sub.this, (Class)Sl.class));
                }
                else {
                    Toast.makeText(It4sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
