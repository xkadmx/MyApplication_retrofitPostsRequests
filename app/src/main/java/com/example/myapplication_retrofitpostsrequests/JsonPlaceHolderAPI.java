package com.example.myapplication_retrofitpostsrequests;

import org.w3c.dom.Comment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {
    @GET("posts")

    Call<List<Post>> getPosts(); // in interfaces we do not provide method body, we only declare method

    @GET("posts/2/comments")

    Call<List<Comment>> getComments(); // this time we declare method for providing comments to MainActivity using interface
}
