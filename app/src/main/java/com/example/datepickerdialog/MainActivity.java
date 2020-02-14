package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private Button ValueOfButton;
   private TextView ValueOfTextView;
   private DatePickerDialog ValueOfdatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ValueOfButton= (Button) findViewById(R.id.ButtonId);
        ValueOfTextView=(TextView) findViewById(R.id.TextViewId);

       ValueOfButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        DatePicker datePicker=new DatePicker(this);
        int CurrentDay=datePicker.getDayOfMonth();
        int CurrentMonth=(datePicker.getMonth()+1);
        int CurrentYear=datePicker.getYear();

        ValueOfdatePicker =new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ValueOfTextView.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },CurrentDay,CurrentMonth,CurrentYear);
        ValueOfdatePicker.show();
    }
}
