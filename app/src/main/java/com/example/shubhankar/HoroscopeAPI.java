package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class HoroscopeAPI extends AppCompatActivity {


    public static String apiUrl = "";
    TextView txtResponse;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horoscope_api);
        txtResponse = findViewById(R.id.txtResponse);
        callApi();
    }

    private void callApi() {
        if (Helper.isNetworkAvailable(com.example.shubhankar.HoroscopeAPI.this)) {
            Helper.showProgressDialog(com.example.shubhankar.HoroscopeAPI.this, "Please Wait");
            RequestQueue queue = Volley.newRequestQueue(com.example.shubhankar.HoroscopeAPI.this);
            apiUrl = "https://json.astrologyapi.com/v1/birth_details";
            Log.e("Main Activity: ", "Url: " + apiUrl);
            StringRequest stringRequest = new StringRequest(Request.Method.POST, apiUrl,
                    new com.android.volley.Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Helper.dismissProgressDialog();
                            Log.e("Main Activity: ", "Response; " + response);
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                txtResponse.setText("Year: " + jsonObject.getString("year")
                                        + "\nmonth: " + jsonObject.getString("month")
                                        + "\nday: " + jsonObject.getString("day")
                                        + "\nhour: " + jsonObject.getString("hour")
                                        + "\nminute: " + jsonObject.getString("minute")
                                        + "\nseconds: " + jsonObject.getString("seconds")
                                        + "\ntimezone: " + jsonObject.getString("timezone"));
                            } catch (JSONException e) {
                                e.printStackTrace();
                                if (e.getMessage() == null) {
                                    showToastMessage("Something Went Wrong");
                                } else {
                                    showToastMessage(e.getMessage());
                                }
                            }
                        }
                    },
                    new com.android.volley.Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Helper.dismissProgressDialog();
                            if (error.getMessage() == null) {
                                showToastMessage("Something went wrong");
                            } else {
                                showToastMessage(error.getMessage());
                            }
                        }
                    }) {


                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("day", "15");
                    params.put("month", "10");
                    params.put("year", "1964");
                    params.put("hour", "12");
                    params.put("min", "50");
                    params.put("lat", "18.63");
                    params.put("lon", "77.43");
                    params.put("tzone", "5.5");
                    Log.e("Main Activity: ", "Param: " + params);
                    return params;
                }

                @Override
                public Map<String, String> getHeaders() {
                    Map<String, String> headers = new HashMap<>();
                    String credentials = "626450:eb832bd6c3c58285ee7eea3818d35b39";
                    String auth = "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
                    headers.put("Authorization", auth);
                    return headers;
                }
            };
            stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                    100000,
                    DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            queue.add(stringRequest);
        } else {
            showToastMessage(getString(R.string.no_internet_connection)); }
        }

        public void showToastMessage (String message){
            if (message != null) {
                Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
            }
        }
    }