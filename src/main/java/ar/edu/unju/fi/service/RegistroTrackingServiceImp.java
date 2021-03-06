package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.RegistroTracking;
import ar.edu.unju.fi.repository.IRegistroTrackingDAO;

@Service
public class RegistroTrackingServiceImp implements IRegistroTrackingService {

	@Autowired
	IRegistroTrackingDAO registroTrackingDAOImp;
	
	@Override
	public void guardarRegistroTracking(RegistroTracking registroTracking) {
		registroTrackingDAOImp.save(registroTracking);
	}

}
