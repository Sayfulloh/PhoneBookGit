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
        String [] items={"Исломов Тешабой\tСардори Раёсат\t98-999-03-80\n" ,
                "Ҳақназорв Саидбек\tСардори шуъба\t98-999-03-82\n" ,
                "Олматов Аламшоҳ\tСар.шуъ. моби\t98-999-03-83\n" ,
                "Зоғаков Фирӯз\tМуов.сар.шуъ\t98-999-03-84\n" ,
                "Сироҷиддинов Р\tМутахасс П\t98-999-03-85\n" ,
                "Назорати камераҳои мушоҳидавӣ\t\t98-999-04-01\n" ,
                "Дидбонгоҳи №1\t\t98-999-03-92\n" ,
                "Дидбонгоҳи №2\t\t98-999-03-93\n" ,
                "Дидбонгоҳи №3\t\t98-999-03-94\n" ,
                "Дидбонгоҳи №4\t\t98-999-03-95\n" ,
                "Дидбонгоҳи №5\t\t98-999-03-96\n" ,
                "Дидбонгоҳи №6\t\t98-999-03-97\n" ,
                "Дид. Маъмурият\t\t98-999-03-99\n" ,
                "Қароргоҳ\t\t98-999-03-98\n" ,
                "Ризоев Тоҷиддин\tМутахассис\t98-999-03-88\n" ,
                "Саидов Раҷабалӣ\tМутахассис\t98-999-03-91\n" ,
                "Шарипов Ҷоми\tМутахассис\t938-06-02-77\n" ,
                "Тоиров Алиҷон\tМутахассис\t951-37-11-97\n",
                "Холов Шерали\tМутахассис\t937-34-64-64\n 93-420-76-62\n" ,
                "Абдулов Сафарбек\tМутахассис\t938-50-16-38\n" ,
                "Исматов Тоҳирҷон\tМутахассис\t935-23-11-11\n" ,
                "Ахмедшоев Баҳодур\tМутахассис\t919-60-74-98\n" ,
                "Абдуллоев Исматулло\tМутахассис\t934-05-88-87\n" ,
                "Раҳмонов Ҷамшед\tМутахассис\t\n" ,
                "Алибегов Меҳроҷиддин\tМутахассис\t935-64-28-24\n" ,
                "Абдулмуминов Самариддин\tМутахассис\t909-88-44-17\n" ,
                "Боронов Бахтиёр\tМутахассис\t934-34-81-88\n" ,
                "Боронов Абдулло\tМутахассис\t935-39-91-99\n" ,
                "Валиев Ҷонибек\tМутахассис\t934-77-40-61\n" ,
                "Одилов Қурбоназар\tМутахассис\t935-81-44-80\n" ,
                "Саидов Абдураҳмон\tМутахассис\t918-24-77-33\n" ,
                "Толибов Оятулло\tМутахассис\t904-18-89-85\n" ,
                "Умаров Неъматулло\tМутахассис\t938-50-44-99\n" ,
                "Усмонов Рустам\tМутахассис\t935-94-27-27\n" ,
                "Файзалиев Ҳабибулло\tМутахассис\t934-06-87-88\n" ,
                "Холмирзоев Мирзоали\tМутахассис\t937-20-00-93\n" ,
                "Буйдоқов Фатҳулло\tМутахассис\t939-11-43-40\n" ,
                "Зардов Раҷабалӣ\tМутахассис\t907-09-02-05\n" ,
                "Азизов Муҳиддин\tМутахассис\t938-94-16-91\n" ,
                "Маҳмадмуродов Эделвейс\tМутахассис\t937-41-10-00\n" ,
                "Зоиров Абдусаид\tМутахассис\t934-32-08-07\n" ,
                "Абдулҳақов Саймурод\tМутахассис\t937-10-35-10\n"};



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
