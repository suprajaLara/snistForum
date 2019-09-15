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

public class Cse3sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public Cse3sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("OPERATING SYSTEMS(OS)"));
        this.movieList.add(new Subjects("COMPUTER NETWORKS(CN)"));
        this.movieList.add(new Subjects("THEORY OF COMPUTATION(TOC)"));
        this.movieList.add(new Subjects("OPERATIONS RESEARCH(OR)"));
        this.movieList.add(new Subjects("OBJECT ORIENTED ANALYSIS AND DESIGN(OOAD)"));
        this.movieList.add(new Subjects("SOFTWARE ENGINEERING(SE)"));
        this.movieList.add(new Subjects("WEB TECHNOLOGIES(WT)"));
        this.movieList.add(new Subjects("COMPUTER GRAPHICS(CG)"));
        this.movieList.add(new Subjects("COMPILER DESIGN(CD)"));
        this.movieList.add(new Subjects("INFORMATION SECURITY(IS)"));
        this.movieList.add(new Subjects("BANKING OPERATIONS INSURANCE AND RISK MANAGEMENT(BOIRM)"));
        this.movieList.add(new Subjects("ENTREPRENURSHIP(ENT)"));
        this.movieList.add(new Subjects("SOFTWARE PROJECT MANAGEMENT"));
        this.movieList.add(new Subjects("Product & Service Design"));
        this.movieList.add(new Subjects("GME"));
        this.movieList.add(new Subjects("SAP"));
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
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Os.class));
                }
                else if (n == 1) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Cn.class));
                }
                else if (n == 2) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Toc.class));
                }
                else if (n == 3) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Or.class));
                }
                else if (n == 4) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Ooad.class));
                }
                else if (n == 5) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Se.class));
                }
                else if (n == 6) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Wt.class));
                }
                else if (n == 7) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Cg.class));
                }
                else if (n == 8) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Cd.class));
                }
                else if (n == 9) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Is.class));
                }
                else if (n == 10) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Boirm.class));
                }
                else if (n == 11) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Ent.class));
                }
                else if (n == 12) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Spm.class));
                }
                else if (n == 13) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Psd.class));
                }
                else if (n == 14) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Gme.class));
                }
                else if (n == 15) {
                    Cse3sub.this.startActivity(new Intent((Context)Cse3sub.this, (Class)Sap.class));
                }
                else {
                    Toast.makeText(Cse3sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", Toast.LENGTH_SHORT).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
