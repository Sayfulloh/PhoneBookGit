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

import com.example.sayfulloh.phonebook.R;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.BahshiTarjumon;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.IT;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.Matbuot;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.Ruhsatnoma;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.ShubaiUmumi;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.TahlilJanbast;


import java.util.ArrayList;
import java.util.Arrays;

public class KotibotActivity extends AppCompatActivity {

    ArrayList<String> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        listView = (ListView) findViewById(R.id.listview1);
        String[] values = new String [] {"Тоҳирзода М.\nСардори Котибот\n98-999-00-04","Шуъбаи умумӣ\n", "Бахши тарҷумон\n", "Шуъбаи технологияи компютерӣ ва ҳифзи иттилоот\n",
                "Бахши таҳлил ва ҷамъбаст\n", "Шуъбаи рухсатномаҳо\n", "Шуъбаи матбуот\n"};

        arrayList = new ArrayList<>(Arrays.asList(values));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==1){
                    Intent myintent =new Intent(view.getContext(),ShubaiUmumi.class);
                    startActivityForResult(myintent, 1);
                }
                if (position==2){
                    Intent myintent =new Intent(view.getContext(),BahshiTarjumon.class);
                    startActivityForResult(myintent, 2);
                }
                if (position==3){
                    Intent myintent =new Intent(view.getContext(),IT.class);
                    startActivityForResult(myintent, 3);
                }
                if (position==4){
                    Intent myintent =new Intent(view.getContext(),TahlilJanbast.class);
                    startActivityForResult(myintent, 4);
                }
                if (position==5){
                    Intent myintent =new Intent(view.getContext(),Ruhsatnoma.class);
                    startActivityForResult(myintent, 5);
                }
                if (position==6){
                    Intent myintent =new Intent(view.getContext(),Matbuot.class);
                    startActivityForResult(myintent, 6);
                }



            }
        });

    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(KotibotActivity.this);
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
