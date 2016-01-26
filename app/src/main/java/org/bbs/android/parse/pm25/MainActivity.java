/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.bbs.android.parse.pm25;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

import java.util.Random;


public class MainActivity extends ActionBarActivity {


  private static final String TAG = MainActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        //    ParseObject testObject = new ParseObject("TestObject");
//    testObject.put("foo", "bar");
////    testObject.saveInBackground();
//    testObject.saveInBackground(new SaveCallback() {
//      @Override
//      public void done(ParseException e) {
//        Log.d(TAG, "done. e:" + e);
//      }
//    });

        PMS50003 pm = ParseObject.create(PMS50003.class);

        Random r = new Random();
        pm.setPm1_0_CF1(r.nextInt(100));
        pm.setPm2_5_CF1(r.nextInt(100));
        pm.setPm10_CF1(r.nextInt(100));

        pm.setPm1_0(r.nextInt(100));
        pm.setPm2_5(r.nextInt(100));
        pm.setPm10(r.nextInt(100));

        pm.setValue_0_3(r.nextInt(100));
        pm.setValue_0_5(r.nextInt(100));
        pm.setValue_1(r.nextInt(100));
        pm.setValue_2_5(r.nextInt(100));
        pm.setValue_5(r.nextInt(100));
        pm.setValue_10(r.nextInt(100));
        pm.setRecordedTime(System.currentTimeMillis());

//    pm.saveInBackground(new SaveCallback() {
//      @Override
//      public void done(ParseException e) {
//        Log.d(TAG, "done. e:" + e);
//      }
//    });
        pm.saveEventually(new SaveCallback() {
          @Override
          public void done(ParseException e) {
            Log.d(TAG, "done. e:" + e);
          }
        });
      }
    });

    ParseAnalytics.trackAppOpenedInBackground(getIntent());


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
