package com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class GushikayLTD extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_gushikay_ltd);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Муҳиддинов Р\tСар.шуъ.кадр\t98-999-17-30\n" ,
                "Ҷанг Ан Ҷун\tСардори.қит\t98-999-17-31\n" ,
                "Собиров Суҳроб\tТарҷумон\t98-999-17-32\n" ,
                "Давлатов Ш\tТарҷумон\t98-999-17-33\n" ,
                "Ҳабибуллоев Ҷ\tТарҷумон\t98-999-17-34\n"};



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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(GushikayLTD.this);
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
