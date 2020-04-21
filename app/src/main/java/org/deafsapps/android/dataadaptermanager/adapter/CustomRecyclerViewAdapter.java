package org.deafsapps.android.dataadaptermanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.deafsapps.android.dataadaptermanager.R;
import org.deafsapps.android.dataadaptermanager.data.Student;
import org.deafsapps.android.dataadaptermanager.viewholder.CustomViewHolder;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context;
    private int layoutResource;
    private List<Student> studentList;

    public CustomRecyclerViewAdapter(Context context, int layoutResource, List<Student> data) {
        this.context = context;
        this.layoutResource = layoutResource;
        this.studentList = data;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // creates the 'ViewHolder' to be used for the whole list
        View view = LayoutInflater.from(context).inflate(layoutResource, parent, false);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "Element clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // allows to fill in the row widget with actual data
        holder.bindData(position, studentList.get(position));
    }

    @Override
    public int getItemCount() {
        // sets up the amount of elements to display on the list
        return studentList.size();
    }

}
