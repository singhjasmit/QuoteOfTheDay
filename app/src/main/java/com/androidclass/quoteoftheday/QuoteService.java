package com.androidclass.quoteoftheday;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jsingh on 7/19/16.
 */
public class QuoteService {
    private Random randomGenerator = new Random();
    private List<String> quotes= new ArrayList<String>();
    private static final String TAG = QuoteService.class.getSimpleName();


    public QuoteService() {

        quotes.add("Stop acting so small. You are the universe in ecstatic motion.");
        quotes.add("What you seek is seeking you.");
        quotes.add("Don’t grieve. Anything you lose comes round in another form.");
        quotes.add("You were born with wings, why prefer to crawl through life?");
        quotes.add("Silence is the language of god; all else is poor translation.");

    }

    // get a random quote

    public String getQuote() {
        String item = "";
        int index = randomGenerator.nextInt(quotes.size());
        item = quotes.get(index);
        Log.d(TAG, "New quote selected: " + item);
        return item;
    }
}
