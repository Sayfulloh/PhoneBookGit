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
        String [] items={"Раҳмонов Суҳбат\tСардори аёсат\t989-99-04-77\n",
                "Сайфиддинов А\tМуо. сар. Раёсат\t98-999-00-80\n",
                "Салимов Бехруз\tМуо. сар. Раёс\t98-999-00-81\n",
                "Раҳмонов Ризо\tМут таъминот\t98-999-04-83\n",
                "Кабиров Пардабой\tМут пешбар\t98-999-04-82\n",
                "Қурбонов Ш\tМут.пешбар\t98-999-04-84\n" ,
                "Қарчиев Саидбек\tМудири анбор\t98-999-04-85\n",
                "Паҳлавонов Гурез\tМудири анбор\t98-999-04-86\n",
                "Соибов Олим\tМудири анбор\t98-999-04-87\n",
                "Шоев Абдураҳмон\tМудири анбор\t98-999-04-88\n",
                "Самиев Р\tМут.таъминотч\t98-999-04-89\n" ,
                "Зафарова Нилуфар\tИқтисодчӣ\t98-999-04-90\n",
                "Гулшанов диловар\tТаъминотчӣ\t98-999-04-91\n",
                "Аҳмадов А\tТаъминотчӣ\t98-999-04-93\n",
                "Насриддинов З\tМутахассис\t98-999-04-94\n",
                "Саидов М\tАнборчӣ\t98-999-04-95\n" ,
                "Пулатов Ҷамшед\tАнборчӣ\t98-999-04-96\n",
                "Арипов Акбар\tмутахассиси бешбар\t98-999-04-81\n"};



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
