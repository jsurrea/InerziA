package com.example.inerzia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.inerzia.modelo.SignUp;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SignUpActivity extends AppCompatActivity {

    private EditText usuarioSu;
    private EditText correoElectronico;
    private EditText contraseña;
    private Button btnCuenta;


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    private FirebaseDatabase BD = FirebaseDatabase.getInstance();
    private DatabaseReference root = BD.getReference().child("Usuarios");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        usuarioSu = (EditText) findViewById(R.id.etUsuario);
        correoElectronico = (EditText) findViewById(R.id.etCorreo);
        contraseña = (EditText) findViewById(R.id.etContrsaeña);
        btnCuenta = findViewById(R.id.btnCrearCuenta);

      //  inicializarBD();

        btnCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuariosu = usuarioSu.getText().toString();
                String correoelectronico = correoElectronico.getText().toString();
                String contraseñaS = contraseña.getText().toString();

                HashMap<String, String> userMap = new HashMap<>();

                userMap.put("usuario" , usuariosu);
                userMap.put("email" , correoelectronico);
                userMap.put("contraseña" , contraseñaS);

                root.push().setValue(userMap);

            }
        });
    }




    public void nuevaCuenta(View view){
        Intent sesion = new Intent(SignUpActivity.this, HomeActivity.class);
        startActivity(sesion);
    }

    public void regresar(View view){
        Intent back = new Intent(SignUpActivity.this, LandingActivity.class);
        startActivity(back);
    }
//    private void inicializarBD() {
//        FirebaseApp.initializeApp(this);
//        firebaseDatabase = FirebaseDatabase.getInstance();
//        databaseReference = firebaseDatabase.getReference();
//    }


//    private void CrearCuentaBD() {


//    public boolean EnviarBD( ){
//        String usuariosu = usuarioSu.getText().toString();
//        String correoelectronico = correoElectronico.getText().toString();
//        String contraseñaS = contraseña.getText().toString();
//
//                if (usuariosu.isEmpty()||(correoelectronico.isEmpty())||(contraseñaS.isEmpty())){
//                    validacion();
//                }
//                else{
//                   SignUp objSignUp = new SignUp();
//                   objSignUp.setNombreNickname(usuariosu);
//                   objSignUp.setCorreoElectronico(correoelectronico);
//                   objSignUp.setContraseña(contraseñaS);
//                   databaseReference.child("sign-up").child(objSignUp.getContraseña()).setValue(objSignUp);
//                   Toast.makeText(this, "Cuenta creada correctamente", Toast.LENGTH_SHORT).show();
//                   limpiarCajas();
//                }
//
//    }
//public boolean onOptionsItemSelected(MenuItem MenuItem){
//    String usuariosu = this.usuarioSu.getText().toString();
//    String correoelectronico = this.correoElectronico.getText().toString();
//    String contraseñaS = this.contraseña.getText().toString();
//    MenuItem item = null;
//    switch (item.getItemId()){
//        case R.id.btnCrearCuenta:
//            if (usuariosu.isEmpty()||(correoelectronico.isEmpty())||(contraseñaS.isEmpty())){
//                validacion();
//            }
//            else{
//                SignUp objSignUp = new SignUp();
//                objSignUp.setNombreNickname(usuariosu);
//                objSignUp.setCorreoElectronico(correoelectronico);
//                objSignUp.setContraseña(contraseñaS);
//                databaseReference.child("sign-up").child(objSignUp.getContraseña()).setValue(objSignUp);
//                Toast.makeText(this, "Cuenta creada correctamente", Toast.LENGTH_SHORT).show();
//                limpiarCajas();
//            } break;
//        case R.id.btnRegresar:
//            Toast.makeText(this, "Estas regresando al inicio de InerziA", Toast.LENGTH_SHORT).show();
//            Intent back = new Intent(SignUpActivity.this, LandingActivity.class);
//            startActivity(back);
//            break;
//        default:
//            break;
//    }
//    return super.onOptionsItemSelected(item);
//}
   // }

    public void limpiarCajas (){
        usuarioSu.setText("");
        correoElectronico.setText("");
        contraseña.setText("");
    }



    public void validacion (){
        String usuariosu = usuarioSu.getText().toString();
        String correoelectronico = correoElectronico.getText().toString();
        String contraseñaS = contraseña.getText().toString();
        if (usuariosu.isEmpty()){
            usuarioSu.setError("Requerido");
        } else if (correoelectronico.isEmpty()){
            correoElectronico.setError("Requerido");
        }else {
            contraseña.setError("Requerido");
        }
    }
}