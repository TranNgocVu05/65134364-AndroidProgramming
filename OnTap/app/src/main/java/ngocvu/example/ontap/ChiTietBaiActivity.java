package ngocvu.example.ontap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChiTietBaiActivity extends AppCompatActivity {
    TextView textViewChiTiet;
    ImageView imageViewChiTiet;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_bai);

        // Ánh xạ
        textViewChiTiet = findViewById(R.id.txtChiTiet);
        imageViewChiTiet = findViewById(R.id.imgChiTiet);
        btnBack = findViewById(R.id.btnBack);

        // Nhận dữ liệu từ Intent
        String ten = getIntent().getStringExtra("tenthuoc");
        String tenFileAnh = getIntent().getStringExtra("anh");

        // Hiển thị tên
        textViewChiTiet.setText(ten);

        // Hiển thị ảnh nếu có
        if (tenFileAnh != null) {
            int imageID = getResources().getIdentifier(tenFileAnh, "mipmap", getPackageName());
            if (imageID != 0) {
                imageViewChiTiet.setImageResource(imageID);
            }
        }

        // Xử lý nút quay lại
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Đóng Activity hiện tại để về trang trước
            }
        });
    }
}
