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
    ViewPager viewPager4;
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
        viewPager2 = (ViewPager) view.findViewById(R.id.meat);
        viewPager3 = (ViewPager) view.findViewById(R.id.adds);
        viewPager4 = (ViewPager) view.findViewById(R.id.bun2);

        final ViewPagerAdapter viewPagerAdapter1 = new ViewPagerAdapter(getActivity());
        final ViewPagerAdapter viewPagerAdapter2 = new ViewPagerAdapter(getActivity());
        final ViewPagerAdapter viewPagerAdapter3 = new ViewPagerAdapter(getActivity());
        final ViewPagerAdapter viewPagerAdapter4 = new ViewPagerAdapter(getActivity());

        viewPager1.setAdapter(setCategory(viewPagerAdapter1, "BreadTop", 2));
        viewPager2.setAdapter(setCategory(viewPagerAdapter2, "Meat", 3));
        viewPager3.setAdapter(setCategory(viewPagerAdapter3, "Adds", 9));
        viewPager4.setAdapter(setCategory(viewPagerAdapter4, "BreadBot", 2));



        final TextView tv = (TextView) view.findViewById(R.id.ingr1);



        viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //Toast.makeText(getActivity(), "Nome:" + viewPager2.getId() , Toast.LENGTH_SHORT).show();
                currPosition = position;
                //viewPager4.setCurrentItem(position);
                String currImgName = viewPagerAdapter1.ingredients[currPosition].name;
                tv.setText("Ingrediente: " +  currImgName);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }

    public ViewPagerAdapter setCategory(ViewPagerAdapter v1, String cate, int n) {

        Ingredient [] ingredients = new Ingredient[n];
        ViewPagerAdapter nv1 = v1;
        int i = 0;
        for (Ingredient ing : v1.ingredients) {
            if (ing.getCategory().equals(cate))
            {
                ingredients[i] = ing;
                i++;
            }
        }

        nv1.ingredients = ingredients;

        return nv1;
    }
}
