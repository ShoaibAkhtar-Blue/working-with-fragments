package blue.project.workingwithfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.myFragmentLayout, firstFragment).commit();

        Button firstFragmentButton = findViewById(R.id.button_fragment1);
        Button secondFragmentButton = findViewById(R.id.button_fragment2);

        firstFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.myFragmentLayout, firstFragment).commit();
            }
        });

        secondFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.myFragmentLayout, secondFragment).commit();
            }
        });
    }
}