package com.example.amirul.testing;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestingAdapter extends RecyclerView.Adapter<TestingAdapter.ViewHolder> {

    List<UserModel> list;
    Context context;

    public TestingAdapter(List userModels, Context context) {

        this.list = userModels;
        context = context;

        Log.e("Tag", userModels.toString());

    }

    @NonNull
    @Override
    public TestingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_recycler, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TestingAdapter.ViewHolder viewHolder, int i) {

        UserModel model = list.get(i);

        viewHolder.id.setText(model.getId());
        viewHolder.userId.setText(model.getUserId());
        viewHolder.title.setText(model.getTitle());
        viewHolder.body.setText(model.getBody());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id, userId, title, body;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id = (TextView) itemView.findViewById(R.id.Tvid);
            userId = (TextView) itemView.findViewById(R.id.TvUserId);
            title = (TextView) itemView.findViewById(R.id.TvTitle);
            body = (TextView) itemView.findViewById(R.id.TvBody);
        }
    }
}
