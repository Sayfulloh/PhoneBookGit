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
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.BahshiTarjumon;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.IT;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.Matbuot;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.Ruhsatnoma;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.ShubaiUmumi;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKotibot.TahlilJanbast;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.CQI_QCSH_CQM;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.IstifodaRoho;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.Kompresor;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.KorhoiTarkishi;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.KoriZeriZamin;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.QMV1;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.QMV2;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.QNA;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.QitaiInshuotSohtmon;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.QitaiKorhBehatari;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.QitaiObparto;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.ShubaiGeodezia;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.ShubaiKadr;
import com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.SitodiJSF;

import java.util.ArrayList;
import java.util.Arrays;

public class SohtmoniAsosi extends AppCompatActivity {

    ArrayList<String> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sohtmoni_asosi);
        listView = (ListView) findViewById(R.id.listview1);
        String[] values = new String [] {"Имомов Х\tДиректор\t98-999-07-00\n" ,
                "Садуллоев Мурод\tСармуҳандис\t98-999-07-01\n" ,
                "Ширинбеков У\tМуов.Дир\t98-999-07-02\n" ,
                "Абдуллоев Шодмон\tГЛ.энергетик\t98-999-07-03\n" ,
                "Мирзоев Маҳмадали\tМуов.сармуҳандис\t98-999-07-04\n" ,
                "Оймаҳмадов Ёрмаҳмад\tМудири хоҷагӣ\t98-999-07-24\n" ,
                "Мирзоева Лутфия\tМух.шуъбаи умумӣ\t98-999-07-00\n" ,
                "Шоев Фотеҳ\tМутахассиси копютер\t98-999-09-10\n" ,
                "Пиров Хокимшо\tСар ТБ\t98-999-07-09\n" ,
                "Тағоймуродов Маҳмадмурод\tСардори шуъба ШММ\t98-999-07-15\n" ,
                "Аҳмадов А\tСардори шуъбаи ШИ\t98-999-07-11\n" ,
                "Акобиров Начмуддин\tМуҳандис\t98-999-07-17\n" ,
                "Самиев Ш\tСардори шуъба\t98-999-07-06\n","ШУЪБАИ КАДР\n","МУҲОСИБОТ\n","ШУЪБАИ ГИОДЕЗИЯ\n","СИТОДИ ҶСФ “СОХТМОНИ АСОСӢ”\n","ҚИТЪАИ КОРҲОИ БЕХАТАРӢ\n",
                "ҚИТЪАИ ИСТИФОДАБАРИИ РОҲҲО\n","ҚИТЪАИ КОРҲОИ ЗЕРИЗАМИНӢ\n","ҚИТЪАИ КОРҲОИ ТАРКИШӢ\n","ҚМВ-1\n","ҚМВ-2\n","ҚНА\n","ҚИТЪАИ ОБПАРТО\n","КОМПРЕССОР\n","ҚИТЪАИ ИНШООТИИ СОХТМОНИ АСОСӢ\n"
                ,"СҚИ, ҚСШ-1, ҚБ-1,ҚХБ, СҚМ\n"};

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
                if (position==6){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==7){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==8){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==9){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==10){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==11){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==12){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==13){
                    Intent myintent =new Intent(view.getContext(),ShubaiKadr.class);
                    startActivityForResult(myintent, 13);
                }
                if (position==14){
                    Intent myintent =new Intent(view.getContext(), com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision.Muhosibot.class);
                    startActivityForResult(myintent, 14);
                }
                if (position==15){
                    Intent myintent =new Intent(view.getContext(),ShubaiGeodezia.class);
                    startActivityForResult(myintent, 15);
                }
                if (position==16){
                    Intent myintent =new Intent(view.getContext(),SitodiJSF.class);
                    startActivityForResult(myintent, 16);
                }
                if (position==17){
                    Intent myintent =new Intent(view.getContext(),QitaiKorhBehatari.class);
                    startActivityForResult(myintent, 17);
                }
                if (position==18){
                    Intent myintent =new Intent(view.getContext(),IstifodaRoho.class);
                    startActivityForResult(myintent, 18);
                }
                if (position==19){
                    Intent myintent =new Intent(view.getContext(),KoriZeriZamin.class);
                    startActivityForResult(myintent, 19);
                }
                if (position==20){
                    Intent myintent =new Intent(view.getContext(),KorhoiTarkishi.class);
                    startActivityForResult(myintent, 20);
                }
                if (position==21){
                    Intent myintent =new Intent(view.getContext(),QMV1.class);
                    startActivityForResult(myintent, 21);
                }
                if (position==22){
                    Intent myintent =new Intent(view.getContext(),QMV2.class);
                    startActivityForResult(myintent, 22);
                }
                if (position==23){
                    Intent myintent =new Intent(view.getContext(),QNA.class);
                    startActivityForResult(myintent, 23);
                }
                if (position==24){
                    Intent myintent =new Intent(view.getContext(),QitaiObparto.class);
                    startActivityForResult(myintent, 24);
                }
                if (position==25){
                    Intent myintent =new Intent(view.getContext(),Kompresor.class);
                    startActivityForResult(myintent, 25);
                }
                if (position==26){
                    Intent myintent =new Intent(view.getContext(),QitaiInshuotSohtmon.class);
                    startActivityForResult(myintent, 26);
                }
                if (position==27){
                    Intent myintent =new Intent(view.getContext(),CQI_QCSH_CQM.class);
                    startActivityForResult(myintent, 27);
                }
            }
        });

    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(SohtmoniAsosi.this);
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
