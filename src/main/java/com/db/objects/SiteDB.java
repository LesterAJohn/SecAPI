package com.db.objects;

import java.security.SecureRandom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiteDB {
@Id
	private String siteIDHex;
	private String userHex;
	private String url;
	private String dnsVendor;
	private String originIP;
	private String certificateIDHex;
	private String agreementID;
	
	// Setter
	public void setSiteIDHex(String siteIDHex) {
		this.siteIDHex = siteIDHex;
		siteRecordKeySet();
    }
	
    public void setUserHex(String userHex) {
		siteRecordKeySet();
		this.userHex = userHex;
    }
	
    public void setUrl(String url) {
        siteRecordKeySet();
        this.url = url;
    }
	
    public void setDnsVendor(String dnsVendor) {
        siteRecordKeySet();
        this.dnsVendor = dnsVendor;
    }
    
    public void setOriginIP(String originIP) {
        siteRecordKeySet();
        this.originIP = originIP;
    }
    
    public void setCertificateIDHex(String certificateIDHex) {
        siteRecordKeySet();
        this.certificateIDHex = certificateIDHex;
    }
    
    public void setAgreementID(String subscriptionID) {
        siteRecordKeySet();
        this.agreementID = subscriptionID;
    }
    
    //Getters
    public String getSiteIDHex() {
		return siteIDHex;
    }
	
    public String getUserHex() {
		return userHex;
    }
	
    public String getUrl() {
        return url;
    }
	
    public String getDnsVendor() {
        return dnsVendor;
    }
    
    public String getOriginIP() {
        return originIP;
    }
    
    public String getCertificateIDHex() {
        return certificateIDHex;
    }
    
    public String getSubscriptionID() {
        return agreementID;
    }
    
    //Method
	public void siteRecordKeySet() {
		if (siteIDHex == null) 
		siteIDHex = (new SecureRandom()).toString();
	}

}
