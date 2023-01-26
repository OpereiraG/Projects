package Class13Java;

public class REplaceAllMethod {
    public static void main(String[] args) {

        String str = "FDGFGFDGFDasasaGFD1232132121$%$#%$#%$#%#$@";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));



    }
}
