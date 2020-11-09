/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.google;

import com.google.api.gax.paging.Page;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: GoogleCloundStorageClientService.java, v 0.1 2020-11-07 21:58 wb-phoonwaic553932 Exp $$
 */
@Service
@Deprecated
public class GoogleCloundStorageClientService {

    private static final String PROJECT_ID = "24-workspace";

    private static final String BUCKET_NAME = "24-workspace";

    private static final String DOMAIN_URL = "https://storage.googleapis.com/";

    private static final String SLASH = "/";

    public void getImagePath(String path) throws IOException {

        List<String> url = new ArrayList<>();

        Credentials credentials = GoogleCredentials.fromStream(new FileInputStream("C:\\Users\\000102\\Desktop\\24\\src\\main\\resources\\24-workspace-3e4dca188877.json"));
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials).setProjectId(PROJECT_ID).build().getService();

        Bucket bucket = storage.get(BUCKET_NAME);

        Page<Blob> blobs = bucket.list(Storage.BlobListOption.prefix("merchant/1038/item/"));
        for (Blob blob : blobs.getValues()) {
            if (blob.getName().endsWith(".png")) {
                String val = buildUrl(blob.getName());
                System.out.println(val);
                url.add(val);
            }
        }
    }

    private String buildUrl(String name) {
        return DOMAIN_URL + BUCKET_NAME + SLASH + name;
    }
}
