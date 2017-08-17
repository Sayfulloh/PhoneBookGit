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

public class OzmoishgohiMarkazi extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozmoishgohi_markazi);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Пиров Гурез\tсард. озмоишгоҳ\t98-999-02-80\n",
                "Буриев Зафар\tмуов. сард. оз-гоҳ\t98-999-02-82\n" ,
                "Умаров Исмоилхон\tмуов. сард. оз-гоҳ\t98-999-02-81\n",
                "Аюбов Ҷаҳонгир\tмуҳанд. дараҷаи 2\t98-999-02-12\n",
                "Бобохонов Сайфуддин\tСардори Шуъба\t98-999-02-85\n",
                "Оев Махмадкул\tмухандиси пешбар\t98-999-02-06\n",
                "Сайдалиев Искандар\tмухандиси пешбар\t98-999-02-01\n",
                "Мачидов Илхом\tcардори бахш\t98-999-02-04\n",
                "Комилшоев Валера\tмухандис\t98-999-02-03\n"};



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
        final Dialog dialog = new Dialog(OzmoishgohiMarkazi.this);
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
