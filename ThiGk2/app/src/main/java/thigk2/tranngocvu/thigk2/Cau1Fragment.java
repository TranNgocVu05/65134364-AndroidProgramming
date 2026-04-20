package thigk2.tranngocvu.thigk2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {

    EditText edtChieuDai, edtChieuRong;
    Button btnTinh;
    TextView tvChuVi, tvDienTich;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau1, container, false);

        // Ánh xạ view
        edtChieuDai = view.findViewById(R.id.edtChieuDai);
        edtChieuRong = view.findViewById(R.id.edtChieuRong);
        btnTinh = view.findViewById(R.id.btnTinh);
        tvChuVi = view.findViewById(R.id.tvChuVi);
        tvDienTich = view.findViewById(R.id.tvDienTich);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhToan();
            }
        });

        return view;
    }

    void TinhToan() {
        String strDai = edtChieuDai.getText().toString();
        String strRong = edtChieuRong.getText().toString();

        if (strDai.isEmpty() || strRong.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double dai = Double.parseDouble(strDai);
            double rong = Double.parseDouble(strRong);

            double chuVi = (dai + rong) * 2;
            double dienTich = dai * rong;

            tvChuVi.setText("Chu vi: " + chuVi);
            tvDienTich.setText("Diện tích: " + dienTich);
        } catch (NumberFormatException e) {
            Toast.makeText(getContext(), "Dữ liệu không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}
