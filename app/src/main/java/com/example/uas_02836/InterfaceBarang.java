package com.example.uas_02836;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface InterfaceBarang {
    //method
    @GET("qrcode/")
    Call<List<Barang>> getBarang();
    @FormUrlEncoded
    @POST("qrcode/")
    //parameter
    Call<Barang> postBarang(@Field("kode") String kode,
                            @Field("nama_barang") String nama,
                            @Field("harga") String harga,
                            @Field("jumlah") String jumlah,
                            @Field("satuan") String satuan);


    @DELETE("qrcode/")
    Call<Barang> deleteBarang(@Query("kode") String kode);
}