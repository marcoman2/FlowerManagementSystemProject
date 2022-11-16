/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopmanagementsystem;

import java.sql.Date;

/**
 *
 * @author MarcoMan
 * 
 * Channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 */
public class customerData {
    
    private Integer customerId;
    private Integer flowerId;
    private String name;
    private Integer quantity;
    private Double price;
    private Date date;
    
    public customerData(Integer customerId, Integer flowerId, String name
            , Integer quantity, Double price, Date date){
        this.customerId = customerId;
        this.flowerId = flowerId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }
    
    public Integer getCustomerId(){
        return customerId;
    }
    public Integer getFlowerId(){
        return flowerId;
    }
    public String getName(){
        return name;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
    
}
