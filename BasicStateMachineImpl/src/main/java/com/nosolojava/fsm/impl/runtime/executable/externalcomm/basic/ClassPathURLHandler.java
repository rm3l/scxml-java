package com.nosolojava.fsm.impl.runtime.executable.externalcomm.basic;

import java.io.Serializable;
import java.net.URL;

import com.nosolojava.fsm.model.datamodel.URLDataHandler;

public class ClassPathURLHandler implements URLDataHandler {

	@Override
	public String getProtocol() {
		return null;
	}

	@Override
	public Serializable getData(URL url) {
		return null;
	}

}
