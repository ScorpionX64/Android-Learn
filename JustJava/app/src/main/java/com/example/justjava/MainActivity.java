package com.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int quantity = 0, price;
    private  String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createOrderSummary();

    }

    public void addQuantity(View view)
    {
        quantity += 1;
        displayQuantity(quantity);

    }

    public void removeQuantity(View view)
    {
        quantity -= 1;
        displayQuantity(quantity);

    }

    private void calculatePrice(int quantity) {
        price = quantity * 5;
    }

    public void submitOrder(View view) {


        displayQuantity(quantity);
        //displayPrice(quantity * 5);
        calculatePrice(quantity);
        createOrderSummary();
    }

    public void createOrderSummary()
    {

        String priceMessage = "Free";
        if (quantity > 0)
        {
            priceMessage = "Name: Jonathan\nQuantity: " + quantity + " \nTotal: " + NumberFormat.getCurrencyInstance().format(price) + "\nThank you!";
        }


        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summery_text_view);
        orderSummaryTextView.setText(priceMessage);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }


}
