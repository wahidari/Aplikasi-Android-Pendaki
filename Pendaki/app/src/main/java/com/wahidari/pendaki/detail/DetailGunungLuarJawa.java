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

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.wahidari.pendaki.R;

/**
 * Provides UI for the Detail page with Collapsing Toolbar.
 */
public class DetailGunungLuarJawa extends AppCompatActivity {

    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.nama_gunung_luar);
        collapsingToolbar.setTitle(places[postion % places.length]);

        TypedArray imageGunung = resources.obtainTypedArray(R.array.image_gunung_luar);
        ImageView imagegunung = (ImageView) findViewById(R.id.images);
        imagegunung.setImageDrawable(imageGunung.getDrawable(postion % imageGunung.length()));

        String[] namaGunung = resources.getStringArray(R.array.nama_gunung_luar);
        TextView namagunung = (TextView) findViewById(R.id.nama_gunung);
        namagunung.setText(namaGunung[postion % namaGunung.length]);

        String[] detailGunung = resources.getStringArray(R.array.deskripsi_gunung_luar);
        TextView detailgunung = (TextView) findViewById(R.id.detail_gunung);
        detailgunung.setText(detailGunung[postion % detailGunung.length]);

        String[] jalurGunung = resources.getStringArray(R.array.jalur_luar);
        TextView jalurgunung = (TextView) findViewById(R.id.jalur);
        jalurgunung.setText(jalurGunung[postion % jalurGunung.length]);
        
        String[] informasiGunung = resources.getStringArray(R.array.nama_gunung_luar);
        TextView informasigunung = (TextView) findViewById(R.id.informasi_gunung);
        informasigunung.setText("Informasi "+informasiGunung[postion % informasiGunung.length]);

        String[] detailInformasi = resources.getStringArray(R.array.informasi_gunung_luar);
        TextView detailinformasi = (TextView) findViewById(R.id.detail_informasi);
        detailinformasi.setText(detailInformasi[postion % detailInformasi.length]);

        imageGunung.recycle();
    }
}
