package com.example.bqva.webService;

import org.json.JSONObject;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface  NlpLabAPI {

    public static final String BASE_URL="http://nlplab.iust.ac.ir:9004/";
    @Headers({"Accept: application/json",

    })


    @Multipart
    @POST("/photo/upload-file/")
    Call<JSONObject> uploadImage(@Part MultipartBody.Part image);


}
