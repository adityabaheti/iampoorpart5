package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    Button rich;
    Button poor;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rich = findViewById(R.id.button3);
        poor = findViewById(R.id.button2);
        text = findViewById(R.id.textView);


        verifyRichness(rich);
        verifyRichness(poor);


    }

    public void verifyRichness(Button button) {
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if (((String) button.getText()).equalsIgnoreCase("i am poor")) text.setText("I AM POOR");
                else if (((String) button.getText()).equalsIgnoreCase("i am rich")) text.setText("I AM RICH");
            }
        });
    }
}