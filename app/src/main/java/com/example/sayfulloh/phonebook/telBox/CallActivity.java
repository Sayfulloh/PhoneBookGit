package com.example.sayfulloh.phonebook.telBox;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sayfulloh.phonebook.R;

/**
 * Created by Sayfulloh on 03.08.2017.
 */

public class CallActivity extends AppCompatActivity{

    Button btn;
    EditText numText;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droble);
        btn = (Button)findViewById(R.id.btnCall);
//        numText = (EditText) findViewById(R.id.idNumtxt);
    }


    public void btnCall(View view) {
        Intent i = new Intent(Intent.ACTION_CALL);
        sNum = numText.getText().toString();
        if (sNum.trim().isEmpty()){
            i.setData(Uri.parse("tel:989-99-00-11"));
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//            Toast.makeText(this, "Please grant the permission to call", Toast.LENGTH_SHORT).show();
            requestPermissions();
        }
        else {
            startActivity(i);
        }

    }

    private void requestPermissions() {
        ActivityCompat.requestPermissions(this, new String []{Manifest.permission.CALL_PHONE}, 1 );
    }
}
