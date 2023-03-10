package com.example.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GameActivity extends AppCompatActivity {
    static String data = "";
    static String oldData="initial state";
    private String barcodesRaw = "3274080005003#7622210449283#3017620425035#3175680011480#3046920022651#3168930010265#3229820129488#8001505005592#3760020507350#3229820100234#3228857000166#7613034626844#3268840001008#3175681851849#7300400481588#5010477348678#3046920022606#5449000214911#3229820019307#7622210601988#5449000214799#3033710065967#3057640257773#3155250358788#8002270014901#3392460480827#7613035040823#3256540000698#3502110009449#7613035974685#3029330022428#7622210713780#8001505005707#3175680011534#3760049790214#5449000133328#3228857000852#3046920029759#3168930009078#3159470000120#80135463#3228857000906#3033710065066#3033490004521#7300400481595#5411188119098#3229820021027#7613035989535#3228857001231#5053990156009#3175680011442#3251490332080#3175680015228#5010477348357#8712100325953#3033491454080#3033490004743#3451790988677#3229820787015#8715700407760#7622210713926#3229820782560#7622210421968#3023470001015#5050083516313#7613035833272#3664346312936#3017620429484#3088543506255#3155251205296#7613036249928#4006985902304#80177173#5010029220773#3068320123264#3159470005071#3229820769165#4056489007180#59032823#3033710084913#3228886048436#7622210713889#3041090063206#3017620421006#3284230011884#3068320120256#7622210476296#7622201133337#3175681066632#3251490307002#3228857000883#5411188103387#3225350000501#8711200548002#3033710073467#7300400481571#3178530410105#3017760000062#7613035676497#3284230006408#8712100871986#3175681105423#3017760363990#3124480191182#7613036669146#8076800195057#3182180012190#7622300689124#4008713756661#3175681209282#5449000267412#3228857001194#7311070032611#3502110006790#87157215#3229820019192#3229820160672#3587220002252#3480341000674#8000500037560#3033491482953#3168930163480#5010477348395#7613035530799#3228857001316#3182180002115#5449000054227#3366321052386#5010477356239#3041090063114#3161711001971#17192008#3664346305990#3182180001477#3251490320001#5010477348630#3019081239640#8001505003529#7622210585691#3033710065783#3168930010906#8076809523547#4006985755863#3760049794298#3228850000262#3182180001996#8410076472953#3387390321357#3155251205500#7613035866386#3480341000636#20005733#3061990141354#3478820023184#5411188110835#87157239#8712100338694#3242274000059#3228886030011#3229820794525#7622210444141#20003166#3252210390014#3366321051983#7613036021388#3387390326574#5410126006957#3760049798609#3229820181950#5000168198491#8000500329481#3228857000838#3068320114453#3033490506629#5053827192699#8410376026962#3330720237361#3229820794532#8410076470812#4008400828121#5000112611861#5053990155354#3017760542890#7622210444127#3175681116832#8715700017006#3088542500285#3168930009795#3033491270864#4008400404127#8001505000061#3033491588136#3168930009030#3046920029780#3608580890898#5010477354051#3175681077324#5053827101066#3041090061615#3178530410143#4008400401621#7613035937420#8715700423913#3664346306003#3608580823445#7622201809638#8715700112596#6175700#5411188125808#7622210770714#3155251205302#3176571983008#3182180060320#3302745733029#3502110009357#3083681095296#20995553#3523230028431#7622210998095#3017620420702#3229820791081#3175681060586#3175681851863#3073781115345#3229820798110#3329770051072#11044204#7311070362664#3073781070309#3228021170039#7613035239562#7622210476104#7622210988034#20047238#3155251205524#5010029219241#3023290634578#5410041005707#7622300441937#3336971805021#3412290070101#3664346305860#3017760756198#3251491787810#3033491279713#3760091727732#3392460481114#3021769505602#3229820794624#5449000232250#3228857001378#3045320008401#3168930009184#3664346315371#8715035110106#7613287176561#3033491474187#3760049790252#3046920027885#5449000000439#3249760000654#5000159461122#7613034947611#5449000131836#4000177158319#3017760472890#3272770098090#3248830000150#3038359004544#8076809529419#3257971309114#3329757002998#3175681134935#5000112611878#8000430138719#3228857000180#3229820787008#3175681134904#7613038552927#3228021170022#7622210995087#80042556#3240931545042#8013108699504#3175681037854#3023291122005#3175680012937#3251490432650#3248340054063#8076809513722#3175681037885#3229820116716#3329770057234#8076802085738#7613035144699#3336971209133#3023470020016#3088545004001#5050083501661#3240931545059#7311070032604#10581724#3023470010017#3083681081534#3088542506508#3155250364772#4008400260921#3088540004440#7613036092487#3033491147067#3428273980046#3480341000704#3760049798029#7613034926814#8410076601131#3229820792132#7622210476241#3175681851856#5010477348517#5411188116592#3175681110106#3229820019604#3392460510050#5410041010800#3017760686792#3168930003632#5411188115472#20713713#3229820784939#3254691586054#8712566328208#3327272107259#3159470204948#3168930002987#3187670002347#3023290030608#3017760819121#5000112611762#8719200012608#3256540002890#5410041040807#7622300315733#5902884463139#3560070472888#3608580758686#7622210422026#3468570116601#8000500227848#8000500269169#9002515601018#20968663#3256540001008#54491472#3336971805038#3228857001101#3056440083193#3073781115673#3760049791006#5411188110842#7622210416629#5000157024671#3038352880305#3175681116863#3178530407396#7613032655495#3266980033613#3017760038409#3095757697105#3159470001424#3178530402728#3229820004334#5038862130929#5902884463153#8712100731822#3176582033563#3029330069898#3229820794648#3034470003107#3229820791074#3229820794549#3533631572006#3664320011510#5060042641000#3038354199603#3273220081068#3502110009401#4056489039518#7612100066317#7613035989443#3019081238643#3033710074525#3036810207923#3175681028111#3092718627850#3083680613576#3175681039599#3770008009653#5000159459228#3024720026895#3161711000622#3175681257542#3034450001123#3608580789758#7622210444097#8076800376999#3033491482892#3228021170046#7622210422163#3061990143365#3228857000913#7622210995063#3124480185112#3178050000749#3242272346050#7311070032598#3329770073265#3017760038331#3073781071955#3254550006013#20918279#3272770003148#3392460482012#7613037059281#3330720237378#3033491351082#3175681257566#3229820019208#7613038552729#3017760030106#7622210724519#3083680973939#5053990138722#3229820800325#3045320517101#3229820791067#3390390000153#3560070910366#8076809529433#7622210100917#8000500150245#3329770063624#3033710071005#3067140013120#5053827104081#8712100751370#20916435#5411188115366#7622300685782#3046920022705#5053827101424#3017760771894#3046920010047#3229820794556#3700278400881#8002470023727#8410188012092#3175681257535#5449000133335#3175681123014#3760049795479#7622210416681#8410076601148#3251491787803#3302740025136#3184670001080#3292070005161#5410126806069#3760020500658#3033491279720#3178530410136#3504182920011#40897677#8715700421353#20000653#20403027#4056489209980#3046920029681#3608580942764#8076809513388#3175681132467#3228857000876#4001724819905#3664346306027#3017760635295#3259011799893#3700214610480#5000159492737#5053827184717#7622210449313#3021760400012#3220035210008#3760049790818#8000500242612#3048282322646#3175681026766#7622210869616#8710482532303#20665241#3116430208934#80052760";
    String[] BarCodeList = barcodesRaw.split("#");
    private String[] Questions= {"Which is the most calorific ?","Which has the higher fat value ?","Which has the higher protein value ?","Which is the saltiest ?"};
    final LoadingDialog loadingDialog = new LoadingDialog(GameActivity.this);



    Product chosenProduct1;
    Product chosenProduct2;
    TextView question;
    ImageButton top;
    ImageButton bot;

    static int tick=1;

    static boolean answer=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);


        Handler handler = new Handler();

        loadingDialog.startLoading();

        int rand =(int)Math.floor(Math.random() * BarCodeList.length);

        Thread thread = new Thread(){
            public void run(){
                try {
                    newProduct(BarCodeList[(int) Math.floor(Math.random() * BarCodeList.length)]);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        while(true) {
            if(!data.equals(oldData) && !data.equals("")){
                break;
            }
        }

        rand = (int) Math.floor(Math.random() * Questions.length);
        //get 2nd prod
        try {
            newProduct(BarCodeList[rand]);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        question= (TextView) findViewById(R.id.question) ;
        question.setText(Questions[rand]);


        top=(ImageButton) findViewById(R.id.top_food);
        bot=(ImageButton) findViewById(R.id.bot_food);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingDialog.stopLoading();
                //Picasso.get().load(chosenProduct1.getImage_url()).fit().into((ImageView) findViewById(R.id.top_food));
                Glide.with(GameActivity.this) //view ou context
                        .load(chosenProduct1.getImage_url()).fitCenter()
                        .into(top); //id de la Target
                switch (question.getText().toString()) {
                    case "Which is the most calorific ?":
                        answer= chosenProduct1.nutriments.energyKcal > chosenProduct2.nutriments.energyKcal;
                    case "Which has the higher fat value ?":
                        answer= chosenProduct1.nutriments.fat > chosenProduct2.nutriments.fat;
                    case "Which has the higher protein value ?":
                        answer= chosenProduct1.nutriments.proteins > chosenProduct2.nutriments.proteins;
                    case "Which is the saltiest ?":
                        answer= chosenProduct1.nutriments.salt > chosenProduct2.nutriments.salt;
                }

                top.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(answer) {
                            top.setBackgroundColor(Color.argb(255,0,255,0));
                            question.setTextColor(Color.argb(255,0,255,0));
                        }
                        else {
                            top.setBackgroundColor(Color.argb(255,255,0,0));
                            question.setTextColor(Color.argb(255,255,0,0));
                            bot.setBackgroundColor(Color.argb(255,0,255,0));
                        }
                    }
                });

                bot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!answer) {
                            bot.setBackgroundColor(Color.argb(255,0,255,0));
                            question.setTextColor(Color.argb(255,0,255,0));
                        }
                        else {
                            bot.setBackgroundColor(Color.argb(255,255,0,0));
                            question.setTextColor(Color.argb(255,255,0,0));
                            top.setBackgroundColor(Color.argb(255,0,255,0));
                        }
                    }
                });
            }
        }, 6000);



    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }




    public void HTTPRequestGET_Asynchr(String URL) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .get()
                .url(URL)
                .build();

        client.newCall(request).enqueue(new Callback() {
            private final String TAG = null;

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                if (response.isSuccessful()) {
                    try {
                        final String result = response.body().string();
                        if (!TextUtils.isEmpty(result)) {
                            data = result;
                            JSONObject jsObj = new JSONObject(data);
                            jsObj = jsObj.getJSONObject("product");
                            if (tick%2==0) {
                                chosenProduct1=importJson(jsObj);
                                oldData=data;
                            }
                            else if(tick%2!=0) {
                                chosenProduct2=importJson(jsObj);
                                oldData=data;
                            }
                        }
                        tick++;
                    } catch (Exception e) {
                        Log.e(TAG, "Exception = " + e);
                    }


                }
            }

        });
    }

    public void newProduct(final String barcode) throws JSONException, IOException, InterruptedException {
        HTTPRequestGET_Asynchr("https://fr.openfoodfacts.org/api/v0/produit/" + barcode + ".json");

        runOnUiThread(new Runnable() {
            public void run() {
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            JSONObject jsObj = new JSONObject(data);
                            jsObj = jsObj.getJSONObject("product");
                            if (tick%2==0) {
                                //Picasso.get().load(chosenProduct1.getImage_url()).fit().into((ImageView) findViewById(R.id.top_food));
                                Glide.with(GameActivity.this) //view ou context
                                        .load(chosenProduct1.getImage_url()).fitCenter()
                                        .into((ImageButton) findViewById(R.id.top_food));
                            }
                            else if(tick%2!=0) {
                                //Picasso.get().load(chosenProduct2.getImage_url()).fit().into((ImageView) findViewById(R.id.bot_food));
                                Glide.with(GameActivity.this).load(chosenProduct2.getImage_url()).fitCenter().into((ImageButton) findViewById(R.id.bot_food));
                            }

                        }
                        catch (JSONException ignored) {

                        }
                    }
                }, 4000);
            }
        });
    }

    public ArrayList<String> importArrayList(JSONObject json_object, String cat_name) throws JSONException {
        JSONArray json_array = json_object.getJSONArray(cat_name);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < json_array.length(); i++) {
            list.add(json_array.get(i).toString());
        }
        return list;
    }

    public Product importJson(JSONObject json) throws JSONException {
        Product current_product = new Product(
                json.getString("product_name"));

        current_product.setCategories(json.getString("categories"));
        current_product.setTrace(json.getString("traces"));
        current_product.setBarcode(json.getString("code"));
        current_product.setBrands(json.getString("brands"));
        current_product.setLabels(json.getString("labels"));
        current_product.setIngredients_text(json.getString("ingredients_text"));
        current_product.setProduct_quantity(json.getString("quantity"));
        current_product.setAllergens(json.getString("allergens"));
        current_product.setPackaging(json.getString("packaging"));

        Product.Nutriments nutriments;
        Gson gson = new Gson();
        nutriments = gson.fromJson(json.getJSONObject("nutriments").toString(), Product.Nutriments.class);
        current_product.setNutriments(nutriments);
        current_product.setImage_url(json.getString("image_url"));

        Product.NutrientLevels nutrient_levels;
        Gson gson2 = new Gson();
        nutrient_levels = gson2.fromJson(json.getJSONObject("nutrient_levels").toString(), Product.NutrientLevels.class);
        current_product.setNutrient_levels(nutrient_levels);

        return current_product;
    }
}