package com.uas0842.github.api

import com.uas0842.github.data.model.DetailUserResponse
import com.uas0842.github.data.model.User
import com.uas0842.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token a06c958245cc526cc1ee133a28a9c4b9a32abefd")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token a06c958245cc526cc1ee133a28a9c4b9a32abefd")
    fun  getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token a06c958245cc526cc1ee133a28a9c4b9a32abefd")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token a06c958245cc526cc1ee133a28a9c4b9a32abefd")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}