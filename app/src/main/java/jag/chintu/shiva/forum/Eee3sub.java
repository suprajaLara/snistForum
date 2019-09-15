package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Eee3sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Eee3sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Data Base System"));
        this.movieList.add(new Subjects("Managerial Economics and Financial Analysis"));
        this.movieList.add(new Subjects("GME"));
        this.movieList.add(new Subjects("PSD"));
        this.movieList.add(new Subjects("Linear and Digital IC Applications"));
        this.movieList.add(new Subjects("Power Systems-III"));
        this.movieList.add(new Subjects("Measurements & Instrumentation"));
        this.movieList.add(new Subjects("Utilization of Electrical Energy"));
        this.movieList.add(new Subjects("Power Electronics"));
        this.movieList.add(new Subjects("Electrical Machines-III"));
        this.movieList.add(new Subjects("Microprocessor & Microcontrollers"));
        this.movieList.add(new Subjects("Power Systems-II"));
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
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Dbms.class));
                }
                else if (n == 1) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Mefa.class));
                }
                else if (n == 2) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Gme.class));
                }
                else if (n == 3) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Psd.class));
                }
                else if (n == 4) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Ldic.class));
                }
                else if (n == 5) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Ps3.class));
                }
                else if (n == 6) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Mi.class));
                }
                else if (n == 7) {
                    Eee3sub.this.startActivity(new Intent((Context)Eee3sub.this, (Class)Uee.class));
                }
                else {
                    Toast.makeText(Eee3sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
