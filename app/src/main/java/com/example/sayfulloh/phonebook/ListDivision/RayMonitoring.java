package com.example.sayfulloh.phonebook.ListDivision;

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

import com.example.sayfulloh.phonebook.Employees.kotibot.Kadr.BahshiMahsusiKadr;
import com.example.sayfulloh.phonebook.Employees.kotibot.RayMonitoring.ShubaiGeodezia;
import com.example.sayfulloh.phonebook.Employees.kotibot.RayMonitoring.ShubaiGeofiziki;
import com.example.sayfulloh.phonebook.Employees.kotibot.RayMonitoring.ShubaiMarkshedri;
import com.example.sayfulloh.phonebook.Employees.kotibot.RayMonitoring.ShubaiMonitoringiGeodezi;
import com.example.sayfulloh.phonebook.Employees.kotibot.RayMonitoring.ShubaiTahliliMonitoring;
import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class RayMonitoring extends AppCompatActivity {

    ArrayList<String> arrayList;
    ArrayAdapter<String > adapter;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring);
        listView = (ListView) findViewById(R.id.listview1);
        final String[] items = new String [] {"Абдуллоев Нурулло\tсардори раёсат\t98-999-01-50\n","Давлатов Р.Н\tсармаркшейдер\t98-999-01-51\n","ШУЪБАИ МАРКШЕЙДЕРӢ",
                "ШУЪБАИ ГЕОДЕЗИЯИ НАЗОРАТИ СОХТМОНӢ", "ШУЪБАИ МОНИТОРИНГИ ГЕОДЕЗӢ", "ШУЪБАИ ТАДҚИҚОТИ ГЕОФИЗИКӢ ВА НАЗОРАТИ НАТУРАВӢ\n", "ШУЪБАИ ТАҲЛИЛИ МОНИТОРИНГӢ"};

        arrayList = new ArrayList<>(Arrays.asList(items));

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1,items);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==1){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==2){
                    Intent myintent =new Intent(view.getContext(),ShubaiMarkshedri.class);
                    startActivityForResult(myintent, 2);
                }
                if (position==3){
                    Intent myintent =new Intent(view.getContext(),ShubaiGeodezia.class);
                    startActivityForResult(myintent, 3);
                }
                if (position==4){
                    Intent myintent =new Intent(view.getContext(),ShubaiMonitoringiGeodezi.class);
                    startActivityForResult(myintent, 4);
                }
                if (position==5){
                    Intent myintent =new Intent(view.getContext(),ShubaiGeofiziki.class);
                    startActivityForResult(myintent, 5);
                }
                if (position==6){
                    Intent myintent =new Intent(view.getContext(),ShubaiTahliliMonitoring.class);
                    startActivityForResult(myintent, 6);
                }

            }
        });

    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(RayMonitoring.this);
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
