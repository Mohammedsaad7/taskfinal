package com.example.zee.taskfinal;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class recycleadapt extends RecyclerView.Adapter {
    private static final String TAG = "recycleadapt";
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vie= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_adapt,viewGroup,false);
        return new ListViewHolder(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

       ((ListViewHolder)viewHolder).bindView(i);
    }

    @Override
    public int getItemCount() {
        return addables.uname.length;
    }
    private  class  ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mtext;
        private ImageView icontext, prosttext;

        public ListViewHolder(View iv){
            super(iv);
            mtext=(TextView) itemView.findViewById(R.id.nameid);
            icontext=(ImageView) itemView.findViewById(R.id.profile);
            prosttext=(ImageView) itemView.findViewById(R.id.prostt);
            itemView.setOnClickListener(this);
        }

        public void bindView(int pos){
            Log.d(TAG, "reaching" );
            mtext.setText(addables.uname[pos]);
            icontext.setImageResource(addables.icons[pos]);
            prosttext.setImageResource(addables.prost[pos]);
        }
        public void onClick(View view){

        }
    }
}
