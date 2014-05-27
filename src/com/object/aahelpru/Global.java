package com.object.aahelpru;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Global extends Activity {

    ImageButton btnSite;
    Button btnCalc, btnNotification;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnSite = (ImageButton)findViewById(R.id.btnSite);
        btnCalc = (Button)findViewById(R.id.btnCalc);
        btnNotification = (Button)findViewById(R.id.btnNotification);

        btnSite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://aa.mail.ru/"));
                startActivity(browserIntent);
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Global.this, Calc.class);
                startActivity(intent);
            }
        });

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Global.this, Notification.class);
                startActivity(intent);
            }
        });

}

}
