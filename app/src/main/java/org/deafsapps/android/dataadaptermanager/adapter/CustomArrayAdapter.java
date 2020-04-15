package org.deafsapps.android.dataadaptermanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.deafsapps.android.dataadaptermanager.R;
import org.deafsapps.android.dataadaptermanager.data.Student;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<Student> {

    private Context context;
    private int layoutResource;
    private List<Student> studentData;

    public CustomArrayAdapter(@NonNull Context context, int resource, @NonNull List<Student> studentData) {
        super(context, resource, studentData);
        this.context = context;
        this.layoutResource = resource;
        this.studentData = studentData;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(layoutResource, parent, false);

        final ImageView imgProfilePic = convertView.findViewById(R.id.row_student__img__profile_pic);
        // TBD
        final TextView tvName = convertView.findViewById(R.id.row_student__tv__name);
        tvName.setText(studentData.get(position).getName());
        final TextView tvExtra = convertView.findViewById(R.id.row_student__tv__extra);
        tvExtra.setText(studentData.get(position).getExtra());

        return convertView;
    }

}