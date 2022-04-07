package com.wimonsiri.popupmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
        PopupMenu.OnMenuItemClickListener {
    Button button;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        button = (Button) findViewById(R.id.button);
    }
    public void changeBackground(View view) {
        PopupMenu popupMenu = new PopupMenu(this, button);
        popupMenu.getMenuInflater().inflate(R.menu.menu_main,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener( this);
        popupMenu.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.white:
                relativeLayout.setBackgroundColor(Color.WHITE);
                Toast.makeText( this, "White", Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue:
                relativeLayout.setBackgroundColor(Color.BLUE);
                Toast.makeText( this, "Blue", Toast.LENGTH_SHORT).show();
                break;
            case R.id.yellow:
                relativeLayout.setBackgroundColor(Color.YELLOW);
                Toast.makeText( this, "Yellow", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}