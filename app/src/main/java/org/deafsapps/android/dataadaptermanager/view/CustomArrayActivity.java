package org.deafsapps.android.dataadaptermanager.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.deafsapps.android.dataadaptermanager.R;
import org.deafsapps.android.dataadaptermanager.adapter.CustomArrayAdapter;
import org.deafsapps.android.dataadaptermanager.data.Student;

import java.util.Arrays;
import java.util.List;

public class CustomArrayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_array);
        // data
        Student[] mdsdStudentArray = {
                new Student("Danilo", "Nice to meet you all!"), new Student("Emiliano"),
                new Student("Felipe"), new Student("Peter"), new Student("Kanya"),
                new Student("Lourenço", "Born to be wild :)"), new Student("Nadine", "What's up, buddy!"), new Student("Paul"),
                new Student("Rainer"), new Student("Rodrigo"), new Student("Daria"),
                new Student("Pablo")
        };
        final List<Student> mdsdStudentList = Arrays.asList(mdsdStudentArray);
        // widget
        final ListView lvStudents = findViewById(R.id.activity_custom_array__lv__students);
        // adapter
        final CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(this, R.layout.row_student, mdsdStudentList);
        // here is where data and widget are connected through the data adapter
        lvStudents.setAdapter(customArrayAdapter);
        lvStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(CustomArrayActivity.this, "Clicked position: " + position + ", id: " + id, Toast.LENGTH_SHORT).show();
            }
        });
    }

}