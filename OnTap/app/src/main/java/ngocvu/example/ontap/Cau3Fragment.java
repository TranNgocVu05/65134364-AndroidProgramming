package ngocvu.example.ontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Cau3Fragment extends Fragment {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Khởi tạo dữ liệu

        list = new ArrayList<LandScape>();
        list.add (new LandScape("@mipmap/daubung","Bài Thuốc 1","Thời Gian: 2019"));
        list.add(new LandScape("eiffel","Bài Thuốc 2","Thời Gian: 2019"));
        list.add(new LandScape("buckingham","Bài Thuốc 3","Thời Gian: 2019"));
        list.add(new LandScape("nhatrang","Bài Thuốc 4","Thời Gian: 2019"));
        list.add(new LandScape("haugiang","Bài Thuốc 5","Thời Gian: 2019"));
        list.add(new LandScape("nhatrang","Bài Thuốc 6","Thời Gian: 2019"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape = view.findViewById(R.id.recyclerViewCau3);
        //
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(getContext());;
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //
        LandScapeAdapter adapter = new LandScapeAdapter(view.getContext(),list);
        //gan vao recycler view
        recyclerViewLandScape.setAdapter(adapter);
        return view;
    }
}