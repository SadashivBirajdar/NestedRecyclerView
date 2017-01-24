package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;


/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout6ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout6Title;
    private ImageView ivLayout6Image;
    private RecyclerView rvLinearVerticle;

    public Layout6ViewHolder(View v) {
        super(v);
        tvLayout6Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout6Image = (ImageView) v.findViewById(R.id.iv_title_image);
        rvLinearVerticle= (RecyclerView) v.findViewById(R.id.RecyclerView);
    }

    public void setTvLayout6Title(TextView tvLayout6Title) {
        this.tvLayout6Title = tvLayout6Title;
    }

    public void setIvLayout6Image(ImageView ivLayout6Image) {
        this.ivLayout6Image = ivLayout6Image;
    }

    public void setRvLinearVerticle(RecyclerView rvLinearVerticle) {
        this.rvLinearVerticle = rvLinearVerticle;
    }

    public TextView getTvLayout6Title() {
        return tvLayout6Title;
    }

    public ImageView getIvLayout6Image() {

        return ivLayout6Image;
    }

    public RecyclerView getRvLinearVerticle() {
        return rvLinearVerticle;
    }
}
