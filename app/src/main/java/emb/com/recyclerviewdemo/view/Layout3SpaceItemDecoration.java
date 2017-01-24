package emb.com.recyclerviewdemo.view;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import emb.com.recyclerviewdemo.constants.Constants;

/**
 * Created by emb-sadabir on 26/8/15.
 */
public class Layout3SpaceItemDecoration extends RecyclerView.ItemDecoration {

    private final int mHorizontalSpaceHeight;

    public Layout3SpaceItemDecoration(int mHorizontalSpaceHeight) {
        if(Constants.setSpaceBetweenItemsForLayout3)
            this.mHorizontalSpaceHeight = mHorizontalSpaceHeight;
        else
            this.mHorizontalSpaceHeight = 0;
        Constants.setSpaceBetweenItemsForLayout3 =false;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
            RecyclerView.State state) {

        if (parent.getChildAdapterPosition(view) !=0)  {
            outRect.left = mHorizontalSpaceHeight;
        }
    }
}
