package NgocVu.baith8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter  extends BaseAdapter {
    //
   private ArrayList<MonAn> dsMonAn;
   private LayoutInflater layoutInflater;
   private Context context;
   // hàm tạo


    public MonAnAdapter(Context _context,ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i ) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewHienHanh = view;
        if(viewHienHanh == null)
           viewHienHanh =layoutInflater.inflate(R.layout.item_monan, null);
        //láy dữ liệu
        MonAn monAnHienTai = dsMonAn.get(i);
        //gán lên các điều khiển


        //tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tenMonAn);
        TextView textView_Gia = (TextView) viewHienHanh.findViewById(R.id.soTien);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.moTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set lên
        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_Gia.setText(String.valueOf(monAnHienTai.getDonGia() ) );
        textView_MoTa.setText(monAnHienTai.getMoTaMonAn());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMH() );

        return viewHienHanh;

    }
}
