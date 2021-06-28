package com.nxp.ead_compe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncUtils {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String long2Date(Long date) {

        Date d = new Date(date);
        return sdf.format(d);
    }
}
