package tranngocvu.tranngocvu.vieccanlam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskRVadapter extends RecyclerView.Adapter<TaskRVadapter.TaskItemViewHolder> {
    private List<TASKS> dataSource;

    public TaskRVadapter(List<TASKS> dataSource) {
        this.dataSource = dataSource;
    }

    public static class TaskItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvTenCL;
        TextView tvNgayHetHan;

        public TaskItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenCL = itemView.findViewById(R.id.TextViewTenVCL);
            tvNgayHetHan = itemView.findViewById(R.id.textViewThoiGian);
        }
    }

    @NonNull
    @Override
    public TaskItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskItemViewHolder holder, int position) {
        TASKS task = dataSource.get(position);
        holder.tvTenCL.setText(task.getName());
        holder.tvNgayHetHan.setText(task.getDate());

        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Bạn vừa chọn việc: " + task.getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return dataSource != null ? dataSource.size() : 0;
    }
}
