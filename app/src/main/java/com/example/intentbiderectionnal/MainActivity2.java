package com.example.intentbiderectionnal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText editText  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        TextView textView = findViewById(R.id.textView);
        textView.setText(i.getStringExtra("val"));





    }

    public void send(View view) {
        editText = findViewById(R.id.editTextTextPersonName) ;

        Intent i1 = new Intent();
        //i1.putExtra("val",editText.getText().toString());
        i1.putExtra("val",editText.getText().toString());
        setResult(Activity.RESULT_OK ,i1);
        //startActivityForResult(i,10);
        finish();
    }
}