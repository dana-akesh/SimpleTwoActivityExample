package edu.cs.birzeit.twoactivity_dana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    private TextView txtShowMessage;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // to obtain the Intent that started the current activity.
        Intent intent = getIntent();

        txtShowMessage = findViewById(R.id.txtShowMessage);
        //  is used to retrieve a String extra from the Intent object named intent.
        //  It assumes that the extra is associated with the key "data".
        String msg = intent.getStringExtra("data");
        txtShowMessage.setText(msg);

    }

    
}
