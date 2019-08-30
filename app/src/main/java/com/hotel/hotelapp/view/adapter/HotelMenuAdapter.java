package com.hotel.hotelapp.view.adapter;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hotel.hotelapp.R;
import com.hotel.hotelapp.databinding.MenuItemBinding;
import com.hotel.hotelapp.datastore.Menus;
import com.hotel.hotelapp.viewmodel.MenuItemViewModel;

public class HotelMenuAdapter extends RecyclerView.Adapter<HotelMenuAdapter.MenuViewHolder> {
    private final Activity mActivity;
    private SparseArray<Menus> mMenuList;
    private LifecycleOwner mLifecycleOwner;

    public HotelMenuAdapter(SparseArray<Menus> list, LifecycleOwner lifecycleOwner,
            Activity activity) {
        mMenuList = list;
        mActivity = activity;
        mLifecycleOwner = lifecycleOwner;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        MenuItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.menu_item, viewGroup, false);

        binding.setLifecycleOwner(mLifecycleOwner);

        return new MenuViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder menuViewHolder, int i) {
        Menus menu = mMenuList.get(i);

        MenuItemViewModel menuItemViewModel = new MenuItemViewModel(mActivity);

        menuItemViewModel.mMenuTitle.setValue(menu.getTitle());
        menuItemViewModel.mMenuDescription.setValue(menu.getDescription());
        menuItemViewModel.mIsDiningVisible.setValue(menu.isDining());
        menuItemViewModel.mIsNonVegVisible.setValue(menu.isNonVeg());
        menuItemViewModel.mRate.setValue("\u20AC" + menu.getRate());

        menuViewHolder.bind(menuItemViewModel);
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {
        MenuItemBinding mBinding;

        MenuViewHolder(@NonNull MenuItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        void bind(MenuItemViewModel viewModel) {
            mBinding.setViewModel(viewModel);
            mBinding.executePendingBindings();
        }
    }
}
