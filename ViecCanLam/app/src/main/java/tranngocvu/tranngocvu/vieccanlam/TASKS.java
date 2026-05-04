package tranngocvu.tranngocvu.vieccanlam;

import com.google.firebase.database.IgnoreExtraProperties;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class TASKS implements Serializable {
    private String name;
    private String date;
    private String message;
    private long priority; // Kiểu long để khớp với kiểu Number trên Firebase

    // 1. Constructor không tham số (Bắt buộc phải có để Firebase nạp dữ liệu)
    public TASKS() {
    }

    // 2. Constructor có tham số đầy đủ
    public TASKS(String name, String date, String message, long priority) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.priority = priority;
    }

    // 3. Đầy đủ Getter và Setter cho từng trường
    public String getName() {
        return name != null ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date != null ? date : "";
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message != null ? message : "";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }

    // 4. Hàm hỗ trợ chuyển đổi sang Map (Dùng khi bạn muốn đẩy dữ liệu lên Firebase)
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("date", date);
        result.put("message", message);
        result.put("priority", priority);
        return result;
    }
}
