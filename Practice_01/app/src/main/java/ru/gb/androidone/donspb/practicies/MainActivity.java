package ru.gb.androidone.donspb.practicies;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStart;
    CheckBox checkBoxOne, checkBoxTwo;
    EditText txtFieldOne;
    boolean flagOne, flagTwo;
    String something;
    ToggleButton buttonOnOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.btnStart);
        checkBoxOne = findViewById(R.id.chBoxOne);
        checkBoxTwo = findViewById(R.id.chBoxTwo);
        txtFieldOne = findViewById(R.id.editTextOne);
        buttonOnOff = findViewById(R.id.buttonToggle);
        buttonStart.setOnClickListener(this);
        buttonOnOff.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStart:
                flagOne = checkBoxOne.isChecked();
                flagTwo = checkBoxTwo.isChecked();
                something = txtFieldOne.getText().toString();
                setContentView(R.layout.form_layout);
                break;
            case R.id.buttonToggle:
                changeLayoutBackground(buttonOnOff.isChecked());
                break;
            default:
                break;
        }
    }

    public void changeLayoutBackground(boolean step) {
        LinearLayout layoutOne = findViewById(R.id.layoutFirst);
        if (step) {
            layoutOne.setBackgroundColor(Color.LTGRAY);
        } else {
            layoutOne.setBackgroundColor(Color.DKGRAY);
        }
    }

    public void switchSwitches(View v) {
        Switch switchOne = findViewById(R.id.switchOne);
        changeLayoutBackground(switchOne.isChecked());
    }
}