package com.example.temucovet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaVeterinarias extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {
    GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_veterinarias);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }
    public void volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        LatLng Temuco = new LatLng(-38.735767869152816, -72.5903631740107);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

        LatLng VeterinariaCorralSur = new LatLng(-38.74103828302345, -72.59846810565489);
        mMap.addMarker(new MarkerOptions().position(VeterinariaCorralSur).title("Veterinaria Corral Sur"));

        LatLng VeterinariaAnimalia = new LatLng(-38.737724358226465, -72.59327534896127);
        mMap.addMarker(new MarkerOptions().position(VeterinariaAnimalia).title("Veterinaria Animalia"));

        LatLng VeterinariaRodrigez = new LatLng(-38.73534761038213, -72.59507779349057);
        mMap.addMarker(new MarkerOptions().position(VeterinariaRodrigez).title("Veterinaria Rodrigez"));

        LatLng VeterinariaAlma = new LatLng(-38.735012850822066, -72.59421948659896);
        mMap.addMarker(new MarkerOptions().position(VeterinariaAlma).title("Veterinaria Alma"));

        LatLng VeterinariaEden = new LatLng(-38.740435762707826, -72.60705117469934);
        mMap.addMarker(new MarkerOptions().position(VeterinariaEden).title("Veterinaria Eden"));

        LatLng VeterinariaArcaDeNoe = new LatLng(-38.73825995244465, -72.6189387250517);
        mMap.addMarker(new MarkerOptions().position(VeterinariaArcaDeNoe).title("Veterinaria Arca De Noe"));

        LatLng VeterinariaDuoVet = new LatLng(-38.73651925651789, -72.61906747108952);
        mMap.addMarker(new MarkerOptions().position(VeterinariaDuoVet).title("Veterinaria DuoVet"));

        LatLng VeterinariaKennel = new LatLng(-38.735448037959216, -72.62280110614856);
        mMap.addMarker(new MarkerOptions().position(VeterinariaKennel).title("Veterinaria Kennel"));

        LatLng VeterinariaTemuco = new LatLng(-38.73862817118806, -72.62361649758722);
        mMap.addMarker(new MarkerOptions().position(VeterinariaTemuco).title("Veterinaria Temuco"));

        LatLng VeterinariaSevilla = new LatLng(-38.737891731883835, -72.63086919076008);
        mMap.addMarker(new MarkerOptions().position(VeterinariaSevilla).title("Veterinaria Sevilla"));

        LatLng VeterinariaFelican = new LatLng(-38.74297970295172, -72.63593320150586);
        mMap.addMarker(new MarkerOptions().position(VeterinariaFelican).title("Veterinaria Felican"));

        LatLng VeterinariaAraucania = new LatLng(-38.73740019634855, -72.63458713172565);
        mMap.addMarker(new MarkerOptions().position(VeterinariaAraucania).title("Veterinaria Araucania"));

        LatLng VeterinariaAltamira = new LatLng(-38.74967511047665, -72.64532002595921);
        mMap.addMarker(new MarkerOptions().position(VeterinariaAltamira).title("Veterinaria Altamira"));

        LatLng VeterinariaCityDog = new LatLng(-38.74933776162454, -72.61720365559816);
        mMap.addMarker(new MarkerOptions().position(VeterinariaCityDog).title("Veterinaria City Dog"));

        LatLng VeterinariaNielol = new LatLng(-38.737714284095006, -72.5809613524388);
        mMap.addMarker(new MarkerOptions().position(VeterinariaNielol).title("Veterinaria Ñielol"));

        LatLng VeterinariaVeterpet = new LatLng(-38.7348338619578, -72.58401227609188);
        mMap.addMarker(new MarkerOptions().position(VeterinariaVeterpet).title("Veterinaria Veterpet"));

        LatLng VeterinariaLaGranja = new LatLng(-38.73550103240708, -72.5815579490193);
        mMap.addMarker(new MarkerOptions().position(VeterinariaLaGranja).title("Veterinaria La Granja"));

        LatLng VeterinariaExonupets = new LatLng(-38.72734028958302, -72.57812581172257);
        mMap.addMarker(new MarkerOptions().position(VeterinariaExonupets).title("Veterinaria Exonuspet"));

        LatLng VeterinariaAlcantara = new LatLng(-38.70844567326826, -72.55055418036495);
        mMap.addMarker(new MarkerOptions().position(VeterinariaAlcantara).title("Veterinaria Alcantara"));

        LatLng VeterinariaLosCastanos = new LatLng(-38.704752476249034, -72.55462527895804);
        mMap.addMarker(new MarkerOptions().position(VeterinariaLosCastanos).title("Veterinaria Los Castaños"));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {

    }
}