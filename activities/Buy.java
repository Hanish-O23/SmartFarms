package akssmk.com.agriculturalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Spinner;

import com.google.firebase.auth.FirebaseAuth;

import akssmk.com.agriculturalapp.R;

public class Buy extends AppCompatActivity {
    Spinner spinner;
    CardView cvBuy,cvSignout,cvCall,cvRates;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        cvBuy  = (CardView)findViewById(R.id.cvBuy);
        cvSignout  = (CardView)findViewById(R.id.cvSignout);
        cvCall  = (CardView)findViewById(R.id.cvCall);
        cvRates  = (CardView)findViewById(R.id.cvMarket_rates);

        auth = FirebaseAuth.getInstance();

        cvBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Buy.this,SpinBuy.class));
            }
        });

        cvSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                startActivity(new Intent(Buy.this,LoginActivity.class));
                finish();
            }
        });
        cvCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cvRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Buy.this,GraphActivity.class));
            }
        });

    }
}
