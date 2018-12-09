package org.anms.dream;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DonorRegForm extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_reg_form);
        radioGroup =findViewById(R.id.radiogroup1);
        Toast.makeText(getBaseContext(),radioButton.getText(),Toast.LENGTH_SHORT).show();



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
    public void checkbutton(View V)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById(radioId);
    }
}
