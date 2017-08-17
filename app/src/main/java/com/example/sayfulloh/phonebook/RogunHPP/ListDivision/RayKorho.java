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

import com.example.sayfulloh.phonebook.RogunHPP.Employees.RogunHPP.RayKorho.HojagiiManzil;
import com.example.sayfulloh.phonebook.RogunHPP.Employees.RogunHPP.RayKorho.HurokiUmumi;
import com.example.sayfulloh.phonebook.RogunHPP.Employees.RogunHPP.RayKorho.QitaiSuzishvori;
import com.example.sayfulloh.phonebook.RogunHPP.Employees.RogunHPP.RayKorho.RonandagoniRayNaqliet;
import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class RayKorho extends AppCompatActivity {

    ArrayList<String> arrayList;
    ArrayAdapter<String > adapter;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ray_korho);
        listView = (ListView) findViewById(R.id.listview1);
        final String[] items = new String [] {"Сафаров Насим\tМуовини сардор\t98-999-01-11\n" ,
                "Мирзоев Ҷурахон\tДухтури Маъмурият\t98-999-06-07\n" ,
                "Ошуров Ҳофиз\tМутахассис\t98-999-0500\n","ХОҶАГИИ МАНЗИЛИ КОММУНАЛӢ","ХУРОКИ УМУМӢ","ҚИТЪАИ СУЗИШВОРӢ","РОНАНДАГОНИ ХОҶАГИИ \n" +
                "НАҚЛИЁТИИ РАЁСАТИ КОРҲО\n"};

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
                    showInputBox(arrayList.get(position),position);

                }
                if (position==3){
                    Intent myintent =new Intent(view.getContext(),HojagiiManzil.class);
                    startActivityForResult(myintent, 3);
                }
                if (position==4){
                    Intent myintent =new Intent(view.getContext(),HurokiUmumi.class);
                    startActivityForResult(myintent, 4);
                }
                if (position==5){
                    Intent myintent =new Intent(view.getContext(),QitaiSuzishvori.class);
                    startActivityForResult(myintent, 5);
                }
                if (position==6){
                    Intent myintent =new Intent(view.getContext(),RonandagoniRayNaqliet.class);
                    startActivityForResult(myintent, 6);
                }

            }
        });

    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(RayKorho.this);
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
