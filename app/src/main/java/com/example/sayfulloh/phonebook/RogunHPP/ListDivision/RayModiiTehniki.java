package com.example.sayfulloh.phonebook.RogunHPP.ListDivision;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class RayModiiTehniki extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ray_modii_tehniki);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Раҳмонов Суҳбат\nСардори аёсат\n989-99-04-77",
                "Сайфиддинов А\nМуо. сар. Раёсат\n98-999-00-80",
                "Салимов Бехруз\nМуо. сар. Раёс\n98-999-00-81",
                "Раҳмонов Ризо\nМут таъминот\n98-999-04-83",
                "Кабиров Пардабой\nМут пешбар\n98-999-04-82",
                "Қурбонов Ш\nМут.пешбар\n98-999-04-84" ,
                "Қарчиев Саидбек\nМудири анбор\n98-999-04-85",
                "Паҳлавонов Гурез\nМудири анбор\n98-999-04-86",
                "Соибов Олим\nМудири анбор\n98-999-04-87",
                "Шоев Абдураҳмон\nМудири анбор\n98-999-04-88",
                "Самиев Р\nМут.таъминотч\n98-999-04-89" ,
                "Зафарова Нилуфар\nИқтисодчӣ\n98-999-04-90",
                "Гулшанов диловар\nТаъминотчӣ\n98-999-04-91",
                "Аҳмадов А\nТаъминотчӣ\n98-999-04-93",
                "Насриддинов З\nМутахассис\n98-999-04-94",
                "Саидов М\nАнборчӣ\n98-999-04-95" ,
                "Пулатов Ҷамшед\nАнборчӣ\n98-999-04-96",
                "Арипов Акбар\nмутахассиси бешбар\n98-999-04-81"};



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
        final Dialog dialog = new Dialog(RayModiiTehniki.this);
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
