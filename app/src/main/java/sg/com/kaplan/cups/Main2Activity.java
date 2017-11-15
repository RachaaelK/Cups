package sg.com.kaplan.cups;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b3 = (Button) findViewById(R.id.idareu);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        Button b2 = (Button) findViewById(R.id.flee);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                finish();
            }
        });
    }
}

