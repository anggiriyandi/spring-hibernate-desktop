/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.latihan;
import org.jdesktop.application.SingleFrameApplication;
import org.latihan.model.dao.service.MasterService;
import org.latihan.model.dao.service.SecurityService;
import org.latihan.ui.MainFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author gel
 */
public class HbSpring extends SingleFrameApplication{
private static  ApplicationContext applicationContext;
private static  SecurityService securityService;
public static  MasterService masterService;
    /**
     * @param args the command line arguments
     */
   

    @Override
    protected void startup() {
        applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
    show(new MainFrame());
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        HbSpring.applicationContext = applicationContext;
    }

     public static void main(String[] args) {
        // TODO code application logic here
         launch(HbSpring.class,args);
    }

    public  static SecurityService getSecurityService() {
        securityService = (SecurityService) applicationContext.getBean("SecurityService");
        return securityService;
    }

    public static MasterService getMasterService() {
        masterService = (MasterService) applicationContext.getBean("MasterService");
        return masterService;
    }


}
