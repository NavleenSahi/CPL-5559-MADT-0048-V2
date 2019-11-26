package com.example.readmine;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import static com.example.readmine.R.layout.activity_book;

public class BookGenre extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    CheckBox checkBoxKids, checkBoxSciFi, checkBoxHistory,
            checkBoxEvolution, checkBoxSelfHelp,
            checkBoxPuzzles, checkBoxAction, checkBoxHorror,
            checkBoxMystery, checkBoxSpiritual, checkBoxAdventure, checkBoxWar;


    Button saveButton;
    SQLiteHelper sqLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_book);

        sqLiteHelper = new SQLiteHelper(this);

        saveButton = findViewById(R.id.saveButton);
        checkBoxKids = findViewById(R.id.kids);
        checkBoxSciFi = findViewById(R.id.sciFi);
        checkBoxHistory = findViewById(R.id.history);
        checkBoxEvolution = findViewById(R.id.evolution);
        checkBoxSelfHelp = findViewById(R.id.selfHelp);
        checkBoxPuzzles = findViewById(R.id.puzzles);
        checkBoxAction = findViewById(R.id.action);
        checkBoxHorror = findViewById(R.id.horror);
        checkBoxMystery = findViewById(R.id.mystery);
        checkBoxSpiritual = findViewById(R.id.spiritual);
        checkBoxAdventure = findViewById(R.id.adventure);
        checkBoxWar = findViewById(R.id.war);

        // UpdateData();


        String strKids = "";
        if (checkBoxKids.isChecked()) {
            strKids = checkBoxKids.getText().toString();
        }

        String strSciFi = "";
        if (checkBoxSciFi.isChecked()) {
            strSciFi = checkBoxSciFi.getText().toString();
        }

        String strHistory = "";
        if (checkBoxHistory.isChecked()) {
            strHistory = checkBoxHistory.getText().toString();
        }

        String strEvolution = "";
        if (checkBoxEvolution.isChecked()) {
            strEvolution = checkBoxEvolution.getText().toString();
        }

        String strSelfHelp = "";
        if (checkBoxSelfHelp.isChecked()) {
            strSelfHelp = checkBoxSelfHelp.getText().toString();
        }

        String strPuzzles = "";
        if (checkBoxPuzzles.isChecked()) {
            strPuzzles = checkBoxPuzzles.getText().toString();
        }

        String strAction = "";
        if (checkBoxAction.isChecked()) {
            strAction = checkBoxAction.getText().toString();
        }

        String strHorror = "";
        if (checkBoxHorror.isChecked()) {
            strHorror = checkBoxHorror.getText().toString();
        }

        String strMystery = "";
        if (checkBoxMystery.isChecked()) {
            strMystery = checkBoxMystery.getText().toString();
        }

        String strSpiritual = "";
        if (checkBoxSpiritual.isChecked()) {
            strSpiritual = checkBoxSpiritual.getText().toString();
        }

        String strAdventure = "";
        if (checkBoxAdventure.isChecked()) {
            strAdventure = checkBoxAdventure.getText().toString();
        }


        String strWar = "";
        if (checkBoxWar.isChecked()) {
            strWar = checkBoxWar.getText().toString();
        }


//
//    }
//
//    public void UpdateData() {
//        saveButton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {

        strKids = checkBoxKids.getText().toString();
        strSciFi = checkBoxSciFi.getText().toString();
        strHistory = checkBoxHistory.getText().toString();
        strEvolution = checkBoxEvolution.getText().toString();
        strSelfHelp = checkBoxSelfHelp.getText().toString();
        strPuzzles = checkBoxPuzzles.getText().toString();
        strAction = checkBoxAction.getText().toString();
        strHorror = checkBoxHorror.getText().toString();
        strMystery = checkBoxMystery.getText().toString();
        strSpiritual = checkBoxSpiritual.getText().toString();
        strAdventure = checkBoxAdventure.getText().toString();
        strWar = checkBoxWar.getText().toString();



//                 public  void  updateGenre(final String strKids, final String strSciFi,final String strHistory,final String strEvolution,final String strSelfHelp,final String strPuzzles,
//                                            final  String strAction,final String strHorror,final String strMystery,
//                                            final String strSpiritual,final String strAdventure,final String strWar){


                     saveButton = findViewById(R.id.saveButton);
        final String finalStrKids = strKids;
        final String finalStrSciFi = strSciFi;
        final String finalStrHistory = strHistory;
        final String finalStrEvolution = strEvolution;
        final String finalStrSelfHelp = strSelfHelp;
        final String finalStrPuzzles = strPuzzles;
        final String finalStrAction = strAction;
        final String finalStrHorror = strHorror;
        final String finalStrMystery = strMystery;
        final String finalStrSpiritual = strSpiritual;
        final String finalStrAdventure = strAdventure;
        final String finalStrWar = strWar;
        saveButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    boolean isinserted =  sqLiteHelper.updateGenre(finalStrKids, finalStrSciFi, finalStrHistory, finalStrEvolution, finalStrSelfHelp, finalStrPuzzles,
                                finalStrAction, finalStrHorror, finalStrMystery, finalStrSpiritual, finalStrAdventure, finalStrWar);

                    if(isinserted == true)
                         Toast.makeText(BookGenre.this, "Data is Updated", Toast.LENGTH_SHORT).show();
//                            // Toast.makeText(BookGenre.this,"Data is not Updated", Toast.LENGTH_SHORT).show()
                    else
                         Toast.makeText(BookGenre.this, "Data is not Updated", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

}





