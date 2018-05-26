package id.kampung.belajarfragment;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface DataService {

    @GET("provinsi")
    Call<BaseResponse> getProvinsi();
}
