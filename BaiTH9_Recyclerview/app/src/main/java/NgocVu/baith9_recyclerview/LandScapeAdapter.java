package NgocVu.baith9_recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lsData;

    public LandScapeAdapter(Context _context, ArrayList<LandScape> lsData) {
        this.context = _context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // lấy đối tượng hiển thị
        LandScape landScapeHienThi = lsData.get(position);
        // trích thông tin
        String caption= landScapeHienThi.getLandCation();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        //đặt vào các trởng thông tin
        holder.tvCaption.setText(caption);
        //
            String packageName = holder.itemView.getContext().getPackageName();
            int imageID = holder.itemView.getResources().getIdentifier(tenAnh,"mipmap",packageName);
        holder.imLandScape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCaption;
        ImageView imLandScape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            imLandScape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //
            int viTriDuocClick = getAdapterPosition();
           LandScape phanTuDuocCL = lsData.get(viTriDuocClick);
           //bóc thông tin
            String ten = phanTuDuocCL.getLandCation();
            String tenFile = phanTuDuocCL.getLandImageFileName();
            //toast
            String chuoiThongBao =" bạn vừa CLick vào : " + ten;
            Toast.makeText(v.getContext(), chuoiThongBao,Toast.LENGTH_SHORT).show();
        }
    }
}
