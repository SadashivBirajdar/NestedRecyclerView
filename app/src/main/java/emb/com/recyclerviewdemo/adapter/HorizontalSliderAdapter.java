package emb.com.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import emb.com.recyclerviewdemo.model.ItemClickResponse;
import emb.com.recyclerviewdemo.screen.R;

/**
 * Created by emb-sadabir on 25/8/15.
 */
public class HorizontalSliderAdapter extends PagerAdapter {

    private LayoutInflater mInflater;
    ArrayList<String> banners;

    private ItemClickResponse itemClickResponse;

    public HorizontalSliderAdapter(Context context, ArrayList<String> banners) {
        mInflater = LayoutInflater.from(context);
        this.banners =banners;
        this.itemClickResponse= (ItemClickResponse) context;
    }

    @Override
    public int getCount() {
        return banners.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = getView(position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    private View getView(final int position) {
        View pageView = mInflater.inflate(R.layout.single_slider_item, null);

        ImageView imageView= (ImageView) pageView.findViewById(R.id.singleSliderImage);

        imageView.setImageResource(R.drawable.placeholder);


        pageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                itemClickResponse.onItemClick(position);
            }
        });

        return pageView;
    }
}