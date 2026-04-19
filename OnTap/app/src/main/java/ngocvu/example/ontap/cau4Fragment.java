package ngocvu.example.ontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class cau4Fragment extends Fragment {

    public cau4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau4, container, false);

        // Tìm các điều khiển
        EditText edtMon1 = view.findViewById(R.id.edtMon1);
        EditText edtMon2 = view.findViewById(R.id.edtMon2);
        EditText edtMon3 = view.findViewById(R.id.edtMon3);
        EditText edtKetQua = view.findViewById(R.id.edtKetQua);
        Button btnTinh = view.findViewById(R.id.btnDTB);

        // Lắng nghe sự kiện click (Thay cho android:onClick trong XML)
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy dữ liệu
                String s1 = edtMon1.getText().toString();
                String s2 = edtMon2.getText().toString();
                String s3 = edtMon3.getText().toString();

                // Chuyển sang số và tính toán
                double m1 = Double.parseDouble(s1);
                double m2 = Double.parseDouble(s2);
                double m3 = Double.parseDouble(s3);
                double dtb = (m1 + m2 + m3) / 3;

                // Hiển thị kết quả
                edtKetQua.setText(String.valueOf(dtb));
            }
        });

        return view;
    }
}
