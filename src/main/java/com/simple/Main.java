package com.simple;


import org.apache.xml.security.algorithms.SignatureAlgorithm;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class Main {

  @Schedule(second= "*/10", minute = "*", hour = "*", persistent = false)
  public void doSometh(){
    System.out.println("Try to do Someth");
    SignatureAlgorithm.providerInit();
  }

}
