package com.midtrans.sdk.uiflow;

import android.content.Context;

import java.util.ArrayList;

import com.midtrans.sdk.coreflow.callback.TransactionFinishedCallback;
import com.midtrans.sdk.coreflow.core.BaseSdkBuilder;
import com.midtrans.sdk.coreflow.core.IScanner;
import com.midtrans.sdk.coreflow.models.PaymentMethodsModel;

/**
 * Created by ziahaqi on 15/06/2016.
 */
public class SdkUIFlowBuilder extends BaseSdkBuilder<SdkUIFlowBuilder> {

    /**
     * It  will initialize an data required to sdk.
     *
     * @param context application context
     * @param clientKey
     * @param merchantServerUrl
     */


    private SdkUIFlowBuilder(Context context, String clientKey, String merchantServerUrl, TransactionFinishedCallback callback) {
        this.context = context;
        this.clientKey = clientKey;
        this.merchantServerUrl = merchantServerUrl;
        this.transactionFinishedCallback = callback;
        this.sdkFlow = new UIFlow();
    }

    public static SdkUIFlowBuilder init(Context context, String clientKey, String merchantServerUrl, TransactionFinishedCallback callback){
        return new SdkUIFlowBuilder(context, clientKey, merchantServerUrl, callback);

    }

    public SdkUIFlowBuilder setExternalScanner(IScanner externalScanner){
        this.externalScanner = externalScanner;
        return this;
    }

    @Override
    public SdkUIFlowBuilder setBoldText(String boldText) {
        this.boldText = boldText;
        return this;
    }

    @Override
    public SdkUIFlowBuilder setSemiBoldText(String semiBoldText) {
        this.semiBoldText = semiBoldText;
        return this;
    }

    @Override
    public SdkUIFlowBuilder setDefaultText(String defaultText) {
        this.defaultText = defaultText;
        return this;
    }

    @Override
    public SdkUIFlowBuilder enableLog(boolean enableLog) {
       this.enableLog = enableLog;
        return this;
    }

    public SdkUIFlowBuilder setSelectedPaymentMethods(ArrayList<PaymentMethodsModel> selectedPaymentMethods) {
        this.selectedPaymentMethods = selectedPaymentMethods;
        return this;
    }

}