package jag.chintu.shiva.forum;

import android.support.v7.widget.*;
import java.util.*;
import android.content.*;
import com.google.firebase.storage.*;
import android.net.*;
import android.app.*;
import android.view.*;
import android.widget.*;

class RecyclerViewAdapter extends Adapter<ViewHolder>
{
    private static List<Row> list;
    private Context context;
    StorageReference srf;
    
    RecyclerViewAdapter(final Context context, final List<Row> list) {
        RecyclerViewAdapter.list = list;
        this.context = context;
    }
    
    Context getContext() {
        return this.context;
    }
    
    @Override
    public int getItemCount() {
        return RecyclerViewAdapter.list.size();
    }
    
    public void onBindViewHolder(final ViewHolder viewHolder, final int n) {
        final Row row = RecyclerViewAdapter.list.get(n);
        viewHolder.tv.setText((CharSequence)row.getName());
        final Button btn = viewHolder.btn;
        btn.setText((CharSequence)"Download");
        btn.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final DownloadManager downloadManager = (DownloadManager)RecyclerViewAdapter.this.context.getSystemService("download");
                final DownloadManager$Request downloadManager$Request = new DownloadManager$Request(Uri.parse(row.getLink().toString()));
                downloadManager$Request.setTitle((CharSequence)row.getName());
                downloadManager$Request.setNotificationVisibility(1);
                downloadManager.enqueue(downloadManager$Request);
                Toast.makeText(RecyclerViewAdapter.this.context, (CharSequence)"downloading..", 0).show();
            }
        });
    }
    
    public ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2130968636, viewGroup, false));
    }
    
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        Button btn;
        TextView tv;
        
        ViewHolder(final View view) {
            super(view);
            this.tv = (TextView)view.findViewById(2131493063);
            this.btn = (Button)view.findViewById(2131493078);
        }
    }
}
