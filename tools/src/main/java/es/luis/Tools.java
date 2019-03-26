package es.luis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.io.Serializable;

/**
 * Created by luis on  25, marzo, 2019
 * Project Tools
 */
public class Tools {

    /**
     * Cargar el toolbar
     */
    static void cargarToolbar(AppCompatActivity activity, int idToolbarXml, String title, boolean back) {
        Toolbar myToolbar = activity.findViewById(idToolbarXml);
        myToolbar.setTitle(title);
        activity.setSupportActionBar(myToolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(back);
    }

    /**
     * Función que se encarga de lanzar un activity
     *
     * @param nameClass nombre de la clases del activity
     */
    static void openActivity(AppCompatActivity activity, Class nameClass) {
        Intent intentOpen = new Intent(activity.getBaseContext(),nameClass);
        activity.startActivity(intentOpen);
    }

    /**
     * Función que se encarga de lanzar un activity
     *
     * @param nameClass nombre de la clases del activity
     */
    static void openActivity(AppCompatActivity activity, Class nameClass, Serializable value, String keyValue) {
        Intent intentOpen = new Intent(activity.getBaseContext(), nameClass);
        intentOpen.putExtra(keyValue, value);
        activity.startActivity(intentOpen);
    }

}
