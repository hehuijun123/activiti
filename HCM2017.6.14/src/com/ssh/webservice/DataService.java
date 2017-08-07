package com.ssh.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService
@Service
public interface DataService {

	@WebMethod(action="http://webservice.ssh.com/toData")
	public String toData(@WebParam(name="data")String json);
}
