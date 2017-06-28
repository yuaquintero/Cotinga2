package com.sennova.cotinga;

import android.*;
import android.content.pm.PackageManager;
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


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);


    }
}
