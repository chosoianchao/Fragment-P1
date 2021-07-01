package com.dcht69.lesson9uik10f.view.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.dcht69.lesson9uik10f.R;
import com.dcht69.lesson9uik10f.view.OnCallBack;
import com.dcht69.lesson9uik10f.view.fragment.M001TopicFrg;
import com.dcht69.lesson9uik10f.view.fragment.M002ListAnimalFrg;
import com.dcht69.lesson9uik10f.view.fragment.M003ListPlantFrg;
import com.dcht69.lesson9uik10f.view.fragment.M004DetailsFood;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        M001TopicFrg frgTopic = (M001TopicFrg) getSupportFragmentManager()
                .findFragmentById(R.id.frg_topic);
        if (frgTopic != null) {
            frgTopic.setCallBack(this);
        }

    }

    public void showAnimalFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        M002ListAnimalFrg frgAnimal = new M002ListAnimalFrg();

        fragmentTransaction.replace(R.id.fr_main, frgAnimal, M002ListAnimalFrg.TAG);
        fragmentTransaction.commit();
    }

    public void showPlantFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        M003ListPlantFrg frgPlant = new M003ListPlantFrg();

        fragmentTransaction.replace(R.id.fr_main, frgPlant, M003ListPlantFrg.TAG);
        fragmentTransaction.commit();
    }

    @Override
    public void callBackToView(Object data, String key) {
        if (key.equals(M001TopicFrg.KEY_SHOW_ANIMAL_LIST)) {
            showAnimalFragment();
        } else if (key.equals(M001TopicFrg.KEY_SHOW_PLANT_LIST)) {
            showPlantFragment();
        }
    }

    public void showFoodDetailsFrg(int ivFood) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        M004DetailsFood frgFood = new M004DetailsFood();
        frgFood.setData(ivFood);
        fragmentTransaction//.addToBackStack(M001TopicFrg.TAG)
                .replace(R.id.ln_main, frgFood, M004DetailsFood.TAG);

        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        List<Fragment> fragmentList = fragmentManager.getFragments();
        if (fragmentList.size() > 0) {
            Fragment fragment = fragmentList.get(fragmentList.size()-1);
            if (fragment instanceof M004DetailsFood) {
                fragmentManager.beginTransaction().remove(fragment).commit();
                return;
            }
        }
        super.onBackPressed();
    }
}