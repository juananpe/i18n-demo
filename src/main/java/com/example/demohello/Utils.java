package com.example.demohello;

import java.util.Locale;
import java.util.ResourceBundle;

public class Utils {

    public static ResourceBundle t() {
        return ResourceBundle.getBundle("strings", new Locale("eus_ES"));
        // use this in production : ResourceBundle.getBundle("strings", Locale.getDefault());
    }

    public static String t(String key) {
        return t().getString(key);
    }


}
