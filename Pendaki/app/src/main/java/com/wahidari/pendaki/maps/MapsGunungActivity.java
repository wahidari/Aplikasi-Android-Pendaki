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

public class MapsGunungActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_gunung);
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
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        String z="3.5";
        float zoom=Float.parseFloat(z);
        // Add a marker in Sydney and move the camera
         LatLng indo = new LatLng(-2.9618647,117.5495417);

        //Jawa Timur
        LatLng argopuro = new LatLng(-7.9640652, 113.5654448);
        LatLng arjuno = new LatLng(-7.763405, 112.5861372);
        LatLng baluran = new LatLng(-7.8457171, 114.3593964);
        LatLng bromo = new LatLng(-7.9423521, 112.9488848);
        LatLng butak = new LatLng(-7.924356, 112.4458237);
        LatLng ijen = new LatLng(-8.059798, 114.2390776);
        LatLng kawi = new LatLng(-7.956539, 112.4627492);
        LatLng kelud = new LatLng(-7.9335129, 112.3105492);
        LatLng panderman = new LatLng(-7.9049782, 112.4958664);
        LatLng penanggungan = new LatLng(-7.6156989, 112.6176925);
        LatLng raung = new LatLng(-8.1285896, 114.044153);
        LatLng semeru = new LatLng(-8.1091822, 112.9204207);
        LatLng welirang = new LatLng(-7.7336786, 112.5713973);
        LatLng wilis = new LatLng(-7.8168207, 111.7581281);

        //Jawa Tengah
        LatLng andong = new LatLng(-7.3883758,110.3686299);
        LatLng lawu = new LatLng(-7.6276241,111.193658);
        LatLng merapi = new LatLng(-7.540626,110.4427796);
        LatLng merbabu = new LatLng(-7.4558213,110.4379029);
        LatLng prau = new LatLng(-7.1970403,109.9291006);
        LatLng rogojembangan = new LatLng(-7.1768298,109.709507);
        LatLng sindoro = new LatLng(-7.3014343,109.9926929);
        LatLng slamet = new LatLng(-7.2407235,109.2108887);
        LatLng sumbing = new LatLng(-7.3843089,110.0707907);
        LatLng ungaran = new LatLng(-7.1833418,110.3455274);

        //Jawa Barat
        LatLng cikuray = new LatLng(-7.3224135,107.8569654);
        LatLng ciremai = new LatLng(-6.8932063,108.4034338);
        LatLng gede = new LatLng(-6.7878168,106.9788904);
        LatLng guntur = new LatLng(-7.153546,107.8452636);
        LatLng malabar = new LatLng(-7.128601,107.632769);
        LatLng pangrango = new LatLng(-6.7708833,106.9599363);
        LatLng papandayan = new LatLng(-7.3190968,107.7276874);
        LatLng patuha = new LatLng(-7.1640912,107.3990455);
        LatLng rakutak = new LatLng(-7.1496392,107.7308723);
        LatLng salak = new LatLng(-6.7160803,106.7306358);
        
        //Luar Jawa
        LatLng agung = new LatLng(-8.3433238,115.5039886);
        LatLng jayawijaya = new LatLng(-4.0839998,137.184683);
        LatLng kerinci = new LatLng(-1.6993189,101.2617267);
        LatLng latimojong = new LatLng(-3.4450112,120.0709216);
        LatLng rinjani = new LatLng(-8.4125315,116.4559529);
        LatLng tambora = new LatLng(-8.2480448,117.989857);

 		//mMap.moveCamera(CameraUpdateFactory.newLatLng(indo,zoom));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(indo, zoom));
		//Jawa Timur
        mMap.addMarker(new MarkerOptions().position(argopuro).title("Gunung Argopuro").snippet("3088 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(arjuno).title("Gunung Arjuno").snippet("3339 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(baluran).title("Gunung Baluran").snippet("1247 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(bromo).title("Gunung Bromo").snippet("2392 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(butak).title("Gunung Butak").snippet("2868 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(ijen).title("Gunung Ijen").snippet("2443 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(kawi).title("Gunung Kawi").snippet("2551 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(kelud).title("Gunung Kelud").snippet("1731 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(panderman).title("Gunung Panderman").snippet("2045 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(penanggungan).title("Gunung Penangungan").snippet("1653 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(raung).title("Gunung Raung").snippet("3344 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(semeru).title("Gunung Semeru").snippet("3676 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(welirang).title("Gunung Welirang").snippet("3156 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(wilis).title("Gunung Wilis").snippet("2563 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        //Jawa Tengah
        mMap.addMarker(new MarkerOptions().position(andong).title("Gunung Andong").snippet("1726 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(lawu).title("Gunung Lawu").snippet("3265 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(merapi).title("Gunung Merapi").snippet("2930 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(merbabu).title("Gunung Merbabu").snippet("3142 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(prau).title("Gunung Prau").snippet("2565 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(rogojembangan).title("Gunung Rogojembangan").snippet("2117 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(sindoro).title("Gunung Sindoro").snippet("3136 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(slamet).title("Gunung Slamet").snippet("3428 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(sumbing).title("Gunung Sumbing").snippet("3371 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions().position(ungaran).title("Gunung Ungaran").snippet("2050 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        //Jawa Barat
        mMap.addMarker(new MarkerOptions().position(cikuray).title("Gunung Cikuray").snippet("2821 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(ciremai).title("Gunung Ciremai").snippet("3078 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(gede).title("Gunung Gede").snippet("2958 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(guntur).title("Gunung Guntur").snippet("2249 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(malabar).title("Gunung Malabar").snippet("2343 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(pangrango).title("Gunung Pangrango").snippet("3019 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(papandayan).title("Gunung Papandayan").snippet("2665 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(patuha).title("Gunung Patuha").snippet("2386 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(rakutak).title("Gunung Rakutak").snippet("1957 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(salak).title("Gunung Salak").snippet("2221 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        //Luar Jawa
        mMap.addMarker(new MarkerOptions().position(agung).title("Gunung Agung").snippet("3031 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(jayawijaya).title("Gunung Jaya Wijaya").snippet("4884 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(kerinci).title("Gunung Kerinci").snippet("3805 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(latimojong).title("Gunung Latimojong").snippet("3478 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(rinjani).title("Gunung Rinjani").snippet("3726 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(tambora).title("Gunung Tambora").snippet("2850 Mdpl").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        mMap.setIndoorEnabled(true);
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
