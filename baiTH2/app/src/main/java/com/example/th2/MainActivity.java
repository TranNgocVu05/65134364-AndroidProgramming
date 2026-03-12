package com.example.th2;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // day la bo lang nghe va xu ky click len nut button
    public void XuLyCong(View view ){
        // tim cac tham so
        EditText  editTextSoA = findViewById(R.id.edtA);
        EditText  editTextSoB = findViewById(R.id.edtB);
        EditText  editTextKQ = findViewById(R.id.edtKq);
        // lay du lieu
        String strA = editTextSoA.getText().toString();
        // lay du lieu
        String strB = editTextSoB.getText().toString();
        // dua du lieu sang dang so
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        // tinh  tong
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        // hien ra man hinh
        editTextKQ.setText(strTong);



    }
}