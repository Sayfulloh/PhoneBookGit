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

public class RayTaminotiBehatari extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ray_taminoti_behatari);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Исломов Тешабой\nСардори Раёсат\n98-999-03-80" ,
                "Ҳақназорв Саидбек\nСардори шуъба\n98-999-03-82" ,
                "Олматов Аламшоҳ\nСар.шуъ. моби\n98-999-03-83" ,
                "Зоғаков Фирӯз\nМуов.сар.шуъ\n98-999-03-84" ,
                "Сироҷиддинов Р\nМутахасс П\n98-999-03-85" ,
                "Назорати камераҳои мушоҳидавӣ\n98-999-04-01" ,
                "Дидбонгоҳи №1\n98-999-03-92" ,
                "Дидбонгоҳи №2\n98-999-03-93" ,
                "Дидбонгоҳи №3\n98-999-03-94" ,
                "Дидбонгоҳи №4\n98-999-03-95" ,
                "Дидбонгоҳи №5\n98-999-03-96" ,
                "Дидбонгоҳи №6\n98-999-03-97" ,
                "Дид. Маъмурият\n98-999-03-99" ,
                "Қароргоҳ\n98-999-03-98",
                "Ризоев Тоҷиддин\nМутахассис\n98-999-03-88" ,
                "Саидов Раҷабалӣ\nМутахассис\n98-999-03-91" ,
                "Шарипов Ҷоми\nМутахассис\n938-06-02-77" ,
                "Тоиров Алиҷон\nМутахассис\n951-37-11-97",
                "Холов Шерали\nМутахассис\n937-34-64-64\n93-420-76-62" ,
                "Абдулов Сафарбек\nМутахассис\n938-50-16-38" ,
                "Исматов Тоҳирҷон\nМутахассис\n935-23-11-11" ,
                "Ахмедшоев Баҳодур\nМутахассис\n919-60-74-98" ,
                "Абдуллоев Исматулло\nМутахассис\n934-05-88-87" ,
                "Раҳмонов Ҷамшед\nМутахассис" ,
                "Алибегов Меҳроҷиддин\nМутахассис\n935-64-28-24" ,
                "Абдулмуминов Самариддин\nМутахассис\n909-88-44-17" ,
                "Боронов Бахтиёр\nМутахассис\n934-34-81-88" ,
                "Боронов Абдулло\nМутахассис\n935-39-91-99" ,
                "Валиев Ҷонибек\nМутахассис\n934-77-40-61" ,
                "Одилов Қурбоназар\nМутахассис\n935-81-44-80" ,
                "Саидов Абдураҳмон\nМутахассис\n918-24-77-33" ,
                "Толибов Оятулло\nМутахассис\n904-18-89-85" ,
                "Умаров Неъматулло\nМутахассис\n938-50-44-99" ,
                "Усмонов Рустам\nМутахассис\n935-94-27-27" ,
                "Файзалиев Ҳабибулло\nМутахассис\n934-06-87-88" ,
                "Холмирзоев Мирзоали\nМутахассис\n937-20-00-93" ,
                "Буйдоқов Фатҳулло\nМутахассис\n939-11-43-40" ,
                "Зардов Раҷабалӣ\nМутахассис\n907-09-02-05" ,
                "Азизов Муҳиддин\nМутахассис\n938-94-16-91" ,
                "Маҳмадмуродов Эделвейс\nМутахассис\n937-41-10-00" ,
                "Зоиров Абдусаид\nМутахассис\n934-32-08-07" ,
                "Абдулҳақов Саймурод\nМутахассис\n937-10-35-10"};



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
        final Dialog dialog = new Dialog(RayTaminotiBehatari.this);
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
