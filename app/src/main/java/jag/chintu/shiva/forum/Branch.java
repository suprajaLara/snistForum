package jag.chintu.shiva.forum;

import com.github.clans.fab.*;
import java.util.*;

import android.app.AlertDialog;
//import android.support.v7.widget.*;
import android.widget.*;
//import android.support.v7.app.*;
import android.os.*;
import android.view.*;
import android.content.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Branch extends AppCompatActivity
{
    private FloatingActionButton ak;
    private ArrayList deom;
    private FloatingActionButton frn;
    private FloatingActionButton rams;
    private TextView textView;
    
    public void intiative() {
        final RecyclerView recyclerView = (RecyclerView)this.findViewById(R.id.rcv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getApplicationContext()));
        (this.deom = new ArrayList()).add(new Deom("Electronics and Communication", 2130837641));
        this.deom.add(new Deom("Electrical Engineering", 2130837643));
        this.deom.add(new Deom("Compute Science", 2130837636));
        this.deom.add(new Deom("Information Technology", 2130837671));
        this.deom.add(new Deom("Electronics and Computers", 2130837642));
        this.deom.add(new Deom("Mechanical Engineering", 2130837675));
        recyclerView.setAdapter((RecyclerView.Adapter)new RVAdapter(this.deom));
        recyclerView.addOnItemTouchListener((RecyclerView.OnItemTouchListener)new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(Branch.this.getApplicationContext(), (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener() {
                public boolean onSingleTapUp(final MotionEvent motionEvent) {
                    return true;
                }
            });
            
            @Override
            public boolean onInterceptTouchEvent(final RecyclerView recyclerView, final MotionEvent motionEvent) {
                final View childViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (childViewUnder != null && this.gestureDetector.onTouchEvent(motionEvent)) {
                    final int childAdapterPosition = recyclerView.getChildAdapterPosition(childViewUnder);
                    if (childAdapterPosition == 0) {
                        Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Eceyears.class));
                    }
                    else if (childAdapterPosition == 1) {
                        Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Eeeyears.class));
                    }
                    else if (childAdapterPosition == 2) {
                        Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Cseyears.class));
                    }
                    else if (childAdapterPosition == 3) {
                        Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Ityears.class));
                    }
                    else if (childAdapterPosition == 4) {
                        Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Ecmyears.class));
                    }
                    else if (childAdapterPosition == 5) {
                        Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Mechyears.class));
                    }
                    else {
                        Toast.makeText(Branch.this.getApplicationContext(), (CharSequence)"orange", Toast.LENGTH_SHORT).show();
                    }
                }
                return false;
            }
            
            @Override
            public void onRequestDisallowInterceptTouchEvent(final boolean b) {
            }
            
            @Override
            public void onTouchEvent(final RecyclerView recyclerView, final MotionEvent motionEvent) {
            }
        });
    }
    
    @Override
    public void onBackPressed() {

        new AlertDialog.Builder((Context)this).setIcon(17301543).setTitle("Exit").setMessage("Are you sure?").setPositiveButton("yes", (DialogInterface.OnClickListener)new DialogInterface.OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n) {
                final Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(268435456);
                Branch.this.startActivity(intent);
                Branch.this.finish();
            }
        }).setNegativeButton("no", null).show();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_branch);
        this.textView = (TextView)this.findViewById(R.id.name);
        (this.ak = (FloatingActionButton)this.findViewById(R.id.button_deep)).setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Aboutus.class));
            }
        });
        (this.rams = (FloatingActionButton)this.findViewById(R.id.button_ak)).setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                Branch.this.startActivity(new Intent((Context)Branch.this, (Class)Frm.class));
            }
        });
        (this.frn = (FloatingActionButton)this.findViewById(R.id.button_rams)).setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                final SharedPreferences.Editor edit = Branch.this.getSharedPreferences("MyPrefs", 0).edit();
                edit.clear();
                edit.commit();
                Toast.makeText(Branch.this.getApplicationContext(), (CharSequence)"logged out", Toast.LENGTH_LONG).show();
                Branch.this.startActivity(new Intent((Context)Branch.this, (Class)MainActivity.class));
            }
        });
        this.intiative();
    }
}
