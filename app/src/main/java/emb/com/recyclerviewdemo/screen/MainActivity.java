package emb.com.recyclerviewdemo.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;

import java.util.ArrayList;

import emb.com.recyclerviewdemo.adapter.HomeScreenAdapter;
import emb.com.recyclerviewdemo.constants.Constants;
import emb.com.recyclerviewdemo.model.ItemClickResponse;
import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;

public class MainActivity extends AppCompatActivity implements ItemClickResponse{

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Constants.setSpaceBetweenItemsForLayout3 =true;
        Constants.setSpaceBetweenItemsForLayout5 =true;
        Constants.setSpaceBetweenItemsForLayout6 =true;
        Constants.setSpaceBetweenItemsForLayout7 =true;

        recyclerView= (RecyclerView) findViewById(R.id.RecyclerView);
        RadioButton radioButton= (RadioButton) findViewById(R.id.rbtnLinearVertical);
        radioButton.setChecked(true);

        ArrayList arrayList=new ArrayList<>();
        arrayList.add("Banner_Single_Image");
        arrayList.add("Banner_With_Scroll");
        arrayList.add("Shop_By_Store");
        arrayList.add("Hangout");
        arrayList.add("Shop_by_Brand");
        arrayList.add("Shop_by_product");
        arrayList.add("Whats_hot_videos");

        HomeScreenAdapter adapter=new HomeScreenAdapter(this,arrayList);

        ScaleInAnimationAdapter animationAdapter = new ScaleInAnimationAdapter(adapter);
        animationAdapter.setFirstOnly(false);
        animationAdapter.setDuration(500);

        recyclerView.setAdapter(animationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(int position) {
        Log.d("LOG","Position "+position+" clicked");
    }

    public void call(View v)
    {
        switch (v.getId())
        {
            case R.id.rbtnLinearHorizontal:
                recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
                break;

            case R.id.rbtnLinearVertical:
                recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
                break;

            case R.id.rbtnLinearHorizontalReverse:
                recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
                break;

            case R.id.rbtnGridHorizontal:
                GridLayoutManager layoutManager=new GridLayoutManager(this,2,LinearLayoutManager.HORIZONTAL,false);
                recyclerView.setLayoutManager(layoutManager);
                break;

            case R.id.rbtnGridVertical:
                GridLayoutManager layoutManager1=new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false);
                recyclerView.setLayoutManager(layoutManager1);
                break;

            case R.id.rbtnStaggeredVertical:
                StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(manager);
                break;

        }
    }
}
