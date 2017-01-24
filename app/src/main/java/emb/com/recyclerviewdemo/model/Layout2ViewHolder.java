package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfiniteCirclePageIndicator;
import emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator.InfiniteViewPager;

/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout2ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout2Title;
    private ImageView ivLayout2Image;
    private RelativeLayout topBannerLayout;
    private ImageButton topSliderLeftArrow,topSliderRightButton;
    private InfiniteViewPager topScrollableSlider;
    private InfiniteCirclePageIndicator mPageIndicator;


    public Layout2ViewHolder(View v) {
        super(v);
        tvLayout2Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout2Image = (ImageView) v.findViewById(R.id.iv_title_image);
        topBannerLayout = (RelativeLayout) v.findViewById(R.id.fragmentHomescreen_topbannerLayout);
        topSliderLeftArrow = (ImageButton) v.findViewById(R.id.fragment_homescreen_topSliderLeftArrow);
        topSliderRightButton = (ImageButton) v.findViewById(R.id.fragment_homescreen_topSliderRightArrow);

        topScrollableSlider = (InfiniteViewPager) v.findViewById(R.id.fragment_homescreen_topSlider);
        topScrollableSlider.setOffscreenPageLimit(3);

        mPageIndicator = (InfiniteCirclePageIndicator) v.findViewById(R.id.fragment_homescreen_topSlider_page_indicator);
        // Because animation between circles now looks ugly, we should disable it
        mPageIndicator.setSnap(true);
    }

    public void setTvLayout2Title(TextView tvLayout2Title) {
        this.tvLayout2Title = tvLayout2Title;
    }

    public void setIvLayout2Image(ImageView ivLayout2Image) {
        this.ivLayout2Image = ivLayout2Image;
    }

    public void setTopBannerLayout(RelativeLayout topBannerLayout) {
        this.topBannerLayout = topBannerLayout;
    }

    public void setTopSliderLeftArrow(ImageButton topSliderLeftArrow) {
        this.topSliderLeftArrow = topSliderLeftArrow;
    }

    public void setTopSliderRightButton(ImageButton topSliderRightButton) {
        this.topSliderRightButton = topSliderRightButton;
    }

    public void setTopScrollableSlider(InfiniteViewPager topScrollableSlider) {
        this.topScrollableSlider = topScrollableSlider;
    }

    public void setmPageIndicator(InfiniteCirclePageIndicator mPageIndicator) {
        this.mPageIndicator = mPageIndicator;
    }

    public TextView getTvLayout2Title() {
        return tvLayout2Title;
    }

    public ImageView getIvLayout2Image() {

        return ivLayout2Image;
    }

    public RelativeLayout getTopBannerLayout() {
        return topBannerLayout;
    }

    public ImageButton getTopSliderLeftArrow() {
        return topSliderLeftArrow;
    }

    public ImageButton getTopSliderRightButton() {
        return topSliderRightButton;
    }

    public InfiniteViewPager getTopScrollableSlider() {
        return topScrollableSlider;
    }

    public InfiniteCirclePageIndicator getmPageIndicator() {
        return mPageIndicator;
    }
}