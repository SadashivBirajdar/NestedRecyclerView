package emb.com.recyclerviewdemo.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import emb.com.recyclerviewdemo.screen.R;


/**
 * Created by emb-sadabir on 14/8/15.
 */
public class Layout4ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvLayout4Title;
    private ImageView ivLayout4Image;
    private ImageView ivLayout4First;
    private ImageView ivLayout4Second;

    public Layout4ViewHolder(View v) {
        super(v);
        tvLayout4Title = (TextView) v.findViewById(R.id.tv_title);
        ivLayout4Image = (ImageView) v.findViewById(R.id.iv_title_image);
        ivLayout4First = (ImageView) v.findViewById(R.id.iv_first);
        ivLayout4Second = (ImageView) v.findViewById(R.id.iv_second);
    }

    public void setTvLayout4Title(TextView tvLayout4Title) {
        this.tvLayout4Title = tvLayout4Title;
    }

    public void setIvLayout4Image(ImageView ivLayout4Image) {
        this.ivLayout4Image = ivLayout4Image;
    }

    public void setIvLayout4First(ImageView ivLayout4First) {
        this.ivLayout4First = ivLayout4First;
    }

    public void setIvLayout4Second(ImageView ivLayout4Second) {
        this.ivLayout4Second = ivLayout4Second;
    }

    public TextView getTvLayout4Title() {
        return tvLayout4Title;
    }

    public ImageView getIvLayout4Image() {

        return ivLayout4Image;
    }

    public ImageView getIvLayout4First() {
        return ivLayout4First;
    }

    public ImageView getIvLayout4Second() {
        return ivLayout4Second;
    }
}