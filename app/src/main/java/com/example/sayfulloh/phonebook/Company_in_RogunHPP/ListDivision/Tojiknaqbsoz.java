package com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision;

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
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.IstifodaRoho;

import java.util.ArrayList;
import java.util.Arrays;

public class Tojiknaqbsoz extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_tojiknaqbsoz);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Зайдов Неъматулло\nРаиси шурои директорон\n98-999-10-10 /" ,
                "Икромов М\nДиректори генералӣ\n98-999-10-11 " ,
                "Зайдов Аслан\nҶой.аввали Директори генералӣ\n98-999-10-12 " ,
                "Саидмуродов Саидмурод\nДиректори Молиявӣ\n98-999-10-13 " ,
                "Азизов Асадулло\nСармуҳандис\n98-999-10-14 " ,
                "Икромова Зебонисо\nСардори  ШК\n98-999-10-23 "};



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
        final Dialog dialog = new Dialog(Tojiknaqbsoz.this);
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

