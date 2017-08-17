package com.example.sayfulloh.phonebook.SohtmoniAsosi;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.R;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.DasgohiKotibiKorporativi;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.HizbiHalqi;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.ItifoqiKasaba;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.Kadr;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.KotibotActivity;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.Markazi_Salomati;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.Muhosibot;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.OzmoishgohiMarkazi;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayHaridMarketing;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayHaridiTajizot;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayHuquq;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayKabuliKorho;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayKorho;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayLoihakashiTehniki;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayModiiTehniki;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayMolia;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayMonitoring;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayNazoratiTehniki;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RaySementasia;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.RayTaminotiBehatari;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.Rohbariat;
import com.example.sayfulloh.phonebook.RogunHPP.ListDivision.SitodiSohtmon;

import java.util.ArrayList;
import java.util.Arrays;

public class SohtmoniAsosi extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sohtmoni_asosi);
        listView = (ListView) findViewById(R.id.listview);
        listView.setCacheColorHint(Color.parseColor("#FF4081"));
        String[] values = new String [] {"Роҳбарият", "Котибот", "Маркази саломатӣ", "Ситоди сохтмон", "Муҳосибот", "Раёсати кадр", "Раёсати лоиҳакашӣ-техникӣ",
                "Раёсати қабули корҳои анҷомёфта", "Раёсати мониториги муҳандисӣ", "Раёсати ҳуқуқ ва қарордодҳо", "Раёсати молия ва иқтисод",
                "Раёсати хариди таҷҳизот ва мукаммалсозӣ", "Раёсати назорати корҳои сементатсионӣ", "Раёсати назорати техникӣ", "Озмоишгоҳи марказӣ", "Раёсати корҳо",
                "Раёсати таъминоти модди-техникӣ", "Раёсати харид ва маркетинг", "Дастгохи котиботи корпоративӣ", "Раёсати таъминоти бехатарӣ ","Иттиҳодияи иттифоқи касаба",
                "Ҳ.Х.Д.Т КУМИТАИ ИҶРОИЯИ\n ИБТИДОИИ ДАР НБО РОҒУН\n" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1,values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    Intent myintent =new Intent(view.getContext(),Rohbariat.class);
                    startActivityForResult(myintent, 0);
                }
                if (position==1){
                    Intent myintent =new Intent(view.getContext(),KotibotActivity.class);
                    startActivityForResult(myintent, 1);
                }
                if (position==2){
                    Intent myintent =new Intent(view.getContext(),Markazi_Salomati.class);
                    startActivityForResult(myintent, 2);
                }
                if (position==3){
                    Intent myintent =new Intent(view.getContext(),SitodiSohtmon.class);
                    startActivityForResult(myintent, 3);
                }
                if (position==4){
                    Intent myintent =new Intent(view.getContext(),Muhosibot.class);
                    startActivityForResult(myintent, 4);
                }
                if (position==5){
                    Intent myintent =new Intent(view.getContext(),Kadr.class);
                    startActivityForResult(myintent, 5);
                }
                if (position==6){
                    Intent myintent =new Intent(view.getContext(),RayLoihakashiTehniki.class);
                    startActivityForResult(myintent, 6);
                }
                if (position==7){
                    Intent myintent =new Intent(view.getContext(),RayKabuliKorho.class);
                    startActivityForResult(myintent, 7);
                }
                if (position==8){
                    Intent myintent =new Intent(view.getContext(),RayMonitoring.class);
                    startActivityForResult(myintent, 8);
                }
                if (position==9){
                    Intent myintent =new Intent(view.getContext(),RayHuquq.class);
                    startActivityForResult(myintent, 9);
                }
                if (position==10){
                    Intent myintent =new Intent(view.getContext(),RayMolia.class);
                    startActivityForResult(myintent, 10);
                }
                if (position==11){
                    Intent myintent =new Intent(view.getContext(),RayHaridiTajizot.class);
                    startActivityForResult(myintent, 11);
                }
                if (position==12){
                    Intent myintent =new Intent(view.getContext(),RaySementasia.class);
                    startActivityForResult(myintent, 12);
                }
                if (position==13){
                    Intent myintent =new Intent(view.getContext(),RayNazoratiTehniki.class);
                    startActivityForResult(myintent, 13);
                }
                if (position==14){
                    Intent myintent =new Intent(view.getContext(),OzmoishgohiMarkazi.class);
                    startActivityForResult(myintent, 14);
                }
                if (position==15){
                    Intent myintent =new Intent(view.getContext(),RayKorho.class);
                    startActivityForResult(myintent, 15);
                }
                if (position==16){
                    Intent myintent =new Intent(view.getContext(),RayModiiTehniki.class);
                    startActivityForResult(myintent, 16);
                }
                if (position==17){
                    Intent myintent =new Intent(view.getContext(),RayHaridMarketing.class);
                    startActivityForResult(myintent, 17);
                }
                if (position==18){
                    Intent myintent =new Intent(view.getContext(),DasgohiKotibiKorporativi.class);
                    startActivityForResult(myintent, 18);
                }
                if (position==19){
                    Intent myintent =new Intent(view.getContext(),RayTaminotiBehatari.class);
                    startActivityForResult(myintent, 19);
                }
                if (position==20){
                    Intent myintent =new Intent(view.getContext(),ItifoqiKasaba.class);
                    startActivityForResult(myintent, 20);
                }
                if (position==21){
                    Intent myintent =new Intent(view.getContext(),HizbiHalqi.class);
                    startActivityForResult(myintent, 21);
                }
            }
        });

    }
}
