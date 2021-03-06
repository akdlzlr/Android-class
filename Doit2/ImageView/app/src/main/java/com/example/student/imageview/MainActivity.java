package com.example.student.imageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_city = (ImageView)findViewById(R.id.iv_city);
        ImageView iv_kiwi = (ImageView)findViewById(R.id.iv_kiwi);
        ImageView iv_money = (ImageView)findViewById(R.id.iv_money);

        //out of memory
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2; // 1/inSampleSize resize 2, 4, 8, 16

        // 1/inSampleSize 비율로 리사이징
        Bitmap bitmap_city = BitmapFactory.decodeResource(getResources(), R.drawable.city, options);
        Bitmap bitmap_kiwi = BitmapFactory.decodeResource(getResources(), R.drawable.kiwi, options);
        Bitmap bitmap_money = BitmapFactory.decodeResource(getResources(), R.drawable.money, options);

        // 350. 200 으로 리사이징
        Bitmap bitmap_city_resize = Bitmap.createScaledBitmap(bitmap_city, 700, 400, true);
        Bitmap bitmap_kiwi_resize = Bitmap.createScaledBitmap(bitmap_kiwi, 700, 400, true);
        Bitmap bitmap_money_resize = Bitmap.createScaledBitmap(bitmap_money, 700, 400, true);

        iv_city.setImageBitmap(bitmap_city_resize);
        iv_kiwi.setImageBitmap(bitmap_kiwi_resize);
        iv_money.setImageBitmap(bitmap_money_resize);

/*
        iv_city.setImageBitmap(bitmap_city);
        iv_kiwi.setImageBitmap(bitmap_kiwi);
        iv_money.setImageBitmap(bitmap_money);
*/
    }
}
