package org.itstep.task01;

import javax.print.DocFlavor;

public class Employee {
    // Поля класса
    private String fullName;
    private String paymentType;
    private int payment;

    // Конструктор класса
    public Employee(String fullName, String paymentType, int payment) {
        this.fullName = fullName;
        this.paymentType = paymentType;
        this.payment = payment;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public int getPayment() {
        return payment;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }


    @Override
    public String toString() {
        return fullName + " | " + paymentType + " | " + payment;
    }
}
