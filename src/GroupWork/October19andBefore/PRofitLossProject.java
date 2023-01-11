package GroupWork.October19andBefore;

import java.math.BigDecimal;

public class PRofitLossProject {
    public static void main(String[] args) {

    }

    public BigDecimal calculateProfitLoss(Long id) {
        //basic formula
       // Net Sales (or revenue) – Cost of Sales (or Cost of Goods Sold) = Gross Profit (or Gross Margin)
       //get sales total from invoiceproduct and quantity sold this will give invoice total
        // store one variable with the total sales value quantity*sales price
        //store a second of just quantity sold
        //store a third with the product kind
       // part 2 get all invoices that are purchase invoices from the product sold by product kind using stream
        //find quantity and price bought from these and add them to hashmap key value is quantity and value stored is price
        //add two more variables one for the absolute total of all products prices  from hashmap which is product* bought price
        //second of total quantity of products
        //find these by a for each loop with hashmap will have two seperate iterations for both quanitty and total price
        //divide absolute total by total quantity will give median cost in big decimal
        //take sales total from invoiceproduct- median cost* quantity sold which is stored in seperate variable above
        // then return this amount as big decimal


        return null;
    }
}
