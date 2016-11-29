package text.bwei.com.lianxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DActivity extends AppCompatActivity {
    private Button DtA, DtB, DtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        DtA();
        DtB();
        DtC();
        Log.d("**********D","onCreate()");
    }

    public void DtA() {
        DtA = (Button) findViewById(R.id.DtA);
        DtA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DActivity.this, MainActivity.class);
                intent.putExtra("fragment", 0);
                startActivity(intent);
            }
        });
    }

    public void DtB() {
        DtB = (Button) findViewById(R.id.DtB);
        DtB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DActivity.this, MainActivity.class);
                intent.putExtra("fragment", 1);
                startActivity(intent);
            }
        });
    }

    public void DtC() {
        DtC = (Button) findViewById(R.id.DtC);
        DtC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DActivity.this, MainActivity.class);
                intent.putExtra("fragment", 2);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("**********D", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("**********D", "onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("**********D", "onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("**********D", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("**********D", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("**********D", "onDestroy()");
    }


}
