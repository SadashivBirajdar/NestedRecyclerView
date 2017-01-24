package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;

/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout1ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout1Title;
    private ImageView ivLayout1Image, ivLayout1Banner;

    public Layout1ViewHolder(View v) {
        super(v);
        tvLayout1Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout1Image = (ImageView) v.findViewById(R.id.iv_title_image);
        ivLayout1Banner = (ImageView) v.findViewById(R.id.lin_single_banner_image);
    }

    public void setTvLayout1Title(TextView tvLayout1Title) {
        this.tvLayout1Title = tvLayout1Title;
    }

    public void setIvLayout1Image(ImageView ivLayout1Image) {
        this.ivLayout1Image = ivLayout1Image;
    }

    public void setIvLayout1Banner(ImageView ivLayout1Banner) {
        this.ivLayout1Banner = ivLayout1Banner;
    }

    public TextView getTvLayout1Title() {
        return tvLayout1Title;
    }

    public ImageView getIvLayout1Image() {

        return ivLayout1Image;
    }

    public ImageView getIvLayout1Banner() {
        return ivLayout1Banner;
    }
}