package com.example.intentbiderectionnal;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void send(View view) {
        editText = findViewById(R.id.editTextTextPersonName) ;

        Intent i = new Intent(this,MainActivity2.class);
        i.putExtra("val",editText.getText().toString());
        //startActivityForResult(i,10);
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK){


                String message = null;
                if (data != null) {
                    message = data.getStringExtra("val");

                    if(message.isEmpty()){
                        Toast.makeText(this,"empty",Toast.LENGTH_LONG).show();

                    }else{
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(message);
                    }
                }

               /* if(message.isEmpty()){
                    TextView textView = findViewById(R.id.textView);
                    textView.setText("empty");
                }else {
                    TextView textView = findViewById(R.id.textView);
                    textView.setText(message);
                }*/

            }

        }
    }
}