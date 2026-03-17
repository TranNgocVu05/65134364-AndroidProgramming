package NgocVu.baith7_listview1;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN ;// khai bao ngoai
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // hien thi dữ liệu lên ListView
        //B1+ cần có dữ liệu
        // dữ liệu từ cơ sở dữ liệu
        // ơ bài này dùng hardcore
        // càn biến phù hợp

        dsTenTinhThanhVN = new ArrayList<String>();
            // them du lieu
            // nhung ta hardcore
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Phú Yên");
        dsTenTinhThanhVN.add("Đà Lạt");
        dsTenTinhThanhVN.add("TP.Nha Trang");
        dsTenTinhThanhVN.add("TP.Hồ Chí Minh");
        dsTenTinhThanhVN.add("Bình Định");
        //b2 tao adddpter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN);
        // b3 gan vao dieu khien hien thi
        //3.1
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        // 3.3 lang nghe xu ly
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // tao bo lang nghe va xu ly su kien onItemClick
    //vd  BoLangNghevaXL
   AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            // code xu ly o day
            // i la vi tri phan tu vua duoc click
         String strTenTinhChon =   dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this,strTenTinhChon ,Toast.LENGTH_LONG).show();

        }
    };
}