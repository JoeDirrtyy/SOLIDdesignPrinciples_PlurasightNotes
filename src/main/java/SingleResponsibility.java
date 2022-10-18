import lombok.AllArgsConstructor;
import lombok.Data;

//Imagine that we have a class ProductService that has two concerns and responsibilities:
//
//Manipulating crud operations on a product.
//Sending SMS and EMAIL notifications based on crud operations.



//SingleResponsibility.java
public class SingleResponsibility {

    public static void main(String[] args) {

    }
}

class ProductService {

//    private NotificationService notificationService;    - for Email Service

    public void addProduct() {
        System.out.println("add product logic...");
    }

    public Product getProduct() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }

    public void sendSms() {
        System.out.println("sms sent");
    }

    public void sendEmail() {
        System.out.println("email sent");
    }


//    //If the class requirements change to email
//    class NotificationService {
//
//        public void sendSms() {
//            System.out.println("sms sent");
//        }
//
//        public void sendHtmlEmail() {
//            System.out.println("email sent");
//        }
//
//        public void sendTextEmail() {
//            System.out.println("email sent");
//        }
//    }
}

@Data
@AllArgsConstructor
class Product {
    private String name;
}