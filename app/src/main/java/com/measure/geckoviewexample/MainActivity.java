package com.measure.geckoviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.mozilla.geckoview.GeckoRuntime;
import org.mozilla.geckoview.GeckoSession;
import org.mozilla.geckoview.GeckoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      GeckoView view = findViewById(R.id.geckoview);
      GeckoSession session = new GeckoSession();
      GeckoRuntime runtime = GeckoRuntime.create(this);

      session.open(runtime);
      view.setSession(session);
      session.loadUri("https://www.mozilla.org");

    }
}
