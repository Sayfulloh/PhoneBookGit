package com.example.sayfulloh.phonebook.SohtmoniAsosi.ListDivision;

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
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.Kadr.BahshiMahsusiKadr;

import java.util.ArrayList;
import java.util.Arrays;

public class ShubaiKadr extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sohtmon_shubai_kadr);
        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Ахмадова Лутфия\tСардори ШК\t98-999-07-07\n" ,
                "Раҳматов Аскар\tНозири ШК\t98-999-07-74\n" ,
                "Ғаниев Маҳқулшоҳ\tНозири ШК\t98-999-07-99\n" ,
                "Улфатов Мухтор\tНозири ШК\t98-999-09-09\n" ,
                "Бегназаров Шоҳзуҳур\tНозири ШК\t98-999-09-33\n"};



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
        final Dialog dialog = new Dialog(ShubaiKadr.this);
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
