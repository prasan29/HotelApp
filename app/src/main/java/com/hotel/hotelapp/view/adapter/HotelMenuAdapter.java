package com.hotel.hotelapp.view.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hotel.hotelapp.R;
import com.hotel.hotelapp.databinding.MenuItemBinding;
import com.hotel.hotelapp.viewmodel.MenuItemViewModel;

import java.util.List;

public class HotelMenuAdapter extends RecyclerView.Adapter<HotelMenuAdapter.MenuViewHolder> {
    private final List<String> mList;
    private LifecycleOwner mLifecycleOwner;

    public HotelMenuAdapter(List<String> list, LifecycleOwner lifecycleOwner) {
        mList = list;
        mLifecycleOwner = lifecycleOwner;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        MenuItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.menu_item, viewGroup, false);

        binding.setLifecycleOwner(mLifecycleOwner);

        MenuItemViewModel menuItemViewModel = new MenuItemViewModel();

        binding.setViewModel(menuItemViewModel);

        return new MenuViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder menuViewHolder, int i) {
        menuViewHolder.mBinding.getViewModel().mMenuTitle.setValue("Menu " + i);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {
        public MenuItemBinding mBinding;

        public MenuViewHolder(@NonNull MenuItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }
}
