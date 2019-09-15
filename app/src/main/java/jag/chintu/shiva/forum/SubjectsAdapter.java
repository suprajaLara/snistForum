package jag.chintu.shiva.forum;

//import android.support.v7.widget.*;
import java.util.*;
import android.widget.*;
import android.view.*;

import androidx.recyclerview.widget.RecyclerView;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.MyViewHolder>
{
    private List<Subjects> moviesList;
    
    public SubjectsAdapter(final List<Subjects> moviesList) {
        this.moviesList = moviesList;
    }
    
    @Override
    public int getItemCount() {
        return this.moviesList.size();
    }
    
    public void onBindViewHolder(final MyViewHolder myViewHolder, final int n) {
        myViewHolder.title.setText((CharSequence)this.moviesList.get(n).getTitle());
    }
    
    public MyViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subs_recycl_rows, viewGroup, false));
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView genre;
        public TextView title;
        public TextView year;
        
        public MyViewHolder(final View view) {
            super(view);
            this.title = (TextView)view.findViewById(R.id.title);
        }
    }
}
