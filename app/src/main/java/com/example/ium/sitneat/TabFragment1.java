package com.example.ium.sitneat;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends android.support.v4.app.Fragment {

    ViewPager viewPager1;
    ViewPager viewPager2;
    ViewPager viewPager3;
    int currPosition=0;

    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_fragment1, container, false);

        viewPager1 = (ViewPager) view.findViewById(R.id.bun1);
        viewPager2 = (ViewPager) view.findViewById(R.id.sauce);
        viewPager3 = (ViewPager) view.findViewById(R.id.bun2);

        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());

        viewPager1.setAdapter(viewPagerAdapter);
        viewPager2.setAdapter(viewPagerAdapter);
        viewPager3.setAdapter(viewPagerAdapter);

        final TextView tv = (TextView) view.findViewById(R.id.ingr1);

        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(getActivity(), "Nome:" + viewPager2.getId() , Toast.LENGTH_SHORT).show();
                currPosition = position;
                String currImgName = viewPagerAdapter.ingredients[currPosition].name;
                tv.setText("Ingrediente" +  currImgName);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }

}
