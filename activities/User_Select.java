package akssmk.com.agriculturalapp.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import akssmk.com.agriculturalapp.R;


public class User_Select extends AppCompatActivity {
    ImageButton ibtnFarmer,ibtnMerchant;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__select);
        sp = getSharedPreferences("D1",MODE_PRIVATE);
        ibtnFarmer = (ImageButton) findViewById(R.id.ibtnFarmer);
        ibtnMerchant = (ImageButton) findViewById(R.id.ibtnMerchant);
        final SharedPreferences.Editor editor = sp.edit();
        ibtnMerchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User_Select.this,LoginActivity.class);
                editor.putString("user","merchant");
                startActivity(i);

            }
        });
        ibtnFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User_Select.this,LoginActivity.class);
                editor.putString("user","farmer");
                startActivity(i);
            }
        });


    }
}
