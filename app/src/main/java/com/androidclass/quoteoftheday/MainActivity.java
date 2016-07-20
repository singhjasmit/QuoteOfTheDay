package com.androidclass.quoteoftheday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private QuoteService qs;
    private ColorService cs;
    private TextView txtQuote = null;
    private Button btnNext = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQuote = (TextView) findViewById(R.id.text_quote);
        btnNext = (Button) findViewById(R.id.change_btn);
        btnNext.setOnClickListener(this);

        qs = new QuoteService();
        cs = new ColorService();
        setQuote();




    }

    @Override
    public void onClick(View view) {
        setQuote();
        Toast.makeText(getBaseContext(), "Changed the quote", Toast.LENGTH_SHORT).show();
    }

    private void setQuote() {

        if (txtQuote!=null) {
            txtQuote.setText(qs.getQuote());
            txtQuote.setTextColor(cs.getColor());
        }


    }
}
