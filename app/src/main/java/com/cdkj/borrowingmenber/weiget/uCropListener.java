package com.cdkj.borrowingmenber.weiget;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.cdkj.baselibrary.utils.CameraHelper;
import com.yalantis.ucrop.UCrop;

import java.io.File;

/**裁剪
 * Created by cdkj on 2017/12/18.
 */

public class uCropListener implements CameraHelper.CamerahelperCropInterface {
    @Override
    public void startCrop(Object context, int requestCode, String path) {


//
//        UCrop.of(sourceUri, destinationUri)
//                .withAspectRatio(16, 9)
//                .withMaxResultSize(maxWidth, maxHeight)
//                .start(context);
    }

//    private void startCropActivity(@NonNull Uri uri) {
//
//
//        UCrop uCrop = UCrop.of(uri, Uri.fromFile(new File(getCacheDir(), destinationFileName)));
//
//        uCrop = basisConfig(uCrop);
//        uCrop = advancedConfig(uCrop);
//
//        uCrop.start(SampleActivity.this);
//    }
}
