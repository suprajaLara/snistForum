package jag.chintu.shiva.forum;

//import android.support.v7.app.*;
import android.os.*;
import android.graphics.*;
import android.view.*;
import android.text.*;
import android.widget.*;
import com.google.firebase.auth.*;
import com.google.android.gms.tasks.*;
//import android.support.annotation.*;
import android.content.*;
import android.app.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity
{
    private FirebaseAuth auth;
    ImageView back;
    private EditText inputEmail;
    private EditText inputPassword;
    private EditText inputusername;
    TextView signup;
    TextView topsignup;
    
    @Override
    public void onBackPressed() {
        this.startActivity(new Intent((Context)this, (Class)MainActivity.class));
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_signup);
        this.auth = FirebaseAuth.getInstance();
        this.inputEmail = (EditText)this.findViewById(2131493052);
        this.inputPassword = (EditText)this.findViewById(2131493050);
        this.inputusername = (EditText)this.findViewById(2131493049);
        this.signup = (TextView)this.findViewById(2131493044);
        this.topsignup = (TextView)this.findViewById(2131493051);
        final Typeface fromAsset = Typeface.createFromAsset(this.getAssets(), "bot1.ttf");
        this.signup.setTypeface(fromAsset);
        this.inputEmail.setTypeface(fromAsset);
        this.inputusername.setTypeface(fromAsset);
        this.inputPassword.setTypeface(fromAsset);
        this.topsignup.setTypeface(fromAsset);
        this.signup.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                final String trim = Signup.this.inputEmail.getText().toString().trim();
                final String trim2 = Signup.this.inputPassword.getText().toString().trim();
                if (TextUtils.isEmpty((CharSequence)trim)) {
                    Toast.makeText(Signup.this.getApplicationContext(), (CharSequence)"Enter email address!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty((CharSequence)trim2)) {
                    Toast.makeText(Signup.this.getApplicationContext(), (CharSequence)"Enter password!", Toast.LENGTH_SHORT).show();
                }
                else if (trim2.length() < 6) {
                    Toast.makeText(Signup.this.getApplicationContext(), (CharSequence)"Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Signup.this.auth.createUserWithEmailAndPassword(trim, trim2).addOnCompleteListener(Signup.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull final Task<AuthResult> task) {
                            Toast.makeText((Context)Signup.this, (CharSequence)("createUserWithEmail:onComplete:" + task.isSuccessful()), Toast.LENGTH_SHORT).show();
                            if (!task.isSuccessful()) {
                                Toast.makeText((Context)Signup.this, (CharSequence)("Authentication failed." + task.getException()), Toast.LENGTH_SHORT).show();
                            }
                            else {
                                final SharedPreferences.Editor edit = Signup.this.getSharedPreferences("MyPrefs", 0).edit();
                                edit.clear();
                                edit.commit();
                                Toast.makeText(Signup.this.getApplicationContext(), (CharSequence)"Login to access forum", Toast.LENGTH_LONG).show();
                                Signup.this.finish();
                            }
                        }
                    });
                }
            }
        });
    }
}
