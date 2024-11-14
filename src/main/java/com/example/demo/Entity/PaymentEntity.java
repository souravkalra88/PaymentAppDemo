package com.example.demo.Entity;

public class PaymentEntity {
    private Long id;
    private double paymentAmount;
    private String paymentCurrency;
    private String userEmail;

    public Long getId() {
        return id;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
