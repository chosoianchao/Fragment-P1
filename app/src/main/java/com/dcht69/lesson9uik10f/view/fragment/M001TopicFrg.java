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
import com.dcht69.lesson9uik10f.databinding.FrgM001TopicBinding;
import com.dcht69.lesson9uik10f.view.OnCallBack;

public class M001TopicFrg extends Fragment {
    public static final String KEY_SHOW_ANIMAL_LIST = "KEY_SHOW_ANIMAL_LIST";
    public static final String KEY_SHOW_PLANT_LIST ="KEY_SHOW_PLANT_LIST" ;
    public static final String TAG = M001TopicFrg.class.getName();
    private Context mContext;
    private View rootView;
    private FrgM001TopicBinding binding;
    private OnCallBack mCallBack;

    public void setCallBack(OnCallBack mCallBack) {
        this.mCallBack = mCallBack;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.frg_m001_topic, container, false);
        binding = FrgM001TopicBinding.bind(rootView);
        initViews();
        return rootView;
    }

    private void initViews() {
        binding.tvAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnimalList();
            }
        });
        binding.tvPlant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPlantList();
            }
        });

    }

    private void showPlantList() {
        mCallBack.callBackToView(null,KEY_SHOW_PLANT_LIST);
    }

    private void showAnimalList() {
    mCallBack.callBackToView(null,KEY_SHOW_ANIMAL_LIST);

    }
}
