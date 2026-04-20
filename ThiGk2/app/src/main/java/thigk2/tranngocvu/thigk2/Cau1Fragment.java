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
    Button btnChuVi, btnDienTich;
    TextView tvKetQua;

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
        btnChuVi = view.findViewById(R.id.btnChuVi);
        btnDienTich = view.findViewById(R.id.btnDienTich);
        tvKetQua = view.findViewById(R.id.tvKetQua);

        btnChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhChuVi();
            }
        });

        btnDienTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhDienTich();
            }
        });

        return view;
    }

    void TinhChuVi() {
        String strDai = edtChieuDai.getText().toString();
        String strRong = edtChieuRong.getText().toString();

        if (validateInput(strDai, strRong)) {
            double dai = Double.parseDouble(strDai);
            double rong = Double.parseDouble(strRong);
            double chuVi = (dai + rong) * 2;
            tvKetQua.setText("Chu vi: " + chuVi);
        }
    }

    void TinhDienTich() {
        String strDai = edtChieuDai.getText().toString();
        String strRong = edtChieuRong.getText().toString();

        if (validateInput(strDai, strRong)) {
            double dai = Double.parseDouble(strDai);
            double rong = Double.parseDouble(strRong);
            double dienTich = dai * rong;
            tvKetQua.setText("Diện tích: " + dienTich);
        }
    }

    boolean validateInput(String strDai, String strRong) {
        if (strDai.isEmpty() || strRong.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return false;
        }
        try {
            Double.parseDouble(strDai);
            Double.parseDouble(strRong);
            return true;
        } catch (NumberFormatException e) {
            Toast.makeText(getContext(), "Dữ liệu không hợp lệ", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
