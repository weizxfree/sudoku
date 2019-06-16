package cz.romario.opensudoku;

import android.app.Application;

import com.mintegral.msdk.MIntegralSDK;
import com.mintegral.msdk.out.MIntegralSDKFactory;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/16.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MIntegralSDK sdk = MIntegralSDKFactory.getMIntegralSDK();
        Map<String, String> map = sdk.getMTGConfigurationMap("115661", "bbe0f36efee488a68199ee6c5acab8e7");
        sdk.init(map, this);
    }
}
