package com.example.sayfulloh.phonebook.Company_in_RogunHPP;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.AsriNur;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.AziaGidro;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.DagSpesctroy;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Elitstroy;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Farob;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.GSSDangara;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.GeozolPetrosalin;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.GidroEnergostroy;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.GidroOsieoMarkazi;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.GidroSpecproekt;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.GushikayLTD;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.HizmatrasoniiMuhandisi;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Hokrud;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Intersohtmon;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Invertor;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.JomKo;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.KF_EKK_3;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.MMZ_Sh_Norak;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Mavlak;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.MehrdodInterneshn;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.MirshohSohtmon;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Nur81;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Nurafshon;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Nurob;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Nursoz;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Obod2013;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Oriena;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.OrmiRohiKorun;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.SadDare;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Samand;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Sarband2;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.ShirkatiSharqiKuhi;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.SomonNur;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Somonien;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Tades;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.TojikCGM;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.TojikGidrospecstroyNorak;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Tojikgidromontaj;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Tojikkuhkan;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.Tojiknaqbsoz;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.UmronMorun;
import com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision.VestTranstroy;
import com.example.sayfulloh.phonebook.R;

public class Company_in_RogunHPP extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_in__rogun_hpp);
        listView = (ListView) findViewById(R.id.listview);
        listView.setCacheColorHint(Color.parseColor("#FF4081"));
        String[] values = new String [] {"ТОҶИКНАҚБСОЗ\n", "ҶСК “ТОҶИКСГЭМ”\n", "ҶДММ “НУРАФШОН”\n", "ҶСК “ТоҷикГидроспецстрой”-и ш.Норак\n", "ТОҶИККУҲКАН\n", "ҶДММ “НУРОБ”\n", "ОРМИ РОҲИ КОРУН\n",
                "Элитстрой\n", "Сомон Нӯр\n", "ГСС ДАНҒАРА\n", "ОРИЁНО\n","МЕҲРДОД-ИНТЕРНЕШНЛ\n", "НӮРСОЗ\n", "ОБОД-2013\n", "ИНВЕРТОР\n", "ГУШИКАЙ ЛТД\n","ВЕСТРАНСТРОЙ\n", "ТОҶИКГИДРОМОНТАЖ\n",
                "КФ ЭКК №3\n", "ММЗ Ш.НОРАК\n","ҶДММ “МИРШОҲ СОХТМОН”\n", "ҶСП “СОМОНИЁН”\n" ,"ДАГСПЕЦСТРОЙ\n", "ҶДММ “САД-ДАРЁ”\n","ҶДММ “МАВЛАК”\n","ҶДММ “АСРИ-НӮР”\n","ҶДММ ТД “ГИДРОЭНЕРГОСТРОЙ”\n",
                "ҶДММ “ИНТЕРСОХТМОН”\n","ҶДММ “ШИРКАТИ ШАРҚИ КУҲИ”\n","ҶДММ ГИДРОСПЕЦПРОЕКТ\n","ҶСК “ГИДРО ОСИЁИ МАРКАЗИ”\n","ҶСП “ТАДЭС”\n","ҶСП \"ХОКРУД\"\n",
                "ҶДММ ХИЗМАТРАСОНИИ \nМУҲАНДИСОНИ МЕХАНИКАИ ХОК","ҶСП АзияГидро\n","ҶДММ Фарроб\n","ҶДММ Нурсоз ҶДММ Саманд\n","ҶДММ НУР-81\n",
                "ҶДММ \"САРБАНД-2\"\n","ҶДММ \"Ҷом Ко\"\n","ФҶСП \"УМРОН МОРУН\"\n", "ҶДММ \"Геосоз Петроталинг\"  (Меҳрдод Интернейшнл)\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1,values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    Intent myintent =new Intent(view.getContext(),Tojiknaqbsoz.class);
                    startActivityForResult(myintent, 0);
                }
                if (position==1){
                    Intent myintent =new Intent(view.getContext(),TojikCGM.class);
                    startActivityForResult(myintent, 1);
                }
                if (position==2){
                    Intent myintent =new Intent(view.getContext(),Nurafshon.class);
                    startActivityForResult(myintent, 2);
                }
                if (position==3){
                    Intent myintent =new Intent(view.getContext(),TojikGidrospecstroyNorak.class);
                    startActivityForResult(myintent, 3);
                }
                if (position==4){
                    Intent myintent =new Intent(view.getContext(),Tojikkuhkan.class);
                    startActivityForResult(myintent, 4);
                }
                if (position==5){
                    Intent myintent =new Intent(view.getContext(),Nurob.class);
                    startActivityForResult(myintent, 5);
                }
                if (position==6){
                    Intent myintent =new Intent(view.getContext(),OrmiRohiKorun.class);
                    startActivityForResult(myintent, 6);
                }
                if (position==7){
                    Intent myintent =new Intent(view.getContext(),Elitstroy.class);
                    startActivityForResult(myintent, 7);
                }
                if (position==8){
                    Intent myintent =new Intent(view.getContext(),SomonNur.class);
                    startActivityForResult(myintent, 8);
                }
                if (position==9){
                    Intent myintent =new Intent(view.getContext(),GSSDangara.class);
                    startActivityForResult(myintent, 9);
                }
                if (position==10){
                    Intent myintent =new Intent(view.getContext(),Oriena.class);
                    startActivityForResult(myintent, 10);
                }
                if (position==11){
                    Intent myintent =new Intent(view.getContext(),MehrdodInterneshn.class);
                    startActivityForResult(myintent, 11);
                }
                if (position==12){
                    Intent myintent =new Intent(view.getContext(),Nursoz.class);
                    startActivityForResult(myintent, 12);
                }
                if (position==13){
                    Intent myintent =new Intent(view.getContext(),Obod2013.class);
                    startActivityForResult(myintent, 13);
                }
                if (position==14){
                    Intent myintent =new Intent(view.getContext(),Invertor.class);
                    startActivityForResult(myintent, 14);
                }
                if (position==15){
                    Intent myintent =new Intent(view.getContext(),GushikayLTD.class);
                    startActivityForResult(myintent, 15);
                }
                if (position==16){
                    Intent myintent =new Intent(view.getContext(),VestTranstroy.class);
                    startActivityForResult(myintent, 16);
                }
                if (position==17){
                    Intent myintent =new Intent(view.getContext(),Tojikgidromontaj.class);
                    startActivityForResult(myintent, 17);
                }
                if (position==18){
                    Intent myintent =new Intent(view.getContext(),KF_EKK_3.class);
                    startActivityForResult(myintent, 18);
                }
                if (position==19){
                    Intent myintent =new Intent(view.getContext(),MMZ_Sh_Norak.class);
                    startActivityForResult(myintent, 19);
                }
                if (position==20){
                    Intent myintent =new Intent(view.getContext(),MirshohSohtmon.class);
                    startActivityForResult(myintent, 20);
                }
                if (position==21){
                    Intent myintent =new Intent(view.getContext(),Somonien.class);
                    startActivityForResult(myintent, 21);
                }
                if (position==22){
                    Intent myintent =new Intent(view.getContext(),DagSpesctroy.class);
                    startActivityForResult(myintent, 22);
                }
                if (position==23){
                    Intent myintent =new Intent(view.getContext(),SadDare.class);
                    startActivityForResult(myintent, 23);
                }
                if (position==24){
                    Intent myintent =new Intent(view.getContext(),Mavlak.class);
                    startActivityForResult(myintent, 24);
                }
                if (position==25){
                    Intent myintent =new Intent(view.getContext(),AsriNur.class);
                    startActivityForResult(myintent, 25);
                }
                if (position==26){
                    Intent myintent =new Intent(view.getContext(),GidroEnergostroy.class);
                    startActivityForResult(myintent, 26);
                }
                if (position==27){
                    Intent myintent =new Intent(view.getContext(),Intersohtmon.class);
                    startActivityForResult(myintent, 27);
                }
                if (position==28){
                    Intent myintent =new Intent(view.getContext(),ShirkatiSharqiKuhi.class);
                    startActivityForResult(myintent, 28);
                }
                if (position==29){
                    Intent myintent =new Intent(view.getContext(),GidroSpecproekt.class);
                    startActivityForResult(myintent, 29);
                }
                if (position==30){
                    Intent myintent =new Intent(view.getContext(),GidroOsieoMarkazi.class);
                    startActivityForResult(myintent, 30);
                }
                if (position==31){
                    Intent myintent =new Intent(view.getContext(),Tades.class);
                    startActivityForResult(myintent, 31);
                }
                if (position==32){
                    Intent myintent =new Intent(view.getContext(),Hokrud.class);
                    startActivityForResult(myintent, 32);
                }
                if (position==33){
                    Intent myintent =new Intent(view.getContext(),HizmatrasoniiMuhandisi.class);
                    startActivityForResult(myintent, 33);
                }
                if (position==34){
                    Intent myintent =new Intent(view.getContext(),AziaGidro.class);
                    startActivityForResult(myintent, 34);
                }
                if (position==35){
                    Intent myintent =new Intent(view.getContext(),Farob.class);
                    startActivityForResult(myintent, 35);
                }
                if (position==36){
                    Intent myintent =new Intent(view.getContext(),Samand.class);
                    startActivityForResult(myintent, 36);
                }
                if (position==37){
                    Intent myintent =new Intent(view.getContext(),Nur81.class);
                    startActivityForResult(myintent, 37);
                }
                if (position==38){
                    Intent myintent =new Intent(view.getContext(),Sarband2.class);
                    startActivityForResult(myintent, 38);
                }
                if (position==39){
                    Intent myintent =new Intent(view.getContext(),JomKo.class);
                    startActivityForResult(myintent, 39);
                }
                if (position==40){
                    Intent myintent =new Intent(view.getContext(),UmronMorun.class);
                    startActivityForResult(myintent, 40);
                }
                if (position==41){
                    Intent myintent =new Intent(view.getContext(),GeozolPetrosalin.class);
                    startActivityForResult(myintent, 41);
                }

            }
        });

    }
}
