package com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKorho;

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
        String [] items={"Шарипов Мирзо\nсармеханик\n98-999-05-10",
                "Амиров Сунъулло\nронанда\n98-999-05-24",
                "Идиев Пирмаҳмад\nронанда\n98-999-05-29",
                "Дустов Саидбег\nронанда\n98-999-02-02",
                "Дустов Файзулло\nронанда\n98-999-05-56",
                "Отамуродов Саймурод\nронанда\n98-999-05-40",
                "Саидов Сайвалӣ\nМеханики назор.\n98-999-05-13",
                "Шарипов Нуралӣ\nронанда\n98-999-05-77",
                "Шарипов Анвар\nронанда\n98-999-05-50",
                "Ёрмаҳмадов Наим\nронанда\n989-99-90-09",
                "Ҷунайдов Баҳром\nТанзимгар\n98-999-05-12",
                "Ҷурахонов Маҳмасаид\nронанда\n98-999-05-31",
                "Раҷабов Ибод\nронанда\n98-999-05-21" ,
                "Қосимов М\nронанда\n98-999-05-44" ,
                "Шарофудинов Шарофудин\nронанда\n98-999-05-73",
                "Ҳақназаров Сафарбег\nронанда\n98-999-05-35" ,
                "Шоев Шомурод\nронанда\n98-999-05-45" ,
                "Сафолов Савриддин\nронанда\n98-999-05-25",
                "Лақаев Сафар\nронанда\n98-999-05-48" ,
                "Гурезов Нурулло\nронанда\n98-999-05-49" ,
                "Абдуллоев А\nРонанда\n98-999-05-52" ,
                "Каримов С\nронанда\n98-999-05-53" ,
                "Ризоев М\nРонанад\n98-999-05-57" ,
                "Назиров М\nронанда\n98-999-05-58",
                "Саидов Ф\nРонанда\n98-999-05-59" ,
                "Юсупов Назрулло\nРонанда\n98-999-05-60",
                "Қурбонов Қ\nРонанда\n98-999-05-61" ,
                "Сафаров А\nРонанда\n98-999-05-62" ,
                "Икромов С\nРонанда\n98-999-05-63" ,
                "Хоҷаев Нурали\nРонанда\n98-999-05-64" ,
                "Пиров  Мусулмон\nРонанда\n98-999-05-28" ,
                "Файзов  Д\nРонанда\n98-999-05-66" ,
                "Назаров Гулмурод\nРонанда\n98-999-05-67" ,
                "Зардов М\tРонанда\n98-999-05-68" ,
                "Гулов Дилшод\nРонанда\n98-999-05-69" ,
                "Валиев Навруз\nРонанда\n98-999-05-71" ,
                "Эмомназаров Ф\nРонанда\n98-999-05-72" ,
                "Мирзоев Қ\nРонанда\n98-999-05-75" ,
                "Холмуродов Ф\nРонанда\n98-999-05-76" ,
                "Исматов Ш\nРонанда\n98-999-05-78" ,
                "Юсупов М\nМ.анбор\n98-999-05-14" ,
                "Ситамов С\nИқтисодчӣ\n98-999-05-15" ,
                "Қурбонов Умар\nРонанда\n98-999-05-17" ,
                "Оймадов Б\nРонанда\n98-999-05-16" ,
                "Сафаров Комил\nРонанда\n98-999-05-20" ,
                "Шарипов Шерафган\nРонанда\n98-999-05-23",
                "Амиров С\nРонанда\n98-999-05-24" ,
                "Сафаров Саидраҳмон\nРонанда\n98-999-05-30" ,
                "Исматов А\nРонанда\n98-999-05-32" ,
                "Мисоқов Ҳабиб\nРонанда\n98-999-05-33" ,
                "Шарипов Ориф\nРонанда\n98-999-05-38" ,
                "Гулов Давлат\nРонанда\n98-999-05-37" ,
                "Тураев Ҳикматулло\nРонанда\n98-999-05-36" ,
                "Гурезов А\nРонанда\n98-999-05-34" ,
                "Садриддинов И\nРонанда\n98-999-05-42" ,
                "Тоиров Н\nРонанда\n98-999-05-43" ,
                "Қодиров М\nРонанда\n98-999-05-65" ,
                "Отақулов Т\nРонанда\n98-999-05-46"};



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
