package sg.edu.rp.c346.p03_classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // These request identify who started the second activity
    int requestCodeForModuleCodeStats = 1;

    TextView tvC347;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC347 = (TextView) findViewById(R.id.textViewC347);

        tvC347.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ClassDetailsActivity.class);
                i.putExtra("faciEmail", "hew_ka_kian@rp.sg");
                startActivityForResult(i, requestCodeForModuleCodeStats);
            }
        });
    }
}
