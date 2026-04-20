package thigk2.tranngocvu.thigk2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DiaDiemAdapter extends RecyclerView.Adapter<DiaDiemAdapter.DiaDiemViewHolder> {

    private List<DiaDiem> dsDiaDiem;

    public DiaDiemAdapter(List<DiaDiem> dsDiaDiem) {
        this.dsDiaDiem = dsDiaDiem;
    }

    @NonNull
    @Override
    public DiaDiemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dia_diem, parent, false);
        return new DiaDiemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiaDiemViewHolder holder, int position) {
        DiaDiem diaDiem = dsDiaDiem.get(position);
        holder.tvTen.setText(diaDiem.getTen());
        holder.tvDiaChi.setText(diaDiem.getDiaChi());
        holder.imgAnh.setImageResource(diaDiem.getAnhResId());
    }

    @Override
    public int getItemCount() {
        return dsDiaDiem.size();
    }

    static class DiaDiemViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAnh;
        TextView tvTen, tvDiaChi;

        public DiaDiemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imgDiaDiem);
            tvTen = itemView.findViewById(R.id.tvTenDiaDiem);
            tvDiaChi = itemView.findViewById(R.id.tvDiaChi);
        }
    }
}
