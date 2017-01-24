package com.rmtd.melo.rxandroidretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rmtd.melo.rxandroidretrofit.http.RetrofitHelper;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;
    Button mButton;
    TextView echo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv_content);
        mButton = (Button) findViewById(R.id.btn_down);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downLoad();
            }
        });
    }


    //obserabale
    private void downLoad() {
        RetrofitHelper.getInstance().getService().getExampleMessage()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ExamlpeBean>() {
                    @Override
                    public void onCompleted() {
                        Log.i("tag", "onCompleted下载成功~");
                    }

                    @Override
                    public void onError(Throwable e) {
                        mTextView.setText("onError");
                    }

                    @Override
                    public void onNext(ExamlpeBean examlpeBean) {
                        if (examlpeBean != null) {
                            mTextView.setText(examlpeBean.getData().toString());
                            Log.i("tag", "onNext下载成功~");
                        } else {
                            mTextView.setText("onError");
                        }
                    }
                });
    }


//retrofit下载
//    private void downLoad() {
//        RetrofitHelper.getInstance().getService().getExampleMessage().enqueue(new Callback<ExamlpeBean>() {
//            @Override
//            public void onResponse(Call<ExamlpeBean> call, Response<ExamlpeBean> response) {
//                if (response.isSuccessful()) {
//                    ExamlpeBean examlpeBean = response.body();
//                    if (examlpeBean != null) {
//                        mTextView.setText(examlpeBean.getData().toString());
//                    } else {
//                        mTextView.setText("onError");
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ExamlpeBean> call, Throwable t) {
//                mTextView.setText("onError");
//            }
//        });
//    }
}
