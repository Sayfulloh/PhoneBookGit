package com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class IT extends AppCompatActivity {


    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Валиев Сафарбег\nСардори шуъбаи ТК ва ҲИ\n989-99-00-10", "Сайфуллоҳи Абдуллоҳ\nМаъмури ҳифзи иттилоот\n989-99-00-11", "Изатуллоев Комрон\nМаъмури веб серверҳо\n989-99-00-12", "Саидов Суҳроб\nМаъмури камераҳои мушоҳидавӣ\n989-99-00-15", "Исоев Далер\nМаъмури системаҳо\n989-99-00-14",
                "Кабиров Мақсуд\nМаъмури камераҳои мушоҳидавӣ\n989-99-00-28", "Раҳмонов Улуғбег\nМаъмури шабака\n989-99-00-13"};



        arrayList = new ArrayList<>(Arrays.asList(items));


        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //show input box
                showInputBox(arrayList.get(position),position);

            }
        });
    }
    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(IT.this);
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
                arrayAdapter.notifyDataSetChanged();
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
