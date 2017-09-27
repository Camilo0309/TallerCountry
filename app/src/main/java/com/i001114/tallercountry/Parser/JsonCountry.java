package com.i001114.tallercountry.Parser;

import com.i001114.tallercountry.Models.Country;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAMILO on 26/09/2017.
 */

public class JsonCountry {

    public static List<Country> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item2 = jsonArray.getJSONObject(i);
            Country country = new Country();
            country.setName(item2.getString("name"));
            country.setCapital(item2.getString("capital"));
            country.setAlphacode(item2.getString("alpha3Code"));
            country.setRegion(item2.getString("region"));
            country.setTimezones(item2.getString("timezones"));
            countryList.add(country);
        }
        return countryList;
    }

}
