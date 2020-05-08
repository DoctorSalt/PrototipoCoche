package com.example.prototipocoche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

public class MainActivity extends AppCompatActivity {
    Entidad x;
    ImageView imgFoto;
    TextView inModelo, inMarca, inAno, inHP, inMotor, inCombustible, inTraccion, inTransmision, inMarcha, inMax, inCC, inCuerpo, inVersion, lbVersion;
    Context contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgFoto = findViewById(R.id.imageView);
        inModelo = findViewById(R.id.inNombre);
        inMarca = findViewById(R.id.inMarca);
        inAno = findViewById(R.id.inAno);
        inHP = findViewById(R.id.inHP);
        inMotor = findViewById(R.id.inMotor);
        inCombustible = findViewById(R.id.inCombustible);
        inTraccion = findViewById(R.id.inTraccion);
        inTransmision=findViewById(R.id.inTransmision);
        inMarcha = findViewById(R.id.inMarcha);
        inMax = findViewById(R.id.inMax);
        inCC = findViewById(R.id.inCC);
        inCuerpo = findViewById(R.id.inCuerpo);
        inVersion = findViewById(R.id.inVersion);
        lbVersion = findViewById(R.id.lbVersion);
        contexto = getApplicationContext();
        setTitle("Coche especifico");
        llamarHttpClass();
    }

    private void llamarHttpClass() {
        ConectandoHTP claes= new ConectandoHTP(imgFoto,inModelo,inMarca,inAno,inHP,inMotor,inCombustible,inTraccion,inTransmision,inMarcha,inMax,inCC,inCuerpo,inVersion,lbVersion, contexto);
        claes.execute();
    }



}
