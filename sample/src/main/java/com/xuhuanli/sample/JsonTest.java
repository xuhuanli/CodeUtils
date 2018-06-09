package com.xuhuanli.sample;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonTest {

    /**
     {
     "personData": [{
     "age": 12,
     "name": "nate",
     "schoolInfo": [{
     "School_name": "清华"
     },
     {
     "School_name": "北大"
     }
     ],
     "url": "http://pic.yesky.com/uploadImages/2014/345/36/E8C039MU0180.jpg"
     },
     {
     "age": 24,
     "name": "jack"
     }
     ],
     "result": 1
     }
     */
    public static final String MY_JSON = "{\"personData\":[{\"age\":12,\"name\":\"nate\",\"schoolInfo\":[{\"School_name\":\"清华\"},{\"School_name\":\"北大\"}],\"url\":\"http://pic.yesky.com/uploadImages/2014/345/36/E8C039MU0180.jpg\"},{\"age\":24,\"name\":\"jack\"}],\"result\":1}";
    public void resolveJson(){
        try {
            JSONObject jsonObject = new JSONObject(MY_JSON);
            int result = jsonObject.getInt("result");
            if (result == 1) {
                JSONArray personData = jsonObject.getJSONArray("personData");
                String dataJson = personData.toString();
                Log.d("TAG",dataJson);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
