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
import com.dcht69.lesson9uik10f.databinding.FrgM003ListPlantBinding;

public class M003ListPlantFrg extends Fragment {
    public static final String TAG = M003ListPlantFrg.class.getName();
    private Context mContext;
    private View rootView;
    private FrgM003ListPlantBinding binding;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        context = mContext;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.frg_m003_list_plant, container, false);
        binding = FrgM003ListPlantBinding.bind(rootView);
        initViews();
        return rootView;
    }

    private void initViews() {
    }
}
