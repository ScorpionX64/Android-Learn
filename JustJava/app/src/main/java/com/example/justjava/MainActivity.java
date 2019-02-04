package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int quantity = 2, price;
    private  String total;
    private CheckBox whippedCream, chocolate;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //createOrderSummary();

        whippedCream = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        chocolate = (CheckBox) findViewById(R.id.chocolate_checkbox);
        name = (EditText) findViewById(R.id.name_edittext);


    }

    public void addQuantity(View view)
    {
        if (quantity < 100) {
            quantity += 1;
            displayQuantity(quantity);
        }
    }

    public void removeQuantity(View view)
    {
        if (quantity > 1) {
            quantity -= 1;
            displayQuantity(quantity);
        }
    }

    private void calculatePrice(int quantity) {

        price = 0;
        if (whippedCream.isChecked())
        {
            price += 1;
        }
        if (chocolate.isChecked())
        {
            price += 2;
        }
        price += 5;
        price = price * quantity;
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
            priceMessage = getString(R.string.order_summary_email_subject, name.getText());
            priceMessage += "\n" + getString(R.string.order_summary_whipped_cream, (Boolean)whippedCream.isChecked());
            priceMessage += "\n" + getString(R.string.order_summary_chocolate, (Boolean)chocolate.isChecked());
            priceMessage += "\n" + getString(R.string.order_summary_quantity, quantity);
            priceMessage += "\n" + getString(R.string.order_summary_price, NumberFormat.getCurrencyInstance().format(price));
            priceMessage += "\n" + getString(R.string.thank_you);
        }


        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summery_text_view);
        orderSummaryTextView.setText(priceMessage);

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("*/*");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "JustJava@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject, name.getText()));
        emailIntent.putExtra(Intent.EXTRA_TEXT, priceMessage);
       // startActivity(emailIntent);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }


}
