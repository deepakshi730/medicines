package com.gohool.login.sampledisplay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Allopathic_medicines extends AppCompatActivity {

    ListView categories_listview;
    TextView categories_textview;
   // SearchView searchView;
    String categories_name[]={"Anti Diabetic", "Blood Pressure", "Anti Biotic","Anti Infective", "Anti Allergic","Respiratory","Cholesterol","Cardiac","Pain Killer" };
    int categories_img[]={R.drawable.antidiabetic, R.drawable.hypertension, R.drawable.antibiotics, R.drawable.anti_infectives, R.drawable.anti_allergic, R.drawable.respiratory, R.drawable.cholesterol, R.drawable.cardiac, R.drawable.pain_killer  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allopathic_medicines);

        categories_listview = (ListView) findViewById(R.id.categories_listview);
        categories_textview = (TextView) findViewById(R.id.categories_textview);
       // searchView = (SearchView) findViewById(R.id.search_view);


        MyAdapter adapter = new MyAdapter(this, categories_name, categories_img);
        categories_listview.setAdapter(adapter);

       /* searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ListView r1 = new ListView();
                for(int i=0;i<categories_name.length;i++)
                {
                    if()
                }

                adapter.getFilter().filter(newText);
                return true;
            }
        });
*/
        categories_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Allopathic_medicines.this, "Anti Diabetic", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, AntiDiabetic.class);
                    startActivity(i);
                }
                if (position == 1) {
                    Toast.makeText(Allopathic_medicines.this, "Hyper Tension", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, HyperTension.class);
                    startActivity(i);
                }
                if (position == 2) {
                    Toast.makeText(Allopathic_medicines.this, "Anti Biotic", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, AntiBiotic.class);
                    startActivity(i);
                }
                if (position == 3) {
                    Toast.makeText(Allopathic_medicines.this, "Anti Infective", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, AntiInfective.class);
                    startActivity(i);
                }
                if (position == 4) {
                    Toast.makeText(Allopathic_medicines.this, "Anti Allergic", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, AntiAllergic.class);
                    startActivity(i);
                }
                if (position == 5) {
                    Toast.makeText(Allopathic_medicines.this, "Respiratory", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, AntiAllergic.class);
                    startActivity(i);
                }
                if (position == 6) {
                    Toast.makeText(Allopathic_medicines.this, "Cholesterol", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, Cholestrol.class);
                    startActivity(i);
                }
                if (position == 7) {
                    Toast.makeText(Allopathic_medicines.this, "Cardiac", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, Cholestrol.class);
                    startActivity(i);
                }
                if (position == 8) {
                    Toast.makeText(Allopathic_medicines.this, "Pain Killer", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Allopathic_medicines.this, PainKiller.class);
                    startActivity(i);
                }
            }
        });

    }



    class MyAdapter extends ArrayAdapter<String> /*implements Filterable*/{
        Context context;
        String categories_name1[];
        int categories_img1[];
       // ValueFilter valueFilter;

        MyAdapter(Context c, String categories_name1[], int categories_img1[])
        {
            super(c, R.layout.medicine_categories,categories_name1);
            this.context=c;
            this.categories_name1=categories_name1;
            this.categories_img1=categories_img1;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View medicines_categories = layoutInflater.inflate(R.layout.medicine_categories, parent, false);

            ImageView categories_img = medicines_categories.findViewById(R.id.categories_image) ;
            TextView text = medicines_categories.findViewById(R.id.categories_name) ;


            categories_img.setImageResource(categories_img1[position]);
            text.setText(categories_name1[position]);




            return medicines_categories;
        }
/*
        @NonNull
        @Override
        public Filter getFilter() {
            if(valueFilter==null){
                valueFilter = new ValueFilter();

            }
            return valueFilter;




            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {
                    FilterResults filterResults = new FilterResults();

                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {

                    categories_name1 = (String[]) results.values;
                    notifyDataSetChanged();
                }
            };
            return super.getFilter();
        */
    }

        /*private class ValueFilter extends Filter{

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                if(constraint != null && constraint.length() >0)
                {
                    String s1 = new String();
                    for(int i=0;i<)
                }
                return null;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

            }
        }
    */}

