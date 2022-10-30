// API key
// a0kg4O21hyNNlcjjkiSs7rNjYPhGxnTP

import java.io.*;
import okhttp3.*;
import kotlin.jvm.internal.markers.*;
import okio.*;

public class Curr_Conv {

    String sourceCurrency ;
    String destinationCurrency ;
    double sourceAmount ;
    double convertedAmount ;

    // private double ExchangeRate() {
    //     return 0 ;
    // }
    
    // public double Conversion() {
    //     return 0 ;
    // }

    public static void main(String []args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        //System.out.println("print2");
        Request request = new Request.Builder()
          .url("https://api.apilayer.com/exchangerates_data/convert?to=GBP&from=USD&amount=10000")
          .addHeader("apikey", "a0kg4O21hyNNlcjjkiSs7rNjYPhGxnTP")
          //.method("GET",)
          .build();
        //System.out.println("print1");
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
    
}
