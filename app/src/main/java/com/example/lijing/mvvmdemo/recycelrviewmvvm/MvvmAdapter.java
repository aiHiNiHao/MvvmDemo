package com.example.lijing.mvvmdemo.recycelrviewmvvm;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lijing.mvvmdemo.R;
import com.example.lijing.mvvmdemo.databinding.ItemRvBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lijing on 2019/3/23.
 */

public class MvvmAdapter extends RecyclerView.Adapter<MvvmAdapter.MyHolder> {

    private Context context;
    private List<ShowBean> list;
    public MvvmAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ShowBean bean = new ShowBean(i, "lijing");
            list.add(bean);
        }
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ItemRvBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_rv, viewGroup, false);
        MyHolder myHolder = new MyHolder(binding);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int position) {
        ItemRvBinding binding = myHolder.getBinding();
        binding.setBean(list.get(position));
        binding.executePendingBindings();
        binding.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.get(position).setName("wangli");
            }
        });
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class MyHolder extends RecyclerView.ViewHolder{
        ItemRvBinding itemRvBinding;
        ItemRvBinding getBinding(){
            return itemRvBinding;
        }
        public MyHolder(ItemRvBinding itemRvBinding){
            super(itemRvBinding.getRoot());
            this.itemRvBinding = itemRvBinding;
        }
    }
}
