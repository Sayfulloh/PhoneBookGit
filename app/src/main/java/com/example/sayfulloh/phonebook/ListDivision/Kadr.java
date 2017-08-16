package com.example.sayfulloh.phonebook.ListDivision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sayfulloh.phonebook.Employees.kotibot.Kadr.BahshiMahsusiKadr;
import com.example.sayfulloh.phonebook.R;

public class Kadr extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kadr);
        listView = (ListView) findViewById(R.id.listview1);
        String[] values = new String [] {"БАХШИ МАХСУСИ РАЁСАТИ КАДРҲО"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    Intent myintent =new Intent(view.getContext(),BahshiMahsusiKadr.class);
                    startActivityForResult(myintent, 0);
                }



            }
        });

    }
}
