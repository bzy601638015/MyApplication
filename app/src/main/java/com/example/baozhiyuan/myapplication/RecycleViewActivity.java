package com.example.baozhiyuan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RecycleViewActivity extends AppCompatActivity {
    @Bind(R.id.recyclerview)
    RecyclerView mRecyclerView;

    private List<String> mListData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        ButterKnife.bind(this);
        initData();
        mRecyclerView.setAdapter(new MyAdapter());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void initData(){
        for (int i = 0; i <100; i++) {
            mListData.add("测试  －－> "+i);
        }
    }



    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            MyViewHolder mHolder = new MyViewHolder(LayoutInflater.from(RecycleViewActivity.this).inflate(R.layout.item_rc_test,null));
            return mHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
            myViewHolder.mTvName.setText(mListData.get(i));
        }

        @Override
        public int getItemCount() {
            return mListData.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            @Bind(R.id.item_rc_iv_header)
            ImageView mIvHeader;
            @Bind(R.id.item_rc_tv_name)
            TextView mTvName;

            public MyViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(itemView);
            }
        }

    }
}
