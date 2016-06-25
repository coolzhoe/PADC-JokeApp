package waiyan.eventregistration.fragments;

import android.app.DatePickerDialog;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;


import java.util.Calendar;

import waiyan.eventregistration.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    final Calendar calendar = Calendar.getInstance();
    private EditText dob;
    private int day_x = calendar.get(Calendar.DAY_OF_MONTH);
    private int month_x = calendar.get(Calendar.MONTH);
    private int year_x = calendar.get(Calendar.YEAR);

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        dob = (EditText) view.findViewById(R.id.et_dob);
        dob.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               new DatePickerDialog(getActivity(), listener, year_x, month_x, day_x).show();
            }
        });

        return view;
    }


    private DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            day_x = dayOfMonth;
            month_x = monthOfYear;
            year_x = year;
            dob.setText(day_x+"/"+(month_x+1)+"/"+year_x);
        }
    };

}
