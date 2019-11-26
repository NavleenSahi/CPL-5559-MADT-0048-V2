package com.example.readmine;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {


    SQLiteHelper sqLiteHelper;
    Button update;
    EditText fname, newpassword , confirmpassword;
    EditText Email;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sqLiteHelper = new SQLiteHelper(this);

        Email = (EditText)findViewById(R.id.showMail);
        fname = findViewById(R.id.fName);
        newpassword = findViewById(R.id.newPwd);
        confirmpassword = findViewById(R.id.confPwd);
        update = findViewById(R.id.update);

        pic = findViewById(R.id.choosePic);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intent);

            }
        });


        UpdateData();
    }
    public void UpdateData()
    {
        update.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      String editEmail =   Email.getText().toString();
                       String editName = fname.getText().toString();
                        String editPwd = newpassword.getText().toString();
                        if(editEmail.matches("") && editName.matches("")&& editPwd.matches(""))
                        {
                            Toast.makeText(ProfileActivity.this,"Data is not Updated", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                sqLiteHelper.updateData(editEmail,editName ,editPwd );
                                Toast.makeText(ProfileActivity.this,"Data is Updated", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

        );
    }



    }

