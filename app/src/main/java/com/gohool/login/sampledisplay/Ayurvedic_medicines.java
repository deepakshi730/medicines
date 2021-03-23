package com.gohool.login.sampledisplay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Ayurvedic_medicines extends AppCompatActivity {

    ListView listView;
    String[] name;
    int[] img;
    ArrayList<ItemsModel> arrayList = new ArrayList<ItemsModel>();
    ListViewAdapter adapter;
   // CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurvedic_medicines);


        name = new String[]{"Anti Diabetic", "Blood Pressure", "Anti Biotic","Anti Infective", "Anti Allergic","Respiratory","Cholesterol","Cardiac","Pain Killer" };
        img = new int[]{R.drawable.antidiabetic, R.drawable.hypertension, R.drawable.antibiotics, R.drawable.anti_infectives, R.drawable.anti_allergic, R.drawable.respiratory, R.drawable.cholesterol, R.drawable.cardiac, R.drawable.pain_killer  };

        listView = (ListView) findViewById(R.id.categories_listview);

        for (int i=0; i<name.length; i++)
        {
            ItemsModel itemsModel = new ItemsModel(name[i],img[i]);
            arrayList.add(itemsModel);
        }

        adapter = new ListViewAdapter(this, arrayList);
        listView.setAdapter(adapter);



     /*   for(int i=0;i<name.length;i++)
        {
            ItemsModel itemsModel = new ItemsModel(name[i],img[i]);
            listItems.add(itemsModel);
        }
        customAdapter = new CustomAdapter(listItems,this);
        listView.setAdapter(customAdapter);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(TextUtils.isEmpty(newText))
                {
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(newText);
                }
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id =item.getItemId();
        if(id==R.id.search_view)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                customAdapter.getFilter().filter(newText);

                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.search_view)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class CustomAdapter extends BaseAdapter implements Filterable {

        private List<ItemsModel> itemsModelList;
        private List<ItemsModel> itemsModelListFiltered;
        private Context context;

        public CustomAdapter(List<ItemsModel> itemsModelList, Context context) {
            this.itemsModelList = itemsModelList;
            this.itemsModelListFiltered = itemsModelList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return itemsModelListFiltered.size();
        }

        @Override
        public Object getItem(int position) {
            return itemsModelListFiltered.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.medicine_categories,null);

            ImageView imageView = view.findViewById(R.id.categories_image);
            TextView textView = view.findViewById(R.id.categories_name);

            imageView.setImageResource(itemsModelListFiltered.get(position).getImg());
            textView.setText(itemsModelListFiltered.get(position).getName());


            return view;
        }

        @Override
        public Filter getFilter() {
            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {

                    FilterResults filterResults = new FilterResults();

                    if(constraint == null || constraint.length() == 0){
                        filterResults.count = itemsModelList.size();
                        filterResults.values = itemsModelList;
                    }
                    else {
                        String searchStr = constraint.toString().toLowerCase();
                        List<ItemsModel> resultData = new ArrayList<>();
                        for(ItemsModel itemsModel:itemsModelList){
                            if(itemsModel.getName().contains(searchStr)){
                                resultData.add(itemsModel);
                            }
                            filterResults.count =resultData.size();
                            filterResults.values = resultData;
                        }
                    }

                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {
                    itemsModelListFiltered = (List<ItemsModel>) results.values;

                    notifyDataSetChanged();

                }
            };

            return filter;
        }
    }
*/
}
