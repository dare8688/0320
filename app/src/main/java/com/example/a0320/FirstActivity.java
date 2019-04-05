package com.example.a0320;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



public class FirstActivity extends Activity {

     private String[] name={
            "1.文字、圖像呈現牙齒部位",
            "2.正中門齒",
            "2.側門齒",
            "3.犬齒",
            "4.第一小臼齒",
            "5.第二小臼齒",
            "上顎第一小臼齒和上顎第二小臼齒的鑒別",
            "6. 第一大臼齒",
            "7.第二大臼齒",
            "上顎第一大臼齒和上顎第二大臼齒的鑒別",
            "8.中門齒",
            "上顎中切齒和下顎中切齒的鑒別",
            "9. 側門齒",
            "下顎中切齒和下顎側切齒的鑒別",
            "10.犬齒",
            "上顎犬齒和下顎犬齒的鑒別.(上下的鑒別)",
            "11.第一小臼齒",
            "12.第二小臼齒",
            "下顎第一小臼齒和下顎第二小臼齒的鑒別 ",
            "13.第一大臼齒",
            "14. 第二大臼齒",
            "下顎第一大臼齒和下顎第二大臼齒的鑒別"
    };


    private int[] imgSmall = {
            R.drawable.i_1_001a_s,
            R.drawable.i_2_001w_s,
            R.drawable.i_2_002w_s,
            R.drawable.i_3_001w_s,
            R.drawable.i_4_001w_s,
            R.drawable.i_5_001w_s,
            R.drawable.i_5vs4_001w_s,
            R.drawable.i_6_001w_s,
            R.drawable.i_7_001w_s,
            R.drawable.i_7vs6_001w_s,
            R.drawable.i_8_001w_s,
            R.drawable.i_8vs2_001w_s,
            R.drawable.i_9_001w_s,
            R.drawable.i_9vs8_001w_s,
            R.drawable.i_10_001w_s,
            R.drawable.i_10vs3_001w_s,
            R.drawable.i_11_001w_s,
            R.drawable.i_12_001w_s,
            R.drawable.i_12vs11_001w_s,
            R.drawable.i_13_001w_s,
            R.drawable.i_14_001w_s,
            R.drawable.i_14vs13_001w_s
    };

    private int[] imgLarge = {
            R.drawable.i_1_1add2w_l,
            R.drawable.i_2_2add1w_l,
            R.drawable.i_2_4add3w_l,
            R.drawable.i_3_2add1w_l,
            R.drawable.i_4_2add1w_l,
            R.drawable.i_5_2add1w_l,
            R.drawable.i_5vs4w_l,
            R.drawable.i_6_2add1w_l,
            R.drawable.i_7_2add1w_l,
            R.drawable.i_7vs6w_l,
            R.drawable.i_8_2add1w_l,
            R.drawable.i_8vs2w_l,
            R.drawable.i_9_2add1w_l,
            R.drawable.i_9vs8w_l,
            R.drawable.i_10_2add1w_l,
            R.drawable.i_10vs3w_l,
            R.drawable.i_11_2add1w_l,
            R.drawable.i_12_2add1w_l,
            R.drawable.i_12vs11w_l,
            R.drawable.i_13_2add1w_l,
            R.drawable.i_14_2add1w_l,
            R.drawable.i_14vs13w_l
    };


    //Recycler View 資訊

    ItemData itemsData[] = {
            new ItemData(name[0],   imgSmall[0],    imgLarge[0]),
            new ItemData(name[1],   imgSmall[1],    imgLarge[1]),
            new ItemData(name[2],   imgSmall[2],    imgLarge[2]),
            new ItemData(name[3],   imgSmall[3],    imgLarge[3]),
            new ItemData(name[4],   imgSmall[4],    imgLarge[4]),
            new ItemData(name[5],   imgSmall[5],    imgLarge[5]),
            new ItemData(name[6],   imgSmall[6],    imgLarge[6]),
            new ItemData(name[7],   imgSmall[7],    imgLarge[7]),
            new ItemData(name[8],   imgSmall[8],    imgLarge[8]),
            new ItemData(name[9],   imgSmall[9],    imgLarge[9]),
            new ItemData(name[10],   imgSmall[10],    imgLarge[10]),
            new ItemData(name[11],   imgSmall[11],    imgLarge[11]),
            new ItemData(name[12],   imgSmall[12],    imgLarge[12]),
            new ItemData(name[13],   imgSmall[13],    imgLarge[13]),
            new ItemData(name[14],   imgSmall[14],    imgLarge[14]),
            new ItemData(name[15],   imgSmall[15],    imgLarge[15]),
            new ItemData(name[16],   imgSmall[16],    imgLarge[16]),
            new ItemData(name[17],   imgSmall[17],    imgLarge[17]),
            new ItemData(name[18],   imgSmall[18],    imgLarge[18]),
            new ItemData(name[19],   imgSmall[19],    imgLarge[19]),
            new ItemData(name[20],   imgSmall[20],    imgLarge[20]),
            new ItemData(name[21],   imgSmall[21],    imgLarge[21])
    };

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter mAdapter = new MyAdapter(this, itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
