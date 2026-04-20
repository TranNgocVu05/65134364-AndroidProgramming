package thigk2.tranngocvu.thigk2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class Cau3Fragment extends Fragment {

    public Cau3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewCau3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<DiaDiem> dsDiaDiem = new ArrayList<>();
        // Đã đổi thành R.mipmap.thaptramhuong
        dsDiaDiem.add(new DiaDiem("Tháp Bà Ponagar", "2 Thắng 4, Vĩnh Phước, Nha Trang", R.mipmap.thapba));
        dsDiaDiem.add(new DiaDiem("Chùa Long Sơn", "20 Đường 23/10, Phương Sơn, Nha Trang", R.mipmap.chualongson));
        dsDiaDiem.add(new DiaDiem("VinWonders Nha Trang", "Đảo Hòn Tre, Nha Trang", R.mipmap.vinpear));
        dsDiaDiem.add(new DiaDiem("Viện Hải dương học", "01 Cầu Đá, Nha Trang", R.mipmap.vienhaiduong));
        dsDiaDiem.add(new DiaDiem("Hòn Chồng", "Vĩnh Phước, Nha Trang", R.mipmap.honchong));

        DiaDiemAdapter adapter = new DiaDiemAdapter(dsDiaDiem);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
