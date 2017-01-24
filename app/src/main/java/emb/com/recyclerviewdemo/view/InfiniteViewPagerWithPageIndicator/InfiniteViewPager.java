package emb.com.recyclerviewdemo.view.InfiniteViewPagerWithPageIndicator;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * A {@link ViewPager} that allows pseudo-infinite paging with a wrap-around
 * effect. Should be used with an {@link InfinitePagerAdapter}.
 *
 */
public class InfiniteViewPager extends ViewPager {

	private boolean infinitePagesEnabled = true;
	private boolean enabled=true;

	public InfiniteViewPager(Context context) {
		super(context);
	}

	public InfiniteViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public void setAdapter(PagerAdapter adapter) {
		super.setAdapter(adapter);
		// offset first element so that we can scroll to the left
		setCurrentItem(0);
	}

	public void setPagingEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (this.enabled) {
			return super.onTouchEvent(event);
		}

		return false;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {
		if (this.enabled) {
			return super.onInterceptTouchEvent(event);
		}

		return false;
	}

	@Override
	public void setCurrentItem(int item) {
//		if (infinitePagesEnabled) {
//			// offset the current item to ensure there is space to scroll
//			item = getOffsetAmount() + (item % getAdapter().getCount());
//		}
		super.setCurrentItem(item);

	}

	public void setCurrentItemMannually(int item,String type){

		if (type.equals("system")){
			if (infinitePagesEnabled) {
				// offset the current item to ensure there is space to scroll
				item = getOffsetAmount() + (item % getAdapter().getCount());
			}
		}
		setCurrentItem(item);


	}

	public void enableInfinitePages(boolean enable) {
		infinitePagesEnabled = enable;
		if (getAdapter() instanceof InfinitePagerAdapter) {
			InfinitePagerAdapter infAdapter = (InfinitePagerAdapter) getAdapter();
			infAdapter.enableInfinitePages(enable);
		}
	}

	public int getOffsetAmount() {
		if (getAdapter() instanceof InfinitePagerAdapter) {
			InfinitePagerAdapter infAdapter = (InfinitePagerAdapter) getAdapter();
			// allow for 100 back cycles from the beginning
			// should be enough to create an illusion of infinity
			// warning: scrolling to very high values (1,000,000+) results in
			// strange drawing behaviour
			return infAdapter.getRealCount() * 100;
		} else {
			return 0;
		}
	}

	@Override
	public int getCurrentItem() {
		return super.getCurrentItem();
	}

	public int getCurrentItemNumber(){
		return getCurrentItem();
	}



}
