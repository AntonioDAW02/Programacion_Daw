package U8_T8;

import U8_T7.Futbolista;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CentralAlumno {

    //https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/json_entrega1/alumnos?_embed=asignaturas
    @GET("json_entrega1/alumnos?_embed=asignaturas")
    Call<List<Alumno>> listAlumno();
}
