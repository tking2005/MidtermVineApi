package nyc.c4q.tarynking.learningjars;

import nyc.c4q.tarynking.learningjars.models.PojoChuckJoke;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tarynking on 10/24/16.
 */

public interface HelloService {

    @GET(" ")
    //Call sends a request to a webserver and returns a response.
    //Call may be executed synchronously with execute() or asynchronously with enqueue(retrofit2.Callback<T>)
//    Call<ResponseBody> getHelloWorld();//this gets entire from the server
    Call<PojoChuckJoke> getHelloWorld();

}

//@GET("users/{substitutePath}/repos")
//Call<List<Repo>> listReos(@Path("user")String substitutePath);..will substitute Path in @GET
