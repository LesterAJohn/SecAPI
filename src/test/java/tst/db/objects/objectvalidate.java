package tst.db.objects;

import com.db.objects.CertDB;

public class objectvalidate {

	public static void main(String[] args) {
		CertDB cert = new CertDB();
		cert.setOrderID("qwer456tyu");
		
		System.out.println(cert.getOrderID());
	}

}
