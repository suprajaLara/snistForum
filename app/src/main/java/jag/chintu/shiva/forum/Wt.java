package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import android.content.*;
import java.util.*;
import android.os.*;
import android.support.v7.widget.*;
import com.google.firebase.database.*;

public class Wt extends AppCompatActivity
{
    DatabaseReference db;
    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;
    ArrayList<Row> rows;
    RecyclerViewAdapter rva;
    
    public Wt() {
        this.rows = new ArrayList<Row>();
    }
    
    void datachanged(final DataSnapshot dataSnapshot) {
        this.rows = new ArrayList<Row>();
        final Iterator<DataSnapshot> iterator = dataSnapshot.getChildren().iterator();
        while (iterator.hasNext()) {
            this.rows.add(iterator.next().getValue(Row.class));
            this.rva = new RecyclerViewAdapter((Context)this, this.rows);
            this.recyclerView.setAdapter((RecyclerView.Adapter)this.rva);
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968609);
        this.recyclerView = (RecyclerView)this.findViewById(2131493046);
        this.rows = new ArrayList<Row>();
        this.linearLayoutManager = new LinearLayoutManager((Context)this);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)this.linearLayoutManager);
        this.recyclerView.setItemAnimator((RecyclerView.ItemAnimator)new DefaultItemAnimator());
        (this.db = FirebaseDatabase.getInstance().getReference("wt")).addValueEventListener(new ValueEventListener() {
            @Override
            public void onCancelled(final DatabaseError databaseError) {
            }
            
            @Override
            public void onDataChange(final DataSnapshot dataSnapshot) {
                Wt.this.datachanged(dataSnapshot);
            }
        });
    }
}
