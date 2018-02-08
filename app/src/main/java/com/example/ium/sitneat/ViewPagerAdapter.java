package com.example.ium.sitneat;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Simone on 07/02/18.
 */

public class ViewPagerAdapter extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    public Ingredient [] ingredients = new Ingredient[3];
    private Integer [] images =  {R.drawable.top_bun, R.drawable.ham1, R.drawable.bot_bun};

    public ViewPagerAdapter(Context context) {
        this.context = context;
        ingredients[0] = new Ingredient("TopBun", 1.0f, R.drawable.top_bun);
        ingredients[1] = new Ingredient("Ham", 1.0f, R.drawable.ham1);
        ingredients[2] = new Ingredient("BotBun", 1.0f, R.drawable.bot_bun);
    }

    @Override
    public int getCount(){
        return ingredients.length;
    }

    @Override
    public boolean isViewFromObject (View view, Object object){
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_viewer, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgView);

        imageView.setImageResource(ingredients[position].img/*images[position]*/);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);


        return view;

    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
