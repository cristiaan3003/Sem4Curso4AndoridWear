package com.example.cristian.myapplication.Broadcasters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.cristian.myapplication.activities.MainActivity;
import com.example.cristian.myapplication.activities.PerfilUsuarioActivity;


public class VerUsuario extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String ACTION_KEY = "VER_USUARIO";
        String accion = intent.getAction();
        Toast.makeText(context, "entrando", Toast.LENGTH_SHORT).show();

        if (ACTION_KEY.equals(accion)){

            Bundle bundle = intent.getExtras();
            String usuario = bundle.getString("usuario");

            Intent i = new Intent(context,PerfilUsuarioActivity.class);
            i.putExtra("usuario", usuario);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_SINGLE_TOP);
            context.startActivity(i);
        }

    }
}
