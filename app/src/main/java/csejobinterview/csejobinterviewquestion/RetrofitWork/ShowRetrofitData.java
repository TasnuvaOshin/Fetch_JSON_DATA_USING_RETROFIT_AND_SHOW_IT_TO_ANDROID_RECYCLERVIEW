package csejobinterview.csejobinterviewquestion.RetrofitWork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import csejobinterview.csejobinterviewquestion.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowRetrofitData extends AppCompatActivity {
    RecyclerView recyclerView;
    public String url = "https://api.myjson.com/bins/";
    DataAdapter dataAdapter;

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_retrofit_data);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CallRetrofit callRetrofit = retrofit.create(CallRetrofit.class);
        Call<List<DataSetClass>> list = callRetrofit.getDataSet();
        list.enqueue(new Callback<List<DataSetClass>>() {
            @Override
            public void onResponse(Call<List<DataSetClass>> call, Response<List<DataSetClass>> response) {
                generateDataList(response.body());
                //we are calling this method for our recyclerview system
            }

            @Override
            public void onFailure(Call<List<DataSetClass>> call, Throwable t) {

            }
        });

    }

    private void generateDataList(List<DataSetClass> body) {
        dataAdapter = new DataAdapter(body, getApplicationContext());
        recyclerView.setAdapter(dataAdapter);

    }
}
