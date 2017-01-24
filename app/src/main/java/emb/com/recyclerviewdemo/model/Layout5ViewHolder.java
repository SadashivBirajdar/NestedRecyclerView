package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;


/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout5ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout5Title;
    private ImageView ivLayout5Image;
    private RecyclerView rvGridVertical;

    public Layout5ViewHolder(View v) {
        super(v);
        tvLayout5Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout5Image = (ImageView) v.findViewById(R.id.iv_title_image);
        rvGridVertical = (RecyclerView) v.findViewById(R.id.RecyclerView);
    }

    public void setTvLayout5Title(TextView tvLayout5Title) {
        this.tvLayout5Title = tvLayout5Title;
    }

    public void setIvLayout5Image(ImageView ivLayout5Image) {
        this.ivLayout5Image = ivLayout5Image;
    }

    public void setRvGridVertical(RecyclerView rvGridVertical) {
        this.rvGridVertical = rvGridVertical;
    }

    public TextView getTvLayout5Title() {
        return tvLayout5Title;
    }

    public ImageView getIvLayout5Image() {

        return ivLayout5Image;
    }

    public RecyclerView getRvGridVertical() {
        return rvGridVertical;
    }
}