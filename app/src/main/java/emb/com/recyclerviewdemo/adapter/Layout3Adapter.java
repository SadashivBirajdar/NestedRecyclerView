package emb.com.recyclerviewdemo.adapter;

/**
 * Created by emb-sadabir on 14/8/15.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import emb.com.recyclerviewdemo.model.ItemClickResponse;
import emb.com.recyclerviewdemo.screen.R;

public class Layout3Adapter extends RecyclerView.Adapter<Layout3Adapter.ViewHolder>
{
    Context context;
    ItemClickResponse itemClickResponse;

    int number;
    public Layout3Adapter(Context context, int number) {
        this.context=context;
        this.number=number;
        itemClickResponse= (ItemClickResponse) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout3_row,parent,false);

        //Creating ViewHolder and passing the object of type view
        ViewHolder vhItem = new ViewHolder(context,view,viewType);

        return vhItem;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.imageView.setImageResource(R.drawable.placeholder);
    }

    @Override
    public int getItemCount() {
        return number;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        public ViewHolder(Context context1, View itemView, int viewType)
        {
            super(itemView);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
            imageView = (ImageView) itemView.findViewById(R.id.rowImage);
        }

        @Override
        public void onClick(View v)
        {
            itemClickResponse.onItemClick(getAdapterPosition());
        }
    }
}
