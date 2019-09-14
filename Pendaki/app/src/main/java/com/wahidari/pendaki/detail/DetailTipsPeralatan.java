/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wahidari.pendaki.detail;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.wahidari.pendaki.MainActivity3;
import com.wahidari.pendaki.R;

/**
 * Provides UI for the Detail page with Collapsing Toolbar.
 */
public class DetailTipsPeralatan extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.CollapsedAppBar);

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.nama_peralatan);
        collapsingToolbar.setTitle(places[postion % places.length]);

        TypedArray imagePeralatan = resources.obtainTypedArray(R.array.image_peralatan);
        ImageView imageperalatan = (ImageView) findViewById(R.id.images_peralatan);
        imageperalatan.setImageDrawable(imagePeralatan.getDrawable(postion % imagePeralatan.length()));

        String[] namaPeralatan = resources.getStringArray(R.array.nama_peralatan);
        TextView namaperalatan = (TextView) findViewById(R.id.nama_peralatan);
        namaperalatan.setText(namaPeralatan[postion % namaPeralatan.length]);

        String[] detailPeralatan = resources.getStringArray(R.array.detail_tips_peralatan);
        TextView detailperalatan = (TextView) findViewById(R.id.detail_peralatan);
        detailperalatan.setText(detailPeralatan[postion % detailPeralatan.length]);

        imagePeralatan.recycle();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            startActivity(new Intent(this,MainActivity3.class));
        }
        return true;
    }
}
