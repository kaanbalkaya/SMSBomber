package com.balkaya.kaan.smsbomber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sendButton;
    EditText message, telefon, sayi;
    BomberThread mBomber;
    Thread mThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendButton=(Button)findViewById(R.id.button);
        message=(EditText)findViewById(R.id.messageView);
        telefon=(EditText)findViewById(R.id.telefonView);
        sayi=(EditText)findViewById(R.id.sayiView);
    }


    public void sendFunction(View view) {
        mBomber=new BomberThread(telefon.getText().toString(),message.getText().toString(),
                Integer.parseInt(sayi.getText().toString()));
        mThread=new Thread(mBomber);
        mThread.start();
    }
}
