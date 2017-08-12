package com.hjhrq1991.library;

public class DefaultHandler implements BridgeHandler {

    String TAG = "DefaultHandler";

    @Override
    public void handler(String data, CallBackFunction function) {
        if (function != null) {
            function.onCallBack("DefaultHandler response data");
        }
    }

}
