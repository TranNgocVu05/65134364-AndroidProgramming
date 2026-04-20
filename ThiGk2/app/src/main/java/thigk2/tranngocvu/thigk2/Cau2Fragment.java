package thigk2.tranngocvu.thigk2;

iimport android.content.Intent;
import android.content.Intent;
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

    ArrayList<String> dsTenMonAn;// Khai báo
    public static Cau2Fragment newInstance(String param1, String param2) {
        Cau2Fragment fragment = new Cau2Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau2, container, false);
        dsTenMonAn= new ArrayList<String>();// Tạo thể hiện cụ thể , xin mới
        //thêm dữ liệu
        // ten mon
        dsTenMonAn.add("Món Ăn 1");
        dsTenMonAn.add("Món Ăn 2");
        dsTenMonAn.add("Món Ăn 3");
        dsTenMonAn.add("Món Ăn 4");
        dsTenMonAn.add("Món Ăn 5");
        dsTenMonAn.add("Món Ăn 6");

        ArrayAdapter<String> adapterMonAn;
        adapterMonAn = new ArrayAdapter<>(getContext(),
                R.layout.item_center,
                R.id.tvItem,
                dsTenMonAn
        );
        // Sửa lỗi sai ID ở đây: lvDanhSachMonAn -> lvDSMonAn
        ListView lvTenMonAn = view.findViewById(R.id.lvDSMonAn);
        lvTenMonAn.setAdapter(adapterMonAn);
        lvTenMonAn.setOnItemClickListener(BoLangNgheVaXL);
        return view;
    }

    AdapterView.OnItemClickListener BoLangNgheVaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            String strTenMonAn = dsTenMonAn.get(i);
            Intent intent = new Intent(getContext(), ChiTietMonAn.class);
            intent.putExtra("tenMon", strTenMonAn);
            startActivity(intent);
        }
    };
}