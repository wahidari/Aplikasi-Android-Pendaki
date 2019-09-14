package com.wahidari.pendaki;

/**
 * Created by Wahid Ari on 8/30/2016.
 */

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.wahidari.pendaki.Pendakian.jatim.jabar.p_cikuray;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_ciremai;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_gede;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_guntur;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_malabar;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_pangrango;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_papandayan;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_patuha;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_rakutak;
import com.wahidari.pendaki.Pendakian.jatim.jabar.p_salak;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_andong;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_lawu;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_merapi;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_merbabu;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_prau;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_rogojembangan;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_sindoro;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_slamet;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_sumbing;
import com.wahidari.pendaki.Pendakian.jatim.jateng.p_ungaran;
import com.wahidari.pendaki.Pendakian.jatim.luar.p_agung;
import com.wahidari.pendaki.Pendakian.jatim.luar.p_jayawijaya;
import com.wahidari.pendaki.Pendakian.jatim.luar.p_kerinci;
import com.wahidari.pendaki.Pendakian.jatim.luar.p_latimojong;
import com.wahidari.pendaki.Pendakian.jatim.luar.p_rinjani;
import com.wahidari.pendaki.Pendakian.jatim.luar.p_tambora;
import com.wahidari.pendaki.Pendakian.jatim.p_argopuro;
import com.wahidari.pendaki.Pendakian.jatim.p_arjuno;
import com.wahidari.pendaki.Pendakian.jatim.p_baluran;
import com.wahidari.pendaki.Pendakian.jatim.p_bromo;
import com.wahidari.pendaki.Pendakian.jatim.p_butak;
import com.wahidari.pendaki.Pendakian.jatim.p_ijen;
import com.wahidari.pendaki.Pendakian.jatim.p_kawi;
import com.wahidari.pendaki.Pendakian.jatim.p_kelud;
import com.wahidari.pendaki.Pendakian.jatim.p_panderman;
import com.wahidari.pendaki.Pendakian.jatim.p_penanggungan;
import com.wahidari.pendaki.Pendakian.jatim.p_raung;
import com.wahidari.pendaki.Pendakian.jatim.p_semeru;
import com.wahidari.pendaki.Pendakian.jatim.p_welirang;
import com.wahidari.pendaki.Pendakian.jatim.p_wilis;
import com.wahidari.pendaki.maps.MapsGunungActivity;
import com.wahidari.pendaki.maps.MapsStoreActivity;
import com.wahidari.pendaki.menu.about;
import com.wahidari.pendaki.menu.peralatan;
import com.wahidari.pendaki.fragment.eFragment;
import com.wahidari.pendaki.fragment.fFragment;
import com.wahidari.pendaki.fragment.gFragment;
import com.wahidari.pendaki.fragment.hFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager2);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs2);
        tabLayout.setupWithViewPager(viewPager);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        }
        else{
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            tabLayout.setTabMode(TabLayout.MODE_FIXED);
        }

        navigationView = (NavigationView) findViewById(R.id.navigation_view2);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                //Memeriksa apakah item tersebut dalam keadaan dicek  atau tidak,
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);
                //Menutup  drawer item klik
                drawerLayout.closeDrawers();
                //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi

                switch (menuItem.getItemId()) {
                    case R.id.navigation1:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        }, 250);
                        break;
                    case R.id.navigation3:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(getApplicationContext(), MainActivity3.class));
                            }
                        }, 250);
                        break;
                    case R.id.navigation4:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(getApplicationContext(), MapsGunungActivity.class));
                            }
                        }, 250);
                        break;
                    case R.id.navigation5:
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(getApplicationContext(), MapsStoreActivity.class));
                            }
                        }, 250);
                        break;
                    case R.id.navigation10:
                        startActivity(new Intent(getApplicationContext(), about.class));
                        return true;
                    default:
                        return true;
                }
                return true;
            }
        });
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {
            @Override
            public void onDrawerClosed(View drawerView) {
                // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
                super.onDrawerOpened(drawerView);
            }
        };
        //Mensetting actionbarToggle untuk drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        //memanggil synstate
        actionBarDrawerToggle.syncState();
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new eFragment(), "Jawa Timur");
        adapter.addFragment(new fFragment(), "Jawa Tengah");
        adapter.addFragment(new gFragment(), "Jawa Barat");
        adapter.addFragment(new hFragment(), "Luar Jawa");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, peralatan.class));
            return true;
        }
        if (id == R.id.about) {
            startActivity(new Intent(this, about.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //    INFO JATIM GOES HERE
//    INFO JATIM GOES HERE
//    INFO JATIM GOES HERE
    public void argopuroo(View view) {
        startActivity(new Intent(this, p_argopuro.class));
    }

    public void arjunoo(View view) {
        startActivity(new Intent(this, p_arjuno.class));
    }

    public void balurann(View view) {
        startActivity(new Intent(this, p_baluran.class));
    }

    public void bromoo(View view) {
        startActivity(new Intent(this, p_bromo.class));
    }

    public void butakk(View view) {
        startActivity(new Intent(this, p_butak.class));
    }

    public void ijenn(View view) {
        startActivity(new Intent(this, p_ijen.class));
    }

    public void kawii(View view) {
        startActivity(new Intent(this, p_kawi.class));
    }

    public void keludd(View view) {
        startActivity(new Intent(this, p_kelud.class));
    }

    public void pandermann(View view) {
        startActivity(new Intent(this, p_panderman.class));
    }

    public void penanggungann(View view) {
        startActivity(new Intent(this, p_penanggungan.class));
    }

    public void raungg(View view) {
        startActivity(new Intent(this, p_raung.class));
    }

    public void semeruu(View view) {
        startActivity(new Intent(this, p_semeru.class));
    }

    public void welirangg(View view) {
        startActivity(new Intent(this, p_welirang.class));
    }

    public void wiliss(View view) {
        startActivity(new Intent(this, p_wilis.class));
    }

    //    INFO JATENG GOES HERE
    //    INFO JATENG GOES HERE
    //    INFO JATENG GOES HERE
    public void andongg(View view) {
        startActivity(new Intent(this, p_andong.class));
    }

    public void lawuu(View view) {
        startActivity(new Intent(this, p_lawu.class));
    }

    public void merapii(View view) {
        startActivity(new Intent(this, p_merapi.class));
    }

    public void merbabuu(View view) {
        startActivity(new Intent(this, p_merbabu.class));
    }

    public void prauu(View view) {
        startActivity(new Intent(this, p_prau.class));
    }

    public void rogojembangann(View view) {
        startActivity(new Intent(this, p_rogojembangan.class));
    }

    public void sindoroo(View view) {
        startActivity(new Intent(this, p_sindoro.class));
    }

    public void slamett(View view) {
        startActivity(new Intent(this, p_slamet.class));
    }

    public void sumbingg(View view) {
        startActivity(new Intent(this, p_sumbing.class));
    }

    public void ungarann(View view) {
        startActivity(new Intent(this, p_ungaran.class));
    }

    //    INFO JABAR GOES HERE
    //    INFO JABAR GOES HERE
    //    INFO JABAR GOES HERE
    public void cikurayy(View view) {
        startActivity(new Intent(this, p_cikuray.class));
    }

    public void ciremaii(View view) {
        startActivity(new Intent(this, p_ciremai.class));
    }

    public void gedee(View view) {
        startActivity(new Intent(this, p_gede.class));
    }

    public void gunturr(View view) {
        startActivity(new Intent(this, p_guntur.class));
    }

    public void malabarr(View view) {
        startActivity(new Intent(this, p_malabar.class));
    }

    public void pangrangoo(View view) {
        startActivity(new Intent(this, p_pangrango.class));
    }

    public void papandayann(View view) {
        startActivity(new Intent(this, p_papandayan.class));
    }

    public void patuhaa(View view) {
        startActivity(new Intent(this, p_patuha.class));
    }

    public void rakutakk(View view) {
        startActivity(new Intent(this, p_rakutak.class));
    }

    public void salakk(View view) {
        startActivity(new Intent(this, p_salak.class));
    }

    //    INFO LUAR GOES HERE
    //    INFO LUAR GOES HERE
    //    INFO LUAR GOES HERE
    public void agungg(View view) {
        startActivity(new Intent(this, p_agung.class));
    }

    public void jayawijayaa(View view) {
        startActivity(new Intent(this, p_jayawijaya.class));
    }

    public void kerincii(View view) {
        startActivity(new Intent(this, p_kerinci.class));
    }

    public void latimojongg(View view) {
        startActivity(new Intent(this, p_latimojong.class));
    }

    public void rinjanii(View view) {
        startActivity(new Intent(this, p_rinjani.class));
    }

    public void tamboraa(View view) {
        startActivity(new Intent(this, p_tambora.class));
    }
}