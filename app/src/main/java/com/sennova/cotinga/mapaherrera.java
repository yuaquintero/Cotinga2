package com.sennova.cotinga;

import android.Manifest;
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

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class mapaherrera extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7,mMap8;
    private UiSettings configuracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapaherrera);
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
        LatLng med2 = new LatLng(5.5967770, -75.8169508);
        LatLng med3 = new LatLng(5.5880799, -75.8128095);
        LatLng med4 = new LatLng(5.5867452, -75.8115649);
        LatLng med5 = new LatLng(5.5862967, -75.8109695);
        LatLng med6 = new LatLng(5.5845509, -75.8088881);
        LatLng med7 = new LatLng(5.5783523, -75.8098403);
        LatLng med8 = new LatLng(5.5776956,-75.8094728);


        final Marker medellin = mMap.addMarker(new MarkerOptions().position(med).title(getString(R.string.herrera1)));
        final Marker medellin2 = mMap2.addMarker(new MarkerOptions().position(med2).title(getString(R.string.herrera2)));
        final Marker medellin3 = mMap3.addMarker(new MarkerOptions().position(med3).title(getString(R.string.herrera3)));
        final Marker medellin4 = mMap4.addMarker(new MarkerOptions().position(med4).title(getString(R.string.herrera4)));
        final Marker medellin5 = mMap5.addMarker(new MarkerOptions().position(med5).title(getString(R.string.herrera5)));
        final Marker medellin6 = mMap5.addMarker(new MarkerOptions().position(med6).title(getString(R.string.herrera6)));
        final Marker medellin7 = mMap5.addMarker(new MarkerOptions().position(med7).title(getString(R.string.herrera7)));
        final Marker medellin8 = mMap5.addMarker(new MarkerOptions().position(med8).title(getString(R.string.herrera8)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(med, 12));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(med2, 12));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(med3, 12));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(med4, 12));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(med5, 12));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(med6, 12));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(med7, 12));
        mMap8.moveCamera(CameraUpdateFactory.newLatLngZoom(med8, 12));

        mMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng( 5.5984961  , -75.8189571 ))
                .add(new LatLng( 5.5974924  , -75.8166504 ))
                .add(new LatLng( 5.5967663  , -75.8170152 ))
                .add(new LatLng( 5.5946521  , -75.8163929 ))
                .add(new LatLng( 5.5923244  , -75.8155024 ))
                .add(new LatLng( 5.5915876  , -75.8155239 ))
                .add(new LatLng( 5.5907868  , -75.8148479 ))
                .add(new LatLng( 5.5898898  , -75.8146977 ))
                .add(new LatLng( 5.5894627  , -75.8130991 ))
                .add(new LatLng( 5.5886939  , -75.8125305 ))
                .add(new LatLng( 5.5883415  , -75.8125305 ))
                .add(new LatLng( 5.5879785  , -75.8123267 ))
                .add(new LatLng( 5.5876902  , -75.8123481 ))
                .add(new LatLng( 5.5874126  , -75.8121979 ))
                .add(new LatLng( 5.5870175  , -75.8122623 ))
                .add(new LatLng( 5.5868013  , -75.8115837 ))
                .add(new LatLng( 5.5866811  , -75.8116561 ))
                .add(new LatLng( 5.5868119  , -75.8123454 ))
                .add(new LatLng( 5.5866758  , -75.8124554 ))
                .add(new LatLng( 5.5865864  , -75.8123387 ))
                .add(new LatLng( 5.5865396  , -75.8119002 ))
                .add(new LatLng( 5.5863821  , -75.8117634 ))
                .add(new LatLng( 5.5862807  , -75.8118667 ))
                .add(new LatLng( 5.5862540  , -75.8120880 ))
                .add(new LatLng( 5.5862860  , -75.8125305 ))
                .add(new LatLng( 5.5861632  , -75.8125305 ))
                .add(new LatLng( 5.5861472  , -75.8122945 ))
                .add(new LatLng( 5.5860031  , -75.8121121 ))
                .add(new LatLng( 5.5859016  , -75.8117634 ))
                .add(new LatLng( 5.5857361  , -75.8117259 ))
                .add(new LatLng( 5.5856560  , -75.8118492 ))
                .add(new LatLng( 5.5859016  , -75.8124286 ))
                .add(new LatLng( 5.5857895  , -75.8126351 ))
                .add(new LatLng( 5.5855172  , -75.8122462 ))
                .add(new LatLng( 5.5850981  , -75.8120477 ))
                .add(new LatLng( 5.5847644  , -75.8122194 ))
                .add(new LatLng( 5.5841665  , -75.8122033 ))
                .add(new LatLng( 5.5808136  , -75.8102989 ))
                .add(new LatLng( 5.5799914  , -75.8101487 ))
                .add(new LatLng( 5.5795643  , -75.8102131 ))
                .add(new LatLng( 5.5793187  , -75.8102667 ))
                .add(new LatLng( 5.5783790  , -75.8099771 ))
                .add(new LatLng( 5.5784057  , -75.8097303 ))
                .add(new LatLng( 5.5785232  , -75.8095104 ))
                .add(new LatLng( 5.5784644  , -75.8093548 ))
                .add(new LatLng( 5.5781761  , -75.8092529 ))
                .add(new LatLng( 5.5778051  , -75.8093333 ))
                .add(new LatLng( 5.5774554  , -75.8092850 ))
                .add(new LatLng( 5.5771297  , -75.8091831 ))
                .add(new LatLng( 5.5767453  , -75.8092314 ))
                .add(new LatLng( 5.5757949  , -75.8091134 ))
                .add(new LatLng( 5.5752610  , -75.8090383 ))
                .add(new LatLng( 5.5749247  , -75.8092475 ))
                .add(new LatLng( 5.5744014  , -75.8092582 ))
                .add(new LatLng( 5.5735952  , -75.8090651 ))
                .add(new LatLng( 5.5733924  , -75.8094728 ))
                .add(new LatLng( 5.5735632  , -75.8096445 ))

                .color(Color.BLUE)
                .width(5)
        );


        mMap6.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng( 5.5867292  , -75.8115703))
                .add(new LatLng( 5.5867772  , -75.8114791))
                .add(new LatLng( 5.5866971  , -75.8113235))
                .add(new LatLng( 5.5864729  , -75.8113825))
                .add(new LatLng( 5.5863448  , -75.8112001))
                .add(new LatLng( 5.5862967  ,-75.8110660))
                .add(new LatLng( 5.5863661  , -75.8109319))
                .add(new LatLng( 5.5862807  , -75.8106905))
                .add(new LatLng( 5.5862166  , -75.8106905))
                .add(new LatLng( 5.5859337  , -75.8104223))
                .add(new LatLng( 5.5857041  , -75.8099878))
                .add(new LatLng( 5.5854211  , -75.8097947))
                .add(new LatLng( 5.5851061  , -75.8094138))
                .add(new LatLng( 5.5848872  , -75.8093387))
                .add(new LatLng( 5.5845936  , -75.8090168))
                .color(Color.BLUE)
                .width(5)

        );

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);

    }
}
