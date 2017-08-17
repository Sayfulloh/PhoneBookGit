package com.example.sayfulloh.phonebook.RogunHPP.Employees.RogunHPP.RayKorho;

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

public class RonandagoniRayNaqliet extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ronandagoni_ray_naqliet);
        ListView listView = (ListView)findViewById(R.id.listViewBox1);
        String [] items={"Шарипов  Мирзо\tсармеханик\t98-999-05-10\n",
                "Амиров Сунъулло\tронанда\t98-999-05-24\n",
                "Идиев Пирмаҳмад\tронанда\t98-999-05-29\n",
                "Дустов Саидбег\tронанда\t98-999-02-02\n",
                "Дустов Файзулло\tронанда\t98-999-05-56\n",
                "Отамуродов Саймурод\tронанда\t98-999-05-40\n",
                "Саидов Сайвалӣ\tМеханики назор.\t98-999-05-13\n",
                "Шарипов Нуралӣ\tронанда\t98-999-05-77\n",
                "Шарипов Анвар\tронанда\t98-999-05-50\n",
                "Ёрмаҳмадов Наим\tронанда\t\n",
                "Ҷунайдов Баҳром\tТанзимгар\t98-999-05-12\n",
                "Ҷурахонов Маҳмасаид\tронанда\t98-999-05-31\n",
                "Раҷабов Ибод\tронанда\t98-999-05-21\n" ,
                "Қосимов М\tронанда\t98-999-05-44\n" ,
                "Шарофудинов Шарофудин\tронанда\t98-999-05-73\n",
                "Ҳақназаров Сафарбег\tронанда\t98-999-05-35\n" ,
                "Шоев Шомурод\tронанда\t98-999-05-45\n" ,
                "Сафолов Савриддин\tронанда\t98-999-05-25\n",
                "Лақаев Сафар\tронанда\t98-999-05-48\n" ,
                "Гурезов Нурулло\tронанда\t98-999-05-49\n" ,
                "Абдуллоев А\tРонанда\t98-999-05-52\n" ,
                "Каримов С\tронанда\t98-999-05-53\n" ,
                "Ризоев М\tРонанад\t98-999-05-57\n" ,
                "Назиров М\tронанда\t98-999-05-58\n",
                "Саидов Ф\tРонанда\t98-999-05-59\n" ,
                "Юсупов Назрулло\tРонанда\t98-999-05-60\n",
                "Қурбонов Қ\tРонанда\t98-999-05-61\n" ,
                "Сафаров А\tРонанда\t98-999-05-62\n" ,
                "Икромов С\tРонанда\t98-999-05-63\n" ,
                "Хоҷаев Нурали\tРонанда\t98-999-05-64\n" ,
                "Пиров  Мусулмон\tРонанда\t98-999-05-28\n" ,
                "Файзов  Д\tРонанда\t98-999-05-66\n" ,
                "Назаров Гулмурод\tРонанда\t98-999-05-67\n" ,
                "Зардов М\tРонанда\t98-999-05-68\n" ,
                "Гулов Дилшод\tРонанда\t98-999-05-69\n" ,
                "Валиев Навруз\tРонанда\t98-999-05-71\n" ,
                "Эмомназаров Ф\tРонанда\t98-999-05-72\n" ,
                "Мирзоев Қ\tРонанда\t98-999-05-75\n" ,
                "Холмуродов Ф\tРонанда\t98-999-05-76\n" ,
                "Исматов Ш\tРонанда\t98-999-05-78\n" ,
                "Юсупов М\tМ.анбор\t98-999-05-14\n" ,
                "Ситамов С\tИқтисодчӣ\t98-999-05-15\n" ,
                "Қурбонов Умар\tРонанда\t98-999-05-17\n" ,
                "Оймадов Б\tРонанда\t98-999-05-16\n" ,
                "Сафаров Комил\tРонанда\t98-999-05-20\n" ,
                "Шарипов Шерафган\tРонанда\t98-999-05-23\n",
                "Амиров С\tРонанда\t98-999-05-24\n" ,
                "Сафаров Саидраҳмон\tРонанда\t98-999-05-30\n" ,
                "Исматов А\tРонанда\t98-999-05-32\n" ,
                "Мисоқов Ҳабиб\tРонанда\t98-999-05-33\n" ,
                "Шарипов Ориф\tРонанда\t98-999-05-38\n" ,
                "Гулов Давлат\tРонанда\t98-999-05-37\n" ,
                "Тураев Ҳикматулло\tРонанда\t98-999-05-36\n" ,
                "Гурезов А\tРонанда\t98-999-05-34\n" ,
                "Садриддинов И\tРонанда\t98-999-05-42\n" ,
                "Тоиров Н\tРонанда\t98-999-05-43\n" ,
                "Қодиров М\tРонанда\t98-999-05-65\n" ,
                "Отақулов Т\tРонанда\t98-999-05-46\n"};



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
        final Dialog dialog = new Dialog(RonandagoniRayNaqliet.this);
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
