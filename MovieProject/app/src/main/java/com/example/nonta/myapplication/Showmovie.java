package com.example.nonta.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class Showmovie extends AppCompatActivity {
    public String ID;
    TextView name,year,runtime,actors,plot;
    ImageView immovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmovie);
        name = (TextView) findViewById(R.id.txt1);
        year = (TextView) findViewById(R.id.txt2);
        runtime = (TextView) findViewById(R.id.txt3);
        actors = (TextView) findViewById(R.id.txt4);
        plot = (TextView) findViewById(R.id.txt5);
        immovie = (ImageView) findViewById(R.id.im1);

        ID = (getIntent().getExtras().getString("sID"));
       // tx.setText(ID);

        get_Json();

    }




    public void get_Json(){

        String json;
        try{
            InputStream is =getAssets().open("movie.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();


            json = new String(buffer,"UTF-8");
            JSONArray jsonArray = new JSONArray(json);

            for (int i = 0;i<jsonArray.length();i++){

                JSONObject obj = jsonArray.getJSONObject(i);

                if (ID.equals(String.valueOf(i)) ){

                    loadImageurl(obj.getString("posterUrl"));
                    name.setText("Name : "+obj.getString("name"));
                    year.setText("Year : "+obj.getString("year"));
                    runtime.setText("Runtime : "+obj.getString("runtime") + " minute" );
                    actors.setText("Actors : "+obj.getString("actors"));
                    plot.setText("Plot : "+obj.getString("plot"));


                }


            }


            //  Toast.makeText(getApplicationContext(),list.toString(),Toast.LENGTH_LONG).show();

        } catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    private void loadImageurl(String url) {
        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(immovie, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });

    }
}
