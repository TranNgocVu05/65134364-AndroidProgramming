package NgocVu.baith5_xulysukien1;

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
        // Gan bo lang nghe su kien va code xu ly cho tung nut
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // xu ly cong o day
                XuLyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();

            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();

            }
        });
        //....
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
    void XuLyCong(){
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        float num1 = Float.parseFloat(soThu1);
        float num2 = Float.parseFloat(soThu2);
        float tong = num1 + num2;
        String chuoiKq = String.valueOf(tong);
        editTextKq.setText(chuoiKq);
    }

    void XuLyTru(){
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        float num1 = Float.parseFloat(soThu1);
        float num2 = Float.parseFloat(soThu2);
        float tru = num1 - num2;
        String chuoiKq = String.valueOf(tru);
        editTextKq.setText(chuoiKq);
    }

    void XuLyNhan(){
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        float num1 = Float.parseFloat(soThu1);
        float num2 = Float.parseFloat(soThu2);
        float nhan = num1 * num2;
        String chuoiKq = String.valueOf(nhan);
        editTextKq.setText(chuoiKq);

    }

    void XuLyChia(){
        String soThu1 = editTextS1.getText().toString();
        String soThu2 = editTextS2.getText().toString();
        float num1 = Float.parseFloat(soThu1);
        float num2 = Float.parseFloat(soThu2);
        float chia = num1 / num2;
        String chuoiKq = String.valueOf(chia);
        editTextKq.setText(chuoiKq);
    }
}