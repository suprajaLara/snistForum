package jag.chintu.shiva.forum;

//import android.support.v7.widget.*;
import java.util.*;
import android.widget.*;
import android.view.*;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private ArrayList<Deom> persons;
    
    public RVAdapter(final ArrayList<Deom> persons) {
        this.persons = persons;
    }
    
    @Override
    public int getItemCount() {
        return this.persons.size();
    }
    
    public void onBindViewHolder(final ViewHolder viewHolder, final int n) {
        viewHolder.personName.setText((CharSequence)this.persons.get(n).text);
        viewHolder.personPhoto.setImageResource(this.persons.get(n).pic);
    }
    
    public ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyl, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView personName;
        ImageView personPhoto;
        
        ViewHolder(final View view) {
            super(view);
            this.personName = (TextView)view.findViewById(R.id.name);
            this.personPhoto = (ImageView)view.findViewById(R.id.pic);
        }
    }
}
