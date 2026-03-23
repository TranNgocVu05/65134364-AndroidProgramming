package NgocVu.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lvDSMonAn = (ListView) findViewById(R.id.LvDSMonAn);

        // chuan bi du liệu
        ArrayList<MonAn>  dsMonAn = new ArrayList<>();
        dsMonAn.add(new MonAn("Cơm Tắm Sường",25000,"Mo tả ở đây", R.drawable.comts));
        dsMonAn.add(new MonAn("Cơm Gà",30000,"Mo tả ở đây", R.drawable.comga));
        dsMonAn.add(new MonAn("Cơm Vịt",35000,"Mo tả ở đây", R.drawable.comvit));
        dsMonAn.add(new MonAn("Cơm Tắm Đặc Biệt",35000,"Mo tả ở đây", R.drawable.comdb));
        dsMonAn.add(new MonAn("Cơm Tắm Bì Chả",25000,"Mo tả ở đây", R.drawable.combicha));

        //
        MonAnAdapter adapter = new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        //bat xu ly sk
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //lấy phần tử được chạm
                MonAn monAnChon = dsMonAn.get(i);
                //lam gi do
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}