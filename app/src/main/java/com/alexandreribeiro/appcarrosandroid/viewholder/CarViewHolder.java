package com.alexandreribeiro.appcarrosandroid.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexandreribeiro.appcarrosandroid.R;
import com.alexandreribeiro.appcarrosandroid.entities.Car;
import com.alexandreribeiro.appcarrosandroid.listener.OnListClickInteractionListener;

//com viewHolder recebe os elementos da interface
public class CarViewHolder extends RecyclerView.ViewHolder{

    private ImageView mImgCar;
    private TextView mTxtVerDetalhes;
    private TextView mTxtModel;


    public CarViewHolder(View itemView) {
        super(itemView);
        this.mImgCar = itemView.findViewById(R.id.img_car_pic);
        this.mTxtVerDetalhes = itemView.findViewById(R.id.txt_details);
        this.mTxtModel = itemView.findViewById(R.id.txt_car_model);


    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {
        this.mTxtModel.setText(car.getModel());
        this.mImgCar.setImageDrawable(car.getPicture());
        this.mTxtVerDetalhes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //delega para quem tiver chamando o evento
                listener.onClick(car.getId());
            }
        });
    }
}
