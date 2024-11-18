/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;
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
import model.ProductManagement.ProductSummary;
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
    Random random = new Random();
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product s1p1 = productcatalog.newProduct("ThinkPad X1", 95000, 135000, 115000);
        Product s1p2 = productcatalog.newProduct("ThinkPad T14", 85000, 125000, 105000);
        Product s1p3 = productcatalog.newProduct("IdeaPad Slim", 50000, 70000, 60000);
        Product s1p4 = productcatalog.newProduct("Legion 5i", 120000, 160000, 140000);
        Product s1p5 = productcatalog.newProduct("Yoga C940", 100000, 140000, 120000);
        Product s1p6 = productcatalog.newProduct("Tab P11", 20000, 35000, 28000);
        Product s1p7 = productcatalog.newProduct("ThinkVision Monitor", 15000, 25000, 20000);
        Product s1p8 = productcatalog.newProduct("Lenovo Smart Clock", 5000, 10000, 7500);
        Product s1p9 = productcatalog.newProduct("ThinkBook Plus", 70000, 110000, 90000);
        Product s1p10 = productcatalog.newProduct("Legion Tower", 95000, 135000, 115000);

        Supplier supplier2 = suplierdirectory.newSupplier("HP");
        ProductCatalog productCatalog2 = supplier2.getProductCatalog();
        Product s2p1 = productCatalog2.newProduct("Spectre x360", 110000, 150000, 130000);
        Product s2p2 = productCatalog2.newProduct("Envy 15", 85000, 115000, 95000);
        Product s2p3 = productCatalog2.newProduct("Pavilion Gaming", 70000, 100000, 85000);
        Product s2p4 = productCatalog2.newProduct("EliteBook 850", 120000, 170000, 145000);
        Product s2p5 = productCatalog2.newProduct("ZBook Studio", 140000, 190000, 165000);
        Product s2p6 = productCatalog2.newProduct("HP Chromebook", 25000, 40000, 30000);
        Product s2p7 = productCatalog2.newProduct("HP Wireless Printer", 20000, 35000, 28000);
        Product s2p8 = productCatalog2.newProduct("HP ProDesk", 60000, 85000, 70000);
        Product s2p9 = productCatalog2.newProduct("HP All-in-One", 50000, 75000, 60000);
        Product s2p10 = productCatalog2.newProduct("OMEN 15", 95000, 135000, 115000);

        Supplier supplier3 = suplierdirectory.newSupplier("Dell");
        ProductCatalog productCatalog3 = supplier3.getProductCatalog();
        Product s3p1 = productCatalog3.newProduct("XPS 13", 115000, 165000, 140000);
        Product s3p2 = productCatalog3.newProduct("Alienware M15", 145000, 200000, 170000);
        Product s3p3 = productCatalog3.newProduct("Inspiron 15", 60000, 90000, 75000);
        Product s3p4 = productCatalog3.newProduct("Latitude 9510", 125000, 175000, 150000);
        Product s3p5 = productCatalog3.newProduct("G5 15 Gaming", 95000, 125000, 110000);
        Product s3p6 = productCatalog3.newProduct("Dell UltraSharp Monitor", 35000, 50000, 40000);
        Product s3p7 = productCatalog3.newProduct("Dell Active Pen", 5000, 10000, 7500);
        Product s3p8 = productCatalog3.newProduct("Dell PowerEdge Server", 200000, 300000, 250000);
        Product s3p9 = productCatalog3.newProduct("Dell Dock WD19", 10000, 20000, 15000);
        Product s3p10 = productCatalog3.newProduct("Dell Pro Webcam", 15000, 25000, 20000);

        Supplier supplier4 = suplierdirectory.newSupplier("Acer");
        ProductCatalog productCatalog4 = supplier4.getProductCatalog();
        Product s4p1 = productCatalog4.newProduct("Aspire 5", 45000, 70000, 55000);
        Product s4p2 = productCatalog4.newProduct("Swift 3", 60000, 90000, 75000);
        Product s4p3 = productCatalog4.newProduct("Nitro 5", 75000, 110000, 95000);
        Product s4p4 = productCatalog4.newProduct("Predator Helios", 125000, 175000, 150000);
        Product s4p5 = productCatalog4.newProduct("Spin 5", 85000, 115000, 95000);
        Product s4p6 = productCatalog4.newProduct("Acer Chromebook", 25000, 40000, 30000);
        Product s4p7 = productCatalog4.newProduct("Acer Gaming Monitor", 20000, 35000, 28000);
        Product s4p8 = productCatalog4.newProduct("Acer Aspire Desktop", 55000, 85000, 65000);
        Product s4p9 = productCatalog4.newProduct("Acer TravelMate", 50000, 75000, 60000);
        Product s4p10 = productCatalog4.newProduct("Acer Predator Accessory Kit", 12000, 18000, 15000);

        Supplier supplier5 = suplierdirectory.newSupplier("Asus");
        ProductCatalog productCatalog5 = supplier5.getProductCatalog();
        Product s5p1 = productCatalog5.newProduct("ROG Zephyrus", 145000, 200000, 170000);
        Product s5p2 = productCatalog5.newProduct("VivoBook S15", 75000, 110000, 95000);
        Product s5p3 = productCatalog5.newProduct("ZenBook Pro Duo", 160000, 220000, 190000);
        Product s5p4 = productCatalog5.newProduct("TUF Gaming F15", 85000, 125000, 100000);
        Product s5p5 = productCatalog5.newProduct("ExpertBook B9", 125000, 175000, 150000);
        Product s5p6 = productCatalog5.newProduct("Asus Chromebook Flip", 30000, 50000, 40000);
        Product s5p7 = productCatalog5.newProduct("Asus EyeCare Monitor", 15000, 25000, 20000);
        Product s5p8 = productCatalog5.newProduct("Asus Mini PC", 60000, 90000, 75000);
        Product s5p9 = productCatalog5.newProduct("Asus ROG Phone", 80000, 110000, 95000);
        Product s5p10 = productCatalog5.newProduct("Asus Webcam Pro", 20000, 35000, 28000);
        

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxSalesperson001 = persondirectory.newPerson("Xerox Sales Person");
        // adding Marketing Person
        Person xeroxMarketingperson001 = persondirectory.newPerson("Xerox Marketing"); // He is the Supplier

        Person person005 = persondirectory.newPerson("Tes");
        Person person006 = persondirectory.newPerson("Mark");
        Person person007 = persondirectory.newPerson("Priyanka");
        Person person008 = persondirectory.newPerson("Deepthi");
        Person person009 = persondirectory.newPerson("Ramesh"); //we use this as customer
        Person person010 = persondirectory.newPerson("Forti");
        Person person011 = persondirectory.newPerson("Boy");
        Person person012 = persondirectory.newPerson("Don");
        Person person013 = persondirectory.newPerson("Harry");
        Person person014 = persondirectory.newPerson("Girl");

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005);
        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006);
        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007);
        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008);
        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009);
        CustomerProfile customerprofile6 = customedirectory.newCustomerProfile(person010);
        CustomerProfile customerprofile7 = customedirectory.newCustomerProfile(person011);
        CustomerProfile customerprofile8 = customedirectory.newCustomerProfile(person012);
        CustomerProfile customerprofile9 = customedirectory.newCustomerProfile(person013);
        CustomerProfile customerprofile10 = customedirectory.newCustomerProfile(person014);

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxSalesperson001);

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxMarketingperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "."); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "."); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi1 = order1.newOrderItem(s1p1, 19000, 2);
        OrderItem oi2 = order1.newOrderItem(s1p2, 20000, 3);
        OrderItem oi3 = order1.newOrderItem(s1p3, 37000, 8);
        OrderItem oi4 = order1.newOrderItem(s1p4, 52000, 2);
        OrderItem oi5 = order1.newOrderItem(s1p5, 26000, 4);
        OrderItem oi6 = order1.newOrderItem(s1p6, 108000, 1);
        OrderItem oi7 = order1.newOrderItem(s1p7, 37000, 2);
        OrderItem oi8 = order1.newOrderItem(s1p8, 51000, 3);
        OrderItem oi9 = order1.newOrderItem(s1p9, 57000, 5);
        OrderItem oi10 = order1.newOrderItem(s1p10, 67000, 6);

        Order order12 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi112 = order12.newOrderItem(s1p1, 18500, 2);
        OrderItem oi12 = order12.newOrderItem(s1p2, 9700, 5);
        OrderItem oi13 = order12.newOrderItem(s1p3, 30000, 7);
        OrderItem oi14 = order12.newOrderItem(s1p4, 31000, 2);
        OrderItem oi15 = order12.newOrderItem(s1p5, 2500, 4);
        OrderItem oi16 = order12.newOrderItem(s1p6, 96000, 1);
        OrderItem oi17 = order12.newOrderItem(s1p7, 27000, 4);
        OrderItem oi18 = order12.newOrderItem(s1p8, 41000, 3);
        OrderItem oi19 = order12.newOrderItem(s1p9, 52000, 6);
        OrderItem oi20 = order12.newOrderItem(s1p10, 61000, 5);

        Order order2 = masterorderlist.newOrder(customerprofile2, salespersonprofile);
        OrderItem h1oi1 = order2.newOrderItem(s2p1, 61000, 1);
        OrderItem h1oi2 = order2.newOrderItem(s2p2, 76000, 4);
        OrderItem h1oi3 = order2.newOrderItem(s2p3, 43000, 7);
        OrderItem h1oi4 = order2.newOrderItem(s2p4, 47000, 4);
        OrderItem h1oi5 = order2.newOrderItem(s2p5, 13500, 6);
        OrderItem h1oi6 = order2.newOrderItem(s2p6, 17500, 3);
        OrderItem h1oi7 = order2.newOrderItem(s2p7, 4200, 8);
        OrderItem h1oi8 = order2.newOrderItem(s2p8, 2600, 12);
        OrderItem h1oi9 = order2.newOrderItem(s2p9, 21000, 6);
        OrderItem h1oi10 = order2.newOrderItem(s2p10, 26000, 7);

        Order order3 = masterorderlist.newOrder(customerprofile3, salespersonprofile);
        OrderItem d1oi1 = order3.newOrderItem(s3p1, 71000, 2);
        OrderItem d1oi2 = order3.newOrderItem(s3p2, 92000, 3);
        OrderItem d1oi3 = order3.newOrderItem(s3p3, 49000, 5);
        OrderItem d1oi4 = order3.newOrderItem(s3p4, 51000, 3);
        OrderItem d1oi5 = order3.newOrderItem(s3p5, 16500, 4);
        OrderItem d1oi6 = order3.newOrderItem(s3p6, 20500, 2);
        OrderItem d1oi7 = order3.newOrderItem(s3p7, 6200, 9);
        OrderItem d1oi8 = order3.newOrderItem(s3p8, 9100, 8);
        OrderItem d1oi9 = order3.newOrderItem(s3p9, 18500, 6);
        OrderItem d1oi10 = order3.newOrderItem(s3p10, 7200, 7);

        Order order4 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem a1oi1 = order4.newOrderItem(s4p1, 29000, 4);
        OrderItem a1oi2 = order4.newOrderItem(s4p2, 32000, 6);
        OrderItem a1oi3 = order4.newOrderItem(s4p3, 24000, 5);
        OrderItem a1oi4 = order4.newOrderItem(s4p4, 28000, 4);
        OrderItem a1oi5 = order4.newOrderItem(s4p5, 11500, 8);
        OrderItem a1oi6 = order4.newOrderItem(s4p6, 14500, 6);
        OrderItem a1oi7 = order4.newOrderItem(s4p7, 5200, 5);
        OrderItem a1oi8 = order4.newOrderItem(s4p8, 8200, 10);
        OrderItem a1oi9 = order4.newOrderItem(s4p9, 9200, 7);
        OrderItem a1oi10 = order4.newOrderItem(s4p10, 7200, 6);

        Order order5 = masterorderlist.newOrder(customerprofile5, salespersonprofile);
        OrderItem as1oi1 = order5.newOrderItem(s5p1, 101000, 2);
        OrderItem as1oi2 = order5.newOrderItem(s5p2, 112000, 3);
        OrderItem as1oi3 = order5.newOrderItem(s5p3, 91000, 4);
        OrderItem as1oi4 = order5.newOrderItem(s5p4, 96000, 3);
        OrderItem as1oi5 = order5.newOrderItem(s5p5, 28000, 5);
        OrderItem as1oi6 = order5.newOrderItem(s5p6, 25000, 2);
        OrderItem as1oi7 = order5.newOrderItem(s5p7, 4200, 9);
        OrderItem as1oi8 = order5.newOrderItem(s5p8, 7200, 10);
        OrderItem as1oi9 = order5.newOrderItem(s5p9, 11200, 6);
        OrderItem as1oi10 = order5.newOrderItem(s5p10, 7600, 8);

        System.out.println("Generated Customers:");
    for (CustomerProfile customerProfile : customedirectory.getCustomerlist()) {
        System.out.println("    Customer: " + customerProfile.getPerson().getPersonId());  // Assuming getPersonName() exists
    }
      System.out.println("\n");


    for (int supplierIndex = 0; supplierIndex < suplierdirectory.getSuplierList().size(); supplierIndex++) {
        Supplier supplier = suplierdirectory.getSuplierList().get(supplierIndex);

        // Print supplier name
        System.out.println("Supplier: " + supplier.getName());

        // Iterate through each product of the supplier
        for (int productIndex = 0; productIndex < supplier.getProductCatalog().getProductList().size(); productIndex++) {
            Product product = supplier.getProductCatalog().getProductList().get(productIndex);

            // Set unique product name by adding supplier index
            String uniqueProductName = "Product_S" + (supplierIndex + 1) + "_P" + (productIndex + 1);
            product.setName(uniqueProductName);

            ProductSummary productSummary = new ProductSummary(product);
            System.out.println("    Product: " + product.getName());
            System.out.println("        Sales Volume: " + productSummary.getSalesRevenues());
            System.out.println("        Profit Margin: " + productSummary.getProductPricePerformance());
            System.out.println("        Frequency above target: " + productSummary.getNumberAboveTarget());
            System.out.println("        Frequency below target: " + productSummary.getNumberBelowTarget());

            // Generate 10 orders per product and display them
            System.out.println("        Orders for " + product.getName()+ ":");

            for (int i = 0; i < 10; i++) {
                // Get the same customer for this cycle of 10 orders
                CustomerProfile customer = customedirectory.getCustomerlist().get(i % customedirectory.getCustomerlist().size());
                Order order = masterorderlist.newOrder(customer, salespersonprofile);
                int quantity = random.nextInt(10) + 1;
                int actualPrice = product.getTargetPrice() + random.nextInt(1000) - 500;
                order.newOrderItem(product, actualPrice, quantity);

                System.out.println("Order " + (i+1) + ": Customer: " + customer.getPerson().getPersonId() + ", Quantity: " + quantity + ", Price: " + actualPrice);
            }
        }

        System.out.println("\n");
    }
        return business;
    
  }
}