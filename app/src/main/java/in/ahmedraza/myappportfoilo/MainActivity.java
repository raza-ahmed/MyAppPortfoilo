package in.ahmedraza.myappportfoilo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pupularMovies(View view){

        Toast.makeText(getApplicationContext(),"This button will launch Popular Movies App!", Toast.LENGTH_SHORT).show();


    }

    public void stockHawk(View view){

        Toast.makeText(getApplicationContext(),"This button will launch Stock Hawk App!", Toast.LENGTH_SHORT).show();
    }

    public void buildBigger(View view){

        Toast.makeText(getApplicationContext(),"This button will launch Build it Bigger App!", Toast.LENGTH_SHORT).show();
    }

    public void makeMaterial(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Make it Material App!", Toast.LENGTH_SHORT).show();
    }

    public void goUbiquitious(View view){

        Toast.makeText(getApplicationContext(),"This button will launch GO Ubiquitious App!", Toast.LENGTH_SHORT).show();

    }

    public void capstone(View view){

        Toast.makeText(getApplicationContext(),"This button will launch Capstone App!", Toast.LENGTH_SHORT).show();

    }


}
