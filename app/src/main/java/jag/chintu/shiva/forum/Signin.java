package jag.chintu.shiva.forum;

//import android.support.v7.app.*;
import android.os.*;
import android.widget.*;
import android.graphics.*;
import android.view.*;
import android.text.*;
import com.google.firebase.auth.*;
import com.google.android.gms.tasks.*;
import android.support.annotation.*;
import android.content.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.*;

public class Signin extends AppCompatActivity
{
    public static final String IS_USER_LOGIN = "IsUserLoggedIn";
    public static final String MyPREFERENCES = "MyPrefs";
    public static String uname;
    public static String uname1;
    private FirebaseAuth auth;
    ImageView back;
    private EditText inputEmail;
    private EditText inputPassword;
    SharedPreferences sharedpreferences;
    private TextView signin;
    private TextView topsignin;
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.sharedpreferences = this.getSharedPreferences("MyPrefs", 0);
        if (this.sharedpreferences.getBoolean("IsUserLoggedIn", false)) {
            this.startActivity(new Intent((Context)this, (Class)Branch.class));
        }
        this.setContentView(R.layout.activity_signin);
        this.auth = FirebaseAuth.getInstance();
        Toast.makeText((Context)this, (CharSequence)"welcome", Toast.LENGTH_LONG).show();
        this.inputEmail = (EditText)this.findViewById(R.id.username);
        this.inputPassword = (EditText)this.findViewById(R.id.password);
        this.signin = (TextView)this.findViewById(R.id.signin);
        this.topsignin = (TextView)this.findViewById(R.id.topsignin);
        this.back = (ImageView)this.findViewById(R.id.back);
        final Typeface fromAsset = Typeface.createFromAsset(this.getAssets(), "bot1.ttf");
        this.signin.setTypeface(fromAsset);
        this.topsignin.setTypeface(fromAsset);
        this.inputEmail.setTypeface(fromAsset);
        this.inputPassword.setTypeface(fromAsset);
        this.signin.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                final String string = Signin.this.inputEmail.getText().toString();
                final String string2 = Signin.this.inputPassword.getText().toString();
                if (TextUtils.isEmpty((CharSequence)string)) {
                    Toast.makeText(Signin.this.getApplicationContext(), (CharSequence)"Enter email address!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty((CharSequence)string2)) {
                    Toast.makeText(Signin.this.getApplicationContext(), (CharSequence)"Enter password!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Signin.this.auth.signInWithEmailAndPassword(string, string2).addOnCompleteListener(Signin.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull final Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                if (string2.length() < 6) {
                                    Toast.makeText(Signin.this.getApplicationContext(), (CharSequence)"Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    Toast.makeText((Context)Signin.this, (CharSequence)"authfailed", Toast.LENGTH_LONG).show();
                                }
                            }
                            else {
                                Signin.uname = Signin.this.inputEmail.getText().toString();
                                final SharedPreferences.Editor edit = Signin.this.sharedpreferences.edit();
                                edit.putBoolean("IsUserLoggedIn", true);
                                edit.putString("use", Signin.uname);
                                edit.commit();
                                Toast.makeText((Context)Signin.this, (CharSequence)"Loggedin Succesfully", Toast.LENGTH_LONG).show();
                                Signin.this.startActivity(new Intent((Context)Signin.this, (Class)Branch.class));
                            }
                        }
                    });
                }
            }
        });
        this.back.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                Signin.this.startActivity(new Intent((Context)Signin.this, (Class)MainActivity.class));
            }
        });
    }
}
