
public class ShoppingCart
{
    private Product[] product;
    private int productCount;
    private Customer customer;
    private static final int MAX_PRODUCTS = 100;
    
    public ShoppingCart(Customer customer) {
        this.product = new Product[MAX_PRODUCTS];
        this.productCount = 0;
        this.customer = customer;
    }
    
    public void addProduct(Product newProduct) {
        if (productCount < MAX_PRODUCTS) {
            product[productCount] = newProduct;
            productCount++;
        }
        
        else {
            System.out.println("Cart is full!");
        }
    }
    
    public void removeProduct(String productName){
        for (int i = 0; i < productCount; i++) {
            if (product[i].getName().equalsIgnoreCase(productName)) {
                for (int j = i; j < productCount - 1; j++) {
                    product[j] = product[j + 1];
                }
                product[productCount - 1] = null;
                productCount--;
                System.out.println(productName + " has been removed.");
                return;
            }
        }
        System.out.println(productName + " not found in cart.");
    }
    
    public void listProducts() {
        if (productCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Products in your cart: ");
        for (int i = 0; i < productCount; i++) {
            System.out.println(product[i].getName() + " - Quantity: " + product[i].getQuantity());
        }
    }
    
    public double calculateTotal() {
        double totalCost = 0;
        for (int i = 0; i < productCount; i++) {
            totalCost += product[i].getPrice() * product[i].getQuantity();
        }
        return totalCost;
    }
    
    
}
