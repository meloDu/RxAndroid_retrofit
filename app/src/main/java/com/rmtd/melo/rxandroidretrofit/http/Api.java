package com.rmtd.melo.rxandroidretrofit.http;


import com.rmtd.melo.rxandroidretrofit.ExamlpeBean;

import retrofit.http.GET;
import rx.Observable;


/**
 * Created by melo on 2017/1/24.
 */
public interface Api {
//    @GET("http://api.ds.lingshi.cccwei.com/?cid=795033&uid=0&tms=20160627092309&" +
//            "sig=516f9fdc8fa85835&wssig=7e96fbf1da2714ee&os_type=3&version=23&" +
//            "channel_name=qihoo&srv=2401")
//    Call<ExamlpeBean> getExampleMessage();

    @GET("?cid=795033&uid=0&tms=20160627092309&" +
            "sig=516f9fdc8fa85835&wssig=7e96fbf1da2714ee&os_type=3&version=23&" +
            "channel_name=qihoo&srv=2401")
    Observable<ExamlpeBean> getExampleMessage();
}
