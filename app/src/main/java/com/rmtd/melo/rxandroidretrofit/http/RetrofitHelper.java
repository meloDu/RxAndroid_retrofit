package com.rmtd.melo.rxandroidretrofit.http;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by melo on 2017/1/24.
 */
public class RetrofitHelper {
    private static volatile RetrofitHelper instance;

    private RetrofitHelper() {

    }

    public static RetrofitHelper getInstance() {
        if (instance == null) {
            synchronized (RetrofitHelper.class) {
                if (instance == null) {
                    instance = new RetrofitHelper();
                }
            }
        }
        return instance;
    }

    public Retrofit createRetrofit() {
        return new Retrofit.Builder().baseUrl(UrlConfig.BASE_URL).
                addConverterFactory(GsonConverterFactory.create(createGson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
    }


    public Api getService() {
        Retrofit retrofit = createRetrofit();
        Api apiService = retrofit.create(Api.class);
        return apiService;
    }

    /**
     * @return
     */
    public Gson createGson() {
        return new GsonBuilder()
                .serializeNulls()
                .enableComplexMapKeySerialization()
//                .setDateFormat("")
                .create();
    }

}
