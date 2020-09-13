package com.example.technovelty;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    //Deklarasi Variable
    private EditText PassInput;
    private CheckBox ShowPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PassInput = findViewById(R.id.password);
        ShowPass = findViewById(R.id.showPass);

        ShowPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ShowPass.isChecked()){
                    PassInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    PassInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
}