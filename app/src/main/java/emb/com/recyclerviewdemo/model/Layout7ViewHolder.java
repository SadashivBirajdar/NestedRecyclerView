package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;


/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout7ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout7Title;
    private ImageView ivLayout7Image;
    private RecyclerView rvYoutube;

    public Layout7ViewHolder(View v) {
        super(v);
        tvLayout7Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout7Image = (ImageView) v.findViewById(R.id.iv_title_image);
        rvYoutube= (RecyclerView) v.findViewById(R.id.list);
    }

    public void setTvLayout7Title(TextView tvLayout7Title) {
        this.tvLayout7Title = tvLayout7Title;
    }

    public void setIvLayout7Image(ImageView ivLayout7Image) {
        this.ivLayout7Image = ivLayout7Image;
    }

    public void setRvYoutube(RecyclerView rvYoutube) {
        this.rvYoutube = rvYoutube;
    }

    public TextView getTvLayout7Title() {
        return tvLayout7Title;
    }

    public ImageView getIvLayout7Image() {

        return ivLayout7Image;
    }

    public RecyclerView getRvYoutube() {
        return rvYoutube;
    }
}