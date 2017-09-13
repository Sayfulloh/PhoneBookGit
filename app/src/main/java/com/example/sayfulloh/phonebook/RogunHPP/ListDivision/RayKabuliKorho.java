package com.example.sayfulloh.phonebook.RogunHPP.ListDivision;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKabuliKorho.ShubaiIstehsoli;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKabuliKorho.ShubaiKorRuiZamini;
import com.example.sayfulloh.phonebook.RogunHPP.RogunDepartment.RayKabuliKorho.ShubaiKorZerizamini;
import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class RayKabuliKorho extends AppCompatActivity {

    ArrayList<String> arrayList;
    ArrayAdapter<String > adapter;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ray_kabuli_korho);
        listView = (ListView) findViewById(R.id.listview1);
        final String[] items = new String [] {"ШУЪБАИ ҚАБУЛИ КОРҲОИ РУИЗАМИНӢ\n", "ШУЪБАИ ҚАБУЛИ КОРҲОИ ЗЕРИЗАМИНӢ\n", "ШУЪБАИ ИСТЕҲСОЛӢ\n", "Абдиев М\nCардори Раёсат\n98-999-00-60",
                "Бурие С\nМуовини сардори Раёсат\n98-999-00-61","Ҳалимов М\nМуовини сардори Раёсат\n98-999-00-63"};

        arrayList = new ArrayList<>(Arrays.asList(items));

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1,items);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                if (position==0){
                    Intent myintent =new Intent(view.getContext(),ShubaiKorRuiZamini.class);
                    startActivityForResult(myintent, 0);
                }

                if (position==1){
                    Intent myintent =new Intent(view.getContext(),ShubaiKorZerizamini.class);
                    startActivityForResult(myintent, 1);
                }
                if (position==2){
                    Intent myintent =new Intent(view.getContext(),ShubaiIstehsoli.class);
                    startActivityForResult(myintent, 2);
                }
                if (position==3){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==4){
                    showInputBox(arrayList.get(position),position);

                }
                if (position==5){
                    showInputBox(arrayList.get(position),position);

                }



            }
        });

    }

    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(RayKabuliKorho.this);
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
//                adapter.notifyDataSetChanged();
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}
