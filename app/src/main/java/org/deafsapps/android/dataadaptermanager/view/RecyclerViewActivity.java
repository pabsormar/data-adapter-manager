package org.deafsapps.android.dataadaptermanager.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.deafsapps.android.dataadaptermanager.R;
import org.deafsapps.android.dataadaptermanager.data.Student;

import java.util.Arrays;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        // data
        Student[] mdsdStudentArray = {
                new Student("Danilo", "Nice to meet you all!"), new Student("Emiliano", "This is a 'RecyclerView'"),
                new Student("Felipe"), new Student("Peter"), new Student("Kanya"),
                new Student("Lourenço", "Born to be wild :)"), new Student("Nadine", "What's up, buddy!"), new Student("Paul"),
                new Student("Rainer"), new Student("Rodrigo"), new Student("Daria"),
                new Student("Pablo")
        };
        final List<Student> mdsdStudentList = Arrays.asList(mdsdStudentArray);
        // widget
        final RecyclerView rvStudents = findViewById(R.id.activity_recycler_view__rv__student_list);
        // adapter

        // here is where data and widget are connected through the data adapter
//        rvStudents.setLayoutManager();
//        rvStudents.setAdapter();
    }

}
