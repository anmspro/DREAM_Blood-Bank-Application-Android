package org.anms.dream;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class donorlogin extends AppCompatActivity {

    private EditText donoremail;
    private EditText donorpass;
    private Button donorb;
    private TextView newacc;
    private FirebaseAuth firebaseAuth;
    private FirebaseUser donor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donorlogin);
        donor = FirebaseAuth.getInstance().getCurrentUser();
        if(donor == null)
        {
            
        }
        //firebaseAuth = FirebaseAuth.getInstance();
        /*donorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = donoremail.getText().toString().trim();
                String pass = donorpass.getText().toString().trim();
                firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCanceledListener(new OnCompleteListener<>() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(this, "Registration Succesfull", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(this, "Registration Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
            }
        });*/
        newacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DonorRegForm.class));
            }
        });
    }
    /*private boolean validatg(String email,String pass)
    {

    }*/
}
