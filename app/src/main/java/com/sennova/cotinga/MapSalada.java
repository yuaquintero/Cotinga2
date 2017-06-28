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

public class MapSalada extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7,mMap8;
    private UiSettings configuracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_salada);
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


        configuracion =mMap.getUiSettings();
        configuracion.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera

        LatLng med = new LatLng(5.5986029, -75.8189893);
        LatLng med2 = new LatLng(5.5965314,-75.8138824);
        LatLng med3 = new LatLng(5.5973002,-75.8136892);
        LatLng med4 = new LatLng(5.6108927, -75.8079493);
        LatLng med5 = new LatLng(5.6139358, -75.8068657);
        LatLng med6 = new LatLng(5.6103054,-75.8119297);
        LatLng med7 = new LatLng(5.6048172,-75.8182597);
        LatLng med8 = new LatLng(5.6006102, -75.8166933);

        final Marker medellin = mMap.addMarker(new MarkerOptions().position(med).title(getString(R.string.salada1)));
        final Marker medellin2 = mMap2.addMarker(new MarkerOptions().position(med2).title(getString(R.string.salada2)));
        final Marker medellin3 = mMap3.addMarker(new MarkerOptions().position(med3).title(getString(R.string.salada3)));
        final Marker medellin4 = mMap4.addMarker(new MarkerOptions().position(med4).title(getString(R.string.salada4)));
        final Marker medellin5 = mMap5.addMarker(new MarkerOptions().position(med5).title(getString(R.string.salada5)));
        final Marker medellin6 = mMap6.addMarker(new MarkerOptions().position(med6).title(getString(R.string.salada6)));
        final Marker medellin7 = mMap7.addMarker(new MarkerOptions().position(med7).title(getString(R.string.salada7)));
        final Marker medellin8 = mMap8.addMarker(new MarkerOptions().position(med8).title(getString(R.string.salada8)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(med, 12));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(med2, 12));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(med3, 12));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(med4, 12));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(med5, 12));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(med6, 12));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(med7, 12));
        mMap8.moveCamera(CameraUpdateFactory.newLatLngZoom(med8, 12));

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);


    }
}
