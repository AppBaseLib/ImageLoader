package com.abt.loader;

import android.os.Environment;

public class LoaderConstant {

    public static final String IMAGE_LOADER_CACHE = Environment
            .getExternalStorageDirectory().getPath() + "/image_loader/";

    public static final String CACHE_FILE_PATH = IMAGE_LOADER_CACHE + "cache";
    public static final int MSG_FROM_CLIENT = 0;
    public static final int MSG_FROM_SERVICE = 1;

}
