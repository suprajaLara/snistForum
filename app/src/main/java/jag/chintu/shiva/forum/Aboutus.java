package jag.chintu.shiva.forum;

import android.support.v7.app.*;
import android.support.design.widget.*;
import android.view.animation.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.net.*;
import android.content.*;

public class Aboutus extends AppCompatActivity
{
    private static final int[] DRAWABLE;
    FlipCardAnimation animation;
    FlipCardAnimation animation1;
    FlipCardAnimation animation_item;
    FlipCardAnimation animation_item1;
    FloatingActionButton floatingActionButton;
    ImageView iv_pro;
    ImageView iv_pro_item;
    ImageView iv_pro_item1;
    ImageView iv_pro_item12;
    int num;
    int num1;
    int num2;
    int num3;
    
    static {
        DRAWABLE = new int[] { 2130837653, 2130837669, 2130837654, 2130837669 };
    }
    
    private void startAnimation(FlipCardAnimation flipCardAnimation, final View view, final TextView textView, final TextView textView2, final TextView textView3, final TextView textView4, final TextView textView5, final TextView textView6, final TextView textView7, final TextView textView8, final TextView textView9, final ImageView imageView, final int n) {
        if (flipCardAnimation != null) {
            flipCardAnimation.setCanContentChange();
            view.startAnimation((Animation)flipCardAnimation);
        }
        else {
            flipCardAnimation = new FlipCardAnimation(0.0f, (float)n, (float)(view.getWidth() / 2), (float)(view.getHeight() / 2));
            flipCardAnimation.setInterpolator((Interpolator)new AnticipateOvershootInterpolator());
            flipCardAnimation.setDuration(3000L);
            flipCardAnimation.setFillAfter(false);
            flipCardAnimation.setRepeatCount(-1);
            flipCardAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                public void onAnimationEnd(final Animation animation) {
                }
                
                public void onAnimationRepeat(final Animation animation) {
                    ((FlipCardAnimation)animation).setCanContentChange();
                }
                
                public void onAnimationStart(final Animation animation) {
                }
            });
            flipCardAnimation.setOnContentChangeListener((FlipCardAnimation.OnContentChangeListener)new FlipCardAnimation.OnContentChangeListener() {
                @Override
                public void contentChange() {
                    if (imageView != null) {
                        if (Aboutus.this.num >= 3) {
                            Aboutus.this.num = 0;
                        }
                        imageView.setBackgroundResource(Aboutus.DRAWABLE[Aboutus.this.num]);
                        if (Aboutus.this.num < 3) {
                            textView2.setText((CharSequence)"Shiva Kumar Reddy");
                            textView6.setText((CharSequence)"itikalashiva@gmail.com");
                        }
                        if (Aboutus.this.num1 == 1) {
                            textView3.setText((CharSequence)"Jagdeeshwar Reddy");
                            textView7.setText((CharSequence)"jagadeeshwarr95@gmail.com");
                        }
                        if (Aboutus.this.num2 == 2) {
                            textView4.setText((CharSequence)"Sandeep Reddy");
                            textView8.setText((CharSequence)"sandeep.peesarla08@gmail.com ");
                        }
                        if (Aboutus.this.num3 == 3) {
                            textView5.setText((CharSequence)"Chanukyanaik Bhukya");
                            textView9.setText((CharSequence)"bhukyachanukyanaik21@gmail.com");
                        }
                        final Aboutus this$0 = Aboutus.this;
                        ++this$0.num;
                    }
                }
            });
            view.startAnimation((Animation)flipCardAnimation);
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968602);
        final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131493015);
        final LinearLayout linearLayout2 = (LinearLayout)this.findViewById(2131493019);
        final LinearLayout linearLayout3 = (LinearLayout)this.findViewById(2131493027);
        final LinearLayout linearLayout4 = (LinearLayout)this.findViewById(2131493023);
        final View viewById = this.findViewById(2131493014);
        this.iv_pro = (ImageView)this.findViewById(2131493016);
        this.iv_pro_item = (ImageView)this.findViewById(2131493020);
        this.iv_pro_item1 = (ImageView)this.findViewById(2131493028);
        this.iv_pro_item12 = (ImageView)this.findViewById(2131493024);
        final TextView textView = (TextView)this.findViewById(2131493022);
        final TextView textView2 = (TextView)this.findViewById(2131493030);
        final TextView textView3 = (TextView)this.findViewById(2131493026);
        final TextView textView4 = (TextView)this.findViewById(2131493017);
        final TextView textView5 = (TextView)this.findViewById(2131493021);
        final TextView textView6 = (TextView)this.findViewById(2131493029);
        final TextView textView7 = (TextView)this.findViewById(2131493025);
        final TextView textView8 = (TextView)this.findViewById(2131493018);
        (this.floatingActionButton = (FloatingActionButton)this.findViewById(2131493031)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Aboutus.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/snistforum/")));
            }
        });
        linearLayout.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Aboutus.this.num = 0;
                textView4.setText((CharSequence)"Devloper");
                textView8.setText((CharSequence)"8686134004");
                Aboutus.this.startAnimation(Aboutus.this.animation, (View)linearLayout, textView8, textView4, textView5, textView6, textView3, textView8, textView, textView2, textView3, Aboutus.this.iv_pro, 180);
                Aboutus.this.startAnimation(Aboutus.this.animation1, viewById, null, null, null, null, null, null, null, null, null, null, -180);
            }
        });
        linearLayout2.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Aboutus.this.num1 = 1;
                textView5.setText((CharSequence)"Devloper");
                textView.setText((CharSequence)"8019116553");
                Aboutus.this.startAnimation(Aboutus.this.animation_item, (View)linearLayout2, textView, textView4, textView5, textView6, textView7, textView8, textView, textView2, textView3, Aboutus.this.iv_pro_item, 180);
            }
        });
        linearLayout3.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Aboutus.this.num2 = 2;
                textView6.setText((CharSequence)"Devloper");
                textView2.setText((CharSequence)"7995920956");
                Aboutus.this.startAnimation(Aboutus.this.animation_item1, (View)linearLayout3, textView2, textView4, textView5, textView6, textView7, textView8, textView, textView2, textView3, Aboutus.this.iv_pro_item1, -180);
            }
        });
        linearLayout4.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                Aboutus.this.num3 = 3;
                textView7.setText((CharSequence)"Devloper");
                textView3.setText((CharSequence)"9963070632");
                Aboutus.this.startAnimation(Aboutus.this.animation_item1, (View)linearLayout4, textView2, textView4, textView5, textView6, textView7, textView8, textView, textView2, textView3, Aboutus.this.iv_pro_item1, -180);
            }
        });
    }
}
