package id.kampung.belajarfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    List<ModelProvinsi> provinsiList;

    public RecyclerAdapter(Context context, List<ModelProvinsi> provinsiList) {
        this.context = context;
        this.provinsiList = provinsiList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_provinsi,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(provinsiList.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return provinsiList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView ;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
