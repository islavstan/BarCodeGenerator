package com.example.islav.barcode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import com.example.islav.barcode.model.Code128;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawBarcode();
    }

    private void drawBarcode() {
        String barcode = "7761010114033430";
        Code128 code = new Code128(this);
        code.setData(barcode);
        Bitmap bitmap = code.getBitmap(680, 300);
        ImageView ivBarcode = (ImageView)findViewById(R.id.code128_barcode);
        ivBarcode.setImageBitmap(bitmap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_bar_code, menu);
        return true;
    }

}
