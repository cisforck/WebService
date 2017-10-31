/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Erick
 */
@WebService(serviceName = "Operacionrara")
public class Operacionrara {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Colebrook")
    public double Colebrook(@WebParam(name = "Rugosidad") double Rugosidad, @WebParam(name = "Reynolds") int Reynolds, @WebParam(name = "Diametro") double Diametro) {
        //TODO write your implementation code here:
        return Rugosidad+Reynolds+Diametro;
    }
}
