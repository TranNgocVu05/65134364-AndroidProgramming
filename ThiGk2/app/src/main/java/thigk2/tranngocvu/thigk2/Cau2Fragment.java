package thigk2.tranngocvu.thigk2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class Cau2Fragment extends Fragment {

    ArrayList<String> dsTinhThanh;

    public Cau2Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau2, container, false);

        // Khởi tạo danh sách 10 tỉnh thành
        dsTinhThanh = new ArrayList<>();
        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("TP. Hồ Chí Minh");
        dsTinhThanh.add("Đà Nẵng");
        dsTinhThanh.add("Hải Phòng");
        dsTinhThanh.add("Cần Thơ");
        dsTinhThanh.add("Nha Trang");
        dsTinhThanh.add("Đà Lạt");
        dsTinhThanh.add("Huế");
        dsTinhThanh.add("Vũng Tàu");
        dsTinhThanh.add("Trần Ngọc Vũ");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1,
                dsTinhThanh
        );

        ListView lvTinhThanh = view.findViewById(R.id.lvDSMonAn); // Giữ ID cũ để tránh lỗi layout
        lvTinhThanh.setAdapter(adapter);


        lvTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tinhThanh = dsTinhThanh.get(position);
                Toast.makeText(getContext(), "Bạn chọn: " + tinhThanh, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
