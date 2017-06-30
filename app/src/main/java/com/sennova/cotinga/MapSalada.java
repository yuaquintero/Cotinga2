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

        mMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng( 5.5984747 , -75.8189893 ))
                .add(new LatLng( 5.5964460 , -75.8139896 ))
                .add(new LatLng( 5.5971720 , -75.8137965 ))
                .add(new LatLng( 5.5981544 , -75.8133674 ))
                .add(new LatLng( 5.5992222 , -75.8134532 ))
                .add(new LatLng( 5.6000283 , -75.8145636 ))
                .add(new LatLng( 5.6015766 , -75.8146441 ))
                .add(new LatLng( 5.6020731 , -75.8144081 ))
                .add(new LatLng( 5.6024468 , -75.8141291 ))
                .add(new LatLng( 5.6028953 , -75.8135819 ))
                .add(new LatLng( 5.6037922 , -75.8134317 ))
                .add(new LatLng( 5.6045182 , -75.8133781 ))
                .add(new LatLng( 5.6051322 , -75.8131903 ))
                .add(new LatLng( 5.6056714 , -75.8125681 ))
                .add(new LatLng( 5.6061092 , -75.8120263 ))
                .add(new LatLng( 5.6063388 , -75.8118653 ))
                .add(new LatLng( 5.6076788 , -75.8112216 ))
                .add(new LatLng( 5.6079938 , -75.8109856 ))
                .add(new LatLng( 5.6080151 , -75.8106905 ))
                .add(new LatLng( 5.6081700 , -75.8101058 ))
                .add(new LatLng( 5.6096968 , -75.8083141 ))
                .add(new LatLng( 5.6135941 , -75.8068013 ))
                .add(new LatLng( 5.6138503 , -75.8068871 ))
                .add(new LatLng( 5.6139571 , -75.8071232 ))
                .add(new LatLng( 5.6139037 , -75.8073699 ))
                .add(new LatLng( 5.6107219 , -75.8099556 ))
                .add(new LatLng( 5.6105831 , -75.8101809 ))
                .add(new LatLng( 5.6106578 , -75.8105242 ))
                .add(new LatLng( 5.6107859 , -75.8109105 ))
                .add(new LatLng( 5.6107966 , -75.8112860 ))
                .add(new LatLng( 5.6107753 , -75.8114684 ))
                .add(new LatLng( 5.6096648 , -75.8122730 ))
                .add(new LatLng( 5.6095901 , -75.8125842 ))
                .add(new LatLng( 5.6099851 , -75.8140004 ))
                .add(new LatLng( 5.6096755 , -75.8148587 ))
                .add(new LatLng( 5.6096328 , -75.8151913 ))
                .add(new LatLng( 5.6097823 , -75.8156204 ))
                .add(new LatLng( 5.6097929 , -75.8165538 ))
                .add(new LatLng( 5.6100919 , -75.8179700 ))
                .add(new LatLng( 5.6094299 , -75.8192897 ))
                .add(new LatLng( 5.6090669 , -75.8193219 ))
                .add(new LatLng( 5.6091202 , -75.8188069 ))
                .add(new LatLng( 5.6088426 , -75.8184421 ))
                .add(new LatLng( 5.6084903 , -75.8183026 ))
                .add(new LatLng( 5.6079030 , -75.8177662 ))
                .add(new LatLng( 5.6075827 , -75.8176804 ))
                .add(new LatLng( 5.6072303 , -75.8177233 ))
                .add(new LatLng( 5.6065683 , -75.8176804 ))
                .add(new LatLng( 5.6058316 , -75.8178091 ))
                .add(new LatLng( 5.6055113 , -75.8178091 ))
                .add(new LatLng( 5.6053297 , -75.8178413 ))
                .add(new LatLng( 5.6049453 , -75.8179164 ))
                .add(new LatLng( 5.6044649 , -75.8177984 ))
                .add(new LatLng( 5.6042193 , -75.8175945 ))
                .add(new LatLng( 5.6037708 , -75.8176267 ))
                .add(new LatLng( 5.6031622 , -75.8173048 ))
                .add(new LatLng( 5.6008505 , -75.8169883 ))
                .add(new LatLng( 5.5990086 , -75.8161354 ))
                .color(Color.BLUE)
                .width(5)

        );

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);


    }
}
