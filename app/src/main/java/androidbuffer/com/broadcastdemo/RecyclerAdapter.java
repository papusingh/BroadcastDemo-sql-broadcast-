package androidbuffer.com.broadcastdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by incred-dev on 27/6/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<IncomingNumber> incomingNumberList = new ArrayList<>();

    public RecyclerAdapter(List<IncomingNumber> list) {
        this.incomingNumberList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.id.setText(Integer.toString(incomingNumberList.get(position).getId()));
        holder.number.setText(incomingNumberList.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return incomingNumberList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id, number;

        public MyViewHolder(View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.tvId);
            number = itemView.findViewById(R.id.tvNumber);
        }
    }
}
