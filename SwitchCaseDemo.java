package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {


        String country="USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){//converts the next to lowercase USA=>usa
            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy"  :
                System.out.println("Pasta");
                break;
            case "Afganistan":
                System.out.println("kebab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
