package udacity.sckim.com.catinthehat;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

//
//    Button catButton = (Button)findViewById(R.id.theCatBtn2);
//    Button thingButton1 = (Button)findViewById(R.id.thingBtn1);
//    Button thingButton2 = (Button)findViewById(R.id.thingBtn2);
//    Button thingaButton = (Button)findViewById(R.id.thingmajiggerBtn);
//    Button sallyButton = (Button)findViewById(R.id.sallyBtn);
//    Button nickButton = (Button)findViewById(R.id.nickBtn);
    Button drButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drButton = (Button)findViewById(R.id.seussBtn);
        drButton.getBackground().setColorFilter(Color.parseColor("#B51A00"), PorterDuff.Mode.SRC_ATOP);
    }

    public void onClick(View v) {
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        Toast.makeText(getApplicationContext(), buttonText, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
