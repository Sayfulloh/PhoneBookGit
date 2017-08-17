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

public class HojagiiManzil extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hojagii_manzil);
        ListView listView = (ListView)findViewById(R.id.listViewBox1);
        String [] items={"Холов Асадулло\tСардори ХМК\t98-999-05-95\n",
                "Зоиров Илҳом\tкомендант-мудири хоҷагӣ\t98-999-05-55\n",
                "Мирзоев Мирзошариф\tКомен.хобгоҳи №2/3\t98-999-06-31\n",
                "Самадов Гулмаҳмад\tКомен.хобгоҳи №1\t98-999-06-32\n",
                "Ашрафбекова Нодира\tКомен.хобгоҳи ҚИА\t98-999-06-33\n",
                "Мирзоев Кабирҷон\tКомен.хобгоҳи ҚМВ кр-15\t98-999-06-34\n"};



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
        final Dialog dialog = new Dialog(HojagiiManzil.this);
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
