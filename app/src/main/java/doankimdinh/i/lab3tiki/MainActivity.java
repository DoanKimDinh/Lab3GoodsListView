package doankimdinh.i.lab3tiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGood;
    CustomGoodAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGood = findViewById(R.id.lvGood);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("com dien dep tuyet","codota",R.drawable.noicom));
        arrayList.add(new Goods("Kho ga ngon nhat qua dat","cong ty kho ga",R.drawable.khoga));
        arrayList.add(new Goods("Sach hay y nghia","fahasa",R.drawable.lanhdao));
        arrayList.add(new Goods("Sach tuyet pham","sach lau",R.drawable.hieulongtre));
        arrayList.add(new Goods("Dieu khien tu xa","xe dieu khien",R.drawable.mohinh));
        arrayList.add(new Goods("Xe dau keo","Toys Cors",R.drawable.xedochoi));

        adt = new CustomGoodAdapter(this,R.layout.item_listview,arrayList);
        lvGood.setAdapter(adt);
    }
}
