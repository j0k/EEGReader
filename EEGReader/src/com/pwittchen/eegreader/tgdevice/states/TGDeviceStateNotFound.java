package com.pwittchen.eegreader.tgdevice.states;

import com.pwittchen.eegreader.R;
import com.pwittchen.eegreader.tgdevice.TGDeviceHandler;
import com.pwittchen.eegreader.utils.StringUtils;

import static com.pwittchen.eegreader.utils.LogUtils.LOGD;
import static com.pwittchen.eegreader.utils.LogUtils.makeLogTag;

public class TGDeviceStateNotFound implements Runnable {
    private static final String TAG = makeLogTag(TGDeviceStateNotFound.class);

    @Override
    public void run() {
        String message = StringUtils.getStringFromResources(R.string.device_not_found);
        LOGD(TAG, message);
        TGDeviceHandler.getActivityViewContract().setMessageFromDevice(message);
    }
}