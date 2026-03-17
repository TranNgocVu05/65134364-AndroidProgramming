package com.example.bth4_linearlayout_tong2so;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai bao dieu khien
    EditText editTextS1;
    EditText editTextS2;
    EditText editTextKq;
    Button nutCong,nutTru, nutNhan,nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void TimDieuKhien(){
        editTextS1 = (EditText)findViewById(R.id.edtS1);
        editTextS2 = (EditText)findViewById(R.id.edtS2);
        editTextKq = (EditText)findViewById(R.id.edtKq);

        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    //xu ly cong
    public void XuLyCong(View v){
        //lay du lieu
       String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        // chuyen du lieu tu chuoi sang so
        float num1 = Float.parseFloat(soThu1);
        float num2 = Float.parseFloat(soThu2);
        //tinh toan
        float tong = num1+num2;
        // hien ket qua
        // chuan bi du lieu xuat
        String chuoiKq = String.valueOf(tong);
        //gan ket qua
        editTextKq.setText(chuoiKq);
    }
    // xu ly tru
    public void XuLyTru(View v){
        //lay du lieu
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        // chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(soThu1);
        float so2 = Float.parseFloat(soThu2);
        //tinh toan
        float tru = so1 - so2;
        // chuan bi du lieu xuat
        String chuoiKq = String.valueOf(tru);
        //gan ket qua
        editTextKq.setText(chuoiKq);
    }
    //xu ly nhan
    public void XuLyNhan(View v){
        //lay du lieu
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        // chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(soThu1);
        float so2 = Float.parseFloat(soThu2);
        //tinh toan
        float nhan = so1 * so2;
        // chuan bi du lieu xuat
        String chuoiKq = String.valueOf(nhan);
        //gan ket qua
        editTextKq.setText(chuoiKq);
    }
    //xu ly chia
    public void XuLyChia(View v){
        //lay du lieu
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        // chuyen du lieu tu chuoi sang so
        float so1 = Float.parseFloat(soThu1);
        float so2 = Float.parseFloat(soThu2);
        //tinh toan
        float chia = so1 / so2;
        // chuan bi du lieu xuat
        String chuoiKq = String.valueOf(chia);
        //gan ket qua
        editTextKq.setText(chuoiKq);
    }
}