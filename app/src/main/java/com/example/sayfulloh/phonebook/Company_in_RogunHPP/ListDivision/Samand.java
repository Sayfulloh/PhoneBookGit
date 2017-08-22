package com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision;

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

public class Samand extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_samand);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Табаров Хуршед  Нуралиевич\tДиректор\t989991630\n" ,
                "Шокиров Ҳикмат  Муродович\tСардори қитъа\t989991634\n" ,
                "Салимов Абдураҳим  Муродалиевич\tСармуҳосиб\t989991631\n" ,
                "Шоева меҳрангез  Шодмонбеговеа\tКоргузор\t989991633\n"};



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
        final Dialog dialog = new Dialog(Samand.this);
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
