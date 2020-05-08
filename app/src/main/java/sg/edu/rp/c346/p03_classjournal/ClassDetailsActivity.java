package sg.edu.rp.c346.p03_classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ClassDetailsActivity extends AppCompatActivity {

    // These request identify who started the second activity
    int requestCodeForAddStats = 1;

    ListView lvModuleList;
    Button btninfo, btnadd, btnemailfaci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvModuleList = (ListView) findViewById(R.id.lvModuleList);
        btninfo = (Button) findViewById(R.id.buttonINFO);
        btnadd = (Button) findViewById(R.id.buttonadd);
        btnemailfaci = (Button) findViewById(R.id.buttonemailfaci);

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse("https://www.rp.edu.sg/SOI/full-time-diplomas/Details/diploma-in-digital-design-and-development"));
                startActivity(rpIntent);
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set Intent to go next page ***
                Intent i = new Intent(ClassDetailsActivity.this, AddDetailsActivity.class);
                startActivityForResult(i, requestCodeForAddStats);
            }
        });

        btnemailfaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the intent
                Intent i = getIntent();

                // The action you want this intent to do;
                // ACTION_SEND is used to indicate sending text
                /*Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT,
                        "Test Email from C347");
                email.putExtra(Intent.EXTRA_TEXT,
                        editTextMessage.getText());
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));*/
            }


        });
    }
}
