package com.rjsgml1105.tranferapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rjsgml1105.tranferapp.R;
import com.rjsgml1105.tranferapp.model.History;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    Context context;
    ArrayList<History> historyList;

    public HistoryAdapter(Context context, ArrayList<History> historyList) {
        this.context = context;
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public HistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.transfer_row, parent, false);
        return new HistoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.ViewHolder holder, int position) {

        History history = historyList.get(position);
        holder.txtText.setText(history.text);
        holder.txtResult.setText(history.result);
        holder.textTarget.setText(history.target);


    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

   public class ViewHolder extends  RecyclerView.ViewHolder {
       TextView txtText;
       TextView txtResult;
       TextView textTarget;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);

           txtText = itemView.findViewById(R.id.txtText);
           txtResult = itemView.findViewById(R.id.txtResult);
           textTarget = itemView.findViewById(R.id.textTarget);



       }
   }


}
