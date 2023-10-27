package org.ws.iranskill_prov_1400.data.api;

import org.ws.iranskill_prov_1400.util.UnSafeOkHttpClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private Retrofit retrofit;
    private static RetrofitClient instance;
    private Api api;

    public RetrofitClient() {
        retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(UnSafeOkHttpClient.getInstance().getUnSafeOkHttpClient())
                .build();

        api = retrofit.create(Api.class);
    }

    public Api getApi() {
        return api;
    }

    public static RetrofitClient getInstance() {
        if (instance == null)
            instance = new RetrofitClient();

        return instance;
    }
}
