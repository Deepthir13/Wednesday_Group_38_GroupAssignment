/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Panasonic");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product productP1 = productcatalog.newProduct("Laptop Pro 14", 50000, 85000, 75000);
        Product productP2 = productcatalog.newProduct("Gaming Console X", 35000, 60000, 45000);
        Product productP3 = productcatalog.newProduct("Smartphone Ultra", 25000, 40000, 32000);
        Product productP4 = productcatalog.newProduct("4K Television", 55000, 95000, 70000);
        Product productP5 = productcatalog.newProduct("Bluetooth Headphones", 8000, 15000, 12000);
        Product productP6 = productcatalog.newProduct("Smartwatch Series 5", 15000, 25000, 20000);
        Product productP7 = productcatalog.newProduct("Tablet Pro 12", 45000, 75000, 60000);
        Product productP8 = productcatalog.newProduct("Home Speaker System", 18000, 32000, 27000);
        Product productP9 = productcatalog.newProduct("Gaming Monitor 27\"", 28000, 50000, 40000);
        Product productP10 = productcatalog.newProduct("Wireless Keyboard", 4000, 7000, 6000);


        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = suplierdirectory.newSupplier("HP");
        productcatalog = supplier2.getProductCatalog();
        Product productHP1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productHP2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productHP3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productHP4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productHP5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productHP6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productHP7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productHP8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);
        
        Supplier supplier3 = suplierdirectory.newSupplier("Max");
        productcatalog = supplier3.getProductCatalog();
        Product productMax1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productMax2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productMax3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productMax4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productMax5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productMax6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productMax7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productMax8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);
        
                
        Supplier supplier4 = suplierdirectory.newSupplier("Mac");
        productcatalog = supplier4.getProductCatalog();
        Product productMac1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productMac2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productMac3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productMac4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productMac5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productMac6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productMac7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productMac8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);
        
                
        Supplier supplier5 = suplierdirectory.newSupplier("ASUS");
        productcatalog = supplier5.getProductCatalog();
        Product productASUS1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productASUS2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productASUS3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productASUS4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productASUS5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productASUS6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productASUS7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productASU8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);

        Supplier supplier6 = suplierdirectory.newSupplier("Samsung");
        productcatalog = supplier6.getProductCatalog();
        Product productSamSung1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productSamSung2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productSamSung3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productSamSung4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productSamSung5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productSamSung6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productSamSung7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productSamSung8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);

        Supplier supplier7 = suplierdirectory.newSupplier("Micro");
        productcatalog = supplier7.getProductCatalog();
        Product productMicro1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productMicro2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productMicro3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productMicro4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productMicro5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productMicro6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productMicro7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productMicro8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);

        Supplier supplier8 = suplierdirectory.newSupplier("Raser");
        productcatalog = supplier8.getProductCatalog();
        Product productRaser1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productRaser2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productRaser3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productRaser4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productRaser5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productRaser6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productRaser7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productRaser8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);

        Supplier supplier9 = suplierdirectory.newSupplier("MSI");
        productcatalog = supplier9.getProductCatalog();
        Product productMSI1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productMSI2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productMSI3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productMSI4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productMSI5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productMSI6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productMSI7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productMSI8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);

        Supplier supplier10 = suplierdirectory.newSupplier("Ranch");
        productcatalog = supplier10.getProductCatalog();
        Product productRanch1 = productcatalog.newProduct("Ultrafast Scanner X1", 15000, 30000, 22000);
        Product productRanch2 = productcatalog.newProduct("Professional Scanner Z5", 95000, 180000, 140000);
        Product productRanch3 = productcatalog.newProduct("High-Resolution Printer 450", 420000, 550000, 490000);
        Product productRanch4 = productcatalog.newProduct("Digital Photocopier Elite", 440000, 880000, 600000);
        Product productRanch5 = productcatalog.newProduct("Compact Scanner Lite 200", 190000, 480000, 350000);
        Product productRanch6 = productcatalog.newProduct("High-Speed Scanner MaxPro", 920000, 1500000, 1750000);
        Product productRanch7 = productcatalog.newProduct("Premium Printer X500", 310000, 460000, 700000);
        Product productRanch8 = productcatalog.newProduct("Advanced Photocopier A900", 360000, 600000, 750000);


// Create Person Directory
        PersonDirectory persondirectory = business.getPersonDirectory();
// Creating people representing sales organization        
        Person dellSalesPerson001 = persondirectory.newPerson("Dell Sales");
        Person dellMarketingPerson001 = persondirectory.newPerson("Dell Marketing");
        Person dellAdminPerson001 = persondirectory.newPerson("Dell Admin");



// Create person objects to represent customer organizations. we use this as customer
        Person person010 = persondirectory.newPerson("Amazon");
        Person person011 = persondirectory.newPerson("Meta");
        Person person012 = persondirectory.newPerson("Apple");
        Person person013 = persondirectory.newPerson("Tesla");
        Person person014 = persondirectory.newPerson("Goldman Sachs"); 

// Create Customers
        CustomerDirectory customerDirectory = business.getCustomerDirectory();
        CustomerProfile amazonCustomerProfile = customerDirectory.newCustomerProfile(person010);
        CustomerProfile metaCustomerProfile = customerDirectory.newCustomerProfile(person011);
        CustomerProfile appleCustomerProfile = customerDirectory.newCustomerProfile(person012);
        CustomerProfile teslaCustomerProfile = customerDirectory.newCustomerProfile(person013);
        CustomerProfile goldmanSachsCustomerProfile = customerDirectory.newCustomerProfile(person014);


// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(dellSalesPerson001);

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(dellMarketingPerson001);

// Create Admins to manage the business
 //       EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
 //       EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX"); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
 //       UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(amazonCustomerProfile, salespersonprofile);
        OrderItem itemA1 = order1.newOrderItem(productP1, 22000, 3);
        OrderItem itemA2 = order1.newOrderItem(productP2, 25000, 6);
        OrderItem itemA3 = order1.newOrderItem(productP3, 40000, 5);
        OrderItem itemA4 = order1.newOrderItem(productP4, 53000, 4);
        OrderItem itemA5 = order1.newOrderItem(productP5, 30000, 2);
        OrderItem itemA6 = order1.newOrderItem(productP6, 115000, 3);
        OrderItem itemA7 = order1.newOrderItem(productP7, 45000, 1);
        OrderItem itemA8 = order1.newOrderItem(productP8, 52000, 7);


        Order order12 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
        OrderItem itemB1 = order12.newOrderItem(productHP1, 17000, 2);
        OrderItem itemB2 = order12.newOrderItem(productHP2, 9500, 5);
        OrderItem itemB3 = order12.newOrderItem(productHP3, 29500, 8);
        OrderItem itemB4 = order12.newOrderItem(productHP4, 30000, 3);
        OrderItem itemB5 = order12.newOrderItem(productHP5, 2000, 4);
        OrderItem itemB6 = order12.newOrderItem(productHP6, 95000, 1);
        OrderItem itemB7 = order12.newOrderItem(productHP7, 26500, 6);
        OrderItem itemB8 = order12.newOrderItem(productHP8, 40000, 1);
    
        Order order3 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
        OrderItem itemC1 = order3.newOrderItem(productMax1, 17000, 2);
        OrderItem itemC2 = order3.newOrderItem(productMax2, 9500, 5);
        OrderItem itemC3 = order3.newOrderItem(productMax3, 29500, 8);
        OrderItem itemC4 = order3.newOrderItem(productMax4, 30000, 3);
        OrderItem itemC5 = order3.newOrderItem(productMax5, 2000, 4);
        OrderItem itemC6 = order3.newOrderItem(productMax6, 95000, 1);
        OrderItem itemC7 = order3.newOrderItem(productMax7, 26500, 6);
        OrderItem itemC8 = order3.newOrderItem(productMax8, 40000, 1);
        
     Order order4 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
     OrderItem itemD1 = order4.newOrderItem(productMac1, 17000, 2);
       OrderItem itemD2 = order4.newOrderItem(productMac2, 9500, 5);
       OrderItem itemD3 = order4.newOrderItem(productMac3, 29500, 8);
        OrderItem itemD4 = order4.newOrderItem(productMac4, 30000, 3);
       OrderItem itemD5 = order4.newOrderItem(productMac5, 2000, 4);
       OrderItem itemD6 = order4.newOrderItem(productMac6, 95000, 1);
        OrderItem itemD7 = order4.newOrderItem(productMac7, 26500, 6);
        OrderItem itemD8 = order4.newOrderItem(productMac8, 40000, 1);
        
             Order order5 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
     OrderItem itemE1 = order5.newOrderItem(productASUS1, 17000, 2);
       OrderItem itemE2 = order5.newOrderItem(productASUS2, 9500, 5);
       OrderItem itemE3 = order5.newOrderItem(productASUS3, 29500, 8);
        OrderItem itemE4 = order5.newOrderItem(productASUS4, 30000, 3);
       OrderItem itemE5 = order5.newOrderItem(productASUS5, 2000, 4);
       OrderItem itemE6 = order5.newOrderItem(productASUS6, 95000, 1);
        OrderItem itemE7 = order5.newOrderItem(productASUS7, 26500, 6);
       
        
            Order order6 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
            OrderItem itemF1 = order6.newOrderItem(productSamSung1, 17000, 2);
            OrderItem itemF2 = order6.newOrderItem(productSamSung2, 9500, 5);
            OrderItem itemF3 = order6.newOrderItem(productSamSung3, 29500, 8);
            OrderItem itemF4 = order6.newOrderItem(productSamSung4, 30000, 3);
            OrderItem itemF5 = order6.newOrderItem(productSamSung5, 2000, 4);
            OrderItem itemF6 = order6.newOrderItem(productSamSung6, 95000, 1);
            OrderItem itemF7 = order6.newOrderItem(productSamSung7, 26500, 6);
            OrderItem itemF8 = order6.newOrderItem(productSamSung8, 40000, 1);
        
             Order order7 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
     OrderItem itemG1 = order7.newOrderItem(productMac1, 17000, 2);
       OrderItem itemG2 = order7.newOrderItem(productMac2, 9500, 5);
       OrderItem itemG3 = order7.newOrderItem(productMac3, 29500, 8);
        OrderItem itemG4 = order7.newOrderItem(productMac4, 30000, 3);
       OrderItem itemG5 = order7.newOrderItem(productMac5, 2000, 4);
       OrderItem itemG6 = order7.newOrderItem(productMac6, 95000, 1);
        OrderItem itemG7 = order7.newOrderItem(productMac7, 26500, 6);
        OrderItem itemG8 = order7.newOrderItem(productMac8, 40000, 1);
        
             Order order8 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
     OrderItem itemH1 = order8.newOrderItem(productMicro1, 17000, 2);
       OrderItem itemH2 = order8.newOrderItem(productMicro2, 9500, 5);
       OrderItem itemH3 = order8.newOrderItem(productMicro3, 29500, 8);
        OrderItem itemH4 = order8.newOrderItem(productMicro4, 30000, 3);
       OrderItem itemH5 = order8.newOrderItem(productMicro5, 2000, 4);
       OrderItem itemH6 = order8.newOrderItem(productMicro6, 95000, 1);
        OrderItem itemH7 = order8.newOrderItem(productMicro7, 26500, 6);
        OrderItem itemH8 = order8.newOrderItem(productMicro8, 40000, 1);
        
            Order order9 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
     OrderItem itemI1 = order9.newOrderItem(productRaser1, 17000, 2);
       OrderItem itemI2 = order9.newOrderItem(productRaser2, 9500, 5);
       OrderItem itemI3 = order9.newOrderItem(productRaser3, 29500, 8);
        OrderItem itemI4 = order9.newOrderItem(productRaser4, 30000, 3);
       OrderItem itemI5 = order9.newOrderItem(productRaser5, 2000, 4);
       OrderItem itemI6 = order9.newOrderItem(productRaser6, 95000, 1);
        OrderItem itemI7 = order9.newOrderItem(productRaser7, 26500, 6);
        OrderItem itemI8 = order9.newOrderItem(productRaser8, 40000, 1);
        
            
    Order order10 = masterorderlist.newOrder(metaCustomerProfile, salespersonprofile);
     OrderItem itemJ1 = order10.newOrderItem(productRanch1, 17000, 2);
       OrderItem itemJ2 = order10.newOrderItem(productRanch2, 9500, 5);
       OrderItem itemJ3 = order10.newOrderItem(productRanch3, 29500, 8);
        OrderItem itemJ4 = order10.newOrderItem(productRanch4, 30000, 3);
       OrderItem itemJ5 = order10.newOrderItem(productRanch5, 2000, 4);
       OrderItem itemJ6 = order10.newOrderItem(productRanch6, 95000, 1);
        OrderItem itemJ7 = order10.newOrderItem(productRanch7, 26500, 6);
        OrderItem itemJ8 = order10.newOrderItem(productRanch8, 40000, 1);
        
    



    return business;
  }
}
