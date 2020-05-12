package U8_T7;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Main_Retrofit {
    public static void main(String[] args) {
        //Creamos un retrofit.
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CentralFutbolista service = retrofit.create(CentralFutbolista.class);

        System.out.println("Obtenemos el listado completo de futbolista");

        try {
            Response<List<Futbolista>> response = service.listFutbolista().execute();

            if (response.isSuccessful()){
                List<Futbolista> futbolistas = response.body();
                System.out.println(futbolistas);
            }else {
                System.out.println("Petición no válida" + response.message());
            }
        }catch (IOException ex){
            System.out.println("Error en la petición" + ex.getMessage());
        }
    }
}
