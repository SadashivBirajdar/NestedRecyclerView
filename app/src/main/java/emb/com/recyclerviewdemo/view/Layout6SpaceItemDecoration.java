package emb.com.recyclerviewdemo.view;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import emb.com.recyclerviewdemo.constants.Constants;

/**
 * Created by emb-sadabir on 28/8/15.
 */
public class Layout6SpaceItemDecoration extends RecyclerView.ItemDecoration{

    private final int space;

    public Layout6SpaceItemDecoration(int space) {
        if(Constants.setSpaceBetweenItemsForLayout6)
            this.space = space;
        else
            this.space = 0;
        Constants.setSpaceBetweenItemsForLayout6=false;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {

        outRect.right = space;
        if (parent.getChildAdapterPosition(view) !=parent.getAdapter().getItemCount()-1) {
            outRect.bottom = space;
        }
    }
}
