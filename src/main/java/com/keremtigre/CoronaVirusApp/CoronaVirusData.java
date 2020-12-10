/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keremtigre.CoronaVirusApp;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.StringWriter;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;



/**
 *
 * @author kerem
 */
public class CoronaVirusData {
    HttpClient httpClient;
    public CoronaVirusData() {
    httpClient=HttpClientBuilder.create().build();
    
    }
    
    
    
   
    public JsonObject getCoronaVirusData()throws Exception{
        //Getireceğimiz Veri için belirttiğimiz linkle websitesinden istek oluşturuyoruz.
         HttpGet httpGet=new HttpGet("https://api.covid19api.com/summary");
         httpGet.addHeader("accept", "application/json");
         HttpResponse response=httpClient.execute(httpGet);
         //Okuduğumuz Veriyi String bir deişkene atıyoruz
         String coronaVirusData=readCoronaVirusData(response);
         //Veriyi json Element Olarak Parse Ediyoruz
         JsonElement jelement = new JsonParser().parse(coronaVirusData);
         //Veriyi JsonObject Olarak döndürüyoruz.
         return jelement.getAsJsonObject();
    }
    //İnternetten Çektiğimiz Veriyi Okuma İşlemi
    public String readCoronaVirusData(HttpResponse httpResponse) throws Exception{
       InputStream inputStream=httpResponse.getEntity().getContent();
       StringWriter stringWriter=new StringWriter();
       IOUtils.copy(inputStream, stringWriter, "UTF-8");
       inputStream.close();
       return stringWriter.toString();
    }
}
