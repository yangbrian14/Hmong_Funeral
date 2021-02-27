package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvName, tvDonation;
    EditText etName, etDonation;
    Button btnSave, btnView;
    ListView listView;
    ArrayList<String> donors;
    ArrayList<String> donations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = (TextView)findViewById(R.id.tvName);
        tvDonation = (TextView)findViewById(R.id.tvDonation);
        etName = (EditText)findViewById(R.id.etName);
        etDonation = (EditText)findViewById(R.id.etDonation);
        btnSave = (Button)findViewById(R.id.btnSave);
        btnView = (Button)findViewById(R.id.btnView);
        listView = (ListView)findViewById(R.id.listView);
        donors = new ArrayList<>();
        donations = new ArrayList<>();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = etName.getText().toString();
                String inputDonation = etDonation.getText().toString();
                donors.add(inputName);
                donations.add(inputDonation);
            }
        });

        MyListAdapter adapter = new MyListAdapter(this, donors, donations);
        listView.setAdapter(adapter);
    }
}