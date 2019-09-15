package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class Mech3sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Mech3sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("Managerial Economics & Financial Analysis"));
        this.movieList.add(new Subjects("Data Base Management Systems"));
        this.movieList.add(new Subjects("Environmental Studies)"));
        this.movieList.add(new Subjects("Product & Service Design"));
        this.movieList.add(new Subjects("Applied Thermodynamics-II"));
        this.movieList.add(new Subjects("Design of Machine Members-I"));
        this.movieList.add(new Subjects("Kinematics of Machinery"));
        this.movieList.add(new Subjects("Metal Cutting & Machine Tools)"));
        this.movieList.add(new Subjects("Design of Machine Members-I)"));
        this.movieList.add(new Subjects("Automobile Engineering"));
        this.movieList.add(new Subjects("Principle of Finite Element Method"));
        this.movieList.add(new Subjects("Heat Transfer"));
        this.movieList.add(new Subjects("Dynamics of Machinery"));
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
                    Mech3sub.this.startActivity(new Intent((Context)Mech3sub.this, (Class)Mefa.class));
                }
                else if (n == 1) {
                    Mech3sub.this.startActivity(new Intent((Context)Mech3sub.this, (Class)Dbms.class));
                }
                else if (n == 2) {
                    Mech3sub.this.startActivity(new Intent((Context)Mech3sub.this, (Class)Es.class));
                }
                else if (n == 3) {
                    Mech3sub.this.startActivity(new Intent((Context)Mech3sub.this, (Class)Psd.class));
                }
                else {
                    Toast.makeText(Mech3sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
