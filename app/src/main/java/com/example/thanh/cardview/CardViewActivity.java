package com.example.thanh.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.thanh.cardview.adapter.MainAdapter;
import com.example.thanh.cardview.pojos.SingleHorizontal;
import com.example.thanh.cardview.pojos.SingleVertical;

import java.util.ArrayList;
import java.util.Objects;

public class CardViewActivity extends AppCompatActivity {
    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MainAdapter adapter = new MainAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private ArrayList<Object> getObject(){
        objects.add(getVerticalData().get(0));
        objects.add(getHorizontalData().get(0));
        return objects;
    }
    public static ArrayList<SingleVertical> getVerticalData(){
        ArrayList<SingleVertical> singleVerticals = new ArrayList<>();
        singleVerticals.add(new SingleVertical("HoaiPhuong", "My Idol", R.mipmap.hoaiphuong));
        singleVerticals.add(new SingleVertical("Ha Oanh", "My Pet", R.mipmap.haoanh));
        singleVerticals.add(new SingleVertical("Anti ca the gioi", "My team", R.mipmap.anti));
        return singleVerticals;
    }
    public static ArrayList<SingleHorizontal> getHorizontalData(){
        ArrayList<SingleHorizontal> singleHorizontal = new ArrayList<>();
        singleHorizontal.add(new SingleHorizontal(R.mipmap.hoaiphuong, "Hoai Phuong", "My Idol", "25/12/1997"));
        singleHorizontal.add(new SingleHorizontal(R.mipmap.haoanh, "Ha Oanh", "My Pet", "12/07/1997"));
        singleHorizontal.add(new SingleHorizontal(R.mipmap.anti, "Anti ca the gioi", "My Team", "26/02/2018"));
        return singleHorizontal;
    }

}
