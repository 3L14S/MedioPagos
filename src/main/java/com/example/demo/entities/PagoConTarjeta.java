package com.example.demo.entities;

import java.math.BigDecimal;


import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class PagoConTarjeta {
  





 
 
  private  Integer installments;

 



  private Payer payer;

 

 
  private  String payment_method_id;


 
  
  private  String token;

  
  private  BigDecimal transaction_amount;

public Integer getInstallments() {
	return installments;
}

public void setInstallments(Integer installments) {
	this.installments = installments;
}




public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}



public BigDecimal getTransaction_amount() {
	return transaction_amount;
}

public void setTransaction_amount(BigDecimal transaction_amount) {
	this.transaction_amount = transaction_amount;
}

public Payer getPayer() {
	return payer;
}

public void setPayer(Payer payer) {
	this.payer = payer;
}

public String getPayment_method_id() {
	return payment_method_id;
}

public void setPayment_method_id(String payment_method_id) {
	this.payment_method_id = payment_method_id;
}

@Override
public String toString() {
	return "PagoConTarjeta [installments=" + installments + ", payer=" + payer + ", payment_method_id="
			+ payment_method_id + ", token=" + token + ", transactionAmount=" + transaction_amount + "]";
}




 




  
  
}
