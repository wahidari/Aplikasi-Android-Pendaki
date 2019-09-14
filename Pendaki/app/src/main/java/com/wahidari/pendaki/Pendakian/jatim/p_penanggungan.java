package com.wahidari.pendaki.Pendakian.jatim;
/**
 * Created by Wahid Ari on 8/31/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.wahidari.pendaki.MainActivity2;
import com.wahidari.pendaki.R;

public class p_penanggungan extends AppCompatActivity {

    private CardView myCard, myCard2, myCard3, myCard4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_penanggungan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.anim_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Penanggungan");
        ImageView header = (ImageView) findViewById(R.id.header);
        myCard = (CardView) findViewById(R.id.mytxtCard);
        myCard2 = (CardView) findViewById(R.id.mytxtCard2);
        myCard3 = (CardView) findViewById(R.id.mytxtCard3);
        myCard4 = (CardView) findViewById(R.id.mytxtCard4);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
        }
        return true;
    }

    public void mycard(View view) {
        myCard.setVisibility((myCard.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
    }

    public void mycard2(View view) {
        myCard2.setVisibility((myCard2.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
    }

    public void mycard3(View view) {
        myCard3.setVisibility((myCard3.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
    }

    public void mycard4(View view) {
        myCard4.setVisibility((myCard4.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
    }
}
