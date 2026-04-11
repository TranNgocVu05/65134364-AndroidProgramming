package NgocVu.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Cau1Fragment extends Fragment {

    EditText editTextS1, editTextS2, editTextKq;
    Button nutCong, nutTru, nutNhan, nutChia;

    public Cau1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cau1, container, false);

        // Ánh xạ view
        editTextS1 = view.findViewById(R.id.edtS1);
        editTextS2 = view.findViewById(R.id.edtS2);
        editTextKq = view.findViewById(R.id.edtKq);

        nutCong = view.findViewById(R.id.btnCong);
        nutTru = view.findViewById(R.id.btnTru);
        nutNhan = view.findViewById(R.id.btnNhan);
        nutChia = view.findViewById(R.id.btnChia);

        // Bắt sự kiện
        nutCong.setOnClickListener(v -> XuLyCong());
        nutTru.setOnClickListener(v -> XuLyTru());
        nutNhan.setOnClickListener(v -> XuLyNhan());
        nutChia.setOnClickListener(v -> XuLyChia());

        return view;
    }

    float[] laySo() {
        String s1 = editTextS1.getText().toString().trim();
        String s2 = editTextS2.getText().toString().trim();

        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)) {
            editTextKq.setText("Nhập đủ 2 số");
            return null;
        }

        float num1 = Float.parseFloat(s1);
        float num2 = Float.parseFloat(s2);

        return new float[]{num1, num2};
    }

    void XuLyCong() {
        float[] nums = laySo();
        if (nums == null) return;
        editTextKq.setText(String.valueOf(nums[0] + nums[1]));
    }

    void XuLyTru() {
        float[] nums = laySo();
        if (nums == null) return;
        editTextKq.setText(String.valueOf(nums[0] - nums[1]));
    }

    void XuLyNhan() {
        float[] nums = laySo();
        if (nums == null) return;
        editTextKq.setText(String.valueOf(nums[0] * nums[1]));
    }

    void XuLyChia() {
        float[] nums = laySo();
        if (nums == null) return;

        if (nums[1] == 0) {
            editTextKq.setText("Không chia cho 0");
            return;
        }

        editTextKq.setText(String.valueOf(nums[0] / nums[1]));
    }

}