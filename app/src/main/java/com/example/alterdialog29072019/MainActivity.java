package com.example.alterdialog29072019;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlertDialog = findViewById(R.id.buttonShowDialog);
//        Nhanvien nhanvien = new NhanvienBuilder()
//                            .setTen("Nguyen Van A")
//                            .setDiachi("38 nguyen lam")
//                            .builder();
//        Log.d("BBB",nhanvien.getDiachi() + "");
        Sinhvien sinhvien = new Sinhvien("Nguyen Van A" , WeekDay.FRIDAY);
        sinhvien.setNgayhoc(WeekDay.FRIDAY);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hộp thoại xác nhận");
                builder.setMessage("Bạn có muốn tắt app hay không");
                builder.setIcon(R.mipmap.ic_launcher);
                // định nghĩa các chức năng của nút
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();

            }
        });
    }
}
