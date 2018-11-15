package com.alexandreribeiro.appcarrosandroid.data;

import com.alexandreribeiro.appcarrosandroid.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {
    private List<Car> mListCars;

    public CarMock(){
        this.mListCars = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            this.mListCars.add(new Car(i, String.valueOf(i),i*10, Double.valueOf(i*100)));
        }
    }

    public List<Car> getmListCars() {
        return mListCars;
    }

    public Car get(int id){
        return this.mListCars.get(id);
    }
}
