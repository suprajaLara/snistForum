package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import android.widget.*;
import java.text.*;
import java.util.*;
import android.content.*;
import android.os.*;
import com.google.firebase.database.*;
import android.view.*;

public class Frmpost extends AppCompatActivity
{
    Button button;
    DatabaseReference db;
    TextView pname;
    EditText ppost;
    String s;
    String s1;
    
    void addData(final View view) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        final Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        this.db.push().setValue(new Frmrow(this.pname.getText().toString(), this.ppost.getText().toString(), simpleDateFormat.format(date).toString()));
        this.ppost.setText((CharSequence)"");
        this.startActivity(new Intent((Context)this, (Class)Frm.class));
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968607);
        this.pname = (TextView)this.findViewById(2131493039);
        this.ppost = (EditText)this.findViewById(2131493040);
        this.db = FirebaseDatabase.getInstance().getReference("posts");
        this.button = (Button)this.findViewById(2131493041);
        this.pname.setText((CharSequence)this.getSharedPreferences("MyPrefs", 0).getString("use", (String)null));
        this.button.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Frmpost.this.addData(view);
            }
        });
    }
}
