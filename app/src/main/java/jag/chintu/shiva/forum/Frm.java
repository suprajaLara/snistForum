package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import android.support.v7.widget.*;
import java.util.*;
import android.content.*;
import android.os.*;
import android.support.design.widget.*;
import android.view.*;
import com.google.firebase.database.*;

public class Frm extends AppCompatActivity
{
    DatabaseReference db;
    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;
    ArrayList<Frmrow> rows;
    FrmViewAdapter rva;
    
    public Frm() {
        this.rows = new ArrayList<Frmrow>();
    }
    
    void datachanged(final DataSnapshot dataSnapshot) {
        this.rows = new ArrayList<Frmrow>();
        final Iterator<DataSnapshot> iterator = dataSnapshot.getChildren().iterator();
        while (iterator.hasNext()) {
            this.rows.add(iterator.next().getValue(Frmrow.class));
            this.rva = new FrmViewAdapter((Context)this, this.rows);
            this.recyclerView.setAdapter((RecyclerView.Adapter)this.rva);
        }
    }
    
    @Override
    public void onBackPressed() {
        this.startActivity(new Intent((Context)this, (Class)Branch.class));
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968606);
        this.recyclerView = (RecyclerView)this.findViewById(2131493046);
        this.rows = new ArrayList<Frmrow>();
        this.linearLayoutManager = new LinearLayoutManager((Context)this);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)this.linearLayoutManager);
        this.db = FirebaseDatabase.getInstance().getReference("posts");
        ((FloatingActionButton)this.findViewById(2131493031)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Frm.this.startActivity(new Intent((Context)Frm.this, (Class)Frmpost.class));
            }
        });
        this.db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onCancelled(final DatabaseError databaseError) {
            }
            
            @Override
            public void onDataChange(final DataSnapshot dataSnapshot) {
                Frm.this.datachanged(dataSnapshot);
            }
        });
    }
}
