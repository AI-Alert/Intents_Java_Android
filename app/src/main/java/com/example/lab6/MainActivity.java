package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button)findViewById(R.id.goButton);
        send_text = (EditText)findViewById(R.id.editText);
    }

    public void secondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String str = send_text.getText().toString();
        intent.putExtra("message_key", str);
        startActivity(intent);
    }
}
