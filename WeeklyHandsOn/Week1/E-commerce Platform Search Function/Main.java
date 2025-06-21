public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(511, "Slipper", "Footwear"),
            new Product(15, "Tv", "Electronics"),
            new Product(110, "Mobile", "Accessories"),
            new Product(188, "Speaker", "Electronics")
        };

        int searchId = 15;

        Product foundLinear = SearchEngine.linearSearch(products, searchId);
       // System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not found"));
       if(foundLinear != null){
          System.out.println("Linear Search Output: "+ foundLinear);
       } 
       else{
          System.out.println("Linear Search Output: "+ "Not Found");
       }

    
        SearchEngine.sortProducts(products);
        Product foundBinary = SearchEngine.binarySearch(products, searchId);
        if(foundBinary != null){
            System.out.println("Binary Search Output: " + foundBinary);
        }
        else{
            System.out.println("Binary Search Output: " + "Not Found");
        }
    }
}

