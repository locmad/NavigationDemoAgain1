package locnv27.fpoly.navigationdemoagain;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.google.android.material.navigation.NavigationView;

import locnv27.fpoly.navigationdemoagain.bai2.lab1Fragment;
import locnv27.fpoly.navigationdemoagain.databinding.ActivityMainBinding;
import locnv27.fpoly.navigationdemoagain.dialog.DialogFragment;
import locnv27.fpoly.navigationdemoagain.recyclerview.RecyclerviewFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        //setContentView(R.layout.activity_main);
        toolbar = activityMainBinding.idToolbar;
       // toolbar = findViewById(R.id.id_toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = activityMainBinding.layoutDrawer;
       // drawerLayout = findViewById(R.id.layoutDrawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                0,0);
        toggle.syncState();
        navigationView = activityMainBinding.idNavView;
        //navigationView = findViewById(R.id.id_navView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id ==R.id.bai1){
            replaceFragment(lab1Fragment.newInstance());

        }else if(id ==R.id.bai3){
            replaceFragment(RecyclerviewFragment.newInstance());
        }else if(id ==R.id.bai4){
            replaceFragment(DialogFragment.newInstance());
        }
        drawerLayout.closeDrawer(navigationView);
        return true;
    }
    public void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.layoutcontend,fragment);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.id_setting:
                break;
            case R.id.id_refresh:
                break;
            case R.id.id_langue:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}