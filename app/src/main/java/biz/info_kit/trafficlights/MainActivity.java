package biz.info_kit.trafficlights;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button mRedButton;
    private Button mYellowButton;
    private Button mGreenButton;
    private RelativeLayout mLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRedButton = (Button)findViewById(R.id.buttonRed);
        mYellowButton = (Button)findViewById(R.id.buttonYellow);
        mGreenButton = (Button)findViewById(R.id.buttonGreen);
        mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
                mTextView.setText(getString(R.string.greenColor_en));
            }
        });

        mLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        mTextView = (TextView)findViewById(R.id.textView);
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

    public void onClickRedButton(View view) {
        mLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
        mTextView.setText(getString(R.string.redColor_en));
    }

    public void onClickYellowButton(View view) {
        mLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
        mTextView.setText(getString(R.string.yellowColor_en));
    }
}
