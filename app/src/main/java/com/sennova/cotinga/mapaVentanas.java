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

public class mapaVentanas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap,mMap2,mMap3,mMap4,mMap5,mMap6,mMap7,mMap8;
    private UiSettings configuracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_ventanas);
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
        LatLng med2 = new LatLng(5.5963072,-75.8130777);
        LatLng med3 = new LatLng(5.5936377, -75.8126003);
        LatLng med4 = new LatLng(5.5749407, -75.7907993);
        LatLng med5 = new LatLng(5.5646469, -75.7912391);
        LatLng med6 = new LatLng(5.5457995, -75.7945168);
        LatLng med7 = new LatLng(5.5391573, -75.8043015);
        LatLng med8 = new LatLng(5.5305395, -75.8031642);


        final Marker medellin = mMap.addMarker(new MarkerOptions().position(med).title(getString(R.string.ventanas1)));
        final Marker medellin2 = mMap2.addMarker(new MarkerOptions().position(med2).title(getString(R.string.ventanas2)));
        final Marker medellin3 = mMap3.addMarker(new MarkerOptions().position(med3).title(getString(R.string.ventanas3)));
        final Marker medellin4 = mMap4.addMarker(new MarkerOptions().position(med4).title(getString(R.string.ventanas4)));
        final Marker medellin5 = mMap5.addMarker(new MarkerOptions().position(med5).title(getString(R.string.ventanas5)));
        final Marker medellin6 = mMap6.addMarker(new MarkerOptions().position(med6).title(getString(R.string.ventanas6)));
        final Marker medellin7 = mMap7.addMarker(new MarkerOptions().position(med7).title(getString(R.string.ventanas7)));
        final Marker medellin8 = mMap8.addMarker(new MarkerOptions().position(med8).title(getString(R.string.ventanas8)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(med, 12));
        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(med2, 12));
        mMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(med3, 12));
        mMap4.moveCamera(CameraUpdateFactory.newLatLngZoom(med4, 12));
        mMap5.moveCamera(CameraUpdateFactory.newLatLngZoom(med5, 12));
        mMap6.moveCamera(CameraUpdateFactory.newLatLngZoom(med6, 12));
        mMap7.moveCamera(CameraUpdateFactory.newLatLngZoom(med7, 12));
        mMap8.moveCamera(CameraUpdateFactory.newLatLngZoom(med8, 12));
        mMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng( 5.5985815 , -75.8189195 ))
                .add(new LatLng( 5.5975885 , -75.8166182 ))
                .add(new LatLng( 5.5960936 , -75.8130026 ))
                .add(new LatLng( 5.5957733 , -75.8127344 ))
                .add(new LatLng( 5.5937338 , -75.8126485 ))
                .add(new LatLng( 5.5927835 , -75.8132172 ))
                .add(new LatLng( 5.5918866 , -75.8127987 ))
                .add(new LatLng( 5.5912352 , -75.8127666 ))
                .add(new LatLng( 5.5893986 , -75.8110714 ))
                .add(new LatLng( 5.5885231 , -75.8110070 ))
                .add(new LatLng( 5.5888861 , -75.8095479 ))
                .add(new LatLng( 5.5902956 , -75.8079815 ))
                .add(new LatLng( 5.5909149 , -75.8080673 ))
                .add(new LatLng( 5.5915128 , -75.8073592 ))
                .add(new LatLng( 5.5918545 , -75.8078313 ))
                .add(new LatLng( 5.5923030 , -75.8079815 ))
                .add(new LatLng( 5.5923244 , -75.8068013 ))
                .add(new LatLng( 5.5926020 , -75.8059430 ))
                .add(new LatLng( 5.5915342 , -75.8057284 ))
                .add(new LatLng( 5.5906159 , -75.8050203 ))
                .add(new LatLng( 5.5903596 , -75.8037329 ))
                .add(new LatLng( 5.5898471 , -75.8031428 ))
                .add(new LatLng( 5.5896336 , -75.8027136 ))
                .add(new LatLng( 5.5879785 , -75.8015442 ))
                .add(new LatLng( 5.5874019 , -75.8011794 ))
                .add(new LatLng( 5.5868360 , -75.7985830 ))
                .add(new LatLng( 5.5854051 , -75.7966733 ))
                .add(new LatLng( 5.5851702 , -75.7962441 ))
                .add(new LatLng( 5.5847217 , -75.7942271 ))
                .add(new LatLng( 5.5847644 , -75.7931542 ))
                .add(new LatLng( 5.5843800 , -75.7911801 ))
                .add(new LatLng( 5.5845509 , -75.7902789 ))
                .add(new LatLng( 5.5842305 , -75.7894850 ))
                .add(new LatLng( 5.5835045 , -75.7887983 ))
                .add(new LatLng( 5.5825434 , -75.7871032 ))
                .add(new LatLng( 5.5823299 , -75.7861590 ))
                .add(new LatLng( 5.5821590 , -75.7850862 ))
                .add(new LatLng( 5.5813689 , -75.7821250 ))
                .add(new LatLng( 5.5813475 , -75.7805371 ))
                .add(new LatLng( 5.5813048 , -75.7790565 ))
                .add(new LatLng( 5.5813475 , -75.7774687 ))
                .add(new LatLng( 5.5807922 , -75.7771468 ))
                .add(new LatLng( 5.5801943 , -75.7785416 ))
                .add(new LatLng( 5.5789770 , -75.7780051 ))
                .add(new LatLng( 5.5781014 , -75.7763529 ))
                .add(new LatLng( 5.5773112 , -75.7762671 ))
                .add(new LatLng( 5.5766492 , -75.7756662 ))
                .add(new LatLng( 5.5760085 , -75.7753444 ))
                .add(new LatLng( 5.5745670 , -75.7738262 ))
                .add(new LatLng( 5.5729546 , -75.7729304 ))
                .add(new LatLng( 5.5729332 , -75.7734239 ))
                .add(new LatLng( 5.5728478 , -75.7743251 ))
                .add(new LatLng( 5.5735419 , -75.7747972 ))
                .add(new LatLng( 5.5737875 , -75.7752693 ))
                .add(new LatLng( 5.5738729 , -75.7764816 ))
                .add(new LatLng( 5.5744708 , -75.7764173 ))
                .add(new LatLng( 5.5746631 , -75.7779086 ))
                .add(new LatLng( 5.5753358 , -75.7794267 ))
                .add(new LatLng( 5.5761793 , -75.7801294 ))
                .add(new LatLng( 5.5760298 , -75.7809448 ))
                .add(new LatLng( 5.5761153 , -75.7816315 ))
                .add(new LatLng( 5.5759444 , -75.7829189 ))
                .add(new LatLng( 5.5764143 , -75.7844424 ))
                .add(new LatLng( 5.5754959 , -75.7865667 ))
                .add(new LatLng( 5.5748553 , -75.7888842 ))
                .add(new LatLng( 5.5749941 , -75.7906866 ))
                .add(new LatLng( 5.5720576 , -75.7914162 ))
                .add(new LatLng( 5.5712888 , -75.7906222 ))
                .add(new LatLng( 5.5705413 , -75.7906866 ))
                .add(new LatLng( 5.5700074 , -75.7903647 ))
                .add(new LatLng( 5.5687687 , -75.7913518 ))
                .add(new LatLng( 5.5677650 , -75.7907295 ))
                .add(new LatLng( 5.5668253 , -75.7910728 ))
                .add(new LatLng( 5.5664409 , -75.7907295 ))
                .add(new LatLng( 5.5656293 , -75.7911587 ))
                .add(new LatLng( 5.5646896 , -75.7910299 ))
                .add(new LatLng( 5.5659283 , -75.7927036 ))
                .add(new LatLng( 5.5660992 , -75.7936478 ))
                .add(new LatLng( 5.5655012 , -75.7942915 ))
                .add(new LatLng( 5.5647323 , -75.7943344 ))
                .add(new LatLng( 5.5619133 , -75.7972527 ))
                .add(new LatLng( 5.5614434 , -75.7990551 ))
                .add(new LatLng( 5.5608454 , -75.7991409 ))
                .add(new LatLng( 5.5602902 , -75.7984972 ))
                .add(new LatLng( 5.5588806 , -75.7975531 ))
                .add(new LatLng( 5.5561469 , -75.7968664 ))
                .add(new LatLng( 5.5561469 , -75.7953644 ))
                .add(new LatLng( 5.5536268 , -75.7944202 ))
                .add(new LatLng( 5.5514911 , -75.7936478 ))
                .add(new LatLng( 5.5500816 , -75.7948065 ))
                .add(new LatLng( 5.5493981 , -75.7944202 ))
                .add(new LatLng( 5.5457674 , -75.7934332 ))
                .add(new LatLng( 5.5453403 , -75.7951498 ))
                .add(new LatLng( 5.5457674 , -75.7961369 ))
                .add(new LatLng( 5.5460451 , -75.7968235 ))
                .add(new LatLng( 5.5468139 , -75.7983255 ))
                .add(new LatLng( 5.5453616 , -75.7986689 ))
                .add(new LatLng( 5.5455966 , -75.7996988 ))
                .add(new LatLng( 5.5464081 , -75.8006215 ))
                .add(new LatLng( 5.5458956 , -75.8013296 ))
                .add(new LatLng( 5.5463227 , -75.8022308 ))
                .add(new LatLng( 5.5451053 , -75.8032823 ))
                .add(new LatLng( 5.5449345 , -75.8037865 ))
                .add(new LatLng( 5.5445501 , -75.8039045 ))
                .add(new LatLng( 5.5443792 , -75.8036900 ))
                .add(new LatLng( 5.5449345 , -75.8028531 ))
                .add(new LatLng( 5.5452121 , -75.8025956 ))
                .add(new LatLng( 5.5449986 , -75.8023596 ))
                .add(new LatLng( 5.5448918 , -75.8023596 ))
                .add(new LatLng( 5.5445073 , -75.8025956 ))
                .add(new LatLng( 5.5431298 , -75.8041513 ))
                .add(new LatLng( 5.5423930 , -75.8043337 ))
                .add(new LatLng( 5.5426493 , -75.8036685 ))
                .add(new LatLng( 5.5430123 , -75.8031321 ))
                .add(new LatLng( 5.5436744 , -75.8024669 ))
                .add(new LatLng( 5.5428628 , -75.8022952 ))
                .add(new LatLng( 5.5419712 , -75.8028370 ))
                .add(new LatLng( 5.5408232 , -75.8030784 ))
                .add(new LatLng( 5.5403427 , -75.8016300 ))
                .add(new LatLng( 5.5402359 , -75.8005357 ))
                .add(new LatLng( 5.5402572 , -75.7992053 ))
                .add(new LatLng( 5.5403640 , -75.7983899 ))
                .add(new LatLng( 5.5400223 , -75.7985616 ))
                .add(new LatLng( 5.5399155 , -75.7995915 ))
                .add(new LatLng( 5.5400437 , -75.8032823 ))
                .add(new LatLng( 5.5394136 , -75.8042479 ))
                .add(new LatLng( 5.5382283 , -75.8037114 ))
                .add(new LatLng( 5.5381215 , -75.8027458 ))
                .add(new LatLng( 5.5374808 , -75.8024025 ))
                .add(new LatLng( 5.5358149 , -75.8037758 ))
                .add(new LatLng( 5.5349606 , -75.8032179 ))
                .add(new LatLng( 5.5340849 , -75.8039474 ))
                .add(new LatLng( 5.5337005 , -75.8036900 ))
                .add(new LatLng( 5.5340208 , -75.8031750 ))
                .add(new LatLng( 5.5336791 , -75.8025098 ))
                .add(new LatLng( 5.5323976 , -75.8024883 ))
                .add(new LatLng( 5.5324350 , -75.8019519 ))
                .add(new LatLng( 5.5320960 , -75.8018446 ))
                .add(new LatLng( 5.5317569 , -75.8020806 ))
                .add(new LatLng( 5.5317356 , -75.8029604 ))
                .add(new LatLng( 5.5314579 , -75.8030999 ))
                .add(new LatLng( 5.5310414 , -75.8026814 ))
                .add(new LatLng( 5.5304968 , -75.8027995 ))
                .color(Color.BLUE)
                .width(5)

        );

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);



    }
}
