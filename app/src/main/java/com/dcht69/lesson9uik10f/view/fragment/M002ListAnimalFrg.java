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
import com.dcht69.lesson9uik10f.databinding.FrgM002ListAnimalBinding;
import com.dcht69.lesson9uik10f.view.activity.MainActivity;

public class M002ListAnimalFrg extends Fragment {
    public static final String TAG = M002ListAnimalFrg.class.getName();
    private Context mContext;
    private View rootView;
    private FrgM002ListAnimalBinding binding;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.frg_m002_list_animal, container, false);
        binding = FrgM002ListAnimalBinding.bind(rootView);
        initViews();
        return rootView;
    }

    private void initViews() {
        binding.ivElephant.setOnClickListener(view -> showFoodDetails(R.drawable.ic_grass1));
        binding.ivZebra.setOnClickListener(view -> showFoodDetails(R.drawable.ic_grass2));
        binding.ivGiraffe.setOnClickListener(view -> showFoodDetails(R.drawable.ic_grass3));
    }

    private void showFoodDetails(int ivFood) {
        MainActivity mainActivity = (MainActivity) mContext;
        mainActivity.showFoodDetailsFrg(ivFood);
    }
}
