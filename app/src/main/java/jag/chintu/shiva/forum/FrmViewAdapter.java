package jag.chintu.shiva.forum;

import android.support.v7.widget.*;
import java.util.*;
import android.content.*;
import com.google.firebase.storage.*;
import android.widget.*;
import android.view.*;

class FrmViewAdapter extends Adapter<ViewHolder>
{
    private static List<Frmrow> list;
    private Context context;
    StorageReference srf;
    
    FrmViewAdapter(final Context context, final List<Frmrow> list) {
        FrmViewAdapter.list = list;
        this.context = context;
    }
    
    Context getContext() {
        return this.context;
    }
    
    @Override
    public int getItemCount() {
        return FrmViewAdapter.list.size();
    }
    
    public void onBindViewHolder(final ViewHolder viewHolder, final int n) {
        final Frmrow frmrow = FrmViewAdapter.list.get(n);
        final TextView tv = viewHolder.tv;
        final TextView tv2 = viewHolder.tv2;
        final TextView tv3 = viewHolder.tv3;
        tv.setText((CharSequence)frmrow.getName());
        tv2.setText((CharSequence)frmrow.getPost());
        tv3.setText((CharSequence)frmrow.getTime());
    }
    
    public ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2130968626, viewGroup, false));
    }
    
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv;
        TextView tv2;
        TextView tv3;
        
        ViewHolder(final View view) {
            super(view);
            this.tv = (TextView)view.findViewById(2131493063);
            this.tv2 = (TextView)view.findViewById(2131493041);
            this.tv3 = (TextView)view.findViewById(2131493064);
        }
    }
}
