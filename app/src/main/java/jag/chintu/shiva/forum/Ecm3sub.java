package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Ecm3sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Ecm3sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("MEFA"));
        this.movieList.add(new Subjects("BIORM"));
        this.movieList.add(new Subjects("COMPUTER ORAGNISATION & ARCHITECTURE"));
        this.movieList.add(new Subjects("DATA COMMUNINCATION"));
        this.movieList.add(new Subjects("COMPUTER NETWORKS"));
        this.movieList.add(new Subjects("OPERATING SYSTEM"));
        this.movieList.add(new Subjects("DESIGN & ANALYSIS OF ALGORITHMS"));
        this.movieList.add(new Subjects("SHELL PROGRAMMING & SCRIPTING LANGUAGE"));
        this.movieList.add(new Subjects("PSD"));
        this.movieList.add(new Subjects("LDIC"));
        this.movieList.add(new Subjects("GME"));
        this.movieList.add(new Subjects("MULTIMEDA & APPLICATION DEVELOPMENT"));
        this.movieList.add(new Subjects("SIGNALS & MODULATION THEORY"));
        this.movieList.add(new Subjects("MICROPROCESSOR & MICRO CONTROLLERS"));
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
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Mefa.class));
                }
                else if (n == 1) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Boirm.class));
                }
                else if (n == 2) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Co.class));
                }
                else if (n == 3) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Dc.class));
                }
                else if (n == 4) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Cn.class));
                }
                else if (n == 5) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Os.class));
                }
                else if (n == 6) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Daa.class));
                }
                else if (n == 7) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Sl.class));
                }
                else if (n == 8) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Psd.class));
                }
                else if (n == 9) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Ldic.class));
                }
                else if (n == 10) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Gme.class));
                }
                else if (n == 13) {
                    Ecm3sub.this.startActivity(new Intent((Context)Ecm3sub.this, (Class)Mpmc.class));
                }
                else {
                    Toast.makeText(Ecm3sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
