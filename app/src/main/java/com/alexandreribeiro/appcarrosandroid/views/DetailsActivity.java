package com.alexandreribeiro.appcarrosandroid.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alexandreribeiro.appcarrosandroid.R;
import com.alexandreribeiro.appcarrosandroid.constants.CarrosConstants;
import com.alexandreribeiro.appcarrosandroid.data.CarMock;
import com.alexandreribeiro.appcarrosandroid.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolderDetails mViewHolderDetails = new ViewHolderDetails();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mCarMock = new CarMock();

        this.mViewHolderDetails.txtModel = this.findViewById(R.id.text_model);
        this.mViewHolderDetails.txtHorsePower = this.findViewById(R.id.txt_horse_power);
        this.mViewHolderDetails.txtPrice = this.findViewById(R.id.text_price);

        this.getDataFromActivity();

        this.setData();

    }

    private void setData(){
        this.mViewHolderDetails.txtModel.setText(mCar.getModel());
        this.mViewHolderDetails.txtHorsePower.setText(mCar.getHorsePower().toString());
        this.mViewHolderDetails.txtPrice.setText(mCar.getPrice().toString());
    }

    private void getDataFromActivity(){
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
           this.mCar =  this.mCarMock.get(bundle.getInt(CarrosConstants.CARROS_ID));
        }
    }

    private static class ViewHolderDetails{
        TextView txtModel;
        TextView txtHorsePower;
        TextView txtPrice;
    }
}
