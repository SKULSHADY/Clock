package com.android.clock;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateText = findViewById(R.id.date_text);
        dateText.setText(String.format("%s", getDate()));
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("EEE, MMM d", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }
}
