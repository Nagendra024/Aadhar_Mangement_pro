package model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Digit.Aahar_pro.bean.AadharDetails;


public class HibernateManager {

	private Session session;

	public HibernateManager() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
		session = sessionFactory.openSession();

	}

//******** INSESRT********
	public boolean saveObj(AadharDetails a1) {
		Transaction tran = session.beginTransaction();
		Serializable save = session.save(a1);
		if (save == null) {
			return false;
		}

		tran.commit();
		return true;
	}

	public List readAll() {
		Transaction tran = session.beginTransaction();
		Query q = session.createQuery("From AadharDetails");
		List li = q.list();
		tran.commit();
		return li;

	}

	public void updateDet(int a_id, String selopt,String det) {
		Transaction tran = session.beginTransaction();
		AadharDetails ad1 = (AadharDetails) session.get(AadharDetails.class, a_id);

		switch (selopt) {
		case "u_name": {
			ad1.setU_name(det);
			break;
		}
		case "dob": {
			ad1.setDob(det);
			break;
		}
		case "address": {
			ad1.setAddress(det);
			break;
		}
		default:

		}
		session.update(ad1);
		tran.commit();

	}
	
	public void delete(int a_id) {
		Transaction tran = session.beginTransaction();
		AadharDetails ad1 = (AadharDetails) session.get(AadharDetails.class, a_id);
		session.delete(ad1);
		tran.commit();

	}
	
	
	public AadharDetails readSpecific(int a_id) {
		Transaction tran =session.beginTransaction();
		AadharDetails s=(AadharDetails) session.get(AadharDetails.class, a_id);
		
		return s;
	}
	
	

}
