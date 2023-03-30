package com.example.arslanconstraints10.SearchViewOnly;

import android.app.SearchManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arslanconstraints10.R;

import java.util.ArrayList;
import java.util.List;

public class FranchiseActivity extends AppCompatActivity implements CountryAdapter.FruitAdapterListener {

    RecyclerView recyclerView;
    List<CountryModel> countryModelList;
    CountryAdapter adapter;
    SearchView searchView;

    //Array
    String[] names={"Senayan City Mall","Toladam","Jalapur Plaza","Senayan City Mall","Adam Smith Road","Toladam"};
    //Array 2 desc
    String[] sntfNames={"Jakarta Pusat","Palu stage","Punica Granatum","Citrus Sinensis","Citrullus Vulgaris","Musa Acuminata"};

    //Array of   images
    int[] image ={R.drawable.senayan,R.drawable.tola,R.drawable.jalapur,R.drawable.senayan,R.drawable.sma1,R.drawable.jalapur};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franchise);
        if(getSupportActionBar()!=null)
        {
            ///to hide button
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(false);
        }

        //finding views
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        //item decorator to separate the items
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        //setting layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // toolbar fancy stuff
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Enter Location Or Name");

        // white background notification bar
        //  whiteNotificationBar(recyclerView);

        //initialize fruits list
        countryModelList = new ArrayList<>();
        adapter = new CountryAdapter(this,countryModelList,this);

        //method to load countries
        loadcountryModel();
        //onItemClickListener
        recyclerView.addOnItemTouchListener(new CountryTouchListener(getApplicationContext(), new CountryTouchListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                //Place item click action here
                Toast.makeText(getApplicationContext(),"You have clicked . . .  "+names[position], Toast.LENGTH_SHORT).show();
            }
        }));
    }

    private void loadcountryModel() {

        for(int i=0; i<names.length;i++) {
            countryModelList.add(new CountryModel(names[i], sntfNames[i], image[i]));
        }
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // listening to search query text change
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // filter recycler view when query submitted
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                // filter recycler view when text is changed
                adapter.getFilter().filter(query);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        // close search view on back button pressed
        if (!searchView.isIconified()) {
            searchView.setIconified(true);
            return;
        }
        super.onBackPressed();
    }

    private void whiteNotificationBar(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            view.setSystemUiVisibility(0);
        }
    }

    @Override
    public void onFruitSelected(CountryModel item) {
        Toast.makeText(getApplicationContext(), "Selected: " + item.getName() , Toast.LENGTH_LONG).show();
    }

}
