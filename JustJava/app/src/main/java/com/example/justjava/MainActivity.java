package com.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int quantity = 0;
    private  String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String priceMessage = "Free";
        displayMessage(priceMessage);

    }

    public void addQuantity(View view)
    {
        quantity += 1;
        display(quantity);

    }

    public void removeQuantity(View view)
    {
        quantity -= 1;
        display(quantity);

    }

    public void submitOrder(View view) {

        String priceMessage = "Free";
        display(quantity);
        //displayPrice(quantity * 5);
        if (quantity > 0)
        {
            priceMessage = "Total: " + NumberFormat.getCurrencyInstance().format(quantity * 5) + "\n\rThank you!";
        }
        displayMessage(priceMessage);
    }

    public void displayMessage(String priceMessage)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(priceMessage);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
