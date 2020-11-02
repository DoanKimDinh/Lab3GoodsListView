package doankimdinh.i.lab3tiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodAdapter extends BaseAdapter {

    public CustomGoodAdapter(Context ctx, int layoutItems, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItems = layoutItems;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItems;
    ArrayList<Goods> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutItems,parent,false);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvShopName = convertView.findViewById(R.id.tvShopName);
        ImageView imageGood = convertView.findViewById(R.id.imgGood);

        tvName.setText(arrayList.get(position).getName());
        tvShopName.setText(arrayList.get(position).getShopName());
        imageGood.setImageResource(arrayList.get(position).getImageGoods());

        return convertView;
    }
}
