package jag.chintu.shiva.forum;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
//import android.support.v7.app.*;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{
    TextView quote;
    TextView signin;
    TextView signup;
    
    @Override
    public void onBackPressed() {

        new AlertDialog.Builder((Context)this).setIcon(17301543).setTitle("Exit").setMessage("Are you sure?").setPositiveButton("yes", (DialogInterface.OnClickListener)new DialogInterface.OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n) {
                final Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(268435456);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        }).setNegativeButton("no", null).show();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_main);
        this.signin = (TextView)this.findViewById(R.id.signin);
        this.signup = (TextView)this.findViewById(R.id.signup);
        this.quote = (TextView)this.findViewById(R.id.quote);
        final Typeface fromAsset = Typeface.createFromAsset(this.getAssets(), "bot1.ttf");
        this.signin.setTypeface(fromAsset);
        this.signup.setTypeface(fromAsset);
        this.quote.setTypeface(fromAsset);
        this.signin.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                MainActivity.this.startActivity(new Intent((Context)MainActivity.this, (Class)Signin.class));
            }
        });
        this.signup.setOnClickListener((View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View view) {
                MainActivity.this.startActivity(new Intent((Context)MainActivity.this, (Class)Signup.class));
            }
        });
    }
}
