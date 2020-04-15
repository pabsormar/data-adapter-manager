package org.deafsapps.android.dataadaptermanager.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.deafsapps.android.dataadaptermanager.R;
import org.deafsapps.android.dataadaptermanager.data.Student;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // data
        String[] mdsdStudentArray = { "Danilo", "Emiliano", "Felipe", "Peter", "Kanya", "Lourenço", "Nadine", "Paul", "Rainer", "Rodrigo", "Daria", "Pablo" };
        final List<String> mdsdStudentList = Arrays.asList(mdsdStudentArray);
        // widget
        final ListView lvStudents = findViewById(R.id.activity_main__lv__students);
        // adapter
        final ArrayAdapter<String> defaultAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mdsdStudentList);
        // Here is where data and widget are connected through the data adapter
        lvStudents.setAdapter(defaultAdapter);
        lvStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked position: " + position + ", id: " + id, Toast.LENGTH_SHORT).show();
            }
        });
        lvStudents.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Long clicked position: " + position + ", id: " + id, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

}