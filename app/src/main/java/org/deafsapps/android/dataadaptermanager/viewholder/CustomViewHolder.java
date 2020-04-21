package org.deafsapps.android.dataadaptermanager.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.deafsapps.android.dataadaptermanager.R;
import org.deafsapps.android.dataadaptermanager.data.Student;

/**
 * Creates a {@link RecyclerView.ViewHolder} which displays {@link Student} data into a
 * {@link RecyclerView}.
 * <p>
 * Includes a public method to ease data binding from the RecyclerView.
 *
 * @author Joe Bloggs
 * @since 1.0
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgProfile;
    private TextView tvName;
    private TextView tvExtraInfo;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imgProfile = itemView.findViewById(R.id.row_student__img__profile_pic);
        this.tvName = itemView.findViewById(R.id.row_student__tv__name);
        this.tvExtraInfo = itemView.findViewById(R.id.row_student__tv__extra);
    }

    public void bindData(final int position, final Student student) {
        int drawableResource = getDrawableResultByPosition(position);

        imgProfile.setImageResource(drawableResource);
        tvName.setText(student.getName());
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Item: " + position + ", student: " + student.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        tvExtraInfo.setText(student.getExtra());
    }

    private int getDrawableResultByPosition(int position) {
        // getting whether the position is even or not
        boolean isEven = getEvenStatusByPosition(position);
        return getDrawableResourceByStatus(isEven);
    }


    private boolean getEvenStatusByPosition(int position) {
        boolean isEven;
        int reminder = (position + 1) % 2;
        isEven = reminder == 0;
        return isEven;
    }

    /**
     * This method returns a drawable resource according to an boolen argument.
     *
     * @param isEven indicates whether the status is even or not
     * @return a drawable resource
     */
    private int getDrawableResourceByStatus(boolean isEven) {
        int drawableResource;
        if (isEven) {
            drawableResource = R.drawable.ic_image_placeholder;
        } else {
            drawableResource = R.drawable.ic_image_placeholder_2;
        }
        return drawableResource;
    }

}