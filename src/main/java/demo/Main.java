package demo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        URL catURL= new URL("http://cat-fact.herokuapp.com/facts/random");
        BufferedReader inputFromCatUrl = new BufferedReader(new InputStreamReader(catURL.openStream()));
        CatFact singleCatFact = new Gson().fromJson(inputFromCatUrl,CatFact.class);
        System.out.println(singleCatFact);
    }
}
