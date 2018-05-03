package thanhhuong.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import thanhhuong.cardview.adapter.MainAdapter;
import thanhhuong.cardview.pojos.SingleHorizontal;
import thanhhuong.cardview.pojos.SingleVertical;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_View);
        MainAdapter adapter = new MainAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<Object> getObject() {
        objects.add(getVerticalData().get(0));
        objects.add(getHorizontalData().get(0));
        return objects;
    }

    public static ArrayList<SingleVertical> getVerticalData() {
        ArrayList<SingleVertical> singleVerticals = new ArrayList<>();
        singleVerticals.add(new SingleVertical("47 ký lô", "là idol của tôi, hòa đồng, vui vẻ, lâu lâu hơi cộc tính xíu.....", R.mipmap.hoaiphuong));
        singleVerticals.add(new SingleVertical("Chi wa wa", "là pet cưng của tôi, người đồng hành cùng tôi các kỉ niệm của thời sinh viên nội trú", R.mipmap.haoanh));
        singleVerticals.add(new SingleVertical("Anti cả thế giới", "Đây là nhóm của tôi vừa quen khi chuyển phòng nội trú, họ giúp tôi nhận ra chỉ cần ta mở lòng thì mọi thứ đều trở nên tốt đẹp", R.mipmap.anti));
        return singleVerticals;
    }


    public static ArrayList<SingleHorizontal> getHorizontalData() {
        ArrayList<SingleHorizontal> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontal(R.mipmap.hoaiphuong, "47 ký lô", "là idol của tôi, hòa đồng, vui vẻ, lâu lâu hơi cộc tính xíu.....", "1997/12/25"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.haoanh, "Chi wa wa", "là pet cưng của tôi, người đồng hành cùng tôi các kỉ niệm của thời sinh viên nội trú", "1997/7/12"));
        singleHorizontals.add(new SingleHorizontal(R.mipmap.anti, "Anti cả thế giới", "Đây là nhóm của tôi vừa quen khi chuyển phòng nội trú, họ giúp tôi nhận ra chỉ cần ta mở lòng thì mọi thứ đều trở nên tốt đẹp", "2018/2/26"));
        return singleHorizontals;
    }


}
