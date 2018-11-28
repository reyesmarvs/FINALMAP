package com.example.cloud.project;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
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

        // Add a marker in Sydney and move the camera
        LatLng Main = new LatLng(14.610157, 120.989277);
        LatLng Roque = new LatLng(14.610026, 120.991838);
        LatLng Albertus = new LatLng(14.610611, 120.991318);
        LatLng Raymund = new LatLng(14.611275, 120.989034);
        LatLng Beato = new LatLng(14.607299, 120.989372);
        LatLng BGPOP = new LatLng(14.608368, 120.988454);
        LatLng Martin = new LatLng(14.612076, 120.989754);
        LatLng Miguel = new LatLng(14.610985, 120.988900);
        LatLng Benavides = new LatLng(14.610524, 120.988048);
        LatLng AMV = new LatLng(14.610196, 120.990562);

        mMap.addMarker(new MarkerOptions().position(Main).title("The Main Building of the University of Santo Tomas declared a national treasure by the Philippine government, houses the Administration offices, the Faculty of Civil Law, the Faculty of Pharmacy, the College of Science and the Institute of Religion."));
        mMap.addMarker(new MarkerOptions().position(Roque).title("It is a five-storey, E-shaped building named after the alumnus who designed the UST Main Building, Rev. Fr. Roque Ruaño, O.P.. It houses the Faculty of Engineering and the Institute of Information and Computing Sciences."));
        mMap.addMarker(new MarkerOptions().position(Albertus).title("Named after the Dominican Albertus Magnus, the building houses the College of Education, the Conservatory of Music, and the Education High School."));
        mMap.addMarker(new MarkerOptions().position(Raymund).title("Named after St. Raymund de Peñafort, the patron saints of lawyers, the building houses both the Faculty of Arts and Letters and the College of Commerce and Business Administration."));
        mMap.addMarker(new MarkerOptions().position(Beato).title("The eight-storey structure named after Fra Angelico houses the College of Architecture, and the College of Fine Arts and Design. It also houses The UST Publishing House which took the place of the UST Press and the UST Printing Office."));
        mMap.addMarker(new MarkerOptions().position(BGPOP).title("Named after the then-Master of the Order of Preachers, Buenaventura García de Paredes. The twelve-storey building is built on the site of the original UST Gymnasium. It houses the Senior High School ."));
        mMap.addMarker(new MarkerOptions().position(Martin).title("Named after Martin de Porres, the building is the home of the Faculty of Medicine and Surgery, College of Nursing, and College of Rehabilitation Sciences. The UST Medicine Auditorium, the largest auditorium in UST, is also located in this structure."));
        mMap.addMarker(new MarkerOptions().position(Miguel).title("It an exclusive building for the library was finally inaugurated in 1990 when the UST Central Library Building was inaugurated. The six-storey library, named after the founder of the University Miguel de Benavides, is one of the biggest in Asia."));
        mMap.addMarker(new MarkerOptions().position(Benavides).title("The building was built after the original edifice was burned down on 1975. Currently, the UST Junior High School occupies the building."));
        mMap.addMarker(new MarkerOptions().position(AMV).title("Located in front of the UST Hospital, a four-level structure wherein the first three levels consist of a multi-level carpark with operating commercial spaces in the first two levels. The UST-AMV College of Accountancy occupies the fourth level of the building."));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Main));
        mMap.setMaxZoomPreference(20.0f);
        mMap.setMinZoomPreference(10.0f);
    }
}
