package com.xcats.firstbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by aidan on 2/6/16.
 */
public class ViewSubTeamsActivity extends Activity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subteam_list);
    }
    public void viewMembers (View view){
        Intent viewMembers = new Intent(this,ViewMembersActivity.class);
        this.startActivity(viewMembers);
    }
}
