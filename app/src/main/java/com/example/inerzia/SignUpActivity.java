package com.example.inerzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.example.inerzia.modelo.SignUp;

import java.util.ArrayList;
import java.util.List;

public class SignUpActivity extends AppCompatActivity {

    private EditText usuarioSu;
    private EditText correoElectronico;
    private EditText contraseña;
    private final List<SignUp> listSignUp = new ArrayList<>();
    ArrayAdapter <SignUp> arrayAdapterSignUp;
    SignUp signUpselect;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        usuarioSu = (EditText) findViewById(R.id.etUsuario);
        correoElectronico = (EditText) findViewById(R.id.etCorreo);
        contraseña = (EditText) findViewById(R.id.etContrsaeña);
        inicializarBD();
    }

    public void nuevaCuenta(View view){
        Intent sesion = new Intent(SignUpActivity.this, HomeActivity.class);
        startActivity(sesion);
    }

    public void regresar(View view){
        Intent back = new Intent(SignUpActivity.this, LandingActivity.class);
        startActivity(back);
    }
    private void inicializarBD() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = DatabaseReference.getInstance();
    }
    public boolean onOptionsItemSelected(MenuItem){
        String usuariosu = this.usuarioSu.getText().toString();
        String correoelectronico = this.correoElectronico.getText().toString();
        String contraseñaS = this.contraseña.getText().toString();
        MenuItem item;
        switch (item.getItemId()){
            case R.id.btnCrearCuenta:
                if (usuariosu.isEmpty()||(correoelectronico.isEmpty())||(contraseñaS.isEmpty())){
                    validacion();
                }
                else{
                   SignUp objSignUp = new SignUp();
                   objSignUp.setNombreNickname(usuariosu);
                   objSignUp.setCorreoElectronico(correoelectronico);
                   objSignUp.setContraseña(contraseñaS);
                   databaseReference.child("sign-up").child(objSignUp.getContraseña()).setValue(objSignUp);
                   Toast.makeText(this, "Cuenta creada correctamente", Toast.LENGTH_SHORT).show();
                   limpiarCajas();
                } break;
            case R.id.btnRegresar:
                Toast.makeText(this, "Estas regresando al inicio de InerziA", Toast.LENGTH_SHORT).show();
                Intent back = new Intent(SignUpActivity.this, LandingActivity.class);
                startActivity(back);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
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