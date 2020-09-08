package mx.gob.cdmx.biometrico_semanal;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class NotificacionIDTokenService extends FirebaseInstanceIdService {
    private final String TAG="FIREBASE_TOKEN";

    @Override
    public void onTokenRefresh() {
       // super.onTokenRefresh();
        String token= FirebaseInstanceId.getInstance().getToken();
        enviarTokenRegistro(token);
    }

private void enviarTokenRegistro(String token){

    Log.d(TAG,token);
}


}
