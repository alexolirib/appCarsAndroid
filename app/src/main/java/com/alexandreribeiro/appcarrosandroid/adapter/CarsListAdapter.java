package com.alexandreribeiro.appcarrosandroid.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alexandreribeiro.appcarrosandroid.R;
import com.alexandreribeiro.appcarrosandroid.entities.Car;
import com.alexandreribeiro.appcarrosandroid.listener.OnListClickInteractionListener;
import com.alexandreribeiro.appcarrosandroid.viewholder.CarViewHolder;

import java.util.List;

public class CarsListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCar;
    private OnListClickInteractionListener mOnListClickInteractionListener;

    public CarsListAdapter(List<Car> mListCar, OnListClickInteractionListener listener) {

        this.mListCar = mListCar;
        this.mOnListClickInteractionListener = listener;
    }

    //é chamado para cada linha criada
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //obter o context
        Context context = parent.getContext();
       //cria o layout e instancia para obter os elementos
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, parent, false);

        return new CarViewHolder(carView);
    }

    //esse método é chamado toda vez que a linha é preenchido
    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        //obtem o a linha que está utilizando
        //para obter o elemento
        Car car = this.mListCar.get(position);
        //CarViewHolder foi criado para manipular os elementos da interface
        holder.bindData(car, mOnListClickInteractionListener);

    }

    @Override
    public int getItemCount() {
        return this.mListCar.size();
    }
}
