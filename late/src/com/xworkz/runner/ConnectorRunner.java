package com.xworkz.runner;

import com.xworkz.external.ConnectorUser;
import com.xworkz.internal.Connector;
import com.xworkz.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args){
        Connector connector=new ConnectorImpl();

        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();
    }
}
