package org.o7planning.vistaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://developer.android.com/studio?gclid=Cj0KCQjwmN2iBhCrARIsAG_G2i5UYs1ub7X30V-Ua_q-fTcW08O5Fv9nYSiFqnRRh-CTFzO_SWxSkxIaAmubEALw_wcB&gclsrc=aw.ds");

    }
}