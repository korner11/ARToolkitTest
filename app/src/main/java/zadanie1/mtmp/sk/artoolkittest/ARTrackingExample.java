package zadanie1.mtmp.sk.artoolkittest;

import android.app.Application;

import org.artoolkit.ar6.base.assets.AssetHelper;

/**
 * Created by z003r0bf on 2. 10. 2017.
 */

public class ARTrackingExample extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AssetHelper assetHelper = new AssetHelper(getAssets());
        assetHelper.cacheAssetFolder(this,"Data");
    }
}
