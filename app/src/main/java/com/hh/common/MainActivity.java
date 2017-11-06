package com.hh.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;

import com.hh.common.dialog.CustomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CustomDialog.Builder builder = new CustomDialog.Builder(this);


        Spanned spanned = Html.fromHtml(getResources().getString(R.string.button_text));

        builder
                .setTitle("前三期不能提前还")
                .setMessage("现在处在第三期，11月3号把第三期还了之后")
//                .setCancelButton("取消", null)
//                .setConfirmButton(spanned, null)
                .setSingleButton("我知道了", null)
        .setCanceledOnTouchOutside(false)
                ;
        builder.show();

        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.show();
            }
        });
    }
}
