package com.hh.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Toast;

import com.hh.common.dialog.BottomMenuDialog;
import com.hh.common.dialog.CustomDialog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<CharSequence> list = new ArrayList<>();
        list.add(Html.fromHtml(getResources().getString(R.string.menu)));
        list.add("从手机相册选择");
        list.add("从空间相册选择");
        new BottomMenuDialog.Builder(MainActivity.this)
                .setMenus(list)
                .setOnItemClickListener(new BottomMenuDialog.OnItemClickListener() {
                    @Override
                    public void click(View view, CharSequence menu) {
                        Toast.makeText(MainActivity.this, menu, Toast.LENGTH_SHORT).show();
                    }
                })
                .show();


        final Spanned spanned = Html.fromHtml(getResources().getString(R.string.button_text));

        findViewById(R.id.open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog.Builder builder = new CustomDialog.Builder(MainActivity.this);
                builder.setTitle("亲爱的用户,你还没有借款记录,需要资金周转记得找卡贷君哈!")
                        .setMessage("亲爱的用户,你还没有借款记录,需要资金周转记得找卡贷君哈!")
                        .setSingleButton("我知道了", null)
                        .show();
            }
        });

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog.Builder builder = new CustomDialog.Builder(MainActivity.this);
                builder.setTitle("爱的用户,你还没有借款记录,需要资金周转记得找卡贷君哈!")
                        .setTitle(spanned)
                        .setSingleButton("确定", null)
                        .show();
            }
        });


        findViewById(R.id.textView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                CustomDialog.Builder builder = new CustomDialog.Builder(MainActivity.this);
//                builder.setMessage("亲爱的用户,你还没有借款记录,需要资金周转记得找卡贷君哈!")
//                        .setSingleButton("取消", null)
//                        .show();
                ArrayList<CharSequence> list = new ArrayList<>();
                list.add(Html.fromHtml(getResources().getString(R.string.menu)));
                list.add("从手机相册选择");
                list.add("从空间相册选择");
                new BottomMenuDialog.Builder(MainActivity.this)
                        .setTitle("你可以将照片上传至照片墙")
                        .setMenus(list)
                        .setOnItemClickListener(new BottomMenuDialog.OnItemClickListener() {
                            @Override
                            public void click(View view, CharSequence menu) {
                                Toast.makeText(MainActivity.this, menu, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}
