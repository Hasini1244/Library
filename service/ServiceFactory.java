/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service;

import edu.ijse.service.custom.Impl.BookServiceImpl;
import edu.ijse.service.custom.Impl.MemberServiceImpl;






/**
 *
 * @author USER
 */
public class ServiceFactory {
      private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceType type){
        switch (type) {
            case BOOK:
                return new BookServiceImpl();
                  case MEMBER:
                return new MemberServiceImpl();
            
                
            default:
                return null;
        }
    }

     public enum ServiceType{
        BOOK,MEMBER;
    }
}
