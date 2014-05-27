package com.object.aahelpru;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;


public class Notification extends Activity implements OnClickListener{
    Button ok;
    TextView res;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        res = (TextView) findViewById(R.id.res);
        ok = (Button) findViewById(R.id.ok);

        ok.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {

        }



}