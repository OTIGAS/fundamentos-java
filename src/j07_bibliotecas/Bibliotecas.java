package j07_bibliotecas;

import com.google.gson.Gson;

public class Bibliotecas {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(json); // [1,2,3,4,5]
    }
}
