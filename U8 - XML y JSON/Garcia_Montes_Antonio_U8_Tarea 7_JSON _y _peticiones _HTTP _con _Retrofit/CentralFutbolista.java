package U8_T7;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CentralFutbolista {

    //https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/
    @GET("futbolistas_api_demo/jugadores")
    Call<List<Futbolista>> listFutbolista();
}
