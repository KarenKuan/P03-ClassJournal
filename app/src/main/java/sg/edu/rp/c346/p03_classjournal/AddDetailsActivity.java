package sg.edu.rp.c346.p03_classjournal;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddDetailsActivity extends AppCompatActivity {

    TextView tvWeek;
    ImageView ivDG;
    RadioGroup rggrade;
    RadioButton rgGrades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWeek = (TextView) findViewById(R.id.textViewWeek);
        ivDG = (ImageView) findViewById(R.id.imageViewDG);
        rggrade = (RadioGroup) findViewById(R.id.radiogroupGarde);
        rgGrades = (RadioButton) findViewById(R.id.radioButton);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroupGarde);
        // Get the Id of the selected radio button in the RadioGroup
        int selectedButtonId = rg.getCheckedRadioButtonId();
        // Get the radio button object from the Id we had gotten above
        RadioButton rb = (RadioButton) findViewById(selectedButtonId);
    }
}
