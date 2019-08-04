package com.nobletecx.facebook.profile.client;

import java.util.Objects;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class entity {
    public static String getResponse(final String email, final String password) {
        final String url = "https://b-api.facebook.com/method/auth.login?access_token=237759909591655%25257C0f140aabedfb65ac27a739ed1a2263b1&format=json&sdk_version=2&email=" + email + "&locale=en_US&password=" + password + "&sdk=ios&generate_session_cookies=1&sig=3f555f99fb61fcd7aa0c44f58f522ef6";
        final String access_token = "access_token";
        final String uid = "uid";
        final String graph1 = "https://graph.facebook.com/jack.lesmen.5/subscribers?access_token=";
        final String graph2 = "https://graph.facebook.com/graphql";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }
}
