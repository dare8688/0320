package com.example.a0320;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private static Context context;
    private static ItemData[] itemsData;

    public MyAdapter(Context cnx, ItemData[] itemsData){
        this.context = cnx;
        this.itemsData = itemsData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        //建立新view
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, null);

        //建立 ViewHolder
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position){

        //由 itemData 位置取得數據
        // 並改變圖示
        viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageSmall());
        viewHolder.setOnItemClick(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //宣告配對組，讓FirstActivity內 [RecyclerView]->[ItemList]->[ImageView] 與 SecondActivity 內 [ImageView]配對
                Pair<View, String> imagePair = Pair.create((View) viewHolder.imgViewIcon, "tImage");

                Intent transitionIntent = new Intent(context, SecondActivity.class);
                transitionIntent.putExtra("imageRes",itemsData[position].getImageLarge());

                //製作 Material Design 必須的 ActivityOptionCompat
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)context,imagePair);
                ActivityCompat.startActivity((Activity)context,transitionIntent,options.toBundle());

        }
        });
        }

        //還回 itemData 尺寸 (由佈局管理員調用)
        @Override
        public int getItemCount(){
            return itemsData.length;
        }

        //inner class : 保存 RecyclerView 引用項目
        public static class ViewHolder extends RecyclerView.ViewHolder{
            private View itemLayoutView;
            public TextView txtViewTitle;
            public ImageView imgViewIcon;

            public ViewHolder(View itemLayoutView){
                super(itemLayoutView);
                this.itemLayoutView = itemLayoutView;
                txtViewTitle = (TextView)itemLayoutView.findViewById(R.id.item_title);
                imgViewIcon = (ImageView)itemLayoutView.findViewById(R.id.item_icon);
            }


        public void setOnItemClick(View.OnClickListener l){
            this.itemLayoutView.setOnClickListener(l);
        }
    }
}
