package com.alexandreribeiro.appcarrosandroid.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.alexandreribeiro.appcarrosandroid.R;
import com.alexandreribeiro.appcarrosandroid.entities.Car;
import com.alexandreribeiro.appcarrosandroid.listener.OnListClickInteractionListener;

//com viewHolder recebe os elementos da interface
public class CarViewHolder extends RecyclerView.ViewHolder{

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = itemView.findViewById(R.id.text_model);

    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {
        this.mTextModel.setText(car.getModel());
        this.mTextModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //delega para quem tiver chamando o evento
                listener.onClick(car.getId());
            }
        });
    }
}
