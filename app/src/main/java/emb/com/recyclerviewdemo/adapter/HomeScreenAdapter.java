package emb.com.recyclerviewdemo.adapter;

/**
 * Created by emb-sadabir on 13/8/15.
 */

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import emb.com.recyclerviewdemo.model.ItemClickResponse;
import emb.com.recyclerviewdemo.model.Layout1ViewHolder;
import emb.com.recyclerviewdemo.model.Layout2ViewHolder;
import emb.com.recyclerviewdemo.model.Layout3ViewHolder;
import emb.com.recyclerviewdemo.model.Layout4ViewHolder;
import emb.com.recyclerviewdemo.model.Layout5ViewHolder;
import emb.com.recyclerviewdemo.model.Layout6ViewHolder;
import emb.com.recyclerviewdemo.model.Layout7ViewHolder;
import emb.com.recyclerviewdemo.screen.R;
import emb.com.recyclerviewdemo.view.CustomGridLayoutManager;
import emb.com.recyclerviewdemo.view.CustomLinearLayoutManager;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfinitePagerAdapter;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfiniteViewPager;
import emb.com.recyclerviewdemo.view.Layout3SpaceItemDecoration;
import emb.com.recyclerviewdemo.view.Layout5SpaceItemDecoration;
import emb.com.recyclerviewdemo.view.Layout6SpaceItemDecoration;
import emb.com.recyclerviewdemo.view.Layout7SpaceItemDecoration;

public class HomeScreenAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final int LAYOUT1 = 1;
    private static final int LAYOUT2 = 2;
    private static final int LAYOUT3 = 3;
    private static final int LAYOUT4 = 4;
    private static final int LAYOUT5 = 5;
    private static final int LAYOUT6 = 6;
    private static final int LAYOUT7 = 7;

    private Context context;
    private ItemClickResponse onItemClickResponse;

    ArrayList<String> arrayList;
    public HomeScreenAdapter(Context context, ArrayList<String> arrayList) {
        this.context=context;
        this.arrayList = arrayList;

        onItemClickResponse= (ItemClickResponse) context;
    }

    // This method returns the number of items present in the list
    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    // With the following method we check what type of view is being passed
    @Override
    public int getItemViewType(int position)
    {
        String layoutType=arrayList.get(position);

        Log.d("LOG", "LayoutType: " + layoutType);

        if (layoutType.equals("Banner_Single_Image"))
            return LAYOUT1;
        else if (layoutType.equals("Banner_With_Scroll"))
            return LAYOUT2;
        else if (layoutType.equals("Shop_By_Store"))
            return LAYOUT3;
        else if (layoutType.equals("Hangout"))
            return LAYOUT4;
        else if (layoutType.equals("Shop_by_Brand"))
            return LAYOUT5;
        else if (layoutType.equals("Shop_by_product"))
            return LAYOUT6;
        if (layoutType.equals("Whats_hot_videos"))
            return LAYOUT7;

        return -1;
    }
 
    //Override the method onCreateViewHolder which is called when the ViewHolder is
    //Created, In this method we inflate the layout according to viewType
 
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType)
        {
            case LAYOUT1:
                View v1=inflater.inflate(R.layout.home_layout_1, parent, false);
                viewHolder = new Layout1ViewHolder(v1);
                break;

            case LAYOUT2:
                View v2=inflater.inflate(R.layout.home_layout_2,parent,false);
                viewHolder = new Layout2ViewHolder(v2);
                break;

            case LAYOUT3:
                View v3=inflater.inflate(R.layout.home_layout_3,parent,false);
                viewHolder = new Layout3ViewHolder(v3);
                break;

            case LAYOUT4:
                View v4=inflater.inflate(R.layout.home_layout_4,parent,false);
                viewHolder = new Layout4ViewHolder(v4);
                break;

            case LAYOUT5:
                View v5=inflater.inflate(R.layout.home_layout_5,parent,false);
                viewHolder = new Layout5ViewHolder(v5);
                break;

            case LAYOUT6:
                View v6=inflater.inflate(R.layout.home_layout_6,parent,false);
                viewHolder = new Layout6ViewHolder(v6);
                break;

            case LAYOUT7:
                View v7=inflater.inflate(R.layout.home_layout_7,parent,false);
                viewHolder = new Layout7ViewHolder(v7);
                break;
        }
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        switch (viewHolder.getItemViewType()) {

            case LAYOUT1:
                Layout1ViewHolder vh1 = (Layout1ViewHolder) viewHolder;
                configureViewHolder1(vh1, position);
                break;

            case LAYOUT2:
                Layout2ViewHolder vh2 = (Layout2ViewHolder) viewHolder;
                configureViewHolder2(vh2, position);
                break;

            case LAYOUT3:
                Layout3ViewHolder vh3 = (Layout3ViewHolder) viewHolder;
                configureViewHolder3(vh3, position);
                break;

            case LAYOUT4:
                Layout4ViewHolder vh4 = (Layout4ViewHolder) viewHolder;
                configureViewHolder4(vh4, position);
                break;

            case LAYOUT5:
                Layout5ViewHolder vh5 = (Layout5ViewHolder) viewHolder;
                configureViewHolder5(vh5, position);
                break;

            case LAYOUT6:
                Layout6ViewHolder vh6 = (Layout6ViewHolder) viewHolder;
                configureViewHolder6(vh6, position);
                break;

            case LAYOUT7:
                Layout7ViewHolder vh7 = (Layout7ViewHolder) viewHolder;
                configureViewHolder7(vh7, position);
                break;
        }
    }

    private void configureViewHolder1(Layout1ViewHolder vh1, int position) {

        vh1.getIvLayout1Banner().setImageResource(R.drawable.placeholder);
    }

    private void configureViewHolder2(Layout2ViewHolder vh2, int position) {
        int item = 0;
        ArrayList<String> bannerData=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            bannerData.add("image"+i);
        }

        Layout2Adapter layout2Adapter = new Layout2Adapter(context, bannerData);

        InfinitePagerAdapter topScrollableSliderAdapter = new InfinitePagerAdapter(layout2Adapter);

        // Show one page on the screen at a time
        topScrollableSliderAdapter.setOneItemMode();
        final InfiniteViewPager topScrollableSlider = vh2.getTopScrollableSlider();
        topScrollableSlider.setAdapter(topScrollableSliderAdapter);

        item = topScrollableSlider.getOffsetAmount() + (item % layout2Adapter.getCount());
        topScrollableSlider.setCurrentItemMannually(item, "mannually");

        vh2.getmPageIndicator().setViewPager(topScrollableSlider);


        vh2.getTopSliderLeftArrow().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int presentItem = topScrollableSlider.getCurrentItemNumber();
                topScrollableSlider.setCurrentItemMannually(--presentItem, "manually");
            }
        });

        vh2.getTopSliderRightButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int presentItem = topScrollableSlider.getCurrentItemNumber();
                topScrollableSlider.setCurrentItemMannually(++presentItem, "mannualy");
            }
        });
    }

    private void configureViewHolder3(Layout3ViewHolder vh3, int position) {

        RecyclerView recyclerView=vh3.getRvLayout3();
        Layout3Adapter adapter=new Layout3Adapter(context,4);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new CustomLinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // convert dp into pixels
        final float scale = context.getResources().getDisplayMetrics().density;
        int pixels = (int) (5 * scale + 0.5f);
        recyclerView.addItemDecoration(new Layout3SpaceItemDecoration(pixels));
    }


    private void configureViewHolder4(Layout4ViewHolder vh4, int position) {

        vh4.getIvLayout4First().setImageResource(R.drawable.placeholder);
        vh4.getIvLayout4Second().setImageResource(R.drawable.placeholder);
    }

    private void configureViewHolder5(Layout5ViewHolder vh5, int position) {

        RecyclerView recyclerView=vh5.getRvGridVertical();

        Layout5Adapter adapter=new Layout5Adapter(context,8);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new CustomGridLayoutManager(context,2, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // convert dp into pixels
        final float scale = context.getResources().getDisplayMetrics().density;
        int pixels = (int) (3 * scale + 0.5f);
        recyclerView.addItemDecoration(new Layout5SpaceItemDecoration(pixels));
    }

    private void configureViewHolder6(Layout6ViewHolder vh6, int position) {

        RecyclerView recyclerView=vh6.getRvLinearVerticle();

        Layout6Adapter adapter=new Layout6Adapter(context,3);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new CustomLinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        // convert dp into pixels
        final float scale = context.getResources().getDisplayMetrics().density;
        int pixels = (int) (3 * scale + 0.5f);
        recyclerView.addItemDecoration(new Layout6SpaceItemDecoration(pixels));
    }

    private void configureViewHolder7(Layout7ViewHolder vh7, int position) {

        ArrayList<String> bannerData=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            bannerData.add("image"+i);
        }

        RecyclerView recyclerView=vh7.getRvYoutube();
        recyclerView.setHasFixedSize(true);

        int height=calculateHeight(bannerData.size());
        Log.i("LOG","Height: "+height);
        ViewGroup.LayoutParams params = recyclerView.getLayoutParams();
        params.height = height;

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // convert dp into pixels
        final float scale = context.getResources().getDisplayMetrics().density;
        int pixels = (int) (3 * scale + 0.5f);
        recyclerView.addItemDecoration(new Layout7SpaceItemDecoration(pixels));

        Layout7Adapter adapter=new Layout7Adapter(context,bannerData);
        recyclerView.setAdapter(adapter);
    }

    private int calculateHeight(int size)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        int singleViewHeight = (int) (200 * scale + 0.5f);
        int spaceHeight=(int) (3 * scale + 0.5f);
        int totalHeight=(singleViewHeight*size)+(spaceHeight*(size-1));
        return totalHeight;
    }
}
