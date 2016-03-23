package test.appium.com.sampleappiumproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button getToastMessage = (Button)findViewById(R.id.gettoastmessage);
        getToastMessage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "You have clicked on Toast Message Button!", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button logout = (Button)findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Options.this, MainActivity.class));
                Toast.makeText(getApplicationContext(),
                        "You have successfully logged out", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

}
