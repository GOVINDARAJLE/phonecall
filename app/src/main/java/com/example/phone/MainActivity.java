package com.example.phone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    EditText editText;
    Button phone;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.edittext1);
        phone=(Button)findViewById(R.id.call);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone1=editText.getText().toString();
                if (phone1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter the no",Toast.LENGTH_SHORT).show();
                }else {
                    String s="tel:"+phone1;
                    Intent intent=new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);

                }

            }
        });

    }
}