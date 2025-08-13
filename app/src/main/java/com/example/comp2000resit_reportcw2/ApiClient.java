package com.example.comp2000resit_reportcw2;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.224.41.18/comp2000/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


   //package com.example.comp2000resit_reportcw2.; // lol this doesnt work, i just think i have written to code badly, or formatted wrong, i get an illegal start type error, so i will ignore it... for now

 //  public class UserData {
  //     int id;
  //     public String firstname;
  //     String lastname;
  //     String email;
  //      String joiningdate;
  //      int leaves;
    }