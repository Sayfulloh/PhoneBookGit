package com.example.sayfulloh.phonebook.Company_in_RogunHPP.ListDivision;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sayfulloh.phonebook.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Elitstroy extends AppCompatActivity {

    ArrayList <String> arrayList;
    ArrayAdapter<String > arrayAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_elitstroy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        ListView listView = (ListView)findViewById(R.id.listViewBox);
        String [] items={"Азизов Худойдод\nДиректор\n98-999-12-12 " ,
                "Содикова Оксана\nКадр\n98-999-12-17 " ,
                "Буриев Файзиддин\tСармуҳосиб\n98-999-12-12 " ,
                "Карчиев\nЧон. Директор\n98-999-12-31 "};



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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
    public void showInputBox (String oldItem, final int index){
        final Dialog dialog = new Dialog(Elitstroy.this);
        dialog.setTitle("Input Box");
        dialog.setContentView(R.layout.input_box);
        TextView txtMessage= (TextView)dialog.findViewById(R.id.txtmessage);
        txtMessage.setText("Маълумот оиди корманд");
//        txtMessage.setTextColor(Color.parseColor("#000000"));
        button=(Button)dialog.findViewById(R.id.btnCall);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Manifest.permission.CALL_PHONE);
                callIntent.setData(Uri.parse("tel:123"));
                startActivity(callIntent);
            }
        });


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
