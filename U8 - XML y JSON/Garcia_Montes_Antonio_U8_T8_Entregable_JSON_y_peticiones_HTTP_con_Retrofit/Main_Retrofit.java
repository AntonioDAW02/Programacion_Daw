package U8_T8;

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

        CentralAlumno service = retrofit.create(CentralAlumno.class);

        System.out.println("Obtenemos el listado completo de alumnos");

        try {
            Response<List<Alumno>> response = service.listAlumno().execute();
            if (response.isSuccessful()){
                List<Alumno> alumnos = response.body();
                System.out.println(alumnos);
            }else {
                System.out.println("Petición no válida" + response.message());
            }
        }catch (IOException ex){
            System.out.println("Error en la petición" + ex.getMessage());
        }
    }
}
