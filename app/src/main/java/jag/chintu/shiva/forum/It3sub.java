package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;
import android.widget.*;

public class It3sub extends AppCompatActivity
{
    private SubjectsAdapter mAdapter;
    private List<Subjects> movieList;
    private RecyclerView recyclerView;
    
    public It3sub() {
        this.movieList = new ArrayList<Subjects>();
    }
    
    private void prepareMovieData() {
        this.movieList.add(new Subjects("DATA MINING & DATA WAREHOUSE(DWDM)"));
        this.movieList.add(new Subjects("COMPUTER NETWORKS"));
        this.movieList.add(new Subjects("ENVIRONMENTAL STUDIES"));
        this.movieList.add(new Subjects("OPERATING SYSTEM"));
        this.movieList.add(new Subjects("OPERATIONAL RESEARCH"));
        this.movieList.add(new Subjects("THEROY OF COMPUTATION"));
        this.movieList.add(new Subjects("MICROPROCESSOR & INTERFACING"));
        this.movieList.add(new Subjects("MANERGERIAL ECONOMICS & FINANCIAL ANALYSIS(MEFA)"));
        this.movieList.add(new Subjects("BANKING OPERATIONS INSURANCE AND RISK MANAGEMENT(BOIRM)"));
        this.movieList.add(new Subjects("CLOUD COMPUTING"));
        this.movieList.add(new Subjects("COMPILER DESIGN"));
        this.movieList.add(new Subjects("SOFTWARE ENGINEERING"));
        this.movieList.add(new Subjects("OBJECT ORIENTED ANALYSIS AND DESIGN(OOAD)"));
        this.movieList.add(new Subjects("PRODUCT & SERVICE DESIGN"));
        this.movieList.add(new Subjects("Entrepreneurship"));
        this.movieList.add(new Subjects("GME"));
        this.movieList.add(new Subjects("SAP"));
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
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Dwdm.class));
                }
                else if (n == 1) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Cn.class));
                }
                else if (n == 2) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Es.class));
                }
                else if (n == 3) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Os.class));
                }
                else if (n == 4) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Or.class));
                }
                else if (n == 5) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Toc.class));
                }
                else if (n == 6) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Compi.class));
                }
                else if (n == 7) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Mefa.class));
                }
                else if (n == 8) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Boirm.class));
                }
                else if (n == 9) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Cc.class));
                }
                else if (n == 10) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Cd.class));
                }
                else if (n == 11) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Se.class));
                }
                else if (n == 12) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Ooad.class));
                }
                else if (n == 13) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Psd.class));
                }
                else if (n == 14) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Ent.class));
                }
                else if (n == 15) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Gme.class));
                }
                else if (n == 16) {
                    It3sub.this.startActivity(new Intent((Context)It3sub.this, (Class)Sap.class));
                }
                else {
                    Toast.makeText(It3sub.this.getApplicationContext(), (CharSequence)"Notes related to this subject will be uploaded soon!", 0).show();
                }
            }
            
            @Override
            public void onLongItemClick(final View view, final int n) {
            }
        }));
        this.prepareMovieData();
    }
}
