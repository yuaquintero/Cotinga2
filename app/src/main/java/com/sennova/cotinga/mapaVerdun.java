package com.sennova.cotinga;

import android.*;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class mapaVerdun extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7,mMap8, mMap9,mMap10,mMap11;
    private UiSettings configuracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_verdun);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        mMap2 = googleMap;
        mMap3 = googleMap;
        mMap4 = googleMap;
        mMap5 = googleMap;
        mMap6 = googleMap;
        mMap7 = googleMap;
        mMap8 = googleMap;
        mMap9= googleMap;
        mMap10 = googleMap;
        mMap11 = googleMap;

        configuracion =mMap.getUiSettings();
        configuracion.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera

        LatLng med = new LatLng(5.5986029, -75.8189893);
        LatLng med2 = new LatLng(5.6001084, -75.8304369);
        LatLng med3 = new LatLng(5.6015979, -75.8366007);
        LatLng med4 = new LatLng(5.5971293, -75.8352917);
        LatLng med5 = new LatLng(5.5757229, -75.8512321);
        LatLng med6 = new LatLng(5.5752103, -75.8511302);
        LatLng med7 = new LatLng(5.5367653, -75.8567548);
        LatLng med8 = new LatLng(5.5268927, -75.8608478);
        LatLng med9 = new LatLng(5.5266524, -75.8719468);
        LatLng med10 = new LatLng(5.4960991, -75.8891344);
        LatLng med11 = new LatLng(5.4829311, -75.8888340);


        final Marker medellin1 = mMap.addMarker(new MarkerOptions().position(med).title(getString(R.string.verdun1)));
        final Marker medellin2 = mMap2.addMarker(new MarkerOptions().position(med2).title(getString(R.string.verdun2)));
        final Marker medellin3 = mMap3.addMarker(new MarkerOptions().position(med3).title(getString(R.string.verdun3)));
        final Marker medellin4 = mMap4.addMarker(new MarkerOptions().position(med4).title(getString(R.string.verdun4)));
        final Marker medellin5 = mMap5.addMarker(new MarkerOptions().position(med5).title(getString(R.string.verdun5)));
        final Marker medellin6 = mMap6.addMarker(new MarkerOptions().position(med6).title(getString(R.string.verdun6)));
        final Marker medellin7 = mMap7.addMarker(new MarkerOptions().position(med7).title(getString(R.string.verdun7)));
        final Marker medellin8 = mMap8.addMarker(new MarkerOptions().position(med8).title(getString(R.string.verdun8)));
        final Marker medellin9 = mMap9.addMarker(new MarkerOptions().position(med9).title(getString(R.string.verdun9)));
        final Marker medellin10 = mMap10.addMarker(new MarkerOptions().position(med10).title(getString(R.string.verdun10)));
        final Marker medellin11 = mMap11.addMarker(new MarkerOptions().position(med11).title(getString(R.string.verdun11)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(med, 12));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(med2, 12));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(med3, 12));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(med4, 12));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(med5, 12));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(med6, 12));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(med7, 12));
        mMap8.moveCamera(CameraUpdateFactory.newLatLngZoom(med8, 12));
        mMap9.moveCamera(CameraUpdateFactory.newLatLngZoom(med9, 12));
        mMap10.moveCamera(CameraUpdateFactory.newLatLngZoom(med10, 12));
        mMap11.moveCamera(CameraUpdateFactory.newLatLngZoom(med11, 12));

        mMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng( 5.5984747 , -75.8189678 ))
                .add(new LatLng( 5.5977059 , -75.8192897 ))
                .add(new LatLng( 5.5992862 , -75.8231521 ))
                .add(new LatLng( 5.5997987 , -75.8249331 ))
                .add(new LatLng( 5.5997987 , -75.8278298 ))
                .add(new LatLng( 5.5999909 , -75.8286452 ))
                .add(new LatLng( 5.5988591 , -75.8298469 ))
                .add(new LatLng( 5.5982825 , -75.8322287 ))
                .add(new LatLng( 5.5986456 , -75.8323574 ))
                .add(new LatLng( 5.5990727 , -75.8311558 ))
                .add(new LatLng( 5.5998415 , -75.8304262 ))
                .add(new LatLng( 5.6001618 , -75.8306193 ))
                .add(new LatLng( 5.6001831 , -75.8317137 ))
                .add(new LatLng( 5.6008238 , -75.8330870 ))
                .add(new LatLng( 5.6008452 , -75.8359194 ))
                .add(new LatLng( 5.6015499 , -75.8366060 ))
                .add(new LatLng( 5.6003113 , -75.8364987 ))
                .add(new LatLng( 5.5991581 , -75.8368850 ))
                .add(new LatLng( 5.5987523 , -75.8365095 ))
                .add(new LatLng( 5.5978020 , -75.8367026 ))
                .add(new LatLng( 5.5977807 , -75.8353454 ))
                .add(new LatLng( 5.5964780 , -75.8356619 ))
                .add(new LatLng( 5.5966862 , -75.8366114 ))
                .add(new LatLng( 5.5963632 , -75.8376655 ))
                .add(new LatLng( 5.5954009 , -75.8380638 ))
                .add(new LatLng( 5.5952073 , -75.8390200 ))
                .add(new LatLng( 5.5945026 , -75.8400768 ))
                .add(new LatLng( 5.5939687 , -75.8425069 ))
                .add(new LatLng( 5.5922816 , -75.8417344 ))
                .add(new LatLng( 5.5916623 , -75.8425820 ))
                .add(new LatLng( 5.5904878 , -75.8434296 ))
                .add(new LatLng( 5.5906159 , -75.8456826 ))
                .add(new LatLng( 5.5890142 , -75.8478069 ))
                .add(new LatLng( 5.5893132 , -75.8482575 ))
                .add(new LatLng( 5.5880319 , -75.8489227 ))
                .add(new LatLng( 5.5876688 , -75.8487725 ))
                .add(new LatLng( 5.5873271 , -75.8490944 ))
                .add(new LatLng( 5.5860031 , -75.8488584 ))
                .add(new LatLng( 5.5858749 , -75.8480215 ))
                .add(new LatLng( 5.5849139 , -75.8468199 ))
                .add(new LatLng( 5.5843373 , -75.8473778 ))
                .add(new LatLng( 5.5845936 , -75.8479571 ))
                .add(new LatLng( 5.5838248 , -75.8486438 ))
                .add(new LatLng( 5.5831841 , -75.8485365 ))
                .add(new LatLng( 5.5827356 , -75.8487940 ))
                .add(new LatLng( 5.5818814 , -75.8486009 ))
                .add(new LatLng( 5.5811126 , -75.8480215 ))
                .add(new LatLng( 5.5798953 , -75.8478069 ))
                .add(new LatLng( 5.5797031 , -75.8483434 ))
                .add(new LatLng( 5.5794255 , -75.8488369 ))
                .add(new LatLng( 5.5801089 , -75.8495879 ))
                .add(new LatLng( 5.5794255 , -75.8498883 ))
                .add(new LatLng( 5.5788275 , -75.8497810 ))
                .add(new LatLng( 5.5782082 , -75.8498240 ))
                .add(new LatLng( 5.5777383 , -75.8495450 ))
                .add(new LatLng( 5.5771190 , -75.8499312 ))
                .add(new LatLng( 5.5773326 , -75.8502960 ))
                .add(new LatLng( 5.5763929 , -75.8505750 ))
                .add(new LatLng( 5.5757522 , -75.8513260 ))
                .add(new LatLng( 5.5752931 , -75.8511651 ))
                .add(new LatLng( 5.5748499 , -75.8513421 ))
                .add(new LatLng( 5.5743534 , -75.8514225 ))
                .add(new LatLng( 5.5731361 , -75.8520341 ))
                .add(new LatLng( 5.5720896 , -75.8517337 ))
                .add(new LatLng( 5.5708136 , -75.8515137 ))
                .add(new LatLng( 5.5697511 , -75.8505213 ))
                .add(new LatLng( 5.5688114 , -75.8511543 ))
                .add(new LatLng( 5.5680853 , -75.8509398 ))
                .add(new LatLng( 5.5678931 , -75.8502424 ))
                .add(new LatLng( 5.5673699 , -75.8499527 ))
                .add(new LatLng( 5.5666865 , -75.8498132 ))
                .add(new LatLng( 5.5661953 , -75.8494270 ))
                .add(new LatLng( 5.5656720 , -75.8487403 ))
                .add(new LatLng( 5.5652876 , -75.8485794 ))
                .add(new LatLng( 5.5650740 , -75.8479249 ))
                .add(new LatLng( 5.5647751 , -75.8480322 ))
                .add(new LatLng( 5.5638647 , -75.8477587 ))
                .add(new LatLng( 5.5637086 , -75.8472490 ))
                .add(new LatLng( 5.5632641 , -75.8470505 ))
                .add(new LatLng( 5.5634029 , -75.8474046 ))
                .add(new LatLng( 5.5630719 , -75.8484399 ))
                .add(new LatLng( 5.5623404 , -75.8491373 ))
                .add(new LatLng( 5.5611765 , -75.8492339 ))
                .add(new LatLng( 5.5603969 , -75.8503819 ))
                .add(new LatLng( 5.5592864 , -75.8504248 ))
                .add(new LatLng( 5.5588806 , -75.8497596 ))
                .add(new LatLng( 5.5582399 , -75.8493519 ))
                .add(new LatLng( 5.5578128 , -75.8495879 ))
                .add(new LatLng( 5.5574284 , -75.8495450 ))
                .add(new LatLng( 5.5569585 , -75.8506393 ))
                .add(new LatLng( 5.5560188 , -75.8507895 ))
                .add(new LatLng( 5.5559761 , -75.8510685 ))
                .add(new LatLng( 5.5549510 , -75.8511758 ))
                .add(new LatLng( 5.5545452 , -75.8514494 ))
                .add(new LatLng( 5.5540113 , -75.8511651 ))
                .add(new LatLng( 5.5521532 , -75.8510470 ))
                .add(new LatLng( 5.5524522 , -75.8516479 ))
                .add(new LatLng( 5.5521959 , -75.8519053 ))
                .add(new LatLng( 5.5518328 , -75.8514547 ))
                .add(new LatLng( 5.5509359 , -75.8511114 ))
                .add(new LatLng( 5.5505301 , -75.8513260 ))
                .add(new LatLng( 5.5512562 , -75.8519053 ))
                .add(new LatLng( 5.5499321 , -75.8519268 ))
                .add(new LatLng( 5.5468780 , -75.8527207 ))
                .add(new LatLng( 5.5470809 , -75.8520877 ))
                .add(new LatLng( 5.5466858 , -75.8518410 ))
                .add(new LatLng( 5.5463868 , -75.8520341 ))
                .add(new LatLng( 5.5457781 , -75.8519053 ))
                .add(new LatLng( 5.5454898 , -75.8516049 ))
                .add(new LatLng( 5.5451481 , -75.8520234 ))
                .add(new LatLng( 5.5442831 , -75.8531284 ))
                .add(new LatLng( 5.5431191 , -75.8538473 ))
                .add(new LatLng( 5.5409407 , -75.8558536 ))
                .add(new LatLng( 5.5400437 , -75.8554888 ))
                .add(new LatLng( 5.5391894 , -75.8555532 ))
                .add(new LatLng( 5.5371604 , -75.8566475 ))
                .add(new LatLng( 5.5353664 , -75.8582783 ))
                .add(new LatLng( 5.5339781 , -75.8583748 ))
                .add(new LatLng( 5.5331131 , -75.8588254 ))
                .add(new LatLng( 5.5329957 , -75.8591473 ))
                .add(new LatLng( 5.5328355 , -75.8594048 ))
                .add(new LatLng( 5.5329102 , -75.8596301 ))
                .add(new LatLng( 5.5330384 , -75.8607996 ))
                .add(new LatLng( 5.5326433 , -75.8609390 ))
                .add(new LatLng( 5.5332092 , -75.8613575 ))
                .add(new LatLng( 5.5332947 , -75.8604455 ))
                .add(new LatLng( 5.5334015 , -75.8602846 ))
                .add(new LatLng( 5.5336684 , -75.8614004 ))
                .add(new LatLng( 5.5331665 , -75.8619475 ))
                .add(new LatLng( 5.5328248 , -75.8622694 ))
                .add(new LatLng( 5.5323549 , -75.8616042 ))
                .add(new LatLng( 5.5316928 , -75.8614862 ))
                .add(new LatLng( 5.5301391 , -75.8609498 ))
                .add(new LatLng( 5.5294663 , -75.8604938 ))
                .add(new LatLng( 5.5287775 , -75.8606708 ))
                .add(new LatLng( 5.5284892 , -75.8604348 ))
                .add(new LatLng( 5.5285746 , -75.8610463 ))
                .add(new LatLng( 5.5292581 , -75.8611429 ))
                .add(new LatLng( 5.5297600 , -75.8616257 ))
                .add(new LatLng( 5.5289804 , -75.8615506 ))
                .add(new LatLng( 5.5287027 , -75.8620656 ))
                .add(new LatLng( 5.5284251 , -75.8622372 ))
                .add(new LatLng( 5.5276989 , -75.8610034 ))
                .add(new LatLng( 5.5270155 , -75.8607781 ))
                .add(new LatLng( 5.5266951 , -75.8614004 ))
                .add(new LatLng( 5.5270902 , -75.8615720 ))
                .add(new LatLng( 5.5272504 , -75.8631063 ))
                .add(new LatLng( 5.5282756 , -75.8638573 ))
                .add(new LatLng( 5.5281902 , -75.8645225 ))
                .add(new LatLng( 5.5287882 , -75.8649516 ))
                .add(new LatLng( 5.5291940 , -75.8662820 ))
                .add(new LatLng( 5.5286814 , -75.8672905 ))
                .add(new LatLng( 5.5282969 , -75.8670545 ))
                .add(new LatLng( 5.5278698 , -75.8681488 ))
                .add(new LatLng( 5.5282542 , -75.8687067 ))
                .add(new LatLng( 5.5283183 , -75.8697259 ))
                .add(new LatLng( 5.5278484 , -75.8714533 ))
                .add(new LatLng( 5.5280940 , -75.8722579 ))
                .add(new LatLng( 5.5271436 , -75.8719039 ))
                .add(new LatLng( 5.5266310 , -75.8720326 ))
                .add(new LatLng( 5.5264708 , -75.8722311 ))
                .add(new LatLng( 5.5271863 , -75.8727032 ))
                .add(new LatLng( 5.5284678 , -75.8744574 ))
                .add(new LatLng( 5.5284304 , -75.8750314 ))
                .add(new LatLng( 5.5276242 , -75.8755088 ))
                .add(new LatLng( 5.5282809 , -75.8759433 ))
                .add(new LatLng( 5.5277043 , -75.8768928 ))
                .add(new LatLng( 5.5285105 , -75.8784539 ))
                .add(new LatLng( 5.5281688 , -75.8788347 ))
                .add(new LatLng( 5.5280086 , -75.8801222 ))
                .add(new LatLng( 5.5265456 , -75.8809161 ))
                .add(new LatLng( 5.5266737 , -75.8813238 ))
                .add(new LatLng( 5.5244098 , -75.8837271 ))
                .add(new LatLng( 5.5237263 , -75.8832550 ))
                .add(new LatLng( 5.5227012 , -75.8835554 ))
                .add(new LatLng( 5.5219536 , -75.8831048 ))
                .add(new LatLng( 5.5190062 , -75.8844781 ))
                .add(new LatLng( 5.5175538 , -75.8841133 ))
                .add(new LatLng( 5.5163364 , -75.8827615 ))
                .add(new LatLng( 5.5140511 , -75.8828473 ))
                .add(new LatLng( 5.5129832 , -75.8833408 ))
                .add(new LatLng( 5.5130900 , -75.8838344 ))
                .add(new LatLng( 5.5108260 , -75.8860016 ))
                .add(new LatLng( 5.5093309 , -75.8856153 ))
                .add(new LatLng( 5.5048883 , -75.8837271 ))
                .add(new LatLng( 5.5023252 , -75.8842421 ))
                .add(new LatLng( 5.4996340 , -75.8872461 ))
                .add(new LatLng( 5.4965156 , -75.8893275 ))
                .add(new LatLng( 5.4923506 , -75.8901000 ))
                .add(new LatLng( 5.4905137 , -75.8907652 ))
                .add(new LatLng( 5.4892962 , -75.8900785 ))
                .add(new LatLng( 5.4854302 , -75.8903146 ))
                .add(new LatLng( 5.4829311 , -75.8893490 ))

                .color(Color.BLUE)
                .width(5)
        );



        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);


    }
}
