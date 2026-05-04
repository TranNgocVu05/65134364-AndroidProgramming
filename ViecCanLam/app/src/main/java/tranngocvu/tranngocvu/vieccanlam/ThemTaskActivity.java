package tranngocvu.tranngocvu.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText; // Thêm import này

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class ThemTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_them_task);

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lấy dữ liệu
                EditText editTextName = findViewById(R.id.editTextTenCV);
                EditText editTextmessage = findViewById(R.id.editTextMessage);
                EditText editTextPrority = findViewById(R.id.editTextPrority);
                EditText editTextdate = findViewById(R.id.editTextDate);

                String tencv = editTextName.getText().toString();
                String message = editTextmessage.getText().toString();
                String date = editTextdate.getText().toString();

                //
                long prority = Long.parseLong(editTextPrority.getText().toString());
                
                //
                TASKS task = new TASKS(tencv, date, message, prority);
                
                // Kết nối DB
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("TASKS");
                String key = databaseReference.push().getKey();
                
                HashMap<String, Object> items = new HashMap<>();
                items.put(key, task.toMap());

                databaseReference.updateChildren(items, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null) finish();
                    }
                });
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
