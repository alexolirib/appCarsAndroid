package com.alexandreribeiro.appcarrosandroid.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.alexandreribeiro.appcarrosandroid.R;
import com.alexandreribeiro.appcarrosandroid.adapter.CarsListAdapter;
import com.alexandreribeiro.appcarrosandroid.constants.CarrosConstants;
import com.alexandreribeiro.appcarrosandroid.data.CarMock;
import com.alexandreribeiro.appcarrosandroid.entities.Car;
import com.alexandreribeiro.appcarrosandroid.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mContext = this;

        //meu mock
        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getmListCars());

        // 1 - obter a recyclerView
        this.mViewHolder.recyclerViewCars = findViewById(R.id.recyclerCarsId);

        //implementar a interface
        //para implementar a interface dessa forma faço uma classe anonima
        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarrosConstants.CARROS_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        };

        //2 - definir adapter
        //fazer que o recyclerView e a listagem de comuniquem
        CarsListAdapter carsListAdapter = new CarsListAdapter(carList,listener);
        this.mViewHolder.recyclerViewCars.setAdapter(carsListAdapter);

        //3 - definir layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerViewCars.setLayoutManager(linearLayoutManager);

    }

    private static class ViewHolder {
        RecyclerView recyclerViewCars;
    }
}