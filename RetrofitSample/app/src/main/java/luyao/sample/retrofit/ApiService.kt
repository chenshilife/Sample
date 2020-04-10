package luyao.sample.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by luyao
 * on 2020/4/10 15:56
 */
interface ApiService {

    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<Repo>>
}
