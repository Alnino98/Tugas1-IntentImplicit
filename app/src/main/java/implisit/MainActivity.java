package implisit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import implisit.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnWebBrowser;
    Button btnDialPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWebBrowser = findViewById(R.id.btn_web_browser);
        btnWebBrowser.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_web_browser:
                String url = "http://abhyelnino.blogspot.com/" ;
                Intent openBrowserIntent = new Intent(Intent.ACTION_VIEW);
                openBrowserIntent.setData(Uri.parse(url));
                startActivity(openBrowserIntent);
                break;

            case R.id.btn_dial_number:
                String phoneNumber = "085716078516";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;


        }
    }
}
