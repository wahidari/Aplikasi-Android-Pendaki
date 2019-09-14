package com.wahidari.pendaki.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.wahidari.pendaki.R;

public class MapsStoreActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_store);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);
        // toolbar.setSubtitle("Aplikasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String z="6.0";
        float zoom=Float.parseFloat(z);
        // Add a marker in Sydney and move the camera
        LatLng indo = new LatLng(-7.2913089,109.9965787);

        // Eiger Jatim
        LatLng eiger_sby_basra = new LatLng(-7.2671754,112.7386807);
        LatLng eiger_sby_merr = new LatLng(-7.3842274,112.6149789);
        LatLng eiger_sby_tp = new LatLng(-7.3115861,112.7644932);
        LatLng eiger_malang = new LatLng(-7.8752636,112.1683606);
        LatLng eiger_kediri = new LatLng(-7.211297,111.410857);

        // Eiger Jateng
        LatLng eiger_kudus = new LatLng(-7.1686852,108.8890552);
        LatLng eiger_jogja_jakal = new LatLng(-7.8021425,110.2476492);
        LatLng eiger_jogja_babarsari = new LatLng(-7.8021425,110.247649);
        LatLng eiger_jogja_yap = new LatLng(-7.8021425,110.2476492);
        LatLng eiger_jogja_maliboro = new LatLng(-7.8021425,110.2476492);

        // Eiger Jabar
        LatLng eiger_jabar_angkrek = new LatLng(-7.0614534,107.6628391);
        LatLng eiger_jabar_cihampelas = new LatLng(-6.9052691,107.5872338);
        LatLng eiger_jabar_sumatera = new LatLng(-6.9052691,107.5872338);
        LatLng eiger_jabar_pelajar = new LatLng(-6.9295528,107.6087773);
        LatLng eiger_jabar_cimanuk = new LatLng(-6.945558,107.5485338);

        // Eiger Jakarta
        LatLng eiger_jakarta_salemba = new LatLng(-6.4157804,106.4779136);
        LatLng eiger_jakarta_bintaro = new LatLng(-6.4157804,106.4779136);
        LatLng eiger_jakarta_depok = new LatLng(-6.4157804,106.4779136);

        // Eiger Banten
        LatLng eiger_banten_serang = new LatLng(-6.4043073,105.7505609);

        // Eiger Jatim
        mMap.addMarker(new MarkerOptions().position(eiger_sby_basra).title("Eiger Adventure Store Basra").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(eiger_sby_merr).title("Eiger Adventure Store Merr").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(eiger_sby_tp).title("Eiger Adventure Store TP").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(eiger_malang).title("Eiger Adventure Store Malang").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(eiger_kediri).title("Eiger Adventure Store Kediri").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        // Eiger Jateng
        mMap.addMarker(new MarkerOptions().position(eiger_kudus).title("Eiger Adventure Store Kudus").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(eiger_jogja_jakal).title("Eiger Adventure Store Jakal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(eiger_jogja_babarsari).title("Eiger Adventure Store Babarsari").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(eiger_jogja_yap).title("Eiger Adventure Store YAP").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(eiger_jogja_maliboro).title("Eiger Adventure Store Malioboro").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        // Eiger Jabar
        mMap.addMarker(new MarkerOptions().position(eiger_jabar_angkrek).title("Eiger Adventure Store Angkrek").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(eiger_jabar_cihampelas).title("Eiger Adventure Store Cihampelas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(eiger_jabar_sumatera).title("Eiger Adventure Store Sumatera").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(eiger_jabar_pelajar).title("Eiger Adventure Store Pelajar").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(eiger_jabar_cimanuk).title("Eiger Adventure Store Cimanuk").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        // Eiger Jakarta
        mMap.addMarker(new MarkerOptions().position(eiger_jakarta_salemba).title("Eiger Adventure Store Salemba").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(eiger_jakarta_bintaro).title("Eiger Adventure Store Bintaro").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(eiger_jakarta_depok).title("Eiger Adventure Store Depok").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        // Eiger Banten
        mMap.addMarker(new MarkerOptions().position(eiger_banten_serang).title("Eiger Adventure Store Serang").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(indo, zoom));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return true;
    }
}
