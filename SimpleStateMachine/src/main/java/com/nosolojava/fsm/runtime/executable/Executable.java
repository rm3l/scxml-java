package com.nosolojava.fsm.runtime.executable;

import java.io.Serializable;

import com.nosolojava.fsm.runtime.Context;

public interface Executable extends Serializable {
	void run(Context context);
}
