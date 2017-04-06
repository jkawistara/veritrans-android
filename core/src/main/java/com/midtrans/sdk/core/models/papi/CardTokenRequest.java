package com.midtrans.sdk.core.models.papi;

import com.midtrans.sdk.core.models.BankType;
import com.midtrans.sdk.core.models.Channel;

/**
 * Created by rakawm on 10/19/16.
 */

public class CardTokenRequest {
    public static final String TYPE_AUTHORIZE = "authorize";

    private String cardNumber;
    private String cardCvv;
    private String cardExpiryMonth;
    private String cardExpiryYear;
    private boolean secure;
    private boolean twoClick;
    private String savedTokenId;
    private int grossAmount;
    private boolean installment;
    private int installmentTerm;
    private String type;
    private String bank;
    private String channel;
    private boolean point;

    public CardTokenRequest() {

    }

    /**
     * Create card token request object for normal transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @return card request object.
     */
    public static CardTokenRequest newNormalCard(String cardNumber,
                                                 String cardCVV,
                                                 String cardExpiryMonth,
                                                 String cardExpiryYear) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for authorize transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param type            transaction type.
     * @return card request object.
     */
    public static CardTokenRequest newAuthorizeCard(String cardNumber,
                                                    String cardCVV,
                                                    String cardExpiryMonth,
                                                    String cardExpiryYear,
                                                    String type) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.type = type;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for normal transaction using acquiring bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankNormalCard(String cardNumber,
                                                              String cardCVV,
                                                              String cardExpiryMonth,
                                                              String cardExpiryYear,
                                                              String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for authorize transaction with bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param type            transaction type.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankAuthorizeCard(String cardNumber,
                                                                 String cardCVV,
                                                                 String cardExpiryMonth,
                                                                 String cardExpiryYear,
                                                                 String type,
                                                                 String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.type = type;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for normal transaction with installment.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param installment     is installment transaction
     * @param installmentTerm installment term.
     * @return card request object.
     */
    public static CardTokenRequest newNormalInstallmentCard(String cardNumber,
                                                            String cardCVV,
                                                            String cardExpiryMonth,
                                                            String cardExpiryYear,
                                                            boolean installment,
                                                            int installmentTerm) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for authorize transaction with installment.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param installment     is installment transaction
     * @param installmentTerm installment term.
     * @param type            transaction type.
     * @return card request object.
     */
    public static CardTokenRequest newAuthorizeInstallmentCard(String cardNumber,
                                                               String cardCVV,
                                                               String cardExpiryMonth,
                                                               String cardExpiryYear,
                                                               boolean installment,
                                                               int installmentTerm,
                                                               String type) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.type = type;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for normal transaction with installment using acquiring
     * bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param installment     is installment transaction
     * @param installmentTerm installment term.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankInstallmentCard(String cardNumber,
                                                                   String cardCVV,
                                                                   String cardExpiryMonth,
                                                                   String cardExpiryYear,
                                                                   boolean installment,
                                                                   int installmentTerm,
                                                                   String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for authorize transaction with installment using acquiring
     * bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param installment     is installment transaction
     * @param installmentTerm installment term.
     * @param type            transaction type.
     * @param bank            bank type.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankAuthorizeInstallmentCard(String cardNumber,
                                                                            String cardCVV,
                                                                            String cardExpiryMonth,
                                                                            String cardExpiryYear,
                                                                            boolean installment,
                                                                            int installmentTerm,
                                                                            String type,
                                                                            String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.type = type;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled normal transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @return card request object.
     */
    public static CardTokenRequest newNormalSecureCard(String cardNumber,
                                                       String cardCVV,
                                                       String cardExpiryMonth,
                                                       String cardExpiryYear,
                                                       boolean secure,
                                                       int grossAmount) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled authorize transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param type            transaction type.
     * @return card request object.
     */
    public static CardTokenRequest newAuthorizeSecureCard(String cardNumber,
                                                          String cardCVV,
                                                          String cardExpiryMonth,
                                                          String cardExpiryYear,
                                                          boolean secure,
                                                          int grossAmount,
                                                          String type) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.type = type;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled normal transaction with acquiring
     * bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankNormalSecureCard(String cardNumber,
                                                                    String cardCVV,
                                                                    String cardExpiryMonth,
                                                                    String cardExpiryYear,
                                                                    boolean secure,
                                                                    int grossAmount,
                                                                    String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled authorize transaction with acquiring
     * bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param type            transaction type.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankAuthorizeSecureCard(String cardNumber,
                                                                       String cardCVV,
                                                                       String cardExpiryMonth,
                                                                       String cardExpiryYear,
                                                                       boolean secure,
                                                                       int grossAmount,
                                                                       String type,
                                                                       String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.type = type;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled normal installment transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @return card request object.
     */
    public static CardTokenRequest newNormalInstallmentSecureCard(String cardNumber,
                                                                  String cardCVV,
                                                                  String cardExpiryMonth,
                                                                  String cardExpiryYear,
                                                                  boolean secure,
                                                                  int grossAmount,
                                                                  boolean installment,
                                                                  int installmentTerm) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled authorize installment transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @param type            transaction type.
     * @return card request object.
     */
    public static CardTokenRequest newAuthorizeInstallmentSecureCard(String cardNumber,
                                                                     String cardCVV,
                                                                     String cardExpiryMonth,
                                                                     String cardExpiryYear,
                                                                     boolean secure,
                                                                     int grossAmount,
                                                                     boolean installment,
                                                                     int installmentTerm,
                                                                     String type) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.type = type;
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled normal installment transaction with
     * acquiring bank.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankNormalInstallmentSecureCard(String cardNumber,
                                                                               String cardCVV,
                                                                               String cardExpiryMonth,
                                                                               String cardExpiryYear,
                                                                               boolean secure,
                                                                               int grossAmount,
                                                                               boolean installment,
                                                                               int installmentTerm,
                                                                               String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create card token request object for 3D secure enabled authorize installment transaction.
     *
     * @param cardNumber      card number.
     * @param cardCVV         card cvv number.
     * @param cardExpiryMonth card expiry month.
     * @param cardExpiryYear  card expiry year.
     * @param secure          true if 3D secure was enabled.
     * @param grossAmount     transaction amount.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @param type            transaction type.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankAuthorizeInstallmentSecureCard(String cardNumber,
                                                                                  String cardCVV,
                                                                                  String cardExpiryMonth,
                                                                                  String cardExpiryYear,
                                                                                  boolean secure,
                                                                                  int grossAmount,
                                                                                  boolean installment,
                                                                                  int installmentTerm,
                                                                                  String type,
                                                                                  String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.cardNumber = cardNumber;
        cardTokenRequest.cardCvv = cardCVV;
        cardTokenRequest.cardExpiryMonth = cardExpiryMonth;
        cardTokenRequest.cardExpiryYear = cardExpiryYear;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.type = type;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for normal two clicks transaction.
     *
     * @param savedTokenId saved token id from previous transaction.
     * @param cardCvv      card cvv.
     * @param twoClick     true if two clicks was enabled.
     * @param secure  true if secure was enabled.
     * @param grossAmount  transaction amount.
     * @return card request object.
     */
    public static CardTokenRequest newNormalTwoClicksCard(String savedTokenId,
                                                          String cardCvv,
                                                          boolean twoClick,
                                                          boolean secure,
                                                          int grossAmount) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.secure = secure;
        cardTokenRequest.grossAmount = grossAmount;
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for authorize two clicks transaction.
     *
     * @param savedTokenId saved token id from previous transaction.
     * @param cardCvv      card cvv.
     * @param twoClick     true if two clicks was enabled.
     * @param grossAmount  transaction amount.
     * @param secure true if 3D secure was enabled.
     * @param type         transaction type.
     * @return card request object.
     */
    public static CardTokenRequest newAuthorizeTwoClicksCard(String savedTokenId,
                                                             String cardCvv,
                                                             boolean twoClick,
                                                             int grossAmount,
                                                             boolean secure,
                                                             String type) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.type = type;
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for normal two clicks transaction with acquiring bank.
     *
     * @param savedTokenId saved token id from previous transaction.
     * @param cardCvv      card cvv.
     * @param twoClick     true if two clicks was enabled.
     * @param grossAmount  transaction amount.
     * @param secure  true if 3D secure was enabled.
     * @param bank         acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankNormalTwoClicksCard(String savedTokenId,
                                                                       String cardCvv,
                                                                       boolean twoClick,
                                                                       int grossAmount,
                                                                       boolean secure,
                                                                       String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for authorize two clicks transaction with acquiring
     * bank.
     *
     * @param savedTokenId saved token id from previous transaction.
     * @param cardCvv      card cvv.
     * @param twoClick     true if two clicks was enabled.
     * @param grossAmount  transaction amount.
     * @param secure true if 3D secure was enabled.
     * @param type         transaction type.
     * @param bank         acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankAuthorizeTwoClicksCard(String savedTokenId,
                                                                          String cardCvv,
                                                                          boolean twoClick,
                                                                          int grossAmount,
                                                                          boolean secure,
                                                                          String type,
                                                                          String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.type = type;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for normal two clicks installment transaction.
     *
     * @param savedTokenId    saved token id from previous transaction.
     * @param cardCvv         card cvv.
     * @param twoClick        true if two clicks was enabled.
     * @param grossAmount     transaction amount.
     * @param secure true if 3D secure was enabled.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @return card request object.
     */
    public static CardTokenRequest newNormalInstallmentTwoClicksCard(String savedTokenId,
                                                                     String cardCvv,
                                                                     boolean twoClick,
                                                                     int grossAmount,
                                                                     boolean secure,
                                                                     boolean installment,
                                                                     int installmentTerm) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for authorize two clicks installment transaction.
     *
     * @param savedTokenId    saved token id from previous transaction.
     * @param cardCvv         card cvv.
     * @param twoClick        true if two clicks was enabled.
     * @param grossAmount     transaction amount.
     * @param secure true if 3D secure is enabled
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @param type            transaction type.
     * @return card request object.
     */
    public static CardTokenRequest newAuthorizeInstallmentTwoClicksCard(String savedTokenId,
                                                                        String cardCvv,
                                                                        boolean twoClick,
                                                                        int grossAmount,
                                                                        boolean secure,
                                                                        boolean installment,
                                                                        int installmentTerm,
                                                                        String type) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.type = type;
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for normal two clicks installment transaction with
     * acquiring bank.
     *
     * @param savedTokenId    saved token id from previous transaction.
     * @param cardCvv         card cvv.
     * @param twoClick        true if two clicks was enabled.
     * @param grossAmount     transaction amount.
     * @param secure true if 3D secure was enabled.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankNormalInstallmentTwoClicksCard(String savedTokenId,
                                                                                  String cardCvv,
                                                                                  boolean twoClick,
                                                                                  int grossAmount,
                                                                                  boolean secure,
                                                                                  boolean installment,
                                                                                  int installmentTerm,
                                                                                  String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);
        return cardTokenRequest;
    }

    /**
     * Create new card request token object for authorize two clicks installment transaction with
     * acquiring bank.
     *
     * @param savedTokenId    saved token id from previous transaction.
     * @param cardCvv         card cvv.
     * @param twoClick        true if two clicks was enabled.
     * @param grossAmount     transaction amount.
     * @param secure true if 3D secure was enabled.
     * @param installment     true if installment was enabled.
     * @param installmentTerm installment term.
     * @param type            transaction type.
     * @param bank            acquiring bank.
     * @return card request object.
     */
    public static CardTokenRequest newAcquiringBankAuthorizeInstallmentTwoClicksCard(String savedTokenId,
                                                                                     String cardCvv,
                                                                                     boolean twoClick,
                                                                                     int grossAmount,
                                                                                     boolean secure,
                                                                                     boolean installment,
                                                                                     int installmentTerm,
                                                                                     String type,
                                                                                     String bank) {
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        cardTokenRequest.savedTokenId = savedTokenId;
        cardTokenRequest.cardCvv = cardCvv;
        cardTokenRequest.twoClick = twoClick;
        cardTokenRequest.grossAmount = grossAmount;
        cardTokenRequest.secure = secure;
        cardTokenRequest.installment = installment;
        cardTokenRequest.installmentTerm = installmentTerm;
        cardTokenRequest.type = type;
        cardTokenRequest.bank = bank;
        setChannel(cardTokenRequest);

        return cardTokenRequest;
    }

    private static void setChannel(CardTokenRequest cardTokenRequest) {
        if (cardTokenRequest.bank.equalsIgnoreCase(BankType.BCA)
                || cardTokenRequest.bank.equalsIgnoreCase(BankType.MAYBANK)
                || cardTokenRequest.bank.equalsIgnoreCase(BankType.BRI)) {
            cardTokenRequest.setChannel(Channel.MIGS);
        } else {
            cardTokenRequest.setChannel(Channel.DRAGON);
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public boolean isTwoClick() {
        return twoClick;
    }

    public String getSavedTokenId() {
        return savedTokenId;
    }

    public int getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(int grossAmount) {
        this.grossAmount = grossAmount;
    }

    public boolean isInstallment() {
        return installment;
    }

    public void setInstallment(boolean installment) {
        this.installment = installment;
    }

    public int getInstallmentTerm() {
        return installmentTerm;
    }

    public void setInstallmentTerm(int installmentTerm) {
        this.installmentTerm = installmentTerm;
    }

    public String getType() {
        return type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setCardType(String cardType) {
        this.type = cardType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean isPoint() {
        return point;
    }

    public void setPoint(boolean point) {
        this.point = point;
    }
}
