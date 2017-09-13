package com.example.sayfulloh.phonebook.RogunHPP.ListDivision;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.RogunHPP.Employees.NameDeportActivity;
import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Kadr extends AppCompatActivity {

    ArrayList<String> arrayList;
    ArrayAdapter<String > adapter;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kadr);
        listView = (ListView) findViewById(R.id.listview1);
        final String[] items = new String [] {"БАХШИ МАХСУСИ РАЁСАТИ КАДРҲО\n", "Абдулҳақов С\nСардори шӯъба\n98-999-00-33", "Холмуродова Ш\nМутахассис\n98-999-00-34",
                "Рустамов М\nМутахассис\n98-999-00-35",
                "Сайдалиева Садбарг\nМутахасиси пешбар\n98-999-00-32","Мамадшоев П.\nМутахасиси пешбар\n98-999-00-30"};

        arrayList = new ArrayList<>(Arrays.asList(items));

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1,items);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    Intent myintent =new Intent(view.getContext(), com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.Kadr.BahshiMahsusiKadr.class);
                    startActivityForResult(myintent, 0);
                }

                if (position==1){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==2){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==3){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==4){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==5){
                    showInputBox(arrayList.get(position),position);

                }



            }
        });

    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(Kadr.this);
        dialog.setTitle("Input Box");
        dialog.setContentView(R.layout.input_box);
        TextView txtMessage= (TextView)dialog.findViewById(R.id.txtmessage);
        txtMessage.setText("Маълумот оиди корманд");
//        txtMessage.setTextColor(Color.parseColor("#000000"));


        final TextView textView = (TextView) dialog.findViewById(R.id.txtinput);
        textView.setText(oldItem);
        Button bt= (Button)dialog.findViewById(R.id.btndone);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.set(index,textView.getText().toString());
//                adapter.notifyDataSetChanged();
                dialog.dismiss();
            }
        });
        dialog.show();

    }

}
