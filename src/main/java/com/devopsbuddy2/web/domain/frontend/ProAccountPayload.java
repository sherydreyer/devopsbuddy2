package com.devopsbuddy2.web.domain.frontend;

/**
 * Created by Sheryl Dreyer on 2017/09/06.
 */

public class ProAccountPayload extends BasicAccountPayload {

    private String cardNumber;
    private String cardCode;
    private String cardMonth;
    private String cardYear;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardMonth() {
        return cardMonth;
    }

    public void setCardMonth(String cardMonth) {
        this.cardMonth = cardMonth;
    }

    public String getCardYear() {
        return cardYear;
    }

    public void setCardYear(String cardYear) {
        this.cardYear = cardYear;
    }
}