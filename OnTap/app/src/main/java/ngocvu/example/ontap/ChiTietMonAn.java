package ngocvu.example.ontap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChiTietMonAn extends AppCompatActivity {
    TextView textViewMonAn;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_mon_an);

        textViewMonAn = findViewById(R.id.txtTenMon);
        btnBack = findViewById(R.id.btnBackMonAn);

        // Nhận dữ liệu từ Fragment
        String tenMon = getIntent().getStringExtra("tenMon");
        textViewMonAn.setText(tenMon);

        // Xử lý nút quay lại
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
