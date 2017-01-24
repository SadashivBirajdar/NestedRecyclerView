package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;

/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout3ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout3Title;
    private ImageView ivLayout3Image;
    private RecyclerView rvLayout3;

    public Layout3ViewHolder(View v) {
        super(v);
        tvLayout3Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout3Image = (ImageView) v.findViewById(R.id.iv_title_image);
        rvLayout3= (RecyclerView) v.findViewById(R.id.rvLayout3);
    }

    public void setTvLayout3Title(TextView tvLayout3Title) {
        this.tvLayout3Title = tvLayout3Title;
    }

    public void setIvLayout3Image(ImageView ivLayout3Image) {
        this.ivLayout3Image = ivLayout3Image;
    }

    public void setRvLayout3(RecyclerView rvLayout3) {
        this.rvLayout3 = rvLayout3;
    }

    public TextView getTvLayout3Title() {
        return tvLayout3Title;
    }

    public ImageView getIvLayout3Image() {

        return ivLayout3Image;
    }

    public RecyclerView getRvLayout3() {
        return rvLayout3;
    }
}