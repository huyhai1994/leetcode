package fileio.better_reading;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class ReadJsonFileBetterVersion {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Cookie>>() {
        }.getType();
        List<Cookie> cookies = gson.fromJson(new FileReader("cookies_prod.json"), listType);

    }
}