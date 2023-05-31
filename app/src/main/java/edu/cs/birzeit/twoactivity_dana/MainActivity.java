package edu.cs.birzeit.twoactivity_dana;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtMessage;
    private Button btnSendExplicit;
    private Button btnSendImplicit;
    private Button btnSendImplicit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
        setListeners();
    }

    // This method is used to initialize the views
    private void setupViews() {
        txtMessage = findViewById(R.id.editText);
        btnSendExplicit = findViewById(R.id.btnSendExplicit);
        btnSendImplicit = findViewById(R.id.btnSendImplicit);
        btnSendImplicit2 = findViewById(R.id.btnSendImplicitEmail);
    }

    // This method is used to set the listeners
    private void setListeners() {
        btnSendExplicit.setOnClickListener(v -> {
            String msg = txtMessage.getText().toString();

            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("data", msg);
            startActivity(intent);
        });

        btnSendImplicit.setOnClickListener(v -> {
            Intent intent2 = new Intent(Intent.ACTION_SEND);
            intent2.putExtra(Intent.EXTRA_TEXT, "This is a sample message.");
            intent2.putExtra(Intent.EXTRA_SUBJECT, "Hello There");
            intent2.setType("text/plain");
            Intent chooser = Intent.createChooser(intent2, null);
            startActivity(chooser);
        });

        btnSendImplicit2.setOnClickListener(v -> {
            Intent intent2 = new Intent(Intent.ACTION_SEND);
            intent2.putExtra(Intent.EXTRA_TEXT, "This is a sample message.");
            intent2.putExtra(Intent.EXTRA_SUBJECT, "Hello There");
            intent2.setType("text/plain");
            Intent chooser = Intent.createChooser(intent2, null);
            startActivity(chooser);
        });
    }

}