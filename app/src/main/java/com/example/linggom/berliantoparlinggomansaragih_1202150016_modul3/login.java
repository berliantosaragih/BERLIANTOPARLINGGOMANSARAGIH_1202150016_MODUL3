package com.example.linggom.berliantoparlinggomansaragih_1202150016_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Linggom on 25/02/2018.
 */

public class login extends AppCompatActivity {
    //    Deklarasi variabel
    private EditText Username, Pass;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

//      Inisiasi dengan id
        Username = (EditText)findViewById(R.id.userForm);
        Pass = (EditText)findViewById(R.id.passForm);
        Login = (Button) findViewById(R.id.btnLogin);

//      Membuat tombol dapat di klik
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = Username.getText().toString().trim();
                String pass = Pass.getText().toString().trim();

                if(user.equals("EAD") && pass.equals("MOBILE")){
                    Intent intent = new Intent(login.this, Daftarmenu.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(login.this, "Username and Password are incorect. Try Again", Toast.LENGTH_SHORT).show();
                }
                if(user.isEmpty()){
                    Toast.makeText(login.this, "Please Input Username", Toast.LENGTH_SHORT).show();
                }if(pass.isEmpty()){
                    Toast.makeText(login.this, "Please Input Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


