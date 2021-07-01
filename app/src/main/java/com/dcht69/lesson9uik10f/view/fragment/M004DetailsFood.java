package com.dcht69.lesson9uik10f.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dcht69.lesson9uik10f.R;
import com.dcht69.lesson9uik10f.databinding.FrgM004DetailsFoodBinding;

public class M004DetailsFood extends Fragment {
    public static final String TAG = M004DetailsFood.class.getName();
    private Context mContext;
    private View rootView;
    private FrgM004DetailsFoodBinding binding;
    private int mIvFood;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.frg_m004_details_food, container, false);
        binding = FrgM004DetailsFoodBinding.bind(rootView);
        initViews();
        return rootView;
    }

    private void initViews() {
        binding.ivFood.setImageResource(mIvFood);
    }

    public void setData(int ivFood) {
        mIvFood = ivFood;
    }
}
