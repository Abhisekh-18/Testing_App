package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        w=findViewById(R.id.web);
    }

    public void show_web(View view) {
        String page="<html>   <body bgcolor=\"#F0F0F0\" align=\"center\">\n" +
                "\n" +
                "<p>This is a paragraph for display purpose</p>\n" +
                "<br>\n" +
                "An Example of copyright symbols &#169;\n" +
                "<br>\n" +
                "An Example of resticted trade mark &#174;\n" +
                "<br>\n" +
                "An Example of tarade mark symbol &#8482;\n" +
                "<br>\n" +
                "<p>This is closing a paragraph for display purpose</p>\n" +
                "<br></body></html>";
        w.loadData(page,"text/html","UTF-8");
    }
}
