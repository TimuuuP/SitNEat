package com.example.ium.sitneat;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    public Ingredient [] ingredients = new Ingredient[16];
    private Integer [] images =  {R.drawable.top_bun, R.drawable.ham1, R.drawable.bot_bun};

    public ViewPagerAdapter(Context context) {
        this.context = context;
        ingredients[0] = new Ingredient("Bun", "BreadTop", 1.0f, R.drawable.top_bun);
        ingredients[1] = new Ingredient("Toast", "BreadTop", 1.0f, R.drawable.toast);
        ingredients[2] = new Ingredient("Bun", "BreadBot", 1.0f, R.drawable.bot_bun);
        ingredients[3] = new Ingredient("Toast", "BreadBot", 1.0f, R.drawable.toast);
        ingredients[4] = new Ingredient("Hamburger di Manzo", "Meat", 1.0f, R.drawable.ham1);
        ingredients[5] = new Ingredient("Hamburger di Cavallo", "Meat", 1.0f, R.drawable.ham2);
        ingredients[6] = new Ingredient("Hamburger di Soia", "Meat", 1.0f, R.drawable.soy_ham);
        ingredients[7] = new Ingredient("Bacon", "Adds", 1.0f, R.drawable.bacon);
        ingredients[8] = new Ingredient("Cheese", "Adds", 1.0f, R.drawable.cheese);
        ingredients[9] = new Ingredient("Uovo", "Adds", 1.0f, R.drawable.egg);
        ingredients[10] = new Ingredient("Patatine Fritte", "Adds", 1.0f, R.drawable.fries);
        ingredients[11] = new Ingredient("Lattuga", "Adds", 1.0f, R.drawable.lettuce);
        ingredients[12] = new Ingredient("Cipolla", "Adds", 1.0f, R.drawable.onion);
        ingredients[13] = new Ingredient("Peperoni", "Adds", 1.0f, R.drawable.pepperoni);
        ingredients[14] = new Ingredient("Cetriolini Sottaceto e Funghi", "Adds", 1.0f, R.drawable.pickled_cucumber_mushrooms);
        ingredients[15] = new Ingredient("Pomodoro", "Adds", 1.0f, R.drawable.tomato);
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
