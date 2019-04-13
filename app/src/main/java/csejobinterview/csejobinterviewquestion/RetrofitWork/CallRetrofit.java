package csejobinterview.csejobinterviewquestion.RetrofitWork;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CallRetrofit {

    @GET("zqq1o")
    Call<List<DataSetClass>> getDataSet();
    //define the data set what we will get from the call

}
