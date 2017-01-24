package emb.com.recyclerviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import emb.com.recyclerviewdemo.screen.R;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfiniteCirclePageIndicator;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfinitePagerAdapter;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfiniteViewPager;

/**
 * Created by emb-sadabir on 26/8/15.
 */
public class Layout5Adapter extends RecyclerView.Adapter<Layout5Adapter.ViewHolder>
{
    Context context;
    int number;
    public Layout5Adapter(Context context, int i) {
        this.context=context;
        this.number=i;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalslider,parent,false);

        //Creating ViewHolder and passing the object of type view
        ViewHolder vhItem = new ViewHolder(context,view,viewType);

        return vhItem;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        int item = 0;
        ArrayList<String> bannerData=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            bannerData.add("image"+i);
        }

        // change height for Shop_BY_Brand category
        final float scale = context.getResources().getDisplayMetrics().density;
        int pixels = (int) (260 * scale + 0.5f);
        ViewGroup.LayoutParams params = holder.horizontalSliderLayout.getLayoutParams();
        params.height = pixels;

        HorizontalSliderAdapter sliderAdapter = new HorizontalSliderAdapter(context, bannerData);

        InfinitePagerAdapter topScrollableSliderAdapter = new InfinitePagerAdapter(sliderAdapter);


        // Show one page on the screen at a time
        topScrollableSliderAdapter.setOneItemMode();
        holder.topScrollableSlider.setAdapter(topScrollableSliderAdapter);

        item = holder.topScrollableSlider.getOffsetAmount() + (item % sliderAdapter.getCount());
        holder.topScrollableSlider.setCurrentItemMannually(item, "mannually");

        holder.pageIndicator.setViewPager(holder.topScrollableSlider);
    }

    @Override
    public int getItemCount() {
        return number;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private InfiniteViewPager topScrollableSlider;
        private InfiniteCirclePageIndicator pageIndicator;
        private RelativeLayout horizontalSliderLayout;
        public ViewHolder(Context context1, View itemView, int viewType)
        {
            super(itemView);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);

            horizontalSliderLayout= (RelativeLayout) itemView.findViewById(R.id.HorizontalSlider);
            topScrollableSlider = (InfiniteViewPager) itemView.findViewById(R.id.fragment_homescreen_topSlider);
            topScrollableSlider.setOffscreenPageLimit(3);

            pageIndicator = (InfiniteCirclePageIndicator) itemView.findViewById(R.id.fragment_homescreen_topSlider_page_indicator);
            // Because animation between circles now looks ugly, we should disable it
            pageIndicator.setSnap(true);
        }

        @Override
        public void onClick(View v)
        {
            Log.d("LOG", "Position " + getAdapterPosition() + " clicked");
        }
    }
}
