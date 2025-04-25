package com.xworkz.external;
import com.xworkz.internal.Connector;

public class ConnectorUser {

    public ConnectorUser(){

        System.out.println("no argument constructor in ConnectUser");
        Connector connector;

        public ConnectorUser(Connector connector){
            this.connector=connector;
            System.out.println("run in constructor user");
        }

        public void execute(){
            if(this.connector!=null){
                this.connector.run();
            }
            else{
                System.out.println("no null pointer")
            }
        }
    }

}
